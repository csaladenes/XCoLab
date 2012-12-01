package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.model.PlanTypeAttribute;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the plan type attribute service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTypeAttributePersistenceImpl
 * @see PlanTypeAttributeUtil
 * @generated
 */
public interface PlanTypeAttributePersistence extends BasePersistence<PlanTypeAttribute> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PlanTypeAttributeUtil} to access the plan type attribute persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the plan type attribute in the entity cache if it is enabled.
    *
    * @param planTypeAttribute the plan type attribute
    */
    public void cacheResult(
        com.ext.portlet.plans.model.PlanTypeAttribute planTypeAttribute);

    /**
    * Caches the plan type attributes in the entity cache if it is enabled.
    *
    * @param planTypeAttributes the plan type attributes
    */
    public void cacheResult(
        java.util.List<com.ext.portlet.plans.model.PlanTypeAttribute> planTypeAttributes);

    /**
    * Creates a new plan type attribute with the primary key. Does not add the plan type attribute to the database.
    *
    * @param planTypeAttributeId the primary key for the new plan type attribute
    * @return the new plan type attribute
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute create(
        java.lang.Long planTypeAttributeId);

    /**
    * Removes the plan type attribute with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param planTypeAttributeId the primary key of the plan type attribute
    * @return the plan type attribute that was removed
    * @throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException if a plan type attribute with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute remove(
        java.lang.Long planTypeAttributeId)
        throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.ext.portlet.plans.model.PlanTypeAttribute updateImpl(
        com.ext.portlet.plans.model.PlanTypeAttribute planTypeAttribute,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan type attribute with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanTypeAttributeException} if it could not be found.
    *
    * @param planTypeAttributeId the primary key of the plan type attribute
    * @return the plan type attribute
    * @throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException if a plan type attribute with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute findByPrimaryKey(
        java.lang.Long planTypeAttributeId)
        throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan type attribute with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param planTypeAttributeId the primary key of the plan type attribute
    * @return the plan type attribute, or <code>null</code> if a plan type attribute with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute fetchByPrimaryKey(
        java.lang.Long planTypeAttributeId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan type attribute where planTypeId = &#63; and attributeName = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanTypeAttributeException} if it could not be found.
    *
    * @param planTypeId the plan type ID
    * @param attributeName the attribute name
    * @return the matching plan type attribute
    * @throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException if a matching plan type attribute could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute findByPlanTypeIdAttributeName(
        java.lang.Long planTypeId, java.lang.String attributeName)
        throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan type attribute where planTypeId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param planTypeId the plan type ID
    * @param attributeName the attribute name
    * @return the matching plan type attribute, or <code>null</code> if a matching plan type attribute could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute fetchByPlanTypeIdAttributeName(
        java.lang.Long planTypeId, java.lang.String attributeName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the plan type attribute where planTypeId = &#63; and attributeName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param planTypeId the plan type ID
    * @param attributeName the attribute name
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching plan type attribute, or <code>null</code> if a matching plan type attribute could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTypeAttribute fetchByPlanTypeIdAttributeName(
        java.lang.Long planTypeId, java.lang.String attributeName,
        boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the plan type attributes.
    *
    * @return the plan type attributes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanTypeAttribute> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the plan type attributes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan type attributes
    * @param end the upper bound of the range of plan type attributes (not inclusive)
    * @return the range of plan type attributes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanTypeAttribute> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the plan type attributes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan type attributes
    * @param end the upper bound of the range of plan type attributes (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of plan type attributes
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanTypeAttribute> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the plan type attribute where planTypeId = &#63; and attributeName = &#63; from the database.
    *
    * @param planTypeId the plan type ID
    * @param attributeName the attribute name
    * @throws SystemException if a system exception occurred
    */
    public void removeByPlanTypeIdAttributeName(java.lang.Long planTypeId,
        java.lang.String attributeName)
        throws com.ext.portlet.plans.NoSuchPlanTypeAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the plan type attributes from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of plan type attributes where planTypeId = &#63; and attributeName = &#63;.
    *
    * @param planTypeId the plan type ID
    * @param attributeName the attribute name
    * @return the number of matching plan type attributes
    * @throws SystemException if a system exception occurred
    */
    public int countByPlanTypeIdAttributeName(java.lang.Long planTypeId,
        java.lang.String attributeName)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of plan type attributes.
    *
    * @return the number of plan type attributes
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}