package com.ext.portlet.discussions.model.impl;

import com.ext.portlet.discussions.model.DiscussionCategoryGroup;
import com.ext.portlet.discussions.service.DiscussionCategoryGroupLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the DiscussionCategoryGroup service. Represents a row in the &quot;Discussions_DiscussionCategoryGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiscussionCategoryGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionCategoryGroupImpl
 * @see com.ext.portlet.discussions.model.DiscussionCategoryGroup
 * @generated
 */
public abstract class DiscussionCategoryGroupBaseImpl
    extends DiscussionCategoryGroupModelImpl implements DiscussionCategoryGroup {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a discussion category group model instance should use the {@link DiscussionCategoryGroup} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            DiscussionCategoryGroupLocalServiceUtil.addDiscussionCategoryGroup(this);
        } else {
            DiscussionCategoryGroupLocalServiceUtil.updateDiscussionCategoryGroup(this);
        }
    }
}