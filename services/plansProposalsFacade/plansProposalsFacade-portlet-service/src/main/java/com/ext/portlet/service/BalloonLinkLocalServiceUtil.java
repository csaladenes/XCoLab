package com.ext.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for BalloonLink. This utility wraps
 * {@link com.ext.portlet.service.impl.BalloonLinkLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see BalloonLinkLocalService
 * @see com.ext.portlet.service.base.BalloonLinkLocalServiceBaseImpl
 * @see com.ext.portlet.service.impl.BalloonLinkLocalServiceImpl
 * @generated
 */
public class BalloonLinkLocalServiceUtil {
    private static BalloonLinkLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.service.impl.BalloonLinkLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the balloon link to the database. Also notifies the appropriate model listeners.
    *
    * @param balloonLink the balloon link
    * @return the balloon link that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonLink addBalloonLink(
        com.ext.portlet.model.BalloonLink balloonLink)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addBalloonLink(balloonLink);
    }

    /**
    * Creates a new balloon link with the primary key. Does not add the balloon link to the database.
    *
    * @param uuid the primary key for the new balloon link
    * @return the new balloon link
    */
    public static com.ext.portlet.model.BalloonLink createBalloonLink(
        java.lang.String uuid) {
        return getService().createBalloonLink(uuid);
    }

    /**
    * Deletes the balloon link with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param uuid the primary key of the balloon link
    * @return the balloon link that was removed
    * @throws PortalException if a balloon link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonLink deleteBalloonLink(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBalloonLink(uuid);
    }

    /**
    * Deletes the balloon link from the database. Also notifies the appropriate model listeners.
    *
    * @param balloonLink the balloon link
    * @return the balloon link that was removed
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonLink deleteBalloonLink(
        com.ext.portlet.model.BalloonLink balloonLink)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteBalloonLink(balloonLink);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static com.ext.portlet.model.BalloonLink fetchBalloonLink(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchBalloonLink(uuid);
    }

    /**
    * Returns the balloon link with the primary key.
    *
    * @param uuid the primary key of the balloon link
    * @return the balloon link
    * @throws PortalException if a balloon link with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonLink getBalloonLink(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getBalloonLink(uuid);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the balloon links.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonLinkModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of balloon links
    * @param end the upper bound of the range of balloon links (not inclusive)
    * @return the range of balloon links
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.BalloonLink> getBalloonLinks(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBalloonLinks(start, end);
    }

    /**
    * Returns the number of balloon links.
    *
    * @return the number of balloon links
    * @throws SystemException if a system exception occurred
    */
    public static int getBalloonLinksCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBalloonLinksCount();
    }

    /**
    * Updates the balloon link in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param balloonLink the balloon link
    * @return the balloon link that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.BalloonLink updateBalloonLink(
        com.ext.portlet.model.BalloonLink balloonLink)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateBalloonLink(balloonLink);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static com.ext.portlet.model.BalloonLink getBalloonLinkForUser(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getBalloonLinkForUser(uuid);
    }

    public static void clearService() {
        _service = null;
    }

    public static BalloonLinkLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    BalloonLinkLocalService.class.getName());

            if (invokableLocalService instanceof BalloonLinkLocalService) {
                _service = (BalloonLinkLocalService) invokableLocalService;
            } else {
                _service = new BalloonLinkLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(BalloonLinkLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(BalloonLinkLocalService service) {
    }
}
