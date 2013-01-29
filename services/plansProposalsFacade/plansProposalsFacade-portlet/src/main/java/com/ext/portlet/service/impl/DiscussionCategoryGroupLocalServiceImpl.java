package com.ext.portlet.service.impl;

import java.util.List;

import com.ext.portlet.NoSuchDiscussionCategoryException;
import com.ext.portlet.NoSuchDiscussionMessageException;
import com.ext.portlet.model.DiscussionCategory;
import com.ext.portlet.model.DiscussionCategoryGroup;
import com.ext.portlet.model.DiscussionMessage;
import com.ext.portlet.service.DiscussionCategoryGroupLocalServiceUtil;
import com.ext.portlet.service.DiscussionCategoryLocalServiceUtil;
import com.ext.portlet.service.DiscussionMessageLocalServiceUtil;
import com.ext.portlet.service.base.DiscussionCategoryGroupLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;

/**
 * The implementation of the discussion category group local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.service.DiscussionCategoryGroupLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.base.DiscussionCategoryGroupLocalServiceBaseImpl
 * @see com.ext.portlet.service.DiscussionCategoryGroupLocalServiceUtil
 */
public class DiscussionCategoryGroupLocalServiceImpl
    extends DiscussionCategoryGroupLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.ext.portlet.service.DiscussionCategoryGroupLocalServiceUtil} to access the discussion category group local service.
     */
    
    public DiscussionCategoryGroup createDiscussionCategoryGroup(String description) throws SystemException {
        Long id = CounterLocalServiceUtil.increment(DiscussionCategoryGroup.class.getName());
        DiscussionCategoryGroup discussionCategoryGroup = createDiscussionCategoryGroup(id);
        discussionCategoryGroup.setDescription(description);
        store(discussionCategoryGroup);
        
        return discussionCategoryGroup;
    }
    

    public DiscussionCategory getCategoryById(Long categoryId) throws NoSuchDiscussionCategoryException, SystemException {
        return DiscussionCategoryLocalServiceUtil.getDiscussionCategoryById(categoryId);
        
    }
    
    public DiscussionMessage getThreadById(Long threadId) throws NoSuchDiscussionMessageException, SystemException {
        return DiscussionMessageLocalServiceUtil.getThreadByThreadId(threadId);   
    }
    
    public List<DiscussionCategory> getCategories(DiscussionCategoryGroup dcg) throws SystemException {
        return DiscussionCategoryLocalServiceUtil.getCategoriesByCategoryGroupId(dcg.getId());
    }
    
    public DiscussionCategory addCategory(DiscussionCategoryGroup dcg, String name, String description, User creator) throws SystemException  {
        return DiscussionCategoryLocalServiceUtil.createDebateCategory(dcg.getId(), name, description, creator);
    }
    
    public void store(DiscussionCategoryGroup dcg) throws SystemException {
        if (dcg.isNew()) {
            DiscussionCategoryGroupLocalServiceUtil.addDiscussionCategoryGroup(dcg);
        }
        else {
            DiscussionCategoryGroupLocalServiceUtil.updateDiscussionCategoryGroup(dcg);
        }
    }
    
    public DiscussionMessage getCommentThread(DiscussionCategoryGroup dcg) throws SystemException, PortalException {
        DiscussionMessage thread = null;
        if (dcg.getCommentsThread() <= 0L) {
            thread = null;
        }
        else {
            try {
                thread = DiscussionMessageLocalServiceUtil.getThreadByThreadId(dcg.getCommentsThread());
            }
            catch (NoSuchDiscussionMessageException e) {
                thread = null;
            }
        }
        
        return thread;
        
    }
    
    public DiscussionMessage addComment(DiscussionCategoryGroup dcg, String title, String description, User author) throws SystemException, PortalException {
        DiscussionMessage comment = null;
        if (getCommentThread(dcg) == null) {
            // create new thread
            comment = DiscussionMessageLocalServiceUtil.addThread(dcg.getId(), 0L, title, description, author);
            dcg.setCommentsThread(comment.getMessageId());
            
            store(dcg);
        }
        else {
            DiscussionMessage thread = getCommentThread(dcg);
            comment = DiscussionMessageLocalServiceUtil.addThreadMessage(thread, title, description, author);
        }
        return comment;
    }
    
    public int getCommentsCount(DiscussionCategoryGroup dcg) throws SystemException, PortalException {
        if (getCommentThread(dcg) == null) {
            return 0;
        }
        else {
            return DiscussionMessageLocalServiceUtil.getThreadMessagesCount(getCommentThread(dcg)) + 1;
        }
    }
    
    public void copyEverything(DiscussionCategoryGroup dcg, DiscussionCategoryGroup source) throws SystemException, PortalException {
        // copy categories
        for (DiscussionCategory category: getCategories(dcg)) {
            DiscussionCategory newCategory = DiscussionCategoryLocalServiceUtil.createDebateCategory(
                    dcg.getId(), 
                    category.getName(), 
                    category.getDescription(), 
                    DiscussionCategoryLocalServiceUtil.getAuthor(category));
            newCategory.setCreateDate(category.getCreateDate());
            
            newCategory.setLastActivityAuthorId(category.getLastActivityAuthorId());
            newCategory.setLastActivityDate(category.getLastActivityDate());
            
            DiscussionCategoryLocalServiceUtil.store(newCategory);
            
            for (DiscussionMessage thread: DiscussionCategoryLocalServiceUtil.getThreads(category)) {
                DiscussionMessage newThread = DiscussionCategoryLocalServiceUtil.addThread(newCategory, 
                        thread.getSubject(), thread.getBody(), DiscussionMessageLocalServiceUtil.getAuthor(thread));
                newThread.setCreateDate(thread.getCreateDate());
                newThread.setLastActivityAuthorId(thread.getLastActivityAuthorId());
                newThread.setLastActivityDate(thread.getLastActivityDate());

                DiscussionMessageLocalServiceUtil.store(newThread);
                
                for (DiscussionMessage msg: DiscussionMessageLocalServiceUtil.getThreadMessages(thread)) {
                    DiscussionMessage newMsg = DiscussionMessageLocalServiceUtil.addThreadMessage(newThread, 
                            msg.getSubject(), msg.getBody(), 
                            DiscussionMessageLocalServiceUtil.getAuthor(msg));
                    newMsg.setCreateDate(msg.getCreateDate());
                    
                    DiscussionMessageLocalServiceUtil.store(newMsg);
                }
            }
        }
        
        if (source.getCommentsThread() > 0) {
            DiscussionMessage commentsThread = getCommentThread(dcg);
            DiscussionMessage newCommentsThread = addComment(dcg, commentsThread.getSubject(), commentsThread.getBody(), 
                    DiscussionMessageLocalServiceUtil.getAuthor(commentsThread));
            newCommentsThread.setLastActivityAuthorId(commentsThread.getLastActivityAuthorId());
            newCommentsThread.setLastActivityDate(commentsThread.getLastActivityDate());
            newCommentsThread.setCreateDate(commentsThread.getCreateDate());
            DiscussionMessageLocalServiceUtil.store(newCommentsThread);
            
            for (DiscussionMessage msg: DiscussionMessageLocalServiceUtil.getThreadMessages(commentsThread)) {
                DiscussionMessage newMsg = DiscussionMessageLocalServiceUtil.addThreadMessage(
                        newCommentsThread, msg.getSubject(), msg.getBody(), 
                        DiscussionMessageLocalServiceUtil.getAuthor(msg));
                newMsg.setCreateDate(msg.getCreateDate());
                
                DiscussionMessageLocalServiceUtil.store(newMsg);
            }
        }
        
    }
}