package com.ext.portlet.messaging.service.persistence;

import com.ext.portlet.messaging.model.MessagingUserPreferences;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the messaging user preferences service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessagingUserPreferencesPersistenceImpl
 * @see MessagingUserPreferencesUtil
 * @generated
 */
public interface MessagingUserPreferencesPersistence extends BasePersistence<MessagingUserPreferences> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link MessagingUserPreferencesUtil} to access the messaging user preferences persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the messaging user preferences in the entity cache if it is enabled.
    *
    * @param messagingUserPreferences the messaging user preferences
    */
    public void cacheResult(
        com.ext.portlet.messaging.model.MessagingUserPreferences messagingUserPreferences);

    /**
    * Caches the messaging user preferenceses in the entity cache if it is enabled.
    *
    * @param messagingUserPreferenceses the messaging user preferenceses
    */
    public void cacheResult(
        java.util.List<com.ext.portlet.messaging.model.MessagingUserPreferences> messagingUserPreferenceses);

    /**
    * Creates a new messaging user preferences with the primary key. Does not add the messaging user preferences to the database.
    *
    * @param messagingPreferencesId the primary key for the new messaging user preferences
    * @return the new messaging user preferences
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences create(
        java.lang.Long messagingPreferencesId);

    /**
    * Removes the messaging user preferences with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param messagingPreferencesId the primary key of the messaging user preferences
    * @return the messaging user preferences that was removed
    * @throws com.ext.portlet.messaging.NoSuchUserPreferencesException if a messaging user preferences with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences remove(
        java.lang.Long messagingPreferencesId)
        throws com.ext.portlet.messaging.NoSuchUserPreferencesException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.ext.portlet.messaging.model.MessagingUserPreferences updateImpl(
        com.ext.portlet.messaging.model.MessagingUserPreferences messagingUserPreferences,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the messaging user preferences with the primary key or throws a {@link com.ext.portlet.messaging.NoSuchUserPreferencesException} if it could not be found.
    *
    * @param messagingPreferencesId the primary key of the messaging user preferences
    * @return the messaging user preferences
    * @throws com.ext.portlet.messaging.NoSuchUserPreferencesException if a messaging user preferences with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences findByPrimaryKey(
        java.lang.Long messagingPreferencesId)
        throws com.ext.portlet.messaging.NoSuchUserPreferencesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the messaging user preferences with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param messagingPreferencesId the primary key of the messaging user preferences
    * @return the messaging user preferences, or <code>null</code> if a messaging user preferences with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences fetchByPrimaryKey(
        java.lang.Long messagingPreferencesId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the messaging user preferences where userId = &#63; or throws a {@link com.ext.portlet.messaging.NoSuchUserPreferencesException} if it could not be found.
    *
    * @param userId the user ID
    * @return the matching messaging user preferences
    * @throws com.ext.portlet.messaging.NoSuchUserPreferencesException if a matching messaging user preferences could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences findBymessagingPreferences(
        java.lang.Long userId)
        throws com.ext.portlet.messaging.NoSuchUserPreferencesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the messaging user preferences where userId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param userId the user ID
    * @return the matching messaging user preferences, or <code>null</code> if a matching messaging user preferences could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences fetchBymessagingPreferences(
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the messaging user preferences where userId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param userId the user ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching messaging user preferences, or <code>null</code> if a matching messaging user preferences could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.messaging.model.MessagingUserPreferences fetchBymessagingPreferences(
        java.lang.Long userId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the messaging user preferenceses.
    *
    * @return the messaging user preferenceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.messaging.model.MessagingUserPreferences> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the messaging user preferenceses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of messaging user preferenceses
    * @param end the upper bound of the range of messaging user preferenceses (not inclusive)
    * @return the range of messaging user preferenceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.messaging.model.MessagingUserPreferences> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the messaging user preferenceses.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of messaging user preferenceses
    * @param end the upper bound of the range of messaging user preferenceses (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of messaging user preferenceses
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.messaging.model.MessagingUserPreferences> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the messaging user preferences where userId = &#63; from the database.
    *
    * @param userId the user ID
    * @throws SystemException if a system exception occurred
    */
    public void removeBymessagingPreferences(java.lang.Long userId)
        throws com.ext.portlet.messaging.NoSuchUserPreferencesException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the messaging user preferenceses from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of messaging user preferenceses where userId = &#63;.
    *
    * @param userId the user ID
    * @return the number of matching messaging user preferenceses
    * @throws SystemException if a system exception occurred
    */
    public int countBymessagingPreferences(java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of messaging user preferenceses.
    *
    * @return the number of messaging user preferenceses
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}