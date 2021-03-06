package com.ext.portlet.model.impl;

import com.ext.portlet.model.MessagingMessageRecipient;
import com.ext.portlet.service.MessagingMessageRecipientLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the MessagingMessageRecipient service. Represents a row in the &quot;xcolab_MessagingMessageRecipient&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MessagingMessageRecipientImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessagingMessageRecipientImpl
 * @see com.ext.portlet.model.MessagingMessageRecipient
 * @generated
 */
public abstract class MessagingMessageRecipientBaseImpl
    extends MessagingMessageRecipientModelImpl
    implements MessagingMessageRecipient {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a messaging message recipient model instance should use the {@link MessagingMessageRecipient} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            MessagingMessageRecipientLocalServiceUtil.addMessagingMessageRecipient(this);
        } else {
            MessagingMessageRecipientLocalServiceUtil.updateMessagingMessageRecipient(this);
        }
    }
}
