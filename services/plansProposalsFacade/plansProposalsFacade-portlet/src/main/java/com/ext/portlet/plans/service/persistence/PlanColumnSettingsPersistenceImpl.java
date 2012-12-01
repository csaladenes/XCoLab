package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanColumnSettingsException;
import com.ext.portlet.plans.model.PlanColumnSettings;
import com.ext.portlet.plans.model.impl.PlanColumnSettingsImpl;
import com.ext.portlet.plans.model.impl.PlanColumnSettingsModelImpl;
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
 * The persistence implementation for the plan column settings service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanColumnSettingsPersistence
 * @see PlanColumnSettingsUtil
 * @generated
 */
public class PlanColumnSettingsPersistenceImpl extends BasePersistenceImpl<PlanColumnSettings>
    implements PlanColumnSettingsPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanColumnSettingsUtil} to access the plan column settings persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanColumnSettingsImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME =
        new FinderPath(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsModelImpl.FINDER_CACHE_ENABLED,
            PlanColumnSettingsImpl.class, FINDER_CLASS_NAME_ENTITY,
            "fetchByPlanUserSettingsIdColumnName",
            new String[] { Long.class.getName(), String.class.getName() },
            PlanColumnSettingsModelImpl.PLANUSERSETTINGSID_COLUMN_BITMASK |
            PlanColumnSettingsModelImpl.COLUMNNAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDCOLUMNNAME =
        new FinderPath(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
            "countByPlanUserSettingsIdColumnName",
            new String[] { Long.class.getName(), String.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsModelImpl.FINDER_CACHE_ENABLED,
            PlanColumnSettingsImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsModelImpl.FINDER_CACHE_ENABLED,
            PlanColumnSettingsImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANCOLUMNSETTINGS = "SELECT planColumnSettings FROM PlanColumnSettings planColumnSettings";
    private static final String _SQL_SELECT_PLANCOLUMNSETTINGS_WHERE = "SELECT planColumnSettings FROM PlanColumnSettings planColumnSettings WHERE ";
    private static final String _SQL_COUNT_PLANCOLUMNSETTINGS = "SELECT COUNT(planColumnSettings) FROM PlanColumnSettings planColumnSettings";
    private static final String _SQL_COUNT_PLANCOLUMNSETTINGS_WHERE = "SELECT COUNT(planColumnSettings) FROM PlanColumnSettings planColumnSettings WHERE ";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_PLANUSERSETTINGSID_2 =
        "planColumnSettings.planUserSettingsId = ? AND ";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_1 =
        "planColumnSettings.columnName IS NULL";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_2 =
        "planColumnSettings.columnName = ?";
    private static final String _FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_3 =
        "(planColumnSettings.columnName IS NULL OR planColumnSettings.columnName = ?)";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planColumnSettings.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanColumnSettings exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlanColumnSettings exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanColumnSettingsPersistenceImpl.class);
    private static PlanColumnSettings _nullPlanColumnSettings = new PlanColumnSettingsImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanColumnSettings> toCacheModel() {
                return _nullPlanColumnSettingsCacheModel;
            }
        };

    private static CacheModel<PlanColumnSettings> _nullPlanColumnSettingsCacheModel =
        new CacheModel<PlanColumnSettings>() {
            public PlanColumnSettings toEntityModel() {
                return _nullPlanColumnSettings;
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
     * Caches the plan column settings in the entity cache if it is enabled.
     *
     * @param planColumnSettings the plan column settings
     */
    public void cacheResult(PlanColumnSettings planColumnSettings) {
        EntityCacheUtil.putResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsImpl.class, planColumnSettings.getPrimaryKey(),
            planColumnSettings);

        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
            new Object[] {
                Long.valueOf(planColumnSettings.getPlanUserSettingsId()),
                
            planColumnSettings.getColumnName()
            }, planColumnSettings);

        planColumnSettings.resetOriginalValues();
    }

    /**
     * Caches the plan column settingses in the entity cache if it is enabled.
     *
     * @param planColumnSettingses the plan column settingses
     */
    public void cacheResult(List<PlanColumnSettings> planColumnSettingses) {
        for (PlanColumnSettings planColumnSettings : planColumnSettingses) {
            if (EntityCacheUtil.getResult(
                        PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
                        PlanColumnSettingsImpl.class,
                        planColumnSettings.getPrimaryKey()) == null) {
                cacheResult(planColumnSettings);
            } else {
                planColumnSettings.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan column settingses.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanColumnSettingsImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanColumnSettingsImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan column settings.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanColumnSettings planColumnSettings) {
        EntityCacheUtil.removeResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsImpl.class, planColumnSettings.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        clearUniqueFindersCache(planColumnSettings);
    }

    @Override
    public void clearCache(List<PlanColumnSettings> planColumnSettingses) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanColumnSettings planColumnSettings : planColumnSettingses) {
            EntityCacheUtil.removeResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
                PlanColumnSettingsImpl.class, planColumnSettings.getPrimaryKey());

            clearUniqueFindersCache(planColumnSettings);
        }
    }

    protected void clearUniqueFindersCache(
        PlanColumnSettings planColumnSettings) {
        FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
            new Object[] {
                Long.valueOf(planColumnSettings.getPlanUserSettingsId()),
                
            planColumnSettings.getColumnName()
            });
    }

    /**
     * Creates a new plan column settings with the primary key. Does not add the plan column settings to the database.
     *
     * @param planColumnSettingsId the primary key for the new plan column settings
     * @return the new plan column settings
     */
    public PlanColumnSettings create(Long planColumnSettingsId) {
        PlanColumnSettings planColumnSettings = new PlanColumnSettingsImpl();

        planColumnSettings.setNew(true);
        planColumnSettings.setPrimaryKey(planColumnSettingsId);

        return planColumnSettings;
    }

    /**
     * Removes the plan column settings with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param planColumnSettingsId the primary key of the plan column settings
     * @return the plan column settings that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanColumnSettingsException if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings remove(Long planColumnSettingsId)
        throws NoSuchPlanColumnSettingsException, SystemException {
        return remove((Serializable) planColumnSettingsId);
    }

    /**
     * Removes the plan column settings with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan column settings
     * @return the plan column settings that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanColumnSettingsException if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanColumnSettings remove(Serializable primaryKey)
        throws NoSuchPlanColumnSettingsException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanColumnSettings planColumnSettings = (PlanColumnSettings) session.get(PlanColumnSettingsImpl.class,
                    primaryKey);

            if (planColumnSettings == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanColumnSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planColumnSettings);
        } catch (NoSuchPlanColumnSettingsException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanColumnSettings removeImpl(
        PlanColumnSettings planColumnSettings) throws SystemException {
        planColumnSettings = toUnwrappedModel(planColumnSettings);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planColumnSettings);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planColumnSettings);

        return planColumnSettings;
    }

    @Override
    public PlanColumnSettings updateImpl(
        com.ext.portlet.plans.model.PlanColumnSettings planColumnSettings,
        boolean merge) throws SystemException {
        planColumnSettings = toUnwrappedModel(planColumnSettings);

        boolean isNew = planColumnSettings.isNew();

        PlanColumnSettingsModelImpl planColumnSettingsModelImpl = (PlanColumnSettingsModelImpl) planColumnSettings;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planColumnSettings, merge);

            planColumnSettings.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlanColumnSettingsModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
            PlanColumnSettingsImpl.class, planColumnSettings.getPrimaryKey(),
            planColumnSettings);

        if (isNew) {
            FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                new Object[] {
                    Long.valueOf(planColumnSettings.getPlanUserSettingsId()),
                    
                planColumnSettings.getColumnName()
                }, planColumnSettings);
        } else {
            if ((planColumnSettingsModelImpl.getColumnBitmask() &
                    FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planColumnSettingsModelImpl.getOriginalPlanUserSettingsId()),
                        
                        planColumnSettingsModelImpl.getOriginalColumnName()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                    args);

                FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                    new Object[] {
                        Long.valueOf(planColumnSettings.getPlanUserSettingsId()),
                        
                    planColumnSettings.getColumnName()
                    }, planColumnSettings);
            }
        }

        return planColumnSettings;
    }

    protected PlanColumnSettings toUnwrappedModel(
        PlanColumnSettings planColumnSettings) {
        if (planColumnSettings instanceof PlanColumnSettingsImpl) {
            return planColumnSettings;
        }

        PlanColumnSettingsImpl planColumnSettingsImpl = new PlanColumnSettingsImpl();

        planColumnSettingsImpl.setNew(planColumnSettings.isNew());
        planColumnSettingsImpl.setPrimaryKey(planColumnSettings.getPrimaryKey());

        planColumnSettingsImpl.setPlanColumnSettingsId(planColumnSettings.getPlanColumnSettingsId());
        planColumnSettingsImpl.setColumnName(planColumnSettings.getColumnName());
        planColumnSettingsImpl.setPlanUserSettingsId(planColumnSettings.getPlanUserSettingsId());
        planColumnSettingsImpl.setVisible(planColumnSettings.getVisible());

        return planColumnSettingsImpl;
    }

    /**
     * Returns the plan column settings with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan column settings
     * @return the plan column settings
     * @throws com.liferay.portal.NoSuchModelException if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanColumnSettings findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan column settings with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanColumnSettingsException} if it could not be found.
     *
     * @param planColumnSettingsId the primary key of the plan column settings
     * @return the plan column settings
     * @throws com.ext.portlet.plans.NoSuchPlanColumnSettingsException if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings findByPrimaryKey(Long planColumnSettingsId)
        throws NoSuchPlanColumnSettingsException, SystemException {
        PlanColumnSettings planColumnSettings = fetchByPrimaryKey(planColumnSettingsId);

        if (planColumnSettings == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    planColumnSettingsId);
            }

            throw new NoSuchPlanColumnSettingsException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                planColumnSettingsId);
        }

        return planColumnSettings;
    }

    /**
     * Returns the plan column settings with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan column settings
     * @return the plan column settings, or <code>null</code> if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanColumnSettings fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan column settings with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param planColumnSettingsId the primary key of the plan column settings
     * @return the plan column settings, or <code>null</code> if a plan column settings with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings fetchByPrimaryKey(Long planColumnSettingsId)
        throws SystemException {
        PlanColumnSettings planColumnSettings = (PlanColumnSettings) EntityCacheUtil.getResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
                PlanColumnSettingsImpl.class, planColumnSettingsId);

        if (planColumnSettings == _nullPlanColumnSettings) {
            return null;
        }

        if (planColumnSettings == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planColumnSettings = (PlanColumnSettings) session.get(PlanColumnSettingsImpl.class,
                        Long.valueOf(planColumnSettingsId));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planColumnSettings != null) {
                    cacheResult(planColumnSettings);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanColumnSettingsModelImpl.ENTITY_CACHE_ENABLED,
                        PlanColumnSettingsImpl.class, planColumnSettingsId,
                        _nullPlanColumnSettings);
                }

                closeSession(session);
            }
        }

        return planColumnSettings;
    }

    /**
     * Returns the plan column settings where planUserSettingsId = &#63; and columnName = &#63; or throws a {@link com.ext.portlet.plans.NoSuchPlanColumnSettingsException} if it could not be found.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param columnName the column name
     * @return the matching plan column settings
     * @throws com.ext.portlet.plans.NoSuchPlanColumnSettingsException if a matching plan column settings could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings findByPlanUserSettingsIdColumnName(
        Long planUserSettingsId, String columnName)
        throws NoSuchPlanColumnSettingsException, SystemException {
        PlanColumnSettings planColumnSettings = fetchByPlanUserSettingsIdColumnName(planUserSettingsId,
                columnName);

        if (planColumnSettings == null) {
            StringBundler msg = new StringBundler(6);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("planUserSettingsId=");
            msg.append(planUserSettingsId);

            msg.append(", columnName=");
            msg.append(columnName);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            if (_log.isWarnEnabled()) {
                _log.warn(msg.toString());
            }

            throw new NoSuchPlanColumnSettingsException(msg.toString());
        }

        return planColumnSettings;
    }

    /**
     * Returns the plan column settings where planUserSettingsId = &#63; and columnName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param columnName the column name
     * @return the matching plan column settings, or <code>null</code> if a matching plan column settings could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings fetchByPlanUserSettingsIdColumnName(
        Long planUserSettingsId, String columnName) throws SystemException {
        return fetchByPlanUserSettingsIdColumnName(planUserSettingsId,
            columnName, true);
    }

    /**
     * Returns the plan column settings where planUserSettingsId = &#63; and columnName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param columnName the column name
     * @param retrieveFromCache whether to use the finder cache
     * @return the matching plan column settings, or <code>null</code> if a matching plan column settings could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanColumnSettings fetchByPlanUserSettingsIdColumnName(
        Long planUserSettingsId, String columnName, boolean retrieveFromCache)
        throws SystemException {
        Object[] finderArgs = new Object[] { planUserSettingsId, columnName };

        Object result = null;

        if (retrieveFromCache) {
            result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                    finderArgs, this);
        }

        if (result == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_SELECT_PLANCOLUMNSETTINGS_WHERE);

            query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_PLANUSERSETTINGSID_2);

            if (columnName == null) {
                query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_1);
            } else {
                if (columnName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planUserSettingsId.longValue());

                if (columnName != null) {
                    qPos.add(columnName);
                }

                List<PlanColumnSettings> list = q.list();

                result = list;

                PlanColumnSettings planColumnSettings = null;

                if (list.isEmpty()) {
                    FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                        finderArgs, list);
                } else {
                    planColumnSettings = list.get(0);

                    cacheResult(planColumnSettings);

                    if ((planColumnSettings.getPlanUserSettingsId() != planUserSettingsId) ||
                            (planColumnSettings.getColumnName() == null) ||
                            !planColumnSettings.getColumnName()
                                                   .equals(columnName)) {
                        FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                            finderArgs, planColumnSettings);
                    }
                }

                return planColumnSettings;
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (result == null) {
                    FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                        finderArgs);
                }

                closeSession(session);
            }
        } else {
            if (result instanceof List<?>) {
                return null;
            } else {
                return (PlanColumnSettings) result;
            }
        }
    }

    /**
     * Returns all the plan column settingses.
     *
     * @return the plan column settingses
     * @throws SystemException if a system exception occurred
     */
    public List<PlanColumnSettings> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan column settingses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan column settingses
     * @param end the upper bound of the range of plan column settingses (not inclusive)
     * @return the range of plan column settingses
     * @throws SystemException if a system exception occurred
     */
    public List<PlanColumnSettings> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan column settingses.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan column settingses
     * @param end the upper bound of the range of plan column settingses (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan column settingses
     * @throws SystemException if a system exception occurred
     */
    public List<PlanColumnSettings> findAll(int start, int end,
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

        List<PlanColumnSettings> list = (List<PlanColumnSettings>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANCOLUMNSETTINGS);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANCOLUMNSETTINGS;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanColumnSettings>) QueryUtil.list(q,
                            getDialect(), start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanColumnSettings>) QueryUtil.list(q,
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
     * Removes the plan column settings where planUserSettingsId = &#63; and columnName = &#63; from the database.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param columnName the column name
     * @throws SystemException if a system exception occurred
     */
    public void removeByPlanUserSettingsIdColumnName(Long planUserSettingsId,
        String columnName)
        throws NoSuchPlanColumnSettingsException, SystemException {
        PlanColumnSettings planColumnSettings = findByPlanUserSettingsIdColumnName(planUserSettingsId,
                columnName);

        remove(planColumnSettings);
    }

    /**
     * Removes all the plan column settingses from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanColumnSettings planColumnSettings : findAll()) {
            remove(planColumnSettings);
        }
    }

    /**
     * Returns the number of plan column settingses where planUserSettingsId = &#63; and columnName = &#63;.
     *
     * @param planUserSettingsId the plan user settings ID
     * @param columnName the column name
     * @return the number of matching plan column settingses
     * @throws SystemException if a system exception occurred
     */
    public int countByPlanUserSettingsIdColumnName(Long planUserSettingsId,
        String columnName) throws SystemException {
        Object[] finderArgs = new Object[] { planUserSettingsId, columnName };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(3);

            query.append(_SQL_COUNT_PLANCOLUMNSETTINGS_WHERE);

            query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_PLANUSERSETTINGSID_2);

            if (columnName == null) {
                query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_1);
            } else {
                if (columnName.equals(StringPool.BLANK)) {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_3);
                } else {
                    query.append(_FINDER_COLUMN_PLANUSERSETTINGSIDCOLUMNNAME_COLUMNNAME_2);
                }
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(planUserSettingsId.longValue());

                if (columnName != null) {
                    qPos.add(columnName);
                }

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_PLANUSERSETTINGSIDCOLUMNNAME,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan column settingses.
     *
     * @return the number of plan column settingses
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANCOLUMNSETTINGS);

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
     * Initializes the plan column settings persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanColumnSettings")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanColumnSettings>> listenersList = new ArrayList<ModelListener<PlanColumnSettings>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanColumnSettings>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanColumnSettingsImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}