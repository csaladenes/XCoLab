package com.ext.portlet.service.persistence;

import com.ext.portlet.model.ActivitySubscription;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the activity subscription service. This utility wraps {@link ActivitySubscriptionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ActivitySubscriptionPersistence
 * @see ActivitySubscriptionPersistenceImpl
 * @generated
 */
public class ActivitySubscriptionUtil {
    private static ActivitySubscriptionPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(ActivitySubscription activitySubscription) {
        getPersistence().clearCache(activitySubscription);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<ActivitySubscription> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ActivitySubscription> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ActivitySubscription> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static ActivitySubscription update(
        ActivitySubscription activitySubscription) throws SystemException {
        return getPersistence().update(activitySubscription);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static ActivitySubscription update(
        ActivitySubscription activitySubscription, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(activitySubscription, serviceContext);
    }

    /**
    * Returns all the activity subscriptions where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByreceiverId(
        long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByreceiverId(receiverId);
    }

    /**
    * Returns a range of all the activity subscriptions where receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByreceiverId(
        long receiverId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByreceiverId(receiverId, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByreceiverId(
        long receiverId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByreceiverId(receiverId, start, end, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByreceiverId_First(
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByreceiverId_First(receiverId, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByreceiverId_First(
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByreceiverId_First(receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByreceiverId_Last(
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByreceiverId_Last(receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByreceiverId_Last(
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByreceiverId_Last(receiverId, orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where receiverId = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByreceiverId_PrevAndNext(
        long pk, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByreceiverId_PrevAndNext(pk, receiverId,
            orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where receiverId = &#63; from the database.
    *
    * @param receiverId the receiver ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByreceiverId(long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByreceiverId(receiverId);
    }

    /**
    * Returns the number of activity subscriptions where receiverId = &#63;.
    *
    * @param receiverId the receiver ID
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByreceiverId(long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByreceiverId(receiverId);
    }

    /**
    * Returns all the activity subscriptions where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPK(
        long classNameId, long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByClassNameIdClassPK(classNameId, classPK);
    }

    /**
    * Returns a range of all the activity subscriptions where classNameId = &#63; and classPK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPK(
        long classNameId, long classPK, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPK(classNameId, classPK, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where classNameId = &#63; and classPK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPK(
        long classNameId, long classPK, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPK(classNameId, classPK, start, end,
            orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPK_First(
        long classNameId, long classPK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPK_First(classNameId, classPK,
            orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPK_First(
        long classNameId, long classPK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPK_First(classNameId, classPK,
            orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPK_Last(
        long classNameId, long classPK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPK_Last(classNameId, classPK,
            orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPK_Last(
        long classNameId, long classPK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPK_Last(classNameId, classPK,
            orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where classNameId = &#63; and classPK = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByClassNameIdClassPK_PrevAndNext(
        long pk, long classNameId, long classPK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPK_PrevAndNext(pk, classNameId,
            classPK, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where classNameId = &#63; and classPK = &#63; from the database.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassNameIdClassPK(long classNameId, long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByClassNameIdClassPK(classNameId, classPK);
    }

    /**
    * Returns the number of activity subscriptions where classNameId = &#63; and classPK = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassNameIdClassPK(long classNameId, long classPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByClassNameIdClassPK(classNameId, classPK);
    }

    /**
    * Returns all the activity subscriptions where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKReceiverId(
        long classNameId, long classPK, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId(classNameId, classPK,
            receiverId);
    }

    /**
    * Returns a range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKReceiverId(
        long classNameId, long classPK, long receiverId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId(classNameId, classPK,
            receiverId, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKReceiverId(
        long classNameId, long classPK, long receiverId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId(classNameId, classPK,
            receiverId, start, end, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKReceiverId_First(
        long classNameId, long classPK, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId_First(classNameId,
            classPK, receiverId, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKReceiverId_First(
        long classNameId, long classPK, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKReceiverId_First(classNameId,
            classPK, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKReceiverId_Last(
        long classNameId, long classPK, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId_Last(classNameId,
            classPK, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKReceiverId_Last(
        long classNameId, long classPK, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKReceiverId_Last(classNameId,
            classPK, receiverId, orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByClassNameIdClassPKReceiverId_PrevAndNext(
        long pk, long classNameId, long classPK, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKReceiverId_PrevAndNext(pk,
            classNameId, classPK, receiverId, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where classNameId = &#63; and classPK = &#63; and receiverId = &#63; from the database.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassNameIdClassPKReceiverId(long classNameId,
        long classPK, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByClassNameIdClassPKReceiverId(classNameId, classPK,
            receiverId);
    }

    /**
    * Returns the number of activity subscriptions where classNameId = &#63; and classPK = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param receiverId the receiver ID
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassNameIdClassPKReceiverId(long classNameId,
        long classPK, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByClassNameIdClassPKReceiverId(classNameId, classPK,
            receiverId);
    }

    /**
    * Returns all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeReceiverId(
        long classNameId, long classPK, int type, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId(classNameId,
            classPK, type, receiverId);
    }

    /**
    * Returns a range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeReceiverId(
        long classNameId, long classPK, int type, long receiverId, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId(classNameId,
            classPK, type, receiverId, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeReceiverId(
        long classNameId, long classPK, int type, long receiverId, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId(classNameId,
            classPK, type, receiverId, start, end, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeReceiverId_First(
        long classNameId, long classPK, int type, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId_First(classNameId,
            classPK, type, receiverId, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeReceiverId_First(
        long classNameId, long classPK, int type, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeReceiverId_First(classNameId,
            classPK, type, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeReceiverId_Last(
        long classNameId, long classPK, int type, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId_Last(classNameId,
            classPK, type, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeReceiverId_Last(
        long classNameId, long classPK, int type, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeReceiverId_Last(classNameId,
            classPK, type, receiverId, orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByClassNameIdClassPKTypeReceiverId_PrevAndNext(
        long pk, long classNameId, long classPK, int type, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeReceiverId_PrevAndNext(pk,
            classNameId, classPK, type, receiverId, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63; from the database.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassNameIdClassPKTypeReceiverId(
        long classNameId, long classPK, int type, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByClassNameIdClassPKTypeReceiverId(classNameId, classPK,
            type, receiverId);
    }

    /**
    * Returns the number of activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param receiverId the receiver ID
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassNameIdClassPKTypeReceiverId(
        long classNameId, long classPK, int type, long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByClassNameIdClassPKTypeReceiverId(classNameId,
            classPK, type, receiverId);
    }

    /**
    * Returns all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraDataReceiverId(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId(classNameId,
            classPK, type, extraData, receiverId);
    }

    /**
    * Returns a range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraDataReceiverId(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId(classNameId,
            classPK, type, extraData, receiverId, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraDataReceiverId(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId(classNameId,
            classPK, type, extraData, receiverId, start, end, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeExtraDataReceiverId_First(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId_First(classNameId,
            classPK, type, extraData, receiverId, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeExtraDataReceiverId_First(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeExtraDataReceiverId_First(classNameId,
            classPK, type, extraData, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeExtraDataReceiverId_Last(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId_Last(classNameId,
            classPK, type, extraData, receiverId, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeExtraDataReceiverId_Last(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeExtraDataReceiverId_Last(classNameId,
            classPK, type, extraData, receiverId, orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByClassNameIdClassPKTypeExtraDataReceiverId_PrevAndNext(
        long pk, long classNameId, long classPK, int type,
        java.lang.String extraData, long receiverId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraDataReceiverId_PrevAndNext(pk,
            classNameId, classPK, type, extraData, receiverId, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63; from the database.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassNameIdClassPKTypeExtraDataReceiverId(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByClassNameIdClassPKTypeExtraDataReceiverId(classNameId,
            classPK, type, extraData, receiverId);
    }

    /**
    * Returns the number of activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; and receiverId = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param receiverId the receiver ID
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassNameIdClassPKTypeExtraDataReceiverId(
        long classNameId, long classPK, int type, java.lang.String extraData,
        long receiverId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByClassNameIdClassPKTypeExtraDataReceiverId(classNameId,
            classPK, type, extraData, receiverId);
    }

    /**
    * Returns all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @return the matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraData(
        long classNameId, long classPK, int type, java.lang.String extraData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData(classNameId, classPK,
            type, extraData);
    }

    /**
    * Returns a range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraData(
        long classNameId, long classPK, int type, java.lang.String extraData,
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData(classNameId, classPK,
            type, extraData, start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findByClassNameIdClassPKTypeExtraData(
        long classNameId, long classPK, int type, java.lang.String extraData,
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData(classNameId, classPK,
            type, extraData, start, end, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeExtraData_First(
        long classNameId, long classPK, int type, java.lang.String extraData,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData_First(classNameId,
            classPK, type, extraData, orderByComparator);
    }

    /**
    * Returns the first activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeExtraData_First(
        long classNameId, long classPK, int type, java.lang.String extraData,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeExtraData_First(classNameId,
            classPK, type, extraData, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByClassNameIdClassPKTypeExtraData_Last(
        long classNameId, long classPK, int type, java.lang.String extraData,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData_Last(classNameId,
            classPK, type, extraData, orderByComparator);
    }

    /**
    * Returns the last activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching activity subscription, or <code>null</code> if a matching activity subscription could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByClassNameIdClassPKTypeExtraData_Last(
        long classNameId, long classPK, int type, java.lang.String extraData,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByClassNameIdClassPKTypeExtraData_Last(classNameId,
            classPK, type, extraData, orderByComparator);
    }

    /**
    * Returns the activity subscriptions before and after the current activity subscription in the ordered set where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param pk the primary key of the current activity subscription
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription[] findByClassNameIdClassPKTypeExtraData_PrevAndNext(
        long pk, long classNameId, long classPK, int type,
        java.lang.String extraData,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByClassNameIdClassPKTypeExtraData_PrevAndNext(pk,
            classNameId, classPK, type, extraData, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63; from the database.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @throws SystemException if a system exception occurred
    */
    public static void removeByClassNameIdClassPKTypeExtraData(
        long classNameId, long classPK, int type, java.lang.String extraData)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence()
            .removeByClassNameIdClassPKTypeExtraData(classNameId, classPK,
            type, extraData);
    }

    /**
    * Returns the number of activity subscriptions where classNameId = &#63; and classPK = &#63; and type = &#63; and extraData = &#63;.
    *
    * @param classNameId the class name ID
    * @param classPK the class p k
    * @param type the type
    * @param extraData the extra data
    * @return the number of matching activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countByClassNameIdClassPKTypeExtraData(long classNameId,
        long classPK, int type, java.lang.String extraData)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .countByClassNameIdClassPKTypeExtraData(classNameId,
            classPK, type, extraData);
    }

    /**
    * Caches the activity subscription in the entity cache if it is enabled.
    *
    * @param activitySubscription the activity subscription
    */
    public static void cacheResult(
        com.ext.portlet.model.ActivitySubscription activitySubscription) {
        getPersistence().cacheResult(activitySubscription);
    }

    /**
    * Caches the activity subscriptions in the entity cache if it is enabled.
    *
    * @param activitySubscriptions the activity subscriptions
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.model.ActivitySubscription> activitySubscriptions) {
        getPersistence().cacheResult(activitySubscriptions);
    }

    /**
    * Creates a new activity subscription with the primary key. Does not add the activity subscription to the database.
    *
    * @param pk the primary key for the new activity subscription
    * @return the new activity subscription
    */
    public static com.ext.portlet.model.ActivitySubscription create(long pk) {
        return getPersistence().create(pk);
    }

    /**
    * Removes the activity subscription with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pk the primary key of the activity subscription
    * @return the activity subscription that was removed
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription remove(long pk)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(pk);
    }

    public static com.ext.portlet.model.ActivitySubscription updateImpl(
        com.ext.portlet.model.ActivitySubscription activitySubscription)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(activitySubscription);
    }

    /**
    * Returns the activity subscription with the primary key or throws a {@link com.ext.portlet.NoSuchActivitySubscriptionException} if it could not be found.
    *
    * @param pk the primary key of the activity subscription
    * @return the activity subscription
    * @throws com.ext.portlet.NoSuchActivitySubscriptionException if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription findByPrimaryKey(
        long pk)
        throws com.ext.portlet.NoSuchActivitySubscriptionException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(pk);
    }

    /**
    * Returns the activity subscription with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pk the primary key of the activity subscription
    * @return the activity subscription, or <code>null</code> if a activity subscription with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.ActivitySubscription fetchByPrimaryKey(
        long pk) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(pk);
    }

    /**
    * Returns all the activity subscriptions.
    *
    * @return the activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the activity subscriptions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @return the range of activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the activity subscriptions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ActivitySubscriptionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of activity subscriptions
    * @param end the upper bound of the range of activity subscriptions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.ActivitySubscription> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the activity subscriptions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of activity subscriptions.
    *
    * @return the number of activity subscriptions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ActivitySubscriptionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ActivitySubscriptionPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.service.ClpSerializer.getServletContextName(),
                    ActivitySubscriptionPersistence.class.getName());

            ReferenceRegistry.registerReference(ActivitySubscriptionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(ActivitySubscriptionPersistence persistence) {
    }
}
