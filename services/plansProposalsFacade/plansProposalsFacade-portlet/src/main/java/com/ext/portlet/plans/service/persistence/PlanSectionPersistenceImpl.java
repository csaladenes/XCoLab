package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanSectionException;
import com.ext.portlet.plans.model.PlanSection;
import com.ext.portlet.plans.model.impl.PlanSectionImpl;
import com.ext.portlet.plans.model.impl.PlanSectionModelImpl;
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
 * The persistence implementation for the plan section service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanSectionPersistence
 * @see PlanSectionUtil
 * @generated
 */
public class PlanSectionPersistenceImpl extends BasePersistenceImpl<PlanSection>
    implements PlanSectionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanSectionUtil} to access the plan section persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanSectionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID =
        new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
            "findByPlanIdSectionDefinitionId",
            new String[] {
                Long.class.getName(), Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID =
        new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "findByPlanIdSectionDefinitionId",
            new String[] { Long.class.getName(), Long.class.getName() },
            PlanSectionModelImpl.PLANID_COLUMN_BITMASK |
            PlanSectionModelImpl.PLANSECTIONDEFINITIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLANIDSECTIONDEFINITIONID =
        new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPlanIdSectionDefinitionId",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID =
        new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_ENTITY,
            "fetchByCurrentPlanIdSectionDefinitionId",
            new String[] { Long.class.getName(), Long.class.getName() },
            PlanSectionModelImpl.PLANID_COLUMN_BITMASK |
            PlanSectionModelImpl.PLANSECTIONDEFINITIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_CURRENTPLANIDSECTIONDEFINITIONID =
        new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByCurrentPlanIdSectionDefinitionId",
            new String[] { Long.class.getName(), Long.class.getName() });
    public static final FinderPath FINDER_PATH_FETCH_BY_PLANIDPLANVERSION = new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_ENTITY, "fetchByPlanIdPlanVersion",
            new String[] {
                Long.class.getName(), Long.class.getName(), Long.class.getName()
            },
            PlanSectionModelImpl.PLANID_COLUMN_BITMASK |
            PlanSectionModelImpl.PLANSECTIONDEFINITIONID_COLUMN_BITMASK |
            PlanSectionModelImpl.PLANVERSION_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLANIDPLANVERSION = new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPlanIdPlanVersion",
            new String[] {
                Long.class.getName(), Long.class.getName(), Long.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, PlanSectionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANSECTION = "SELECT planSection FROM PlanSection planSection";
    private static final String _SQL_SELECT_PLANSECTION_WHERE = "SELECT planSection FROM PlanSection planSection WHERE ";
    private static final String _SQL_COUNT_PLANSECTION = "SELECT COUNT(planSection) FROM PlanSection planSection";
    private static final String _SQL_COUNT_PLANSECTION_WHERE = "SELECT COUNT(planSection) FROM PlanSection planSection WHERE ";
    private static final String _FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANID_2 =
        "planSection.planId = ? AND ";
    private static final String _FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2 =
        "planSection.planSectionDefinitionId = ?";
    private static final String _FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANID_2 =
        "planSection.planId = ? AND ";
    private static final String _FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2 =
        "planSection.planSectionDefinitionId = ?";
    private static final String _FINDER_COLUMN_PLANIDPLANVERSION_PLANID_2 = "planSection.planId = ? AND ";
    private static final String _FINDER_COLUMN_PLANIDPLANVERSION_PLANSECTIONDEFINITIONID_2 =
        "planSection.planSectionDefinitionId = ? AND ";
    private static final String _FINDER_COLUMN_PLANIDPLANVERSION_PLANVERSION_2 = "planSection.planVersion <= ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planSection.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanSection exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlanSection exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanSectionPersistenceImpl.class);
    private static PlanSection _nullPlanSection = new PlanSectionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanSection> toCacheModel() {
                return _nullPlanSectionCacheModel;
            }
        };

    private static CacheModel<PlanSection> _nullPlanSectionCacheModel = new CacheModel<PlanSection>() {
            public PlanSection toEntityModel() {
                return _nullPlanSection;
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
     * Caches the plan section in the entity cache if it is enabled.
     *
     * @param planSection the plan section
     */
    public void cacheResult(PlanSection planSection) {
        EntityCacheUtil.putResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionImpl.class, planSection.getPrimaryKey(), planSection);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
            new Object[] {
                Long.valueOf(planSection.getPlanId()),
                Long.valueOf(planSection.getPlanSectionDefinitionId())
            }, planSection);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
            new Object[] {
                Long.valueOf(planSection.getPlanId()),
                Long.valueOf(planSection.getPlanSectionDefinitionId()),
                Long.valueOf(planSection.getPlanVersion())
            }, planSection);

        planSection.resetOriginalValues();
    }

    /**
     * Caches the plan sections in the entity cache if it is enabled.
     *
     * @param planSections the plan sections
     */
    public void cacheResult(List<PlanSection> planSections) {
        for (PlanSection planSection : planSections) {
            if (EntityCacheUtil.getResult(
                        PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
                        PlanSectionImpl.class, planSection.getPrimaryKey()) == null) {
                cacheResult(planSection);
            } else {
                planSection.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan sections.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanSectionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanSectionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan section.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanSection planSection) {
        EntityCacheUtil.removeResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionImpl.class, planSection.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(planSection);
    }

    @Override
    public void clearCache(List<PlanSection> planSections) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanSection planSection : planSections) {
            EntityCacheUtil.removeResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
                PlanSectionImpl.class, planSection.getPrimaryKey());

            clearUniqueFindersCache(planSection);
        }
    }

    protected void clearUniqueFindersCache(PlanSection planSection) {
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
            new Object[] {
                Long.valueOf(planSection.getPlanId()),
                Long.valueOf(planSection.getPlanSectionDefinitionId())
            });

        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
            new Object[] {
                Long.valueOf(planSection.getPlanId()),
                Long.valueOf(planSection.getPlanSectionDefinitionId()),
                Long.valueOf(planSection.getPlanVersion())
            });
    }

    /**
     * Creates a new plan section with the primary key. Does not add the plan section to the database.
     *
     * @param id the primary key for the new plan section
     * @return the new plan section
     */
    public PlanSection create(Long id) {
        PlanSection planSection = new PlanSectionImpl();

        planSection.setNew(true);
        planSection.setPrimaryKey(id);

        return planSection;
    }

    /**
     * Removes the plan section with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the plan section
     * @return the plan section that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection remove(Long id)
        throws NoSuchPlanSectionException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the plan section with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan section
     * @return the plan section that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanSection remove(Serializable primaryKey)
        throws NoSuchPlanSectionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanSection planSection = (PlanSection) session.get(PlanSectionImpl.class,
                    primaryKey);

            if (planSection == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanSectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planSection);
        } catch (NoSuchPlanSectionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanSection removeImpl(PlanSection planSection)
        throws SystemException {
        planSection = toUnwrappedModel(planSection);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planSection);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planSection);

        return planSection;
    }

    @Override
    public PlanSection updateImpl(
        com.ext.portlet.plans.model.PlanSection planSection, boolean merge)
        throws SystemException {
        planSection = toUnwrappedModel(planSection);

        boolean isNew = planSection.isNew();

        PlanSectionModelImpl planSectionModelImpl = (PlanSectionModelImpl) planSection;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planSection, merge);

            planSection.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlanSectionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((planSectionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planSectionModelImpl.getOriginalPlanId()),
                        Long.valueOf(planSectionModelImpl.getOriginalPlanSectionDefinitionId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANIDSECTIONDEFINITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID,
                    args);

                args = new Object[] {
                        Long.valueOf(planSectionModelImpl.getPlanId()),
                        Long.valueOf(planSectionModelImpl.getPlanSectionDefinitionId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANIDSECTIONDEFINITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
            PlanSectionImpl.class, planSection.getPrimaryKey(), planSection);

        if (isNew) {
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                new Object[] {
                    Long.valueOf(planSection.getPlanId()),
                    Long.valueOf(planSection.getPlanSectionDefinitionId())
                }, planSection);

            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                new Object[] {
                    Long.valueOf(planSection.getPlanId()),
                    Long.valueOf(planSection.getPlanSectionDefinitionId()),
                    Long.valueOf(planSection.getPlanVersion())
                }, planSection);
        } else {
            if ((planSectionModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planSectionModelImpl.getOriginalPlanId()),
                        Long.valueOf(planSectionModelImpl.getOriginalPlanSectionDefinitionId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                    args);

                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                    new Object[] {
                        Long.valueOf(planSection.getPlanId()),
                        Long.valueOf(planSection.getPlanSectionDefinitionId())
                    }, planSection);
            }

            if ((planSectionModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PLANIDPLANVERSION.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planSectionModelImpl.getOriginalPlanId()),
                        Long.valueOf(planSectionModelImpl.getOriginalPlanSectionDefinitionId()),
                        Long.valueOf(planSectionModelImpl.getOriginalPlanVersion())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANIDPLANVERSION,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                    args);

                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                    new Object[] {
                        Long.valueOf(planSection.getPlanId()),
                        Long.valueOf(planSection.getPlanSectionDefinitionId()),
                        Long.valueOf(planSection.getPlanVersion())
                    }, planSection);
            }
        }

        return planSection;
    }

    protected PlanSection toUnwrappedModel(PlanSection planSection) {
        if (planSection instanceof PlanSectionImpl) {
            return planSection;
        }

        PlanSectionImpl planSectionImpl = new PlanSectionImpl();

        planSectionImpl.setNew(planSection.isNew());
        planSectionImpl.setPrimaryKey(planSection.getPrimaryKey());

        planSectionImpl.setId(planSection.getId());
        planSectionImpl.setPlanSectionDefinitionId(planSection.getPlanSectionDefinitionId());
        planSectionImpl.setPlanId(planSection.getPlanId());
        planSectionImpl.setContent(planSection.getContent());
        planSectionImpl.setCreated(planSection.getCreated());
        planSectionImpl.setVersion(planSection.getVersion());
        planSectionImpl.setPlanVersion(planSection.getPlanVersion());
        planSectionImpl.setUpdateAuthorId(planSection.getUpdateAuthorId());

        return planSectionImpl;
    }

    /**
     * Returns the plan section with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan section
     * @return the plan section
     * @throws com.liferay.portal.NoSuchModelException if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanSection findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan section with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanSectionException} if it could not be found.
     *
     * @param id the primary key of the plan section
     * @return the plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection findByPrimaryKey(Long id)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = fetchByPrimaryKey(id);

        if (planSection == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchPlanSectionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return planSection;
    }

    /**
     * Returns the plan section with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan section
     * @return the plan section, or <code>null</code> if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanSection fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan section with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the plan section
     * @return the plan section, or <code>null</code> if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection fetchByPrimaryKey(Long id) throws SystemException {
        PlanSection planSection = (PlanSection) EntityCacheUtil.getResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
                PlanSectionImpl.class, id);

        if (planSection == _nullPlanSection) {
            return null;
        }

        if (planSection == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planSection = (PlanSection) session.get(PlanSectionImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planSection != null) {
                    cacheResult(planSection);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanSectionModelImpl.ENTITY_CACHE_ENABLED,
                        PlanSectionImpl.class, id, _nullPlanSection);
                }

                closeSession(session);
            }
        }

        return planSection;
    }

    /**
     * Returns all the plan sections where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @return the matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findByPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId) throws SystemException {
        return findByPlanIdSectionDefinitionId(planId, planSectionDefinitionId,
            QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan sections where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param start the lower bound of the range of plan sections
     * @param end the upper bound of the range of plan sections (not inclusive)
     * @return the range of matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findByPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId, int start, int end)
        throws SystemException {
        return findByPlanIdSectionDefinitionId(planId, planSectionDefinitionId,
            start, end, null);
    }

    /**
     * Returns an ordered range of all the plan sections where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param start the lower bound of the range of plan sections
     * @param end the upper bound of the range of plan sections (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findByPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID;
            finderArgs = new Object[] { planId, planSectionDefinitionId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_PLANIDSECTIONDEFINITIONID;
            finderArgs = new Object[] {
                    planId, planSectionDefinitionId,
                    
                    start, end, orderByComparator
                };
        }

        List<PlanSection> list = (List<PlanSection>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(4 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(4);
            }

            query.append(_SQL_SELECT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANID_2);

            query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(PlanSectionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                list = (List<PlanSection>) QueryUtil.list(q, getDialect(),
                        start, end);
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
     * Returns the first plan section in the ordered set where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection findByPlanIdSectionDefinitionId_First(Long planId,
        Long planSectionDefinitionId, OrderByComparator orderByComparator)
        throws NoSuchPlanSectionException, SystemException {
        List<PlanSection> list = findByPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId, 0, 1, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(", planSectionDefinitionId=");
            msg.append(planSectionDefinitionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanSectionException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the last plan section in the ordered set where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection findByPlanIdSectionDefinitionId_Last(Long planId,
        Long planSectionDefinitionId, OrderByComparator orderByComparator)
        throws NoSuchPlanSectionException, SystemException {
        int count = countByPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId);

        List<PlanSection> list = findByPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId, count - 1, count, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(", planSectionDefinitionId=");
            msg.append(planSectionDefinitionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanSectionException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the plan sections before and after the current plan section in the ordered set where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param id the primary key of the current plan section
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a plan section with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection[] findByPlanIdSectionDefinitionId_PrevAndNext(Long id,
        Long planId, Long planSectionDefinitionId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = findByPrimaryKey(id);

        Session session = null;

        try {
            session = openSession();

            PlanSection[] array = new PlanSectionImpl[3];

            array[0] = getByPlanIdSectionDefinitionId_PrevAndNext(session,
                    planSection, planId, planSectionDefinitionId,
                    orderByComparator, true);

            array[1] = planSection;

            array[2] = getByPlanIdSectionDefinitionId_PrevAndNext(session,
                    planSection, planId, planSectionDefinitionId,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PlanSection getByPlanIdSectionDefinitionId_PrevAndNext(
        Session session, PlanSection planSection, Long planId,
        Long planSectionDefinitionId, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLANSECTION_WHERE);

        query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANID_2);

        query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2);

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
            query.append(PlanSectionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(planId.longValue());

        qPos.add(planSectionDefinitionId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(planSection);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PlanSection> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanSectionException} if it could not be found.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @return the matching plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection findByCurrentPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = fetchByCurrentPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId);

        if (planSection == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(", planSectionDefinitionId=");
            msg.append(planSectionDefinitionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlanSectionException(msg.toString());
        }

        return planSection;
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @return the matching plan section, or <code>null</code> if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection fetchByCurrentPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId) throws SystemException {
        return fetchByCurrentPlanIdSectionDefinitionId(planId,
            planSectionDefinitionId, true);
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching plan section, or <code>null</code> if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection fetchByCurrentPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { planId, planSectionDefinitionId };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                    finderArgs, this);
        }

        if (result == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_SELECT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANID_2);

            query.append(_FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2);

            query.append(PlanSectionModelImpl.ORDER_BY_JPQL);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                List<PlanSection> list = q.list();

                result = list;

                PlanSection planSection = null;

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                        finderArgs, list);
                } else {
                    planSection = list.get(0);

                    cacheResult(planSection);

                    if ((planSection.getPlanId() != planId) ||
                            (planSection.getPlanSectionDefinitionId() != planSectionDefinitionId)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                            finderArgs, planSection);
                    }
                }

                return planSection;
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (result == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                        finderArgs);
                }

                closeSession(session);
            }
        } else {
            if (result instanceof List<?>) {
                return null;
            } else {
                return (PlanSection) result;
            }
        }
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; and planVersion &le; &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanSectionException} if it could not be found.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param planVersion the plan version
     * @return the matching plan section
     * @throws com.ext.portlet.plans.NoSuchPlanSectionException if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection findByPlanIdPlanVersion(Long planId,
        Long planSectionDefinitionId, Long planVersion)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = fetchByPlanIdPlanVersion(planId,
                planSectionDefinitionId, planVersion);

        if (planSection == null) {
            StringBundler msg = new StringBundler(8);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planId=");
            msg.append(planId);

            msg.append(", planSectionDefinitionId=");
            msg.append(planSectionDefinitionId);

            msg.append(", planVersion=");
            msg.append(planVersion);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlanSectionException(msg.toString());
        }

        return planSection;
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; and planVersion &le; &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param planVersion the plan version
     * @return the matching plan section, or <code>null</code> if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection fetchByPlanIdPlanVersion(Long planId,
        Long planSectionDefinitionId, Long planVersion)
        throws SystemException {
        return fetchByPlanIdPlanVersion(planId, planSectionDefinitionId,
            planVersion, true);
    }

    /**
     * Returns the plan section where planId = &#63; and planSectionDefinitionId = &#63; and planVersion &le; &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param planVersion the plan version
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching plan section, or <code>null</code> if a matching plan section could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanSection fetchByPlanIdPlanVersion(Long planId,
        Long planSectionDefinitionId, Long planVersion,
        boolean retrieveFromCache) throws SystemException {
        Object[] finderArgs = new Object[] {
                planId, planSectionDefinitionId, planVersion
            };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                    finderArgs, this);
        }

        if (result == null) {
            StringBundler query = new StringBundler(5);

            query.append(_SQL_SELECT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANID_2);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANSECTIONDEFINITIONID_2);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANVERSION_2);

            query.append(PlanSectionModelImpl.ORDER_BY_JPQL);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                qPos.add(planVersion.longValue());

                List<PlanSection> list = q.list();

                result = list;

                PlanSection planSection = null;

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                        finderArgs, list);
                } else {
                    planSection = list.get(0);

                    cacheResult(planSection);

                    if ((planSection.getPlanId() != planId) ||
                            (planSection.getPlanSectionDefinitionId() != planSectionDefinitionId) ||
                            (planSection.getPlanVersion() != planVersion)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                            finderArgs, planSection);
                    }
                }

                return planSection;
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (result == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANIDPLANVERSION,
                        finderArgs);
                }

                closeSession(session);
            }
        } else {
            if (result instanceof List<?>) {
                return null;
            } else {
                return (PlanSection) result;
            }
        }
    }

    /**
     * Returns all the plan sections.
     *
     * @return the plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan sections.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan sections
     * @param end the upper bound of the range of plan sections (not inclusive)
     * @return the range of plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan sections.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan sections
     * @param end the upper bound of the range of plan sections (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan sections
     * @throws SystemException if a system exception occurred
     */
    public List<PlanSection> findAll(int start, int end,
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

        List<PlanSection> list = (List<PlanSection>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANSECTION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANSECTION.concat(PlanSectionModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanSection>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanSection>) QueryUtil.list(q, getDialect(),
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
     * Removes all the plan sections where planId = &#63; and planSectionDefinitionId = &#63; from the database.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId) throws SystemException {
        for (PlanSection planSection : findByPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId)) {
            remove(planSection);
        }
    }

    /**
     * Removes the plan section where planId = &#63; and planSectionDefinitionId = &#63; from the database.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByCurrentPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = findByCurrentPlanIdSectionDefinitionId(planId,
                planSectionDefinitionId);

        remove(planSection);
    }

    /**
     * Removes the plan section where planId = &#63; and planSectionDefinitionId = &#63; and planVersion &le; &#63; from the database.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param planVersion the plan version
     * @throws SystemException if a system exception occurred
     */
    public void removeByPlanIdPlanVersion(Long planId,
        Long planSectionDefinitionId, Long planVersion)
        throws NoSuchPlanSectionException, SystemException {
        PlanSection planSection = findByPlanIdPlanVersion(planId,
                planSectionDefinitionId, planVersion);

        remove(planSection);
    }

    /**
     * Removes all the plan sections from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanSection planSection : findAll()) {
            remove(planSection);
        }
    }

    /**
     * Returns the number of plan sections where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @return the number of matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public int countByPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId) throws SystemException {
        Object[] finderArgs = new Object[] { planId, planSectionDefinitionId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PLANIDSECTIONDEFINITIONID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANID_2);

            query.append(_FINDER_COLUMN_PLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PLANIDSECTIONDEFINITIONID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan sections where planId = &#63; and planSectionDefinitionId = &#63;.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @return the number of matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public int countByCurrentPlanIdSectionDefinitionId(Long planId,
        Long planSectionDefinitionId) throws SystemException {
        Object[] finderArgs = new Object[] { planId, planSectionDefinitionId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANID_2);

            query.append(_FINDER_COLUMN_CURRENTPLANIDSECTIONDEFINITIONID_PLANSECTIONDEFINITIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CURRENTPLANIDSECTIONDEFINITIONID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan sections where planId = &#63; and planSectionDefinitionId = &#63; and planVersion &le; &#63;.
     *
     * @param planId the plan ID
     * @param planSectionDefinitionId the plan section definition ID
     * @param planVersion the plan version
     * @return the number of matching plan sections
     * @throws SystemException if a system exception occurred
     */
    public int countByPlanIdPlanVersion(Long planId,
        Long planSectionDefinitionId, Long planVersion)
        throws SystemException {
        Object[] finderArgs = new Object[] {
                planId, planSectionDefinitionId, planVersion
            };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PLANIDPLANVERSION,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(4);

            query.append(_SQL_COUNT_PLANSECTION_WHERE);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANID_2);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANSECTIONDEFINITIONID_2);

            query.append(_FINDER_COLUMN_PLANIDPLANVERSION_PLANVERSION_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planId.longValue());

                qPos.add(planSectionDefinitionId.longValue());

                qPos.add(planVersion.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PLANIDPLANVERSION,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan sections.
     *
     * @return the number of plan sections
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANSECTION);

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
     * Initializes the plan section persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanSection")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanSection>> listenersList = new ArrayList<ModelListener<PlanSection>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanSection>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanSectionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}