package com.ext.portlet.Activity.service.base;

import com.ext.portlet.Activity.model.ActivitySubscription;
import com.ext.portlet.Activity.service.ActivitySubscriptionLocalService;
import com.ext.portlet.Activity.service.ActivitySubscriptionService;
import com.ext.portlet.Activity.service.persistence.ActivitySubscriptionPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.base.PrincipalBean;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the activity subscription remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ext.portlet.Activity.service.impl.ActivitySubscriptionServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.Activity.service.impl.ActivitySubscriptionServiceImpl
 * @see com.ext.portlet.Activity.service.ActivitySubscriptionServiceUtil
 * @generated
 */
public abstract class ActivitySubscriptionServiceBaseImpl extends PrincipalBean
    implements ActivitySubscriptionService, IdentifiableBean {
    @BeanReference(type = ActivitySubscriptionLocalService.class)
    protected ActivitySubscriptionLocalService activitySubscriptionLocalService;
    @BeanReference(type = ActivitySubscriptionService.class)
    protected ActivitySubscriptionService activitySubscriptionService;
    @BeanReference(type = ActivitySubscriptionPersistence.class)
    protected ActivitySubscriptionPersistence activitySubscriptionPersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.ext.portlet.Activity.service.ActivitySubscriptionServiceUtil} to access the activity subscription remote service.
     */

    /**
     * Returns the activity subscription local service.
     *
     * @return the activity subscription local service
     */
    public ActivitySubscriptionLocalService getActivitySubscriptionLocalService() {
        return activitySubscriptionLocalService;
    }

    /**
     * Sets the activity subscription local service.
     *
     * @param activitySubscriptionLocalService the activity subscription local service
     */
    public void setActivitySubscriptionLocalService(
        ActivitySubscriptionLocalService activitySubscriptionLocalService) {
        this.activitySubscriptionLocalService = activitySubscriptionLocalService;
    }

    /**
     * Returns the activity subscription remote service.
     *
     * @return the activity subscription remote service
     */
    public ActivitySubscriptionService getActivitySubscriptionService() {
        return activitySubscriptionService;
    }

    /**
     * Sets the activity subscription remote service.
     *
     * @param activitySubscriptionService the activity subscription remote service
     */
    public void setActivitySubscriptionService(
        ActivitySubscriptionService activitySubscriptionService) {
        this.activitySubscriptionService = activitySubscriptionService;
    }

    /**
     * Returns the activity subscription persistence.
     *
     * @return the activity subscription persistence
     */
    public ActivitySubscriptionPersistence getActivitySubscriptionPersistence() {
        return activitySubscriptionPersistence;
    }

    /**
     * Sets the activity subscription persistence.
     *
     * @param activitySubscriptionPersistence the activity subscription persistence
     */
    public void setActivitySubscriptionPersistence(
        ActivitySubscriptionPersistence activitySubscriptionPersistence) {
        this.activitySubscriptionPersistence = activitySubscriptionPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    protected Class<?> getModelClass() {
        return ActivitySubscription.class;
    }

    protected String getModelClassName() {
        return ActivitySubscription.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = activitySubscriptionPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}