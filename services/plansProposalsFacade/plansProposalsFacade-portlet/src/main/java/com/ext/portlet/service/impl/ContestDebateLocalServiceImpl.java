package com.ext.portlet.service.impl;

import java.util.List;

import com.ext.portlet.model.ContestDebate;
import com.ext.portlet.service.ContestDebateLocalServiceUtil;
import com.ext.portlet.service.base.ContestDebateLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the contest debate local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.service.ContestDebateLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.base.ContestDebateLocalServiceBaseImpl
 * @see com.ext.portlet.service.ContestDebateLocalServiceUtil
 */
public class ContestDebateLocalServiceImpl
    extends ContestDebateLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.ext.portlet.service.ContestDebateLocalServiceUtil} to access the contest debate local service.
     */

    public ContestDebate createContestDebate(Long debateId, Long contestId) throws SystemException {
        Long id = CounterLocalServiceUtil.increment(ContestDebate.class.getName());
        
        ContestDebate contestDebate = createContestDebate(id);
        contestDebate.setDebateId(debateId);
        contestDebate.setContestPK(contestId);
        
        store(contestDebate);
        
        return contestDebate;
    }
    
    public List<ContestDebate> getContestDebates(Long contestId) throws SystemException {
        return contestDebatePersistence.findByContestPK(contestId);
    }
    
    
    public void store(ContestDebate contestDebate) throws SystemException {
        if (contestDebate.isNew()) {
            ContestDebateLocalServiceUtil.addContestDebate(contestDebate);
        }
        else {
            ContestDebateLocalServiceUtil.updateContestDebate(contestDebate);
        }
    }
    
    public void delete(ContestDebate contestDebate) throws SystemException {
        if (contestDebate.isNew()) {
            // ignore
        }
        else {
            ContestDebateLocalServiceUtil.deleteContestDebate(contestDebate);
        }
    }
}
