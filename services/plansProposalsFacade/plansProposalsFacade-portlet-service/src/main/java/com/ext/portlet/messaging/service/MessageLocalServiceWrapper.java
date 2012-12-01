package com.ext.portlet.messaging.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link MessageLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       MessageLocalService
 * @generated
 */
public class MessageLocalServiceWrapper implements MessageLocalService,
    ServiceWrapper<MessageLocalService> {
    private MessageLocalService _messageLocalService;

    public MessageLocalServiceWrapper(MessageLocalService messageLocalService) {
        _messageLocalService = messageLocalService;
    }

    /**
    * Adds the message to the database. Also notifies the appropriate model listeners.
    *
    * @param message the message
    * @return the message that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.Message addMessage(
        com.ext.portlet.messaging.model.Message message)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.addMessage(message);
    }

    /**
    * Creates a new message with the primary key. Does not add the message to the database.
    *
    * @param messageId the primary key for the new message
    * @return the new message
    */
    public com.ext.portlet.messaging.model.Message createMessage(
        java.lang.Long messageId) {
        return _messageLocalService.createMessage(messageId);
    }

    /**
    * Deletes the message with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param messageId the primary key of the message
    * @throws PortalException if a message with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteMessage(java.lang.Long messageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _messageLocalService.deleteMessage(messageId);
    }

    /**
    * Deletes the message from the database. Also notifies the appropriate model listeners.
    *
    * @param message the message
    * @throws SystemException if a system exception occurred
    */
    public void deleteMessage(com.ext.portlet.messaging.model.Message message)
        throws com.liferay.portal.kernel.exception.SystemException {
        _messageLocalService.deleteMessage(message);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.messaging.model.Message fetchMessage(
        java.lang.Long messageId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.fetchMessage(messageId);
    }

    /**
    * Returns the message with the primary key.
    *
    * @param messageId the primary key of the message
    * @return the message
    * @throws PortalException if a message with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.Message getMessage(
        java.lang.Long messageId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.getMessage(messageId);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the messages.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of messages
    * @param end the upper bound of the range of messages (not inclusive)
    * @return the range of messages
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.messaging.model.Message> getMessages(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.getMessages(start, end);
    }

    /**
    * Returns the number of messages.
    *
    * @return the number of messages
    * @throws SystemException if a system exception occurred
    */
    public int getMessagesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.getMessagesCount();
    }

    /**
    * Updates the message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param message the message
    * @return the message that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.Message updateMessage(
        com.ext.portlet.messaging.model.Message message)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.updateMessage(message);
    }

    /**
    * Updates the message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param message the message
    * @param merge whether to merge the message with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the message that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.Message updateMessage(
        com.ext.portlet.messaging.model.Message message, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.updateMessage(message, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _messageLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _messageLocalService.setBeanIdentifier(beanIdentifier);
    }

    public int countSentMessage(long userid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.countSentMessage(userid);
    }

    public java.util.List<com.ext.portlet.messaging.model.Message> findSentMessages(
        long userid, int pagerstart, int pagerend)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _messageLocalService.findSentMessages(userid, pagerstart,
            pagerend);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public MessageLocalService getWrappedMessageLocalService() {
        return _messageLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedMessageLocalService(
        MessageLocalService messageLocalService) {
        _messageLocalService = messageLocalService;
    }

    public MessageLocalService getWrappedService() {
        return _messageLocalService;
    }

    public void setWrappedService(MessageLocalService messageLocalService) {
        _messageLocalService = messageLocalService;
    }
}