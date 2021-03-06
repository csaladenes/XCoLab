package com.ext.portlet.model.impl;

import com.ext.portlet.model.DiscussionMessage;
import com.ext.portlet.service.DiscussionMessageLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the DiscussionMessage service. Represents a row in the &quot;xcolab_DiscussionMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiscussionMessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionMessageImpl
 * @see com.ext.portlet.model.DiscussionMessage
 * @generated
 */
public abstract class DiscussionMessageBaseImpl
    extends DiscussionMessageModelImpl implements DiscussionMessage {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a discussion message model instance should use the {@link DiscussionMessage} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            DiscussionMessageLocalServiceUtil.addDiscussionMessage(this);
        } else {
            DiscussionMessageLocalServiceUtil.updateDiscussionMessage(this);
        }
    }
}
