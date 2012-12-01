package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.model.PlansFilter;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the plans filter service. This utility wraps {@link PlansFilterPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlansFilterPersistence
 * @see PlansFilterPersistenceImpl
 * @generated
 */
public class PlansFilterUtil {
    private static PlansFilterPersistence _persistence;

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
    public static void clearCache(PlansFilter plansFilter) {
        getPersistence().clearCache(plansFilter);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<PlansFilter> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<PlansFilter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<PlansFilter> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static PlansFilter update(PlansFilter plansFilter, boolean merge)
        throws SystemException {
        return getPersistence().update(plansFilter, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static PlansFilter update(PlansFilter plansFilter, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(plansFilter, merge, serviceContext);
    }

    /**
    * Caches the plans filter in the entity cache if it is enabled.
    *
    * @param plansFilter the plans filter
    */
    public static void cacheResult(
        com.ext.portlet.plans.model.PlansFilter plansFilter) {
        getPersistence().cacheResult(plansFilter);
    }

    /**
    * Caches the plans filters in the entity cache if it is enabled.
    *
    * @param plansFilters the plans filters
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.plans.model.PlansFilter> plansFilters) {
        getPersistence().cacheResult(plansFilters);
    }

    /**
    * Creates a new plans filter with the primary key. Does not add the plans filter to the database.
    *
    * @param plansFilterPK the primary key for the new plans filter
    * @return the new plans filter
    */
    public static com.ext.portlet.plans.model.PlansFilter create(
        PlansFilterPK plansFilterPK) {
        return getPersistence().create(plansFilterPK);
    }

    /**
    * Removes the plans filter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param plansFilterPK the primary key of the plans filter
    * @return the plans filter that was removed
    * @throws com.ext.portlet.plans.NoSuchFilterException if a plans filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlansFilter remove(
        PlansFilterPK plansFilterPK)
        throws com.ext.portlet.plans.NoSuchFilterException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(plansFilterPK);
    }

    public static com.ext.portlet.plans.model.PlansFilter updateImpl(
        com.ext.portlet.plans.model.PlansFilter plansFilter, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(plansFilter, merge);
    }

    /**
    * Returns the plans filter with the primary key or throws a {@link com.ext.portlet.plans.NoSuchFilterException} if it could not be found.
    *
    * @param plansFilterPK the primary key of the plans filter
    * @return the plans filter
    * @throws com.ext.portlet.plans.NoSuchFilterException if a plans filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlansFilter findByPrimaryKey(
        PlansFilterPK plansFilterPK)
        throws com.ext.portlet.plans.NoSuchFilterException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(plansFilterPK);
    }

    /**
    * Returns the plans filter with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param plansFilterPK the primary key of the plans filter
    * @return the plans filter, or <code>null</code> if a plans filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.plans.model.PlansFilter fetchByPrimaryKey(
        PlansFilterPK plansFilterPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(plansFilterPK);
    }

    /**
    * Returns all the plans filters.
    *
    * @return the plans filters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.plans.model.PlansFilter> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the plans filters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plans filters
    * @param end the upper bound of the range of plans filters (not inclusive)
    * @return the range of plans filters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.plans.model.PlansFilter> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the plans filters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plans filters
    * @param end the upper bound of the range of plans filters (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of plans filters
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.plans.model.PlansFilter> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the plans filters from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of plans filters.
    *
    * @return the number of plans filters
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PlansFilterPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PlansFilterPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.plans.service.ClpSerializer.getServletContextName(),
                    PlansFilterPersistence.class.getName());

            ReferenceRegistry.registerReference(PlansFilterUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    public void setPersistence(PlansFilterPersistence persistence) {
        _persistence = persistence;

        ReferenceRegistry.registerReference(PlansFilterUtil.class,
            "_persistence");
    }
}