package com.ext.portlet.ontology.service.persistence;

import com.ext.portlet.ontology.model.OntologyTerm;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the ontology term service. This utility wraps {@link OntologyTermPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OntologyTermPersistence
 * @see OntologyTermPersistenceImpl
 * @generated
 */
public class OntologyTermUtil {
    private static OntologyTermPersistence _persistence;

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
    public static void clearCache(OntologyTerm ontologyTerm) {
        getPersistence().clearCache(ontologyTerm);
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
    public static List<OntologyTerm> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<OntologyTerm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<OntologyTerm> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static OntologyTerm update(OntologyTerm ontologyTerm, boolean merge)
        throws SystemException {
        return getPersistence().update(ontologyTerm, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static OntologyTerm update(OntologyTerm ontologyTerm, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(ontologyTerm, merge, serviceContext);
    }

    /**
    * Caches the ontology term in the entity cache if it is enabled.
    *
    * @param ontologyTerm the ontology term
    */
    public static void cacheResult(
        com.ext.portlet.ontology.model.OntologyTerm ontologyTerm) {
        getPersistence().cacheResult(ontologyTerm);
    }

    /**
    * Caches the ontology terms in the entity cache if it is enabled.
    *
    * @param ontologyTerms the ontology terms
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.ontology.model.OntologyTerm> ontologyTerms) {
        getPersistence().cacheResult(ontologyTerms);
    }

    /**
    * Creates a new ontology term with the primary key. Does not add the ontology term to the database.
    *
    * @param id the primary key for the new ontology term
    * @return the new ontology term
    */
    public static com.ext.portlet.ontology.model.OntologyTerm create(
        java.lang.Long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the ontology term with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the ontology term
    * @return the ontology term that was removed
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm remove(
        java.lang.Long id)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.ext.portlet.ontology.model.OntologyTerm updateImpl(
        com.ext.portlet.ontology.model.OntologyTerm ontologyTerm, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ontologyTerm, merge);
    }

    /**
    * Returns the ontology term with the primary key or throws a {@link com.ext.portlet.ontology.NoSuchOntologyTermException} if it could not be found.
    *
    * @param id the primary key of the ontology term
    * @return the ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByPrimaryKey(
        java.lang.Long id)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the ontology term with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the ontology term
    * @return the ontology term, or <code>null</code> if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm fetchByPrimaryKey(
        java.lang.Long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the ontology terms where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @return the matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentId(
        java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByParentId(parentId);
    }

    /**
    * Returns a range of all the ontology terms where parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @return the range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentId(
        java.lang.Long parentId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByParentId(parentId, start, end);
    }

    /**
    * Returns an ordered range of all the ontology terms where parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentId(
        java.lang.Long parentId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentId(parentId, start, end, orderByComparator);
    }

    /**
    * Returns the first ontology term in the ordered set where parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByParentId_First(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByParentId_First(parentId, orderByComparator);
    }

    /**
    * Returns the last ontology term in the ordered set where parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByParentId_Last(
        java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByParentId_Last(parentId, orderByComparator);
    }

    /**
    * Returns the ontology terms before and after the current ontology term in the ordered set where parentId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the primary key of the current ontology term
    * @param parentId the parent ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm[] findByParentId_PrevAndNext(
        java.lang.Long id, java.lang.Long parentId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentId_PrevAndNext(id, parentId, orderByComparator);
    }

    /**
    * Returns all the ontology terms where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @return the matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentIdSpaceId(
        java.lang.Long parentId, java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByParentIdSpaceId(parentId, ontologySpaceId);
    }

    /**
    * Returns a range of all the ontology terms where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @return the range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentIdSpaceId(
        java.lang.Long parentId, java.lang.Long ontologySpaceId, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentIdSpaceId(parentId, ontologySpaceId, start, end);
    }

    /**
    * Returns an ordered range of all the ontology terms where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByParentIdSpaceId(
        java.lang.Long parentId, java.lang.Long ontologySpaceId, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentIdSpaceId(parentId, ontologySpaceId, start,
            end, orderByComparator);
    }

    /**
    * Returns the first ontology term in the ordered set where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByParentIdSpaceId_First(
        java.lang.Long parentId, java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentIdSpaceId_First(parentId, ontologySpaceId,
            orderByComparator);
    }

    /**
    * Returns the last ontology term in the ordered set where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByParentIdSpaceId_Last(
        java.lang.Long parentId, java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentIdSpaceId_Last(parentId, ontologySpaceId,
            orderByComparator);
    }

    /**
    * Returns the ontology terms before and after the current ontology term in the ordered set where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the primary key of the current ontology term
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm[] findByParentIdSpaceId_PrevAndNext(
        java.lang.Long id, java.lang.Long parentId,
        java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByParentIdSpaceId_PrevAndNext(id, parentId,
            ontologySpaceId, orderByComparator);
    }

    /**
    * Returns all the ontology terms where ontologySpaceId = &#63;.
    *
    * @param ontologySpaceId the ontology space ID
    * @return the matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findBySpaceId(
        java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySpaceId(ontologySpaceId);
    }

    /**
    * Returns a range of all the ontology terms where ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ontologySpaceId the ontology space ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @return the range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findBySpaceId(
        java.lang.Long ontologySpaceId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findBySpaceId(ontologySpaceId, start, end);
    }

    /**
    * Returns an ordered range of all the ontology terms where ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ontologySpaceId the ontology space ID
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findBySpaceId(
        java.lang.Long ontologySpaceId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySpaceId(ontologySpaceId, start, end, orderByComparator);
    }

    /**
    * Returns the first ontology term in the ordered set where ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findBySpaceId_First(
        java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySpaceId_First(ontologySpaceId, orderByComparator);
    }

    /**
    * Returns the last ontology term in the ordered set where ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findBySpaceId_Last(
        java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySpaceId_Last(ontologySpaceId, orderByComparator);
    }

    /**
    * Returns the ontology terms before and after the current ontology term in the ordered set where ontologySpaceId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the primary key of the current ontology term
    * @param ontologySpaceId the ontology space ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm[] findBySpaceId_PrevAndNext(
        java.lang.Long id, java.lang.Long ontologySpaceId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findBySpaceId_PrevAndNext(id, ontologySpaceId,
            orderByComparator);
    }

    /**
    * Returns all the ontology terms where name = &#63;.
    *
    * @param name the name
    * @return the matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByName(
        java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name);
    }

    /**
    * Returns a range of all the ontology terms where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @return the range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByName(
        java.lang.String name, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end);
    }

    /**
    * Returns an ordered range of all the ontology terms where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param name the name
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findByName(
        java.lang.String name, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName(name, start, end, orderByComparator);
    }

    /**
    * Returns the first ontology term in the ordered set where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByName_First(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_First(name, orderByComparator);
    }

    /**
    * Returns the last ontology term in the ordered set where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a matching ontology term could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm findByName_Last(
        java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByName_Last(name, orderByComparator);
    }

    /**
    * Returns the ontology terms before and after the current ontology term in the ordered set where name = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the primary key of the current ontology term
    * @param name the name
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next ontology term
    * @throws com.ext.portlet.ontology.NoSuchOntologyTermException if a ontology term with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.ontology.model.OntologyTerm[] findByName_PrevAndNext(
        java.lang.Long id, java.lang.String name,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.ontology.NoSuchOntologyTermException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByName_PrevAndNext(id, name, orderByComparator);
    }

    /**
    * Returns all the ontology terms.
    *
    * @return the ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the ontology terms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @return the range of ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the ontology terms.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of ontology terms
    * @param end the upper bound of the range of ontology terms (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.ontology.model.OntologyTerm> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the ontology terms where parentId = &#63; from the database.
    *
    * @param parentId the parent ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByParentId(java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByParentId(parentId);
    }

    /**
    * Removes all the ontology terms where parentId = &#63; and ontologySpaceId = &#63; from the database.
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeByParentIdSpaceId(java.lang.Long parentId,
        java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByParentIdSpaceId(parentId, ontologySpaceId);
    }

    /**
    * Removes all the ontology terms where ontologySpaceId = &#63; from the database.
    *
    * @param ontologySpaceId the ontology space ID
    * @throws SystemException if a system exception occurred
    */
    public static void removeBySpaceId(java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeBySpaceId(ontologySpaceId);
    }

    /**
    * Removes all the ontology terms where name = &#63; from the database.
    *
    * @param name the name
    * @throws SystemException if a system exception occurred
    */
    public static void removeByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByName(name);
    }

    /**
    * Removes all the ontology terms from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of ontology terms where parentId = &#63;.
    *
    * @param parentId the parent ID
    * @return the number of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static int countByParentId(java.lang.Long parentId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByParentId(parentId);
    }

    /**
    * Returns the number of ontology terms where parentId = &#63; and ontologySpaceId = &#63;.
    *
    * @param parentId the parent ID
    * @param ontologySpaceId the ontology space ID
    * @return the number of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static int countByParentIdSpaceId(java.lang.Long parentId,
        java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByParentIdSpaceId(parentId, ontologySpaceId);
    }

    /**
    * Returns the number of ontology terms where ontologySpaceId = &#63;.
    *
    * @param ontologySpaceId the ontology space ID
    * @return the number of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static int countBySpaceId(java.lang.Long ontologySpaceId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countBySpaceId(ontologySpaceId);
    }

    /**
    * Returns the number of ontology terms where name = &#63;.
    *
    * @param name the name
    * @return the number of matching ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static int countByName(java.lang.String name)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByName(name);
    }

    /**
    * Returns the number of ontology terms.
    *
    * @return the number of ontology terms
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static OntologyTermPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (OntologyTermPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.ontology.service.ClpSerializer.getServletContextName(),
                    OntologyTermPersistence.class.getName());

            ReferenceRegistry.registerReference(OntologyTermUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    public void setPersistence(OntologyTermPersistence persistence) {
        _persistence = persistence;

        ReferenceRegistry.registerReference(OntologyTermUtil.class,
            "_persistence");
    }
}