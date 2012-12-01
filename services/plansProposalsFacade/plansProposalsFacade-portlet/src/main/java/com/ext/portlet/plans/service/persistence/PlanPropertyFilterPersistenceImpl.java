package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanPropertyFilterException;
import com.ext.portlet.plans.model.PlanPropertyFilter;
import com.ext.portlet.plans.model.impl.PlanPropertyFilterImpl;
import com.ext.portlet.plans.model.impl.PlanPropertyFilterModelImpl;
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
 * The persistence implementation for the plan property filter service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanPropertyFilterPersistence
 * @see PlanPropertyFilterUtil
 * @generated
 */
public class PlanPropertyFilterPersistenceImpl extends BasePersistenceImpl<PlanPropertyFilter>
    implements PlanPropertyFilterPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanPropertyFilterUtil} to access the plan property filter persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanPropertyFilterImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME =
        new FinderPath(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterModelImpl.FINDER_CACHE_ENABLED,
            PlanPropertyFilterImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByPlanUserSettingsIdPropertyName",
            new String[] { Long.class.getName(), String.class.getName() },
            PlanPropertyFilterModelImpl.PLANUSERSETTINGSID_COLUMN_BITMASK |
            PlanPropertyFilterModelImpl.PROPERTYNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDPROPERTYNAME =
        new FinderPath(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPlanUserSettingsIdPropertyName",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterModelImpl.FINDER_CACHE_ENABLED,
            PlanPropertyFilterImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterModelImpl.FINDER_CACHE_ENABLED,
            PlanPropertyFilterImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANPROPERTYFILTER = "SELECT planPropertyFilter FROM PlanPropertyFilter planPropertyFilter";
    private static final String _SQL_SELECT_PLANPROPERTYFILTER_WHERE = "SELECT planPropertyFilter FROM PlanPropertyFilter planPropertyFilter WHERE ";
    private static final String _SQL_COUNT_PLANPROPERTYFILTER = "SELECT COUNT(planPropertyFilter) FROM PlanPropertyFilter planPropertyFilter";
    private static final String _SQL_COUNT_PLANPROPERTYFILTER_WHERE = "SELECT COUNT(planPropertyFilter) FROM PlanPropertyFilter planPropertyFilter WHERE ";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PLANUSERSETTINGSID_2 =
        "planPropertyFilter.planUserSettingsId = ? AND ";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_1 =
        "planPropertyFilter.propertyName IS NULL";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_2 =
        "planPropertyFilter.propertyName = ?";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_3 =
        "(planPropertyFilter.propertyName IS NULL OR planPropertyFilter.propertyName = ?)";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planPropertyFilter.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanPropertyFilter exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlanPropertyFilter exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanPropertyFilterPersistenceImpl.class);
    private static PlanPropertyFilter _nullPlanPropertyFilter = new PlanPropertyFilterImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanPropertyFilter> toCacheModel() {
                return _nullPlanPropertyFilterCacheModel;
            }
        };

    private static CacheModel<PlanPropertyFilter> _nullPlanPropertyFilterCacheModel =
        new CacheModel<PlanPropertyFilter>() {
            public PlanPropertyFilter toEntityModel() {
                return _nullPlanPropertyFilter;
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
     * Caches the plan property filter in the entity cache if it is enabled.
     *
     * @param planPropertyFilter the plan property filter
     */
    public void cacheResult(PlanPropertyFilter planPropertyFilter) {
        EntityCacheUtil.putResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterImpl.class, planPropertyFilter.getPrimaryKey(),
            planPropertyFilter);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
            new Object[] {
                Long.valueOf(planPropertyFilter.getPlanUserSettingsId()),
                
            planPropertyFilter.getPropertyName()
            }, planPropertyFilter);

        planPropertyFilter.resetOriginalValues();
    }

    /**
     * Caches the plan property filters in the entity cache if it is enabled.
     *
     * @param planPropertyFilters the plan property filters
     */
    public void cacheResult(List<PlanPropertyFilter> planPropertyFilters) {
        for (PlanPropertyFilter planPropertyFilter : planPropertyFilters) {
            if (EntityCacheUtil.getResult(
                        PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
                        PlanPropertyFilterImpl.class,
                        planPropertyFilter.getPrimaryKey()) == null) {
                cacheResult(planPropertyFilter);
            } else {
                planPropertyFilter.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan property filters.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanPropertyFilterImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanPropertyFilterImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan property filter.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanPropertyFilter planPropertyFilter) {
        EntityCacheUtil.removeResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterImpl.class, planPropertyFilter.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(planPropertyFilter);
    }

    @Override
    public void clearCache(List<PlanPropertyFilter> planPropertyFilters) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanPropertyFilter planPropertyFilter : planPropertyFilters) {
            EntityCacheUtil.removeResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
                PlanPropertyFilterImpl.class, planPropertyFilter.getPrimaryKey());

            clearUniqueFindersCache(planPropertyFilter);
        }
    }

    protected void clearUniqueFindersCache(
        PlanPropertyFilter planPropertyFilter) {
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
            new Object[] {
                Long.valueOf(planPropertyFilter.getPlanUserSettingsId()),
                
            planPropertyFilter.getPropertyName()
            });
    }

    /**
     * Creates a new plan property filter with the primary key. Does not add the plan property filter to the database.
     *
     * @param planPropertyFilterId the primary key for the new plan property filter
     * @return the new plan property filter
     */
    public PlanPropertyFilter create(Long planPropertyFilterId) {
        PlanPropertyFilter planPropertyFilter = new PlanPropertyFilterImpl();

        planPropertyFilter.setNew(true);
        planPropertyFilter.setPrimaryKey(planPropertyFilterId);

        return planPropertyFilter;
    }

    /**
     * Removes the plan property filter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param planPropertyFilterId the primary key of the plan property filter
     * @return the plan property filter that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanPropertyFilterException if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter remove(Long planPropertyFilterId)
        throws NoSuchPlanPropertyFilterException, SystemException {
        return remove((Serializable) planPropertyFilterId);
    }

    /**
     * Removes the plan property filter with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan property filter
     * @return the plan property filter that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanPropertyFilterException if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPropertyFilter remove(Serializable primaryKey)
        throws NoSuchPlanPropertyFilterException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanPropertyFilter planPropertyFilter = (PlanPropertyFilter) session.get(PlanPropertyFilterImpl.class,
                    primaryKey);

            if (planPropertyFilter == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanPropertyFilterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planPropertyFilter);
        } catch (NoSuchPlanPropertyFilterException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanPropertyFilter removeImpl(
        PlanPropertyFilter planPropertyFilter) throws SystemException {
        planPropertyFilter = toUnwrappedModel(planPropertyFilter);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planPropertyFilter);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planPropertyFilter);

        return planPropertyFilter;
    }

    @Override
    public PlanPropertyFilter updateImpl(
        com.ext.portlet.plans.model.PlanPropertyFilter planPropertyFilter,
        boolean merge) throws SystemException {
        planPropertyFilter = toUnwrappedModel(planPropertyFilter);

        boolean isNew = planPropertyFilter.isNew();

        PlanPropertyFilterModelImpl planPropertyFilterModelImpl = (PlanPropertyFilterModelImpl) planPropertyFilter;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planPropertyFilter, merge);

            planPropertyFilter.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlanPropertyFilterModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
            PlanPropertyFilterImpl.class, planPropertyFilter.getPrimaryKey(),
            planPropertyFilter);

        if (isNew) {
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                new Object[] {
                    Long.valueOf(planPropertyFilter.getPlanUserSettingsId()),
                    
                planPropertyFilter.getPropertyName()
                }, planPropertyFilter);
        } else {
            if ((planPropertyFilterModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planPropertyFilterModelImpl.getOriginalPlanUserSettingsId()),
                        
                        planPropertyFilterModelImpl.getOriginalPropertyName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                    args);

                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                    new Object[] {
                        Long.valueOf(planPropertyFilter.getPlanUserSettingsId()),
                        
                    planPropertyFilter.getPropertyName()
                    }, planPropertyFilter);
            }
        }

        return planPropertyFilter;
    }

    protected PlanPropertyFilter toUnwrappedModel(
        PlanPropertyFilter planPropertyFilter) {
        if (planPropertyFilter instanceof PlanPropertyFilterImpl) {
            return planPropertyFilter;
        }

        PlanPropertyFilterImpl planPropertyFilterImpl = new PlanPropertyFilterImpl();

        planPropertyFilterImpl.setNew(planPropertyFilter.isNew());
        planPropertyFilterImpl.setPrimaryKey(planPropertyFilter.getPrimaryKey());

        planPropertyFilterImpl.setPlanPropertyFilterId(planPropertyFilter.getPlanPropertyFilterId());
        planPropertyFilterImpl.setPropertyName(planPropertyFilter.getPropertyName());
        planPropertyFilterImpl.setPlanUserSettingsId(planPropertyFilter.getPlanUserSettingsId());
        planPropertyFilterImpl.setValue(planPropertyFilter.getValue());

        return planPropertyFilterImpl;
    }

    /**
     * Returns the plan property filter with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan property filter
     * @return the plan property filter
     * @throws com.liferay.portal.NoSuchModelException if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPropertyFilter findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan property filter with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanPropertyFilterException} if it could not be found.
     *
     * @param planPropertyFilterId the primary key of the plan property filter
     * @return the plan property filter
     * @throws com.ext.portlet.plans.NoSuchPlanPropertyFilterException if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter findByPrimaryKey(Long planPropertyFilterId)
        throws NoSuchPlanPropertyFilterException, SystemException {
        PlanPropertyFilter planPropertyFilter = fetchByPrimaryKey(planPropertyFilterId);

        if (planPropertyFilter == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    planPropertyFilterId);
            }

            throw new NoSuchPlanPropertyFilterException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                planPropertyFilterId);
        }

        return planPropertyFilter;
    }

    /**
     * Returns the plan property filter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan property filter
     * @return the plan property filter, or <code>null</code> if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPropertyFilter fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan property filter with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param planPropertyFilterId the primary key of the plan property filter
     * @return the plan property filter, or <code>null</code> if a plan property filter with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter fetchByPrimaryKey(Long planPropertyFilterId)
        throws SystemException {
        PlanPropertyFilter planPropertyFilter = (PlanPropertyFilter) EntityCacheUtil.getResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
                PlanPropertyFilterImpl.class, planPropertyFilterId);

        if (planPropertyFilter == _nullPlanPropertyFilter) {
            return null;
        }

        if (planPropertyFilter == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planPropertyFilter = (PlanPropertyFilter) session.get(PlanPropertyFilterImpl.class,
                        Long.valueOf(planPropertyFilterId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planPropertyFilter != null) {
                    cacheResult(planPropertyFilter);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanPropertyFilterModelImpl.ENTITY_CACHE_ENABLED,
                        PlanPropertyFilterImpl.class, planPropertyFilterId,
                        _nullPlanPropertyFilter);
                }

                closeSession(session);
            }
        }

        return planPropertyFilter;
    }

    /**
     * Returns the plan property filter where planUserSettingsId = &#63; and propertyName = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanPropertyFilterException} if it could not be found.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param propertyName the property name
     * @return the matching plan property filter
     * @throws com.ext.portlet.plans.NoSuchPlanPropertyFilterException if a matching plan property filter could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter findByPlanUserSettingsIdPropertyName(
        Long planUserSettingsId, String propertyName)
        throws NoSuchPlanPropertyFilterException, SystemException {
        PlanPropertyFilter planPropertyFilter = fetchByPlanUserSettingsIdPropertyName(planUserSettingsId,
                propertyName);

        if (planPropertyFilter == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planUserSettingsId=");
            msg.append(planUserSettingsId);

            msg.append(", propertyName=");
            msg.append(propertyName);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlanPropertyFilterException(msg.toString());
        }

        return planPropertyFilter;
    }

    /**
     * Returns the plan property filter where planUserSettingsId = &#63; and propertyName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param propertyName the property name
     * @return the matching plan property filter, or <code>null</code> if a matching plan property filter could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter fetchByPlanUserSettingsIdPropertyName(
        Long planUserSettingsId, String propertyName) throws SystemException {
        return fetchByPlanUserSettingsIdPropertyName(planUserSettingsId,
            propertyName, true);
    }

    /**
     * Returns the plan property filter where planUserSettingsId = &#63; and propertyName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param propertyName the property name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching plan property filter, or <code>null</code> if a matching plan property filter could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPropertyFilter fetchByPlanUserSettingsIdPropertyName(
        Long planUserSettingsId, String propertyName, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { planUserSettingsId, propertyName };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                    finderArgs, this);
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PLANPROPERTYFILTER_WHERE);

            query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PLANUSERSETTINGSID_2);

            if (propertyName == null) {
                query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_1);
            } else {
                if (propertyName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planUserSettingsId.longValue());

                if (propertyName != null) {
                    qPos.add(propertyName);
                }

                List<PlanPropertyFilter> list = q.list();

                result = list;

                PlanPropertyFilter planPropertyFilter = null;

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                        finderArgs, list);
                } else {
                    planPropertyFilter = list.get(0);

                    cacheResult(planPropertyFilter);

                    if ((planPropertyFilter.getPlanUserSettingsId() != planUserSettingsId) ||
                            (planPropertyFilter.getPropertyName() == null) ||
                            !planPropertyFilter.getPropertyName()
                                                   .equals(propertyName)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                            finderArgs, planPropertyFilter);
                    }
                }

                return planPropertyFilter;
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (result == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                        finderArgs);
                }

                closeSession(session);
            }
        } else {
            if (result instanceof List<?>) {
                return null;
            } else {
                return (PlanPropertyFilter) result;
            }
        }
    }

    /**
     * Returns all the plan property filters.
     *
     * @return the plan property filters
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPropertyFilter> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan property filters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan property filters
     * @param end the upper bound of the range of plan property filters (not inclusive)
     * @return the range of plan property filters
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPropertyFilter> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan property filters.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan property filters
     * @param end the upper bound of the range of plan property filters (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan property filters
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPropertyFilter> findAll(int start, int end,
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

        List<PlanPropertyFilter> list = (List<PlanPropertyFilter>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANPROPERTYFILTER);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANPROPERTYFILTER;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanPropertyFilter>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanPropertyFilter>) QueryUtil.list(q,
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
     * Removes the plan property filter where planUserSettingsId = &#63; and propertyName = &#63; from the database.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param propertyName the property name
     * @throws SystemException if a system exception occurred
     */
    public void removeByPlanUserSettingsIdPropertyName(
        Long planUserSettingsId, String propertyName)
        throws NoSuchPlanPropertyFilterException, SystemException {
        PlanPropertyFilter planPropertyFilter = findByPlanUserSettingsIdPropertyName(planUserSettingsId,
                propertyName);

        remove(planPropertyFilter);
    }

    /**
     * Removes all the plan property filters from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanPropertyFilter planPropertyFilter : findAll()) {
            remove(planPropertyFilter);
        }
    }

    /**
     * Returns the number of plan property filters where planUserSettingsId = &#63; and propertyName = &#63;.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param propertyName the property name
     * @return the number of matching plan property filters
     * @throws SystemException if a system exception occurred
     */
    public int countByPlanUserSettingsIdPropertyName(Long planUserSettingsId,
        String propertyName) throws SystemException {
        Object[] finderArgs = new Object[] { planUserSettingsId, propertyName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PLANPROPERTYFILTER_WHERE);

            query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PLANUSERSETTINGSID_2);

            if (propertyName == null) {
                query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_1);
            } else {
                if (propertyName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDPROPERTYNAME_PROPERTYNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planUserSettingsId.longValue());

                if (propertyName != null) {
                    qPos.add(propertyName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDPROPERTYNAME,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan property filters.
     *
     * @return the number of plan property filters
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANPROPERTYFILTER);

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
     * Initializes the plan property filter persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanPropertyFilter")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanPropertyFilter>> listenersList = new ArrayList<ModelListener<PlanPropertyFilter>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanPropertyFilter>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanPropertyFilterImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}