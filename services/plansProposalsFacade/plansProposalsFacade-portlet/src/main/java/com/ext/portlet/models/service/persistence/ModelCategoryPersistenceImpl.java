package com.ext.portlet.models.service.persistence;

import com.ext.portlet.models.NoSuchModelCategoryException;
import com.ext.portlet.models.model.ModelCategory;
import com.ext.portlet.models.model.impl.ModelCategoryImpl;
import com.ext.portlet.models.model.impl.ModelCategoryModelImpl;
import com.ext.portlet.models.service.persistence.ModelCategoryPersistence;
import com.ext.portlet.models.service.persistence.ModelDiscussionPersistence;
import com.ext.portlet.models.service.persistence.ModelGlobalPreferencePersistence;
import com.ext.portlet.models.service.persistence.ModelInputGroupPersistence;
import com.ext.portlet.models.service.persistence.ModelInputItemPersistence;
import com.ext.portlet.models.service.persistence.ModelOutputChartOrderPersistence;
import com.ext.portlet.models.service.persistence.ModelOutputItemPersistence;
import com.ext.portlet.models.service.persistence.ModelPositionPersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the model category service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelCategoryPersistence
 * @see ModelCategoryUtil
 * @generated
 */
public class ModelCategoryPersistenceImpl extends BasePersistenceImpl<ModelCategory>
    implements ModelCategoryPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ModelCategoryUtil} to access the model category persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = ModelCategoryImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryModelImpl.FINDER_CACHE_ENABLED,
            ModelCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryModelImpl.FINDER_CACHE_ENABLED,
            ModelCategoryImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_MODELCATEGORY = "SELECT modelCategory FROM ModelCategory modelCategory";
    private static final String _SQL_COUNT_MODELCATEGORY = "SELECT COUNT(modelCategory) FROM ModelCategory modelCategory";
    private static final String _ORDER_BY_ENTITY_ALIAS = "modelCategory.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ModelCategory exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(ModelCategoryPersistenceImpl.class);
    private static ModelCategory _nullModelCategory = new ModelCategoryImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<ModelCategory> toCacheModel() {
                return _nullModelCategoryCacheModel;
            }
        };

    private static CacheModel<ModelCategory> _nullModelCategoryCacheModel = new CacheModel<ModelCategory>() {
            public ModelCategory toEntityModel() {
                return _nullModelCategory;
            }
        };

    @BeanReference(type = ModelCategoryPersistence.class)
    protected ModelCategoryPersistence modelCategoryPersistence;
    @BeanReference(type = ModelDiscussionPersistence.class)
    protected ModelDiscussionPersistence modelDiscussionPersistence;
    @BeanReference(type = ModelGlobalPreferencePersistence.class)
    protected ModelGlobalPreferencePersistence modelGlobalPreferencePersistence;
    @BeanReference(type = ModelInputGroupPersistence.class)
    protected ModelInputGroupPersistence modelInputGroupPersistence;
    @BeanReference(type = ModelInputItemPersistence.class)
    protected ModelInputItemPersistence modelInputItemPersistence;
    @BeanReference(type = ModelOutputChartOrderPersistence.class)
    protected ModelOutputChartOrderPersistence modelOutputChartOrderPersistence;
    @BeanReference(type = ModelOutputItemPersistence.class)
    protected ModelOutputItemPersistence modelOutputItemPersistence;
    @BeanReference(type = ModelPositionPersistence.class)
    protected ModelPositionPersistence modelPositionPersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the model category in the entity cache if it is enabled.
     *
     * @param modelCategory the model category
     */
    public void cacheResult(ModelCategory modelCategory) {
        EntityCacheUtil.putResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryImpl.class, modelCategory.getPrimaryKey(),
            modelCategory);

        modelCategory.resetOriginalValues();
    }

    /**
     * Caches the model categories in the entity cache if it is enabled.
     *
     * @param modelCategories the model categories
     */
    public void cacheResult(List<ModelCategory> modelCategories) {
        for (ModelCategory modelCategory : modelCategories) {
            if (EntityCacheUtil.getResult(
                        ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
                        ModelCategoryImpl.class, modelCategory.getPrimaryKey()) == null) {
                cacheResult(modelCategory);
            } else {
                modelCategory.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all model categories.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(ModelCategoryImpl.class.getName());
        }

        EntityCacheUtil.clearCache(ModelCategoryImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the model category.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(ModelCategory modelCategory) {
        EntityCacheUtil.removeResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryImpl.class, modelCategory.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<ModelCategory> modelCategories) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (ModelCategory modelCategory : modelCategories) {
            EntityCacheUtil.removeResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
                ModelCategoryImpl.class, modelCategory.getPrimaryKey());
        }
    }

    /**
     * Creates a new model category with the primary key. Does not add the model category to the database.
     *
     * @param modelCategoryPK the primary key for the new model category
     * @return the new model category
     */
    public ModelCategory create(Long modelCategoryPK) {
        ModelCategory modelCategory = new ModelCategoryImpl();

        modelCategory.setNew(true);
        modelCategory.setPrimaryKey(modelCategoryPK);

        return modelCategory;
    }

    /**
     * Removes the model category with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param modelCategoryPK the primary key of the model category
     * @return the model category that was removed
     * @throws com.ext.portlet.models.NoSuchModelCategoryException if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ModelCategory remove(Long modelCategoryPK)
        throws NoSuchModelCategoryException, SystemException {
        return remove((Serializable) modelCategoryPK);
    }

    /**
     * Removes the model category with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the model category
     * @return the model category that was removed
     * @throws com.ext.portlet.models.NoSuchModelCategoryException if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ModelCategory remove(Serializable primaryKey)
        throws NoSuchModelCategoryException, SystemException {
        Session session = null;

        try {
            session = openSession();

            ModelCategory modelCategory = (ModelCategory) session.get(ModelCategoryImpl.class,
                    primaryKey);

            if (modelCategory == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchModelCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(modelCategory);
        } catch (NoSuchModelCategoryException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected ModelCategory removeImpl(ModelCategory modelCategory)
        throws SystemException {
        modelCategory = toUnwrappedModel(modelCategory);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, modelCategory);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(modelCategory);

        return modelCategory;
    }

    @Override
    public ModelCategory updateImpl(
        com.ext.portlet.models.model.ModelCategory modelCategory, boolean merge)
        throws SystemException {
        modelCategory = toUnwrappedModel(modelCategory);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, modelCategory, merge);

            modelCategory.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        EntityCacheUtil.putResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
            ModelCategoryImpl.class, modelCategory.getPrimaryKey(),
            modelCategory);

        return modelCategory;
    }

    protected ModelCategory toUnwrappedModel(ModelCategory modelCategory) {
        if (modelCategory instanceof ModelCategoryImpl) {
            return modelCategory;
        }

        ModelCategoryImpl modelCategoryImpl = new ModelCategoryImpl();

        modelCategoryImpl.setNew(modelCategory.isNew());
        modelCategoryImpl.setPrimaryKey(modelCategory.getPrimaryKey());

        modelCategoryImpl.setModelCategoryPK(modelCategory.getModelCategoryPK());
        modelCategoryImpl.setModelCategoryName(modelCategory.getModelCategoryName());
        modelCategoryImpl.setModelCategoryDescription(modelCategory.getModelCategoryDescription());
        modelCategoryImpl.setModelCategoryDisplayWeight(modelCategory.getModelCategoryDisplayWeight());

        return modelCategoryImpl;
    }

    /**
     * Returns the model category with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the model category
     * @return the model category
     * @throws com.liferay.portal.NoSuchModelException if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ModelCategory findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the model category with the primary key or throws a {@link com.ext.portlet.models.NoSuchModelCategoryException} if it could not be found.
     *
     * @param modelCategoryPK the primary key of the model category
     * @return the model category
     * @throws com.ext.portlet.models.NoSuchModelCategoryException if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ModelCategory findByPrimaryKey(Long modelCategoryPK)
        throws NoSuchModelCategoryException, SystemException {
        ModelCategory modelCategory = fetchByPrimaryKey(modelCategoryPK);

        if (modelCategory == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + modelCategoryPK);
            }

            throw new NoSuchModelCategoryException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                modelCategoryPK);
        }

        return modelCategory;
    }

    /**
     * Returns the model category with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the model category
     * @return the model category, or <code>null</code> if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public ModelCategory fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the model category with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param modelCategoryPK the primary key of the model category
     * @return the model category, or <code>null</code> if a model category with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public ModelCategory fetchByPrimaryKey(Long modelCategoryPK)
        throws SystemException {
        ModelCategory modelCategory = (ModelCategory) EntityCacheUtil.getResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
                ModelCategoryImpl.class, modelCategoryPK);

        if (modelCategory == _nullModelCategory) {
            return null;
        }

        if (modelCategory == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                modelCategory = (ModelCategory) session.get(ModelCategoryImpl.class,
                        Long.valueOf(modelCategoryPK));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (modelCategory != null) {
                    cacheResult(modelCategory);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(ModelCategoryModelImpl.ENTITY_CACHE_ENABLED,
                        ModelCategoryImpl.class, modelCategoryPK,
                        _nullModelCategory);
                }

                closeSession(session);
            }
        }

        return modelCategory;
    }

    /**
     * Returns all the model categories.
     *
     * @return the model categories
     * @throws SystemException if a system exception occurred
     */
    public List<ModelCategory> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the model categories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of model categories
     * @param end the upper bound of the range of model categories (not inclusive)
     * @return the range of model categories
     * @throws SystemException if a system exception occurred
     */
    public List<ModelCategory> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the model categories.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of model categories
     * @param end the upper bound of the range of model categories (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of model categories
     * @throws SystemException if a system exception occurred
     */
    public List<ModelCategory> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = new Object[] { start, end, orderByComparator };

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<ModelCategory> list = (List<ModelCategory>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_MODELCATEGORY);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_MODELCATEGORY;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<ModelCategory>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<ModelCategory>) QueryUtil.list(q,
                            getDialect(), start, end);
                }
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (list == null) {
                    FinderCacheUtil.removeResult(finderPath, finderArgs);
                } else {
                    cacheResult(list);

                    FinderCacheUtil.putResult(finderPath, finderArgs, list);
                }

                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the model categories from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (ModelCategory modelCategory : findAll()) {
            remove(modelCategory);
        }
    }

    /**
     * Returns the number of model categories.
     *
     * @return the number of model categories
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_MODELCATEGORY);

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the model category persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.models.model.ModelCategory")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<ModelCategory>> listenersList = new ArrayList<ModelListener<ModelCategory>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<ModelCategory>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(ModelCategoryImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}