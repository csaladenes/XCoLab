package com.ext.portlet.contests.service.persistence;

import com.ext.portlet.contests.model.ContestPhaseColumn;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the contest phase column service. This utility wraps {@link ContestPhaseColumnPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContestPhaseColumnPersistence
 * @see ContestPhaseColumnPersistenceImpl
 * @generated
 */
public class ContestPhaseColumnUtil {
    private static ContestPhaseColumnPersistence _persistence;

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
    public static void clearCache(ContestPhaseColumn contestPhaseColumn) {
        getPersistence().clearCache(contestPhaseColumn);
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
    public static List<ContestPhaseColumn> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<ContestPhaseColumn> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<ContestPhaseColumn> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
     */
    public static ContestPhaseColumn update(
        ContestPhaseColumn contestPhaseColumn, boolean merge)
        throws SystemException {
        return getPersistence().update(contestPhaseColumn, merge);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
     */
    public static ContestPhaseColumn update(
        ContestPhaseColumn contestPhaseColumn, boolean merge,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(contestPhaseColumn, merge, serviceContext);
    }

    /**
    * Caches the contest phase column in the entity cache if it is enabled.
    *
    * @param contestPhaseColumn the contest phase column
    */
    public static void cacheResult(
        com.ext.portlet.contests.model.ContestPhaseColumn contestPhaseColumn) {
        getPersistence().cacheResult(contestPhaseColumn);
    }

    /**
    * Caches the contest phase columns in the entity cache if it is enabled.
    *
    * @param contestPhaseColumns the contest phase columns
    */
    public static void cacheResult(
        java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> contestPhaseColumns) {
        getPersistence().cacheResult(contestPhaseColumns);
    }

    /**
    * Creates a new contest phase column with the primary key. Does not add the contest phase column to the database.
    *
    * @param id the primary key for the new contest phase column
    * @return the new contest phase column
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn create(
        java.lang.Long id) {
        return getPersistence().create(id);
    }

    /**
    * Removes the contest phase column with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the contest phase column
    * @return the contest phase column that was removed
    * @throws com.ext.portlet.contests.NoSuchContestPhaseColumnException if a contest phase column with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn remove(
        java.lang.Long id)
        throws com.ext.portlet.contests.NoSuchContestPhaseColumnException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().remove(id);
    }

    public static com.ext.portlet.contests.model.ContestPhaseColumn updateImpl(
        com.ext.portlet.contests.model.ContestPhaseColumn contestPhaseColumn,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(contestPhaseColumn, merge);
    }

    /**
    * Returns the contest phase column with the primary key or throws a {@link com.ext.portlet.contests.NoSuchContestPhaseColumnException} if it could not be found.
    *
    * @param id the primary key of the contest phase column
    * @return the contest phase column
    * @throws com.ext.portlet.contests.NoSuchContestPhaseColumnException if a contest phase column with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn findByPrimaryKey(
        java.lang.Long id)
        throws com.ext.portlet.contests.NoSuchContestPhaseColumnException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPrimaryKey(id);
    }

    /**
    * Returns the contest phase column with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param id the primary key of the contest phase column
    * @return the contest phase column, or <code>null</code> if a contest phase column with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn fetchByPrimaryKey(
        java.lang.Long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(id);
    }

    /**
    * Returns all the contest phase columns where ContestPhasePK = &#63;.
    *
    * @param ContestPhasePK the contest phase p k
    * @return the matching contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findByContestPhasePK(
        java.lang.Long ContestPhasePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByContestPhasePK(ContestPhasePK);
    }

    /**
    * Returns a range of all the contest phase columns where ContestPhasePK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPhasePK the contest phase p k
    * @param start the lower bound of the range of contest phase columns
    * @param end the upper bound of the range of contest phase columns (not inclusive)
    * @return the range of matching contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findByContestPhasePK(
        java.lang.Long ContestPhasePK, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByContestPhasePK(ContestPhasePK, start, end);
    }

    /**
    * Returns an ordered range of all the contest phase columns where ContestPhasePK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPhasePK the contest phase p k
    * @param start the lower bound of the range of contest phase columns
    * @param end the upper bound of the range of contest phase columns (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findByContestPhasePK(
        java.lang.Long ContestPhasePK, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContestPhasePK(ContestPhasePK, start, end,
            orderByComparator);
    }

    /**
    * Returns the first contest phase column in the ordered set where ContestPhasePK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPhasePK the contest phase p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching contest phase column
    * @throws com.ext.portlet.contests.NoSuchContestPhaseColumnException if a matching contest phase column could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn findByContestPhasePK_First(
        java.lang.Long ContestPhasePK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestPhaseColumnException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContestPhasePK_First(ContestPhasePK, orderByComparator);
    }

    /**
    * Returns the last contest phase column in the ordered set where ContestPhasePK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param ContestPhasePK the contest phase p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching contest phase column
    * @throws com.ext.portlet.contests.NoSuchContestPhaseColumnException if a matching contest phase column could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn findByContestPhasePK_Last(
        java.lang.Long ContestPhasePK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestPhaseColumnException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContestPhasePK_Last(ContestPhasePK, orderByComparator);
    }

    /**
    * Returns the contest phase columns before and after the current contest phase column in the ordered set where ContestPhasePK = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param id the primary key of the current contest phase column
    * @param ContestPhasePK the contest phase p k
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next contest phase column
    * @throws com.ext.portlet.contests.NoSuchContestPhaseColumnException if a contest phase column with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.contests.model.ContestPhaseColumn[] findByContestPhasePK_PrevAndNext(
        java.lang.Long id, java.lang.Long ContestPhasePK,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.contests.NoSuchContestPhaseColumnException,
            com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByContestPhasePK_PrevAndNext(id, ContestPhasePK,
            orderByComparator);
    }

    /**
    * Returns all the contest phase columns.
    *
    * @return the contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the contest phase columns.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contest phase columns
    * @param end the upper bound of the range of contest phase columns (not inclusive)
    * @return the range of contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the contest phase columns.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of contest phase columns
    * @param end the upper bound of the range of contest phase columns (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.contests.model.ContestPhaseColumn> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the contest phase columns where ContestPhasePK = &#63; from the database.
    *
    * @param ContestPhasePK the contest phase p k
    * @throws SystemException if a system exception occurred
    */
    public static void removeByContestPhasePK(java.lang.Long ContestPhasePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByContestPhasePK(ContestPhasePK);
    }

    /**
    * Removes all the contest phase columns from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of contest phase columns where ContestPhasePK = &#63;.
    *
    * @param ContestPhasePK the contest phase p k
    * @return the number of matching contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static int countByContestPhasePK(java.lang.Long ContestPhasePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByContestPhasePK(ContestPhasePK);
    }

    /**
    * Returns the number of contest phase columns.
    *
    * @return the number of contest phase columns
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static ContestPhaseColumnPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (ContestPhaseColumnPersistence) PortletBeanLocatorUtil.locate(com.ext.portlet.contests.service.ClpSerializer.getServletContextName(),
                    ContestPhaseColumnPersistence.class.getName());

            ReferenceRegistry.registerReference(ContestPhaseColumnUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    public void setPersistence(ContestPhaseColumnPersistence persistence) {
        _persistence = persistence;

        ReferenceRegistry.registerReference(ContestPhaseColumnUtil.class,
            "_persistence");
    }
}