package com.ext.portlet.service.persistence;

import com.ext.portlet.model.DiscussionCategory;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the discussion category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionCategoryPersistenceImpl
 * @see DiscussionCategoryUtil
 * @generated
 */
public interface DiscussionCategoryPersistence extends BasePersistence<DiscussionCategory> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DiscussionCategoryUtil} to access the discussion category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the discussion categories where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @return the matching discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findByCategoryGroupId(
        long categoryGroupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the discussion categories where categoryGroupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.DiscussionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param categoryGroupId the category group ID
    * @param start the lower bound of the range of discussion categories
    * @param end the upper bound of the range of discussion categories (not inclusive)
    * @return the range of matching discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findByCategoryGroupId(
        long categoryGroupId, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the discussion categories where categoryGroupId = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.DiscussionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param categoryGroupId the category group ID
    * @param start the lower bound of the range of discussion categories
    * @param end the upper bound of the range of discussion categories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findByCategoryGroupId(
        long categoryGroupId, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first discussion category in the ordered set where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching discussion category
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory findByCategoryGroupId_First(
        long categoryGroupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first discussion category in the ordered set where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching discussion category, or <code>null</code> if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory fetchByCategoryGroupId_First(
        long categoryGroupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last discussion category in the ordered set where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching discussion category
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory findByCategoryGroupId_Last(
        long categoryGroupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last discussion category in the ordered set where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching discussion category, or <code>null</code> if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory fetchByCategoryGroupId_Last(
        long categoryGroupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion categories before and after the current discussion category in the ordered set where categoryGroupId = &#63;.
    *
    * @param pk the primary key of the current discussion category
    * @param categoryGroupId the category group ID
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next discussion category
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory[] findByCategoryGroupId_PrevAndNext(
        long pk, long categoryGroupId,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the discussion categories where categoryGroupId = &#63; from the database.
    *
    * @param categoryGroupId the category group ID
    * @throws SystemException if a system exception occurred
    */
    public void removeByCategoryGroupId(long categoryGroupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of discussion categories where categoryGroupId = &#63;.
    *
    * @param categoryGroupId the category group ID
    * @return the number of matching discussion categories
    * @throws SystemException if a system exception occurred
    */
    public int countByCategoryGroupId(long categoryGroupId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion category where categoryId = &#63; or throws a {@link com.ext.portlet.NoSuchDiscussionCategoryException} if it could not be found.
    *
    * @param categoryId the category ID
    * @return the matching discussion category
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory findByCategoryId(
        long categoryId)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion category where categoryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
    *
    * @param categoryId the category ID
    * @return the matching discussion category, or <code>null</code> if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory fetchByCategoryId(
        long categoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion category where categoryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
    *
    * @param categoryId the category ID
    * @param retrieveFromCache whether to use the finder cache
    * @return the matching discussion category, or <code>null</code> if a matching discussion category could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory fetchByCategoryId(
        long categoryId, boolean retrieveFromCache)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes the discussion category where categoryId = &#63; from the database.
    *
    * @param categoryId the category ID
    * @return the discussion category that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory removeByCategoryId(
        long categoryId)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of discussion categories where categoryId = &#63;.
    *
    * @param categoryId the category ID
    * @return the number of matching discussion categories
    * @throws SystemException if a system exception occurred
    */
    public int countByCategoryId(long categoryId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the discussion category in the entity cache if it is enabled.
    *
    * @param discussionCategory the discussion category
    */
    public void cacheResult(
        com.ext.portlet.model.DiscussionCategory discussionCategory);

    /**
    * Caches the discussion categories in the entity cache if it is enabled.
    *
    * @param discussionCategories the discussion categories
    */
    public void cacheResult(
        java.util.List<com.ext.portlet.model.DiscussionCategory> discussionCategories);

    /**
    * Creates a new discussion category with the primary key. Does not add the discussion category to the database.
    *
    * @param pk the primary key for the new discussion category
    * @return the new discussion category
    */
    public com.ext.portlet.model.DiscussionCategory create(long pk);

    /**
    * Removes the discussion category with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param pk the primary key of the discussion category
    * @return the discussion category that was removed
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory remove(long pk)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    public com.ext.portlet.model.DiscussionCategory updateImpl(
        com.ext.portlet.model.DiscussionCategory discussionCategory)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion category with the primary key or throws a {@link com.ext.portlet.NoSuchDiscussionCategoryException} if it could not be found.
    *
    * @param pk the primary key of the discussion category
    * @return the discussion category
    * @throws com.ext.portlet.NoSuchDiscussionCategoryException if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory findByPrimaryKey(long pk)
        throws com.ext.portlet.NoSuchDiscussionCategoryException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the discussion category with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param pk the primary key of the discussion category
    * @return the discussion category, or <code>null</code> if a discussion category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.DiscussionCategory fetchByPrimaryKey(long pk)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the discussion categories.
    *
    * @return the discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the discussion categories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.DiscussionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of discussion categories
    * @param end the upper bound of the range of discussion categories (not inclusive)
    * @return the range of discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the discussion categories.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.DiscussionCategoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of discussion categories
    * @param end the upper bound of the range of discussion categories (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of discussion categories
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.model.DiscussionCategory> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the discussion categories from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of discussion categories.
    *
    * @return the number of discussion categories
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
