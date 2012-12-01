package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.model.PlanAttributeFilter;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the plan attribute filter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanAttributeFilterPersistenceImpl
 * @see PlanAttributeFilterUtil
 * @generated
 */
public interface PlanAttributeFilterPersistence extends BasePersistence<PlanAttributeFilter> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PlanAttributeFilterUtil} to access the plan attribute filter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the plan attribute filter in the entity cache if it is enabled.
    *
    * @param planAttributeFilter the plan attribute filter
    */
    public void cacheResult(
        com.ext.portlet.plans.model.PlanAttributeFilter planAttributeFilter);

    /**
    * Caches the plan attribute filters in the entity cache if it is enabled.
    *
    * @param planAttributeFilters the plan attribute filters
    */
    public void cacheResult(
        java.util.List<com.ext.portlet.plans.model.PlanAttributeFilter> planAttributeFilters);

    /**
    * Creates a new plan attribute filter with the primary key. Does not add the plan attribute filter to the database.
    *
    * @param planAttributeFilterId the primary key for the new plan attribute filter
    * @return the new plan attribute filter
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter create(
        java.lang.Long planAttributeFilterId);

    /**
    * Removes the plan attribute filter with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param planAttributeFilterId the primary key of the plan attribute filter
    * @return the plan attribute filter that was removed
    * @throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException if a plan attribute filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter remove(
        java.lang.Long planAttributeFilterId)
        throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.ext.portlet.plans.model.PlanAttributeFilter updateImpl(
        com.ext.portlet.plans.model.PlanAttributeFilter planAttributeFilter,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan attribute filter with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanAttributeFilterException} if it could not be found.
    *
    * @param planAttributeFilterId the primary key of the plan attribute filter
    * @return the plan attribute filter
    * @throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException if a plan attribute filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter findByPrimaryKey(
        java.lang.Long planAttributeFilterId)
        throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan attribute filter with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param planAttributeFilterId the primary key of the plan attribute filter
    * @return the plan attribute filter, or <code>null</code> if a plan attribute filter with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter fetchByPrimaryKey(
        java.lang.Long planAttributeFilterId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan attribute filter where planUserSettingsId = &#63; and attributeName = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanAttributeFilterException} if it could not be found.
    *
    * @param planUserSettingsId the plan user settings ID
    * @param attributeName the attribute name
    * @return the matching plan attribute filter
    * @throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException if a matching plan attribute filter could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter findByPlanUserSettingsIdAttributeName(
        java.lang.Long planUserSettingsId, java.lang.String attributeName)
        throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan attribute filter where planUserSettingsId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param planUserSettingsId the plan user settings ID
    * @param attributeName the attribute name
    * @return the matching plan attribute filter, or <code>null</code> if a matching plan attribute filter could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter fetchByPlanUserSettingsIdAttributeName(
        java.lang.Long planUserSettingsId, java.lang.String attributeName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan attribute filter where planUserSettingsId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param planUserSettingsId the plan user settings ID
    * @param attributeName the attribute name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching plan attribute filter, or <code>null</code> if a matching plan attribute filter could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanAttributeFilter fetchByPlanUserSettingsIdAttributeName(
        java.lang.Long planUserSettingsId, java.lang.String attributeName,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the plan attribute filters.
    *
    * @return the plan attribute filters
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanAttributeFilter> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the plan attribute filters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan attribute filters
    * @param end the upper bound of the range of plan attribute filters (not inclusive)
    * @return the range of plan attribute filters
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanAttributeFilter> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the plan attribute filters.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan attribute filters
    * @param end the upper bound of the range of plan attribute filters (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of plan attribute filters
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanAttributeFilter> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the plan attribute filter where planUserSettingsId = &#63; and attributeName = &#63; from the database.
    *
    * @param planUserSettingsId the plan user settings ID
    * @param attributeName the attribute name
    * @throws SystemException if a system exception occurred
    */
    public void removeByPlanUserSettingsIdAttributeName(
        java.lang.Long planUserSettingsId, java.lang.String attributeName)
        throws com.ext.portlet.plans.NoSuchPlanAttributeFilterException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the plan attribute filters from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of plan attribute filters where planUserSettingsId = &#63; and attributeName = &#63;.
    *
    * @param planUserSettingsId the plan user settings ID
    * @param attributeName the attribute name
    * @return the number of matching plan attribute filters
    * @throws SystemException if a system exception occurred
    */
    public int countByPlanUserSettingsIdAttributeName(
        java.lang.Long planUserSettingsId, java.lang.String attributeName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of plan attribute filters.
    *
    * @return the number of plan attribute filters
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}