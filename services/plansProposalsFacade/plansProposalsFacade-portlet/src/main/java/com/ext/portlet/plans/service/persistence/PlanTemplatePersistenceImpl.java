package com.ext.portlet.plans.service.persistence;

import com.ext.portlet.plans.NoSuchPlanTemplateException;
import com.ext.portlet.plans.model.PlanTemplate;
import com.ext.portlet.plans.model.impl.PlanTemplateImpl;
import com.ext.portlet.plans.model.impl.PlanTemplateModelImpl;
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
 * The persistence implementation for the plan template service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplatePersistence
 * @see PlanTemplateUtil
 * @generated
 */
public class PlanTemplatePersistenceImpl extends BasePersistenceImpl<PlanTemplate>
    implements PlanTemplatePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PlanTemplateUtil} to access the plan template persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PlanTemplateImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateModelImpl.FINDER_CACHE_ENABLED, PlanTemplateImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateModelImpl.FINDER_CACHE_ENABLED, PlanTemplateImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PLANTEMPLATE = "SELECT planTemplate FROM PlanTemplate planTemplate";
    private static final String _SQL_COUNT_PLANTEMPLATE = "SELECT COUNT(planTemplate) FROM PlanTemplate planTemplate";
    private static final String _ORDER_BY_ENTITY_ALIAS = "planTemplate.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No PlanTemplate exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PlanTemplatePersistenceImpl.class);
    private static PlanTemplate _nullPlanTemplate = new PlanTemplateImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<PlanTemplate> toCacheModel() {
                return _nullPlanTemplateCacheModel;
            }
        };

    private static CacheModel<PlanTemplate> _nullPlanTemplateCacheModel = new CacheModel<PlanTemplate>() {
            public PlanTemplate toEntityModel() {
                return _nullPlanTemplate;
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
     * Caches the plan template in the entity cache if it is enabled.
     *
     * @param planTemplate the plan template
     */
    public void cacheResult(PlanTemplate planTemplate) {
        EntityCacheUtil.putResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateImpl.class, planTemplate.getPrimaryKey(), planTemplate);

        planTemplate.resetOriginalValues();
    }

    /**
     * Caches the plan templates in the entity cache if it is enabled.
     *
     * @param planTemplates the plan templates
     */
    public void cacheResult(List<PlanTemplate> planTemplates) {
        for (PlanTemplate planTemplate : planTemplates) {
            if (EntityCacheUtil.getResult(
                        PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
                        PlanTemplateImpl.class, planTemplate.getPrimaryKey()) == null) {
                cacheResult(planTemplate);
            } else {
                planTemplate.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all plan templates.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PlanTemplateImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PlanTemplateImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the plan template.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(PlanTemplate planTemplate) {
        EntityCacheUtil.removeResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateImpl.class, planTemplate.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<PlanTemplate> planTemplates) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (PlanTemplate planTemplate : planTemplates) {
            EntityCacheUtil.removeResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
                PlanTemplateImpl.class, planTemplate.getPrimaryKey());
        }
    }

    /**
     * Creates a new plan template with the primary key. Does not add the plan template to the database.
     *
     * @param id the primary key for the new plan template
     * @return the new plan template
     */
    public PlanTemplate create(Long id) {
        PlanTemplate planTemplate = new PlanTemplateImpl();

        planTemplate.setNew(true);
        planTemplate.setPrimaryKey(id);

        return planTemplate;
    }

    /**
     * Removes the plan template with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param id the primary key of the plan template
     * @return the plan template that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanTemplateException if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanTemplate remove(Long id)
        throws NoSuchPlanTemplateException, SystemException {
        return remove((Serializable) id);
    }

    /**
     * Removes the plan template with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the plan template
     * @return the plan template that was removed
     * @throws com.ext.portlet.plans.NoSuchPlanTemplateException if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanTemplate remove(Serializable primaryKey)
        throws NoSuchPlanTemplateException, SystemException {
        Session session = null;

        try {
            session = openSession();

            PlanTemplate planTemplate = (PlanTemplate) session.get(PlanTemplateImpl.class,
                    primaryKey);

            if (planTemplate == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPlanTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(planTemplate);
        } catch (NoSuchPlanTemplateException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected PlanTemplate removeImpl(PlanTemplate planTemplate)
        throws SystemException {
        planTemplate = toUnwrappedModel(planTemplate);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.delete(session, planTemplate);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        clearCache(planTemplate);

        return planTemplate;
    }

    @Override
    public PlanTemplate updateImpl(
        com.ext.portlet.plans.model.PlanTemplate planTemplate, boolean merge)
        throws SystemException {
        planTemplate = toUnwrappedModel(planTemplate);

        Session session = null;

        try {
            session = openSession();

            BatchSessionUtil.update(session, planTemplate, merge);

            planTemplate.setNew(false);
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        EntityCacheUtil.putResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
            PlanTemplateImpl.class, planTemplate.getPrimaryKey(), planTemplate);

        return planTemplate;
    }

    protected PlanTemplate toUnwrappedModel(PlanTemplate planTemplate) {
        if (planTemplate instanceof PlanTemplateImpl) {
            return planTemplate;
        }

        PlanTemplateImpl planTemplateImpl = new PlanTemplateImpl();

        planTemplateImpl.setNew(planTemplate.isNew());
        planTemplateImpl.setPrimaryKey(planTemplate.getPrimaryKey());

        planTemplateImpl.setId(planTemplate.getId());
        planTemplateImpl.setName(planTemplate.getName());

        return planTemplateImpl;
    }

    /**
     * Returns the plan template with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the plan template
     * @return the plan template
     * @throws com.liferay.portal.NoSuchModelException if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanTemplate findByPrimaryKey(Serializable primaryKey)
        throws NoSuchModelException, SystemException {
        return findByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan template with the primary key or throws a {@link com.ext.portlet.plans.NoSuchPlanTemplateException} if it could not be found.
     *
     * @param id the primary key of the plan template
     * @return the plan template
     * @throws com.ext.portlet.plans.NoSuchPlanTemplateException if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanTemplate findByPrimaryKey(Long id)
        throws NoSuchPlanTemplateException, SystemException {
        PlanTemplate planTemplate = fetchByPrimaryKey(id);

        if (planTemplate == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + id);
            }

            throw new NoSuchPlanTemplateException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                id);
        }

        return planTemplate;
    }

    /**
     * Returns the plan template with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the plan template
     * @return the plan template, or <code>null</code> if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public PlanTemplate fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        return fetchByPrimaryKey((Long) primaryKey);
    }

    /**
     * Returns the plan template with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param id the primary key of the plan template
     * @return the plan template, or <code>null</code> if a plan template with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    public PlanTemplate fetchByPrimaryKey(Long id) throws SystemException {
        PlanTemplate planTemplate = (PlanTemplate) EntityCacheUtil.getResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
                PlanTemplateImpl.class, id);

        if (planTemplate == _nullPlanTemplate) {
            return null;
        }

        if (planTemplate == null) {
            Session session = null;

            boolean hasException = false;

            try {
                session = openSession();

                planTemplate = (PlanTemplate) session.get(PlanTemplateImpl.class,
                        Long.valueOf(id));
            } catch (Exception e) {
                hasException = true;

                throw processException(e);
            } finally {
                if (planTemplate != null) {
                    cacheResult(planTemplate);
                } else if (!hasException) {
                    EntityCacheUtil.putResult(PlanTemplateModelImpl.ENTITY_CACHE_ENABLED,
                        PlanTemplateImpl.class, id, _nullPlanTemplate);
                }

                closeSession(session);
            }
        }

        return planTemplate;
    }

    /**
     * Returns all the plan templates.
     *
     * @return the plan templates
     * @throws SystemException if a system exception occurred
     */
    public List<PlanTemplate> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the plan templates.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan templates
     * @param end the upper bound of the range of plan templates (not inclusive)
     * @return the range of plan templates
     * @throws SystemException if a system exception occurred
     */
    public List<PlanTemplate> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the plan templates.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
     * </p>
     *
     * @param start the lower bound of the range of plan templates
     * @param end the upper bound of the range of plan templates (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of plan templates
     * @throws SystemException if a system exception occurred
     */
    public List<PlanTemplate> findAll(int start, int end,
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

        List<PlanTemplate> list = (List<PlanTemplate>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PLANTEMPLATE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PLANTEMPLATE;
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (orderByComparator == null) {
                    list = (List<PlanTemplate>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);
                } else {
                    list = (List<PlanTemplate>) QueryUtil.list(q, getDialect(),
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
     * Removes all the plan templates from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    public void removeAll() throws SystemException {
        for (PlanTemplate planTemplate : findAll()) {
            remove(planTemplate);
        }
    }

    /**
     * Returns the number of plan templates.
     *
     * @return the number of plan templates
     * @throws SystemException if a system exception occurred
     */
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_PLANTEMPLATE);

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
     * Initializes the plan template persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.com.ext.portlet.plans.model.PlanTemplate")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<PlanTemplate>> listenersList = new ArrayList<ModelListener<PlanTemplate>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<PlanTemplate>) InstanceFactory.newInstance(
                            listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PlanTemplateImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}