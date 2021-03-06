package com.ext.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link BalloonUserTrackingLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see BalloonUserTrackingLocalService
 * @generated
 */
public class BalloonUserTrackingLocalServiceWrapper
    implements BalloonUserTrackingLocalService,
        ServiceWrapper<BalloonUserTrackingLocalService> {
    private BalloonUserTrackingLocalService _balloonUserTrackingLocalService;

    public BalloonUserTrackingLocalServiceWrapper(
        BalloonUserTrackingLocalService balloonUserTrackingLocalService) {
        _balloonUserTrackingLocalService = balloonUserTrackingLocalService;
    }

    /**
    * Adds the balloon user tracking to the database. Also notifies the appropriate model listeners.
    *
    * @param balloonUserTracking the balloon user tracking
    * @return the balloon user tracking that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking addBalloonUserTracking(
        com.ext.portlet.model.BalloonUserTracking balloonUserTracking)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.addBalloonUserTracking(balloonUserTracking);
    }

    /**
    * Creates a new balloon user tracking with the primary key. Does not add the balloon user tracking to the database.
    *
    * @param uuid the primary key for the new balloon user tracking
    * @return the new balloon user tracking
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking createBalloonUserTracking(
        java.lang.String uuid) {
        return _balloonUserTrackingLocalService.createBalloonUserTracking(uuid);
    }

    /**
    * Deletes the balloon user tracking with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param uuid the primary key of the balloon user tracking
    * @return the balloon user tracking that was removed
    * @throws PortalException if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking deleteBalloonUserTracking(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.deleteBalloonUserTracking(uuid);
    }

    /**
    * Deletes the balloon user tracking from the database. Also notifies the appropriate model listeners.
    *
    * @param balloonUserTracking the balloon user tracking
    * @return the balloon user tracking that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking deleteBalloonUserTracking(
        com.ext.portlet.model.BalloonUserTracking balloonUserTracking)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.deleteBalloonUserTracking(balloonUserTracking);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _balloonUserTrackingLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.dynamicQuery(dynamicQuery,
            start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.ext.portlet.model.BalloonUserTracking fetchBalloonUserTracking(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.fetchBalloonUserTracking(uuid);
    }

    /**
    * Returns the balloon user tracking with the primary key.
    *
    * @param uuid the primary key of the balloon user tracking
    * @return the balloon user tracking
    * @throws PortalException if a balloon user tracking with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking getBalloonUserTracking(
        java.lang.String uuid)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.getBalloonUserTracking(uuid);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the balloon user trackings.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.BalloonUserTrackingModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of balloon user trackings
    * @param end the upper bound of the range of balloon user trackings (not inclusive)
    * @return the range of balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.ext.portlet.model.BalloonUserTracking> getBalloonUserTrackings(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.getBalloonUserTrackings(start,
            end);
    }

    /**
    * Returns the number of balloon user trackings.
    *
    * @return the number of balloon user trackings
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getBalloonUserTrackingsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.getBalloonUserTrackingsCount();
    }

    /**
    * Updates the balloon user tracking in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param balloonUserTracking the balloon user tracking
    * @return the balloon user tracking that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.BalloonUserTracking updateBalloonUserTracking(
        com.ext.portlet.model.BalloonUserTracking balloonUserTracking)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.updateBalloonUserTracking(balloonUserTracking);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _balloonUserTrackingLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _balloonUserTrackingLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _balloonUserTrackingLocalService.invokeMethod(name,
            parameterTypes, arguments);
    }

    @Override
    public java.util.List<com.ext.portlet.model.BalloonUserTracking> findByEmail(
        java.lang.String email)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _balloonUserTrackingLocalService.findByEmail(email);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public BalloonUserTrackingLocalService getWrappedBalloonUserTrackingLocalService() {
        return _balloonUserTrackingLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedBalloonUserTrackingLocalService(
        BalloonUserTrackingLocalService balloonUserTrackingLocalService) {
        _balloonUserTrackingLocalService = balloonUserTrackingLocalService;
    }

    @Override
    public BalloonUserTrackingLocalService getWrappedService() {
        return _balloonUserTrackingLocalService;
    }

    @Override
    public void setWrappedService(
        BalloonUserTrackingLocalService balloonUserTrackingLocalService) {
        _balloonUserTrackingLocalService = balloonUserTrackingLocalService;
    }
}
