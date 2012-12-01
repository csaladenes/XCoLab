package com.ext.portlet.messaging.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the message recipient status local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessageRecipientStatusLocalServiceUtil
 * @see com.ext.portlet.messaging.service.base.MessageRecipientStatusLocalServiceBaseImpl
 * @see com.ext.portlet.messaging.service.impl.MessageRecipientStatusLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface MessageRecipientStatusLocalService
    extends PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MessageRecipientStatusLocalServiceUtil} to access the message recipient status local service. Add custom service methods to {@link com.ext.portlet.messaging.service.impl.MessageRecipientStatusLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the message recipient status to the database. Also notifies the appropriate model listeners.
    *
    * @param messageRecipientStatus the message recipient status
    * @return the message recipient status that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessageRecipientStatus addMessageRecipientStatus(
        com.ext.portlet.messaging.model.MessageRecipientStatus messageRecipientStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new message recipient status with the primary key. Does not add the message recipient status to the database.
    *
    * @param messageRecipientId the primary key for the new message recipient status
    * @return the new message recipient status
    */
    public com.ext.portlet.messaging.model.MessageRecipientStatus createMessageRecipientStatus(
        java.lang.Long messageRecipientId);

    /**
    * Deletes the message recipient status with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param messageRecipientId the primary key of the message recipient status
    * @throws PortalException if a message recipient status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteMessageRecipientStatus(java.lang.Long messageRecipientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the message recipient status from the database. Also notifies the appropriate model listeners.
    *
    * @param messageRecipientStatus the message recipient status
    * @throws SystemException if a system exception occurred
    */
    public void deleteMessageRecipientStatus(
        com.ext.portlet.messaging.model.MessageRecipientStatus messageRecipientStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

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
        throws com.liferay.portal.kernel.exception.SystemException;

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
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.messaging.model.MessageRecipientStatus fetchMessageRecipientStatus(
        java.lang.Long messageRecipientId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the message recipient status with the primary key.
    *
    * @param messageRecipientId the primary key of the message recipient status
    * @return the message recipient status
    * @throws PortalException if a message recipient status with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.messaging.model.MessageRecipientStatus getMessageRecipientStatus(
        java.lang.Long messageRecipientId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the message recipient statuses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of message recipient statuses
    * @param end the upper bound of the range of message recipient statuses (not inclusive)
    * @return the range of message recipient statuses
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.ext.portlet.messaging.model.MessageRecipientStatus> getMessageRecipientStatuses(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of message recipient statuses.
    *
    * @return the number of message recipient statuses
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getMessageRecipientStatusesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the message recipient status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param messageRecipientStatus the message recipient status
    * @return the message recipient status that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessageRecipientStatus updateMessageRecipientStatus(
        com.ext.portlet.messaging.model.MessageRecipientStatus messageRecipientStatus)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the message recipient status in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param messageRecipientStatus the message recipient status
    * @param merge whether to merge the message recipient status with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the message recipient status that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessageRecipientStatus updateMessageRecipientStatus(
        com.ext.portlet.messaging.model.MessageRecipientStatus messageRecipientStatus,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    public int countByMessageId(long messageId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.ext.portlet.messaging.model.MessageRecipientStatus> findByMessageId(
        long messageId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countArchivedMessagesForUser(long userid)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.ext.portlet.messaging.model.MessageRecipientStatus> findArchivedMessagesForUser(
        long userid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public int countInboxMessagesForUser(long userid)
        throws com.liferay.portal.kernel.exception.SystemException;

    public java.util.List<com.ext.portlet.messaging.model.MessageRecipientStatus> findInboxMessagesForUser(
        long userid, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.ext.portlet.messaging.model.MessageRecipientStatus findByMessageRecipient(
        long userid, long messageid)
        throws com.ext.portlet.messaging.NoSuchMessageRecipientStatusException,
            com.liferay.portal.kernel.exception.SystemException;
}