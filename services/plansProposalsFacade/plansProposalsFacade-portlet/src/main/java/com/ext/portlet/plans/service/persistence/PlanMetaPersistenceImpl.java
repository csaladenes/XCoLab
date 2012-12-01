package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanMetaException;
import com.ext.portlet.plans.model.PlanMeta;
import com.ext.portlet.plans.model.impl.PlanMetaImpl;
import com.ext.portlet.plans.model.impl.PlanMetaModelImpl;
import com.ext.portlet.plans.service.persistence.PlanAttributeFilterPersistence;
import com.ext.portlet.plans.service.persistence.PlanAttributePersistence;
import com.ext.portlet.plans.service.persistence.PlanColumnSettingsPersistence;
import com.ext.portlet.plans.service.persistence.PlanDescriptionPersistence;
import com.ext.portlet.plans.service.persistence.PlanFanPersistence;
import com.ext.portlet.plans.service.persistence.PlanItemPersistence;
import com.ext.portlet.plans.service.persistence.PlanMetaPersistence;
import com.ext.portlet.plans.service.persistence.PlanModelRunPersistence;
import com.ext.portlet.plans.service.persistence.PlanPositionItemPersistence;
import com.ext.portlet.plans.service.persistence.PlanPositionPersistence;
import com.ext.portlet.plans.service.persistence.PlanPositionsPersistence;
import com.ext.portlet.plans.service.persistence.PlanPropertyFilterPersistence;
import com.ext.portlet.plans.service.persistence.PlanRelatedPersistence;
import com.ext.portlet.plans.service.persistence.PlanSectionDefinitionPersistence;
import com.ext.portlet.plans.service.persistence.PlanSectionPersistence;
import com.ext.portlet.plans.service.persistence.PlanSectionPlanMapPersistence;
import com.ext.portlet.plans.service.persistence.PlanTeamHistoryPersistence;
import com.ext.portlet.plans.service.persistence.PlanTemplatePersistence;
import com.ext.portlet.plans.service.persistence.PlanTemplateSectionPersistence;
import com.ext.portlet.plans.service.persistence.PlanTypeAttributePersistence;
import com.ext.portlet.plans.service.persistence.PlanTypeColumnPersistence;
import com.ext.portlet.plans.service.persistence.PlanTypePersistence;
import com.ext.portlet.plans.service.persistence.PlanVotePersistence;
import com.ext.portlet.plans.service.persistence.PlansFilterPersistence;
import com.ext.portlet.plans.service.persistence.PlansFilterPositionPersistence;
import com.ext.portlet.plans.service.persistence.PlansUserSettingsPersistence;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
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
import com.liferay.portal.kernel.util.StringPool;
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
 * The persistence implementation for the plan meta service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanMetaPersistence
 * @see PlanMetaUtil
 * @generated
 */
public class PlanMetaPersistenceImpl extends BasePersistenceImpl<PlanMeta>
    implements PlanMetaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanMetaUtil} to access the plan meta persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanMetaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_FETCH_BY_CURRENTBYPLANID = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, PlanMetaImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByCurrentByPlanId",
            new String[] { Long.class.getName() },
            PlanMetaModelImpl.PLANID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CURRENTBYPLANID = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCurrentByPlanId", new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLBYPLANID =
        new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, PlanMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByAllByPlanId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLBYPLANID =
        new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, PlanMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByAllByPlanId",
            new String[] { Long.class.getName() },
            PlanMetaModelImpl.PLANID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ALLBYPLANID = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByAllByPlanId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, PlanMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, PlanMetaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANMETA = "SELECT planMeta FROM PlanMeta planMeta";
    private static final String _SQL_SELECT_PLANMETA_WHERE = "SELECT planMeta FROM PlanMeta planMeta WHERE ";
    private static final String _SQL_COUNT_PLANMETA = "SELECT COUNT(planMeta) FROM PlanMeta planMeta";
    private static final String _SQL_COUNT_PLANMETA_WHERE = "SELECT COUNT(planMeta) FROM PlanMeta planMeta WHERE ";
    private static final String _FINDER_COLUMN_CURRENTBYPLANID_PLANID_2 = "planMeta.planId = ?";
    private static final String _FINDER_COLUMN_ALLBYPLANID_PLANID_2 = "planMeta.planId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planMeta.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanMeta exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlanMeta exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanMetaPersistenceImpl.class);
    private static PlanMeta _nullPlanMeta = new PlanMetaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanMeta> toCacheModel() {
                return _nullPlanMetaCacheModel;
            }
        };

    private static CacheModel<PlanMeta> _nullPlanMetaCacheModel = new CacheModel<PlanMeta>() {
            public PlanMeta toEntityModel() {
                return _nullPlanMeta;
            }
        };

    @BeanReference(type = PlanAttributePersistence.class)
    protected PlanAttributePersistence planAttributePersistence;
    @BeanReference(type = PlanAttributeFilterPersistence.class)
    protected PlanAttributeFilterPersistence planAttributeFilterPersistence;
    @BeanReference(type = PlanColumnSettingsPersistence.class)
    protected PlanColumnSettingsPersistence planColumnSettingsPersistence;
    @BeanReference(type = PlanDescriptionPersistence.class)
    protected PlanDescriptionPersistence planDescriptionPersistence;
    @BeanReference(type = PlanFanPersistence.class)
    protected PlanFanPersistence planFanPersistence;
    @BeanReference(type = PlanItemPersistence.class)
    protected PlanItemPersistence planItemPersistence;
    @BeanReference(type = PlanMetaPersistence.class)
    protected PlanMetaPersistence planMetaPersistence;
    @BeanReference(type = PlanModelRunPersistence.class)
    protected PlanModelRunPersistence planModelRunPersistence;
    @BeanReference(type = PlanPositionPersistence.class)
    protected PlanPositionPersistence planPositionPersistence;
    @BeanReference(type = PlanPositionItemPersistence.class)
    protected PlanPositionItemPersistence planPositionItemPersistence;
    @BeanReference(type = PlanPositionsPersistence.class)
    protected PlanPositionsPersistence planPositionsPersistence;
    @BeanReference(type = PlanPropertyFilterPersistence.class)
    protected PlanPropertyFilterPersistence planPropertyFilterPersistence;
    @BeanReference(type = PlanRelatedPersistence.class)
    protected PlanRelatedPersistence planRelatedPersistence;
    @BeanReference(type = PlanSectionPersistence.class)
    protected PlanSectionPersistence planSectionPersistence;
    @BeanReference(type = PlanSectionDefinitionPersistence.class)
    protected PlanSectionDefinitionPersistence planSectionDefinitionPersistence;
    @BeanReference(type = PlanSectionPlanMapPersistence.class)
    protected PlanSectionPlanMapPersistence planSectionPlanMapPersistence;
    @BeanReference(type = PlansFilterPersistence.class)
    protected PlansFilterPersistence plansFilterPersistence;
    @BeanReference(type = PlansFilterPositionPersistence.class)
    protected PlansFilterPositionPersistence plansFilterPositionPersistence;
    @BeanReference(type = PlansUserSettingsPersistence.class)
    protected PlansUserSettingsPersistence plansUserSettingsPersistence;
    @BeanReference(type = PlanTeamHistoryPersistence.class)
    protected PlanTeamHistoryPersistence planTeamHistoryPersistence;
    @BeanReference(type = PlanTemplatePersistence.class)
    protected PlanTemplatePersistence planTemplatePersistence;
    @BeanReference(type = PlanTemplateSectionPersistence.class)
    protected PlanTemplateSectionPersistence planTemplateSectionPersistence;
    @BeanReference(type = PlanTypePersistence.class)
    protected PlanTypePersistence planTypePersistence;
    @BeanReference(type = PlanTypeAttributePersistence.class)
    protected PlanTypeAttributePersistence planTypeAttributePersistence;
    @BeanReference(type = PlanTypeColumnPersistence.class)
    protected PlanTypeColumnPersistence planTypeColumnPersistence;
    @BeanReference(type = PlanVotePersistence.class)
    protected PlanVotePersistence planVotePersistence;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;

    /**
     * Caches the plan meta in the entity cache if it is enabled.
     *
     * @param planMeta the plan meta
     */
    public void cacheResult(PlanMeta planMeta) {
        EntityCacheUtil.putResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaImpl.class, planMeta.getPrimaryKey(), planMeta);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
            new Object[] { Long.valueOf(planMeta.getPlanId()) }, planMeta);

        planMeta.resetOriginalValues();
    }

    /**
     * Caches the plan metas in the entity cache if it is enabled.
     *
     * @param planMetas the plan metas
     */
    public void cacheResult(List<PlanMeta> planMetas) {
        for (PlanMeta planMeta : planMetas) {
            if (EntityCacheUtil.getResult(
                        PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
                        PlanMetaImpl.class, planMeta.getPrimaryKey()) == null) {
                cacheResult(planMeta);
            } else {
                planMeta.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan metas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanMetaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanMetaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan meta.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanMeta planMeta) {
        EntityCacheUtil.removeResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaImpl.class, planMeta.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(planMeta);
    }

    @Override
    public void clearCache(List<PlanMeta> planMetas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanMeta planMeta : planMetas) {
            EntityCacheUtil.removeResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
                PlanMetaImpl.class, planMeta.getPrimaryKey());

            clearUniqueFindersCache(planMeta);
        }
    }

    protected void clearUniqueFindersCache(PlanMeta planMeta) {
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
            new Object[] { Long.valueOf(planMeta.getPlanId()) });
    }

    /**
     * Creates a new plan meta with the primary key. Does not add the plan meta to the database.
     *
     * @param id the primary key for the new plan meta
     * @return the new plan meta
     */
    public PlanMeta create(Long id) {
        PlanMeta planMeta = new PlanMetaImpl();

        planMeta.setNew(true);
        planMeta.setPrimaryKey(id);

        return planMeta;
    }

    /**
     * Removes the plan meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the plan meta
     * @return the plan meta that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta remove(Long id)
        throws NoSuchPlanMetaException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the plan meta with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan meta
     * @return the plan meta that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanMeta remove(Serializable primaryKey)
        throws NoSuchPlanMetaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanMeta planMeta = (PlanMeta) session.get(PlanMetaImpl.class,
                    primaryKey);

            if (planMeta == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanMetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planMeta);
        } catch (NoSuchPlanMetaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanMeta removeImpl(PlanMeta planMeta) throws SystemException {
        planMeta = toUnwrappedModel(planMeta);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planMeta);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planMeta);

        return planMeta;
    }

    @Override
    public PlanMeta updateImpl(com.ext.portlet.plans.model.PlanMeta planMeta,
        boolean merge) throws SystemException {
        planMeta = toUnwrappedModel(planMeta);

        boolean isNew = planMeta.isNew();

        PlanMetaModelImpl planMetaModelImpl = (PlanMetaModelImpl) planMeta;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planMeta, merge);

            planMeta.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlanMetaModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((planMetaModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLBYPLANID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planMetaModelImpl.getOriginalPlanId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLBYPLANID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLBYPLANID,
                    args);

                args = new Object[] { Long.valueOf(planMetaModelImpl.getPlanId()) };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ALLBYPLANID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLBYPLANID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
            PlanMetaImpl.class, planMeta.getPrimaryKey(), planMeta);

        if (isNew) {
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                new Object[] { Long.valueOf(planMeta.getPlanId()) }, planMeta);
        } else {
            if ((planMetaModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CURRENTBYPLANID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planMetaModelImpl.getOriginalPlanId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENTBYPLANID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                    args);

                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                    new Object[] { Long.valueOf(planMeta.getPlanId()) },
                    planMeta);
            }
        }

        return planMeta;
    }

    protected PlanMeta toUnwrappedModel(PlanMeta planMeta) {
        if (planMeta instanceof PlanMetaImpl) {
            return planMeta;
        }

        PlanMetaImpl planMetaImpl = new PlanMetaImpl();

        planMetaImpl.setNew(planMeta.isNew());
        planMetaImpl.setPrimaryKey(planMeta.getPrimaryKey());

        planMetaImpl.setId(planMeta.getId());
        planMetaImpl.setPlanId(planMeta.getPlanId());
        planMetaImpl.setPlanTypeId(planMeta.getPlanTypeId());
        planMetaImpl.setPlanCreated(planMeta.getPlanCreated());
        planMetaImpl.setAuthorId(planMeta.getAuthorId());
        planMetaImpl.setVotes(planMeta.getVotes());
        planMetaImpl.setPlanGroupId(planMeta.getPlanGroupId());
        planMetaImpl.setOpen(planMeta.getOpen());
        planMetaImpl.setStatus(planMeta.getStatus());
        planMetaImpl.setMbCategoryId(planMeta.getMbCategoryId());
        planMetaImpl.setCategoryGroupId(planMeta.getCategoryGroupId());
        planMetaImpl.setVersion(planMeta.getVersion());
        planMetaImpl.setPlanVersion(planMeta.getPlanVersion());
        planMetaImpl.setCreated(planMeta.getCreated());
        planMetaImpl.setUpdateAuthorId(planMeta.getUpdateAuthorId());
        planMetaImpl.setModelId(planMeta.getModelId());
        planMetaImpl.setPromoted(planMeta.getPromoted());
        planMetaImpl.setPreviousContestPhase(planMeta.getPreviousContestPhase());
        planMetaImpl.setContestPhase(planMeta.getContestPhase());

        return planMetaImpl;
    }

    /**
     * Returns the plan meta with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan meta
     * @return the plan meta
     * @throws com.liferay.portal.NoSuchModelException if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanMeta findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan meta with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanMetaException} if it could not be found.
     *
     * @param id the primary key of the plan meta
     * @return the plan meta
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta findByPrimaryKey(Long id)
        throws NoSuchPlanMetaException, SystemException {
        PlanMeta planMeta = fetchByPrimaryKey(id);

        if (planMeta == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchPlanMetaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return planMeta;
    }

    /**
     * Returns the plan meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan meta
     * @return the plan meta, or <code>null</code> if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanMeta fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan meta with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the plan meta
     * @return the plan meta, or <code>null</code> if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta fetchByPrimaryKey(Long id) throws SystemException {
        PlanMeta planMeta = (PlanMeta) EntityCacheUtil.getResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
                PlanMetaImpl.class, id);

        if (planMeta == _nullPlanMeta) {
            return null;
        }

        if (planMeta == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planMeta = (PlanMeta) session.get(PlanMetaImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planMeta != null) {
                    cacheResult(planMeta);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanMetaModelImpl.ENTITY_CACHE_ENABLED,
                        PlanMetaImpl.class, id, _nullPlanMeta);
                }

                closeSession(session);
            }
        }

        return planMeta;
    }

    /**
     * Returns the plan meta where planId = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanMetaException} if it could not be found.
     *
     * @param planId the plan ID
     * @return the matching plan meta
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a matching plan meta could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta findByCurrentByPlanId(Long planId)
        throws NoSuchPlanMetaException, SystemException {
        PlanMeta planMeta = fetchByCurrentByPlanId(planId);

        if (planMeta == null) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlanMetaException(msg.toString());
        }

        return planMeta;
    }

    /**
     * Returns the plan meta where planId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param planId the plan ID
     * @return the matching plan meta, or <code>null</code> if a matching plan meta could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta fetchByCurrentByPlanId(Long planId)
        throws SystemException {
        return fetchByCurrentByPlanId(planId, true);
    }

    /**
     * Returns the plan meta where planId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param planId the plan ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching plan meta, or <code>null</code> if a matching plan meta could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta fetchByCurrentByPlanId(Long planId,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] { planId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                    finderArgs, this);
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PLANMETA_WHERE);

            query.append(_FINDER_COLUMN_CURRENTBYPLANID_PLANID_2);

            query.append(PlanMetaModelImpl.ORDER_BY_JPQL);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                List<PlanMeta> list = q.list();

                result = list;

                PlanMeta planMeta = null;

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                        finderArgs, list);
                } else {
                    planMeta = list.get(0);

                    cacheResult(planMeta);

                    if ((planMeta.getPlanId() != planId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                            finderArgs, planMeta);
                    }
                }

                return planMeta;
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (result == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTBYPLANID,
                        finderArgs);
                }

                closeSession(session);
            }
        } else {
            if (result instanceof List<?>) {
                return null;
            } else {
                return (PlanMeta) result;
            }
        }
    }

    /**
     * Returns all the plan metas where planId = &#63;.
     *
     * @param planId the plan ID
     * @return the matching plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findByAllByPlanId(Long planId)
        throws SystemException {
        return findByAllByPlanId(planId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
            null);
    }

    /**
     * Returns a range of all the plan metas where planId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param start the lower bound of the range of plan metas
     * @param end the upper bound of the range of plan metas (not inclusive)
     * @return the range of matching plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findByAllByPlanId(Long planId, int start, int end)
        throws SystemException {
        return findByAllByPlanId(planId, start, end, null);
    }

    /**
     * Returns an ordered range of all the plan metas where planId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param start the lower bound of the range of plan metas
     * @param end the upper bound of the range of plan metas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findByAllByPlanId(Long planId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ALLBYPLANID;
            finderArgs = new Object[] { planId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ALLBYPLANID;
            finderArgs = new Object[] { planId, start, end, orderByComparator };
        }

        List<PlanMeta> list = (List<PlanMeta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PLANMETA_WHERE);

            query.append(_FINDER_COLUMN_ALLBYPLANID_PLANID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(PlanMetaModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                list = (List<PlanMeta>) QueryUtil.list(q, getDialect(), start,
                        end);
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
     * Returns the first plan meta in the ordered set where planId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching plan meta
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a matching plan meta could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta findByAllByPlanId_First(Long planId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanMetaException, SystemException {
        List<PlanMeta> list = findByAllByPlanId(planId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanMetaException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the last plan meta in the ordered set where planId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching plan meta
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a matching plan meta could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta findByAllByPlanId_Last(Long planId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanMetaException, SystemException {
        int count = countByAllByPlanId(planId);

        List<PlanMeta> list = findByAllByPlanId(planId, count - 1, count,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanMetaException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the plan metas before and after the current plan meta in the ordered set where planId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param id the primary key of the current plan meta
     * @param planId the plan ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next plan meta
     * @throws com.ext.portlet.plans.NoSuchPlanMetaException if a plan meta with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanMeta[] findByAllByPlanId_PrevAndNext(Long id, Long planId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanMetaException, SystemException {
        PlanMeta planMeta = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PlanMeta[] array = new PlanMetaImpl[3];

            array[0] = getByAllByPlanId_PrevAndNext(session, planMeta, planId,
                    orderByComparator, true);

            array[1] = planMeta;

            array[2] = getByAllByPlanId_PrevAndNext(session, planMeta, planId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PlanMeta getByAllByPlanId_PrevAndNext(Session session,
        PlanMeta planMeta, Long planId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLANMETA_WHERE);

        query.append(_FINDER_COLUMN_ALLBYPLANID_PLANID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        }
        else {
            query.append(PlanMetaModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(planId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(planMeta);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PlanMeta> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the plan metas.
     *
     * @return the plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan metas
     * @param end the upper bound of the range of plan metas (not inclusive)
     * @return the range of plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan metas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan metas
     * @param end the upper bound of the range of plan metas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan metas
     * @throws SystemException if a system exception occurred
     */
    public List<PlanMeta> findAll(int start, int end,
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

        List<PlanMeta> list = (List<PlanMeta>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANMETA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANMETA.concat(PlanMetaModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanMeta>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanMeta>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes the plan meta where planId = &#63; from the database.
     *
     * @param planId the plan ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCurrentByPlanId(Long planId)
        throws NoSuchPlanMetaException, SystemException {
        PlanMeta planMeta = findByCurrentByPlanId(planId);

        remove(planMeta);
    }

    /**
     * Removes all the plan metas where planId = &#63; from the database.
     *
     * @param planId the plan ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByAllByPlanId(Long planId) throws SystemException {
        for (PlanMeta planMeta : findByAllByPlanId(planId)) {
            remove(planMeta);
        }
    }

    /**
     * Removes all the plan metas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanMeta planMeta : findAll()) {
            remove(planMeta);
        }
    }

    /**
     * Returns the number of plan metas where planId = &#63;.
     *
     * @param planId the plan ID
     * @return the number of matching plan metas
     * @throws SystemException if a system exception occurred
     */
    public int countByCurrentByPlanId(Long planId) throws SystemException {
        Object[] finderArgs = new Object[] { planId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CURRENTBYPLANID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLANMETA_WHERE);

            query.append(_FINDER_COLUMN_CURRENTBYPLANID_PLANID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CURRENTBYPLANID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan metas where planId = &#63;.
     *
     * @param planId the plan ID
     * @return the number of matching plan metas
     * @throws SystemException if a system exception occurred
     */
    public int countByAllByPlanId(Long planId) throws SystemException {
        Object[] finderArgs = new Object[] { planId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_ALLBYPLANID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLANMETA_WHERE);

            query.append(_FINDER_COLUMN_ALLBYPLANID_PLANID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_ALLBYPLANID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan metas.
     *
     * @return the number of plan metas
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANMETA);

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
     * Initializes the plan meta persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanMeta")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanMeta>> listenersList = new ArrayList<ModelListener<PlanMeta>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanMeta>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanMetaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}