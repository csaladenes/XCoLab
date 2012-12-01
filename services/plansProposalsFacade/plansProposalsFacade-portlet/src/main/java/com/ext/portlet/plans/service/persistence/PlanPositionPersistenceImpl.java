package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanPositionException;
import com.ext.portlet.plans.model.PlanPosition;
import com.ext.portlet.plans.model.impl.PlanPositionImpl;
import com.ext.portlet.plans.model.impl.PlanPositionModelImpl;
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
 * The persistence implementation for the plan position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanPositionPersistence
 * @see PlanPositionUtil
 * @generated
 */
public class PlanPositionPersistenceImpl extends BasePersistenceImpl<PlanPosition>
    implements PlanPositionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanPositionUtil} to access the plan position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanPositionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONID =
        new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, PlanPositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPositionId",
            new String[] {
                Long.class.getName(),
                
            "java.lang.Integer", "java.lang.Integer",
                "com.liferay.portal.kernel.util.OrderByComparator"
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID =
        new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, PlanPositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPositionId",
            new String[] { Long.class.getName() },
            PlanPositionModelImpl.POSITIONID_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_POSITIONID = new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPositionId",
            new String[] { Long.class.getName() });
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, PlanPositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, PlanPositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANPOSITION = "SELECT planPosition FROM PlanPosition planPosition";
    private static final String _SQL_SELECT_PLANPOSITION_WHERE = "SELECT planPosition FROM PlanPosition planPosition WHERE ";
    private static final String _SQL_COUNT_PLANPOSITION = "SELECT COUNT(planPosition) FROM PlanPosition planPosition";
    private static final String _SQL_COUNT_PLANPOSITION_WHERE = "SELECT COUNT(planPosition) FROM PlanPosition planPosition WHERE ";
    private static final String _FINDER_COLUMN_POSITIONID_POSITIONID_2 = "planPosition.id.positionId = ?";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planPosition.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanPosition exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No PlanPosition exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanPositionPersistenceImpl.class);
    private static PlanPosition _nullPlanPosition = new PlanPositionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanPosition> toCacheModel() {
                return _nullPlanPositionCacheModel;
            }
        };

    private static CacheModel<PlanPosition> _nullPlanPositionCacheModel = new CacheModel<PlanPosition>() {
            public PlanPosition toEntityModel() {
                return _nullPlanPosition;
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
     * Caches the plan position in the entity cache if it is enabled.
     *
     * @param planPosition the plan position
     */
    public void cacheResult(PlanPosition planPosition) {
        EntityCacheUtil.putResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionImpl.class, planPosition.getPrimaryKey(), planPosition);

        planPosition.resetOriginalValues();
    }

    /**
     * Caches the plan positions in the entity cache if it is enabled.
     *
     * @param planPositions the plan positions
     */
    public void cacheResult(List<PlanPosition> planPositions) {
        for (PlanPosition planPosition : planPositions) {
            if (EntityCacheUtil.getResult(
                        PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
                        PlanPositionImpl.class, planPosition.getPrimaryKey()) == null) {
                cacheResult(planPosition);
            } else {
                planPosition.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan positions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanPositionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanPositionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan position.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanPosition planPosition) {
        EntityCacheUtil.removeResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionImpl.class, planPosition.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PlanPosition> planPositions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanPosition planPosition : planPositions) {
            EntityCacheUtil.removeResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
                PlanPositionImpl.class, planPosition.getPrimaryKey());
        }
    }

    /**
     * Creates a new plan position with the primary key. Does not add the plan position to the database.
     *
     * @param planPositionPK the primary key for the new plan position
     * @return the new plan position
     */
    public PlanPosition create(PlanPositionPK planPositionPK) {
        PlanPosition planPosition = new PlanPositionImpl();

        planPosition.setNew(true);
        planPosition.setPrimaryKey(planPositionPK);

        return planPosition;
    }

    /**
     * Removes the plan position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param planPositionPK the primary key of the plan position
     * @return the plan position that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition remove(PlanPositionPK planPositionPK)
        throws NoSuchPlanPositionException, SystemException {
        return remove((Serializable) planPositionPK);
    }

    /**
     * Removes the plan position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan position
     * @return the plan position that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPosition remove(Serializable primaryKey)
        throws NoSuchPlanPositionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanPosition planPosition = (PlanPosition) session.get(PlanPositionImpl.class,
                    primaryKey);

            if (planPosition == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planPosition);
        } catch (NoSuchPlanPositionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanPosition removeImpl(PlanPosition planPosition)
        throws SystemException {
        planPosition = toUnwrappedModel(planPosition);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planPosition);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planPosition);

        return planPosition;
    }

    @Override
    public PlanPosition updateImpl(
        com.ext.portlet.plans.model.PlanPosition planPosition, boolean merge)
        throws SystemException {
        planPosition = toUnwrappedModel(planPosition);

        boolean isNew = planPosition.isNew();

        PlanPositionModelImpl planPositionModelImpl = (PlanPositionModelImpl) planPosition;

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planPosition, merge);

            planPosition.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PlanPositionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((planPositionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        Long.valueOf(planPositionModelImpl.getOriginalPositionId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID,
                    args);

                args = new Object[] {
                        Long.valueOf(planPositionModelImpl.getPositionId())
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
            PlanPositionImpl.class, planPosition.getPrimaryKey(), planPosition);

        return planPosition;
    }

    protected PlanPosition toUnwrappedModel(PlanPosition planPosition) {
        if (planPosition instanceof PlanPositionImpl) {
            return planPosition;
        }

        PlanPositionImpl planPositionImpl = new PlanPositionImpl();

        planPositionImpl.setNew(planPosition.isNew());
        planPositionImpl.setPrimaryKey(planPosition.getPrimaryKey());

        planPositionImpl.setPlanId(planPosition.getPlanId());
        planPositionImpl.setPositionId(planPosition.getPositionId());
        planPositionImpl.setUserId(planPosition.getUserId());
        planPositionImpl.setUserName(planPosition.getUserName());
        planPositionImpl.setCreateDate(planPosition.getCreateDate());
        planPositionImpl.setModifiedDate(planPosition.getModifiedDate());

        return planPositionImpl;
    }

    /**
     * Returns the plan position with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan position
     * @return the plan position
     * @throws com.liferay.portal.NoSuchModelException if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPosition findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((PlanPositionPK) primaryKey);
    }

    /**
     * Returns the plan position with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanPositionException} if it could not be found.
     *
     * @param planPositionPK the primary key of the plan position
     * @return the plan position
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition findByPrimaryKey(PlanPositionPK planPositionPK)
        throws NoSuchPlanPositionException, SystemException {
        PlanPosition planPosition = fetchByPrimaryKey(planPositionPK);

        if (planPosition == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + planPositionPK);
            }

            throw new NoSuchPlanPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                planPositionPK);
        }

        return planPosition;
    }

    /**
     * Returns the plan position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan position
     * @return the plan position, or <code>null</code> if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanPosition fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((PlanPositionPK) primaryKey);
    }

    /**
     * Returns the plan position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param planPositionPK the primary key of the plan position
     * @return the plan position, or <code>null</code> if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition fetchByPrimaryKey(PlanPositionPK planPositionPK)
        throws SystemException {
        PlanPosition planPosition = (PlanPosition) EntityCacheUtil.getResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
                PlanPositionImpl.class, planPositionPK);

        if (planPosition == _nullPlanPosition) {
            return null;
        }

        if (planPosition == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planPosition = (PlanPosition) session.get(PlanPositionImpl.class,
                        planPositionPK);
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planPosition != null) {
                    cacheResult(planPosition);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanPositionModelImpl.ENTITY_CACHE_ENABLED,
                        PlanPositionImpl.class, planPositionPK,
                        _nullPlanPosition);
                }

                closeSession(session);
            }
        }

        return planPosition;
    }

    /**
     * Returns all the plan positions where positionId = &#63;.
     *
     * @param positionId the position ID
     * @return the matching plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findByPositionId(Long positionId)
        throws SystemException {
        return findByPositionId(positionId, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan positions where positionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param positionId the position ID
     * @param start the lower bound of the range of plan positions
     * @param end the upper bound of the range of plan positions (not inclusive)
     * @return the range of matching plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findByPositionId(Long positionId, int start,
        int end) throws SystemException {
        return findByPositionId(positionId, start, end, null);
    }

    /**
     * Returns an ordered range of all the plan positions where positionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param positionId the position ID
     * @param start the lower bound of the range of plan positions
     * @param end the upper bound of the range of plan positions (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findByPositionId(Long positionId, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID;
            finderArgs = new Object[] { positionId };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONID;
            finderArgs = new Object[] { positionId, start, end, orderByComparator };
        }

        List<PlanPosition> list = (List<PlanPosition>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_PLANPOSITION_WHERE);

            query.append(_FINDER_COLUMN_POSITIONID_POSITIONID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            }
            else {
                query.append(PlanPositionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(positionId.longValue());

                list = (List<PlanPosition>) QueryUtil.list(q, getDialect(),
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
     * Returns the first plan position in the ordered set where positionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param positionId the position ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching plan position
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a matching plan position could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition findByPositionId_First(Long positionId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanPositionException, SystemException {
        List<PlanPosition> list = findByPositionId(positionId, 0, 1,
                orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("positionId=");
            msg.append(positionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanPositionException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the last plan position in the ordered set where positionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param positionId the position ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching plan position
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a matching plan position could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition findByPositionId_Last(Long positionId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanPositionException, SystemException {
        int count = countByPositionId(positionId);

        List<PlanPosition> list = findByPositionId(positionId, count - 1,
                count, orderByComparator);

        if (list.isEmpty()) {
            StringBundler msg = new StringBundler(4);

            msg.append(_NO_SUCH_ENTITY_WITH_KEY);

            msg.append("positionId=");
            msg.append(positionId);

            msg.append(StringPool.CLOSE_CURLY_BRACE);

            throw new NoSuchPlanPositionException(msg.toString());
        } else {
            return list.get(0);
        }
    }

    /**
     * Returns the plan positions before and after the current plan position in the ordered set where positionId = &#63;.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param planPositionPK the primary key of the current plan position
     * @param positionId the position ID
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the previous, current, and next plan position
     * @throws com.ext.portlet.plans.NoSuchPlanPositionException if a plan position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanPosition[] findByPositionId_PrevAndNext(
        PlanPositionPK planPositionPK, Long positionId,
        OrderByComparator orderByComparator)
        throws NoSuchPlanPositionException, SystemException {
        PlanPosition planPosition = findByPrimaryKey(planPositionPK);

        Session session = null;

        try {
            session = openSession();

            PlanPosition[] array = new PlanPositionImpl[3];

            array[0] = getByPositionId_PrevAndNext(session, planPosition,
                    positionId, orderByComparator, true);

            array[1] = planPosition;

            array[2] = getByPositionId_PrevAndNext(session, planPosition,
                    positionId, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected PlanPosition getByPositionId_PrevAndNext(Session session,
        PlanPosition planPosition, Long positionId,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_PLANPOSITION_WHERE);

        query.append(_FINDER_COLUMN_POSITIONID_POSITIONID_2);

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
            query.append(PlanPositionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(positionId.longValue());

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(planPosition);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<PlanPosition> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Returns all the plan positions.
     *
     * @return the plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan positions.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan positions
     * @param end the upper bound of the range of plan positions (not inclusive)
     * @return the range of plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan positions.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan positions
     * @param end the upper bound of the range of plan positions (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan positions
     * @throws SystemException if a system exception occurred
     */
    public List<PlanPosition> findAll(int start, int end,
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

        List<PlanPosition> list = (List<PlanPosition>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANPOSITION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANPOSITION.concat(PlanPositionModelImpl.ORDER_BY_JPQL);
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanPosition>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanPosition>) QueryUtil.list(q, getDialect(),
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
     * Removes all the plan positions where positionId = &#63; from the database.
     *
     * @param positionId the position ID
     * @throws SystemException if a system exception occurred
     */
    public void removeByPositionId(Long positionId) throws SystemException {
        for (PlanPosition planPosition : findByPositionId(positionId)) {
            remove(planPosition);
        }
    }

    /**
     * Removes all the plan positions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanPosition planPosition : findAll()) {
            remove(planPosition);
        }
    }

    /**
     * Returns the number of plan positions where positionId = &#63;.
     *
     * @param positionId the position ID
     * @return the number of matching plan positions
     * @throws SystemException if a system exception occurred
     */
    public int countByPositionId(Long positionId) throws SystemException {
        Object[] finderArgs = new Object[] { positionId };

        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_BY_POSITIONID,
                finderArgs, this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_PLANPOSITION_WHERE);

            query.append(_FINDER_COLUMN_POSITIONID_POSITIONID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(positionId.longValue());

                count = (Long) q.uniqueResult();
            } catch (Exception e) {
                throw processException(e);
            } finally {
                if (count == null) {
                    count = Long.valueOf(0);
                }

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_POSITIONID,
                    finderArgs, count);

                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns the number of plan positions.
     *
     * @return the number of plan positions
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANPOSITION);

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
     * Initializes the plan position persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanPosition")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanPosition>> listenersList = new ArrayList<ModelListener<PlanPosition>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanPosition>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanPositionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}