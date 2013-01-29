package com.ext.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the plan vote local service. This utility wraps {@link com.ext.portlet.service.impl.PlanVoteLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanVoteLocalService
 * @see com.ext.portlet.service.base.PlanVoteLocalServiceBaseImpl
 * @see com.ext.portlet.service.impl.PlanVoteLocalServiceImpl
 * @generated
 */
public class PlanVoteLocalServiceUtil {
    private static PlanVoteLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.service.impl.PlanVoteLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the plan vote to the database. Also notifies the appropriate model listeners.
    *
    * @param planVote the plan vote
    * @return the plan vote that was added
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.PlanVote addPlanVote(
        com.ext.portlet.model.PlanVote planVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addPlanVote(planVote);
    }

    /**
    * Creates a new plan vote with the primary key. Does not add the plan vote to the database.
    *
    * @param planVotePK the primary key for the new plan vote
    * @return the new plan vote
    */
    public static com.ext.portlet.model.PlanVote createPlanVote(
        com.ext.portlet.service.persistence.PlanVotePK planVotePK) {
        return getService().createPlanVote(planVotePK);
    }

    /**
    * Deletes the plan vote with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param planVotePK the primary key of the plan vote
    * @throws PortalException if a plan vote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static void deletePlanVote(
        com.ext.portlet.service.persistence.PlanVotePK planVotePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        getService().deletePlanVote(planVotePK);
    }

    /**
    * Deletes the plan vote from the database. Also notifies the appropriate model listeners.
    *
    * @param planVote the plan vote
    * @throws SystemException if a system exception occurred
    */
    public static void deletePlanVote(com.ext.portlet.model.PlanVote planVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().deletePlanVote(planVote);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    public static com.ext.portlet.model.PlanVote fetchPlanVote(
        com.ext.portlet.service.persistence.PlanVotePK planVotePK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchPlanVote(planVotePK);
    }

    /**
    * Returns the plan vote with the primary key.
    *
    * @param planVotePK the primary key of the plan vote
    * @return the plan vote
    * @throws PortalException if a plan vote with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.PlanVote getPlanVote(
        com.ext.portlet.service.persistence.PlanVotePK planVotePK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanVote(planVotePK);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the plan votes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan votes
    * @param end the upper bound of the range of plan votes (not inclusive)
    * @return the range of plan votes
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<com.ext.portlet.model.PlanVote> getPlanVotes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanVotes(start, end);
    }

    /**
    * Returns the number of plan votes.
    *
    * @return the number of plan votes
    * @throws SystemException if a system exception occurred
    */
    public static int getPlanVotesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanVotesCount();
    }

    /**
    * Updates the plan vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planVote the plan vote
    * @return the plan vote that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.PlanVote updatePlanVote(
        com.ext.portlet.model.PlanVote planVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePlanVote(planVote);
    }

    /**
    * Updates the plan vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planVote the plan vote
    * @param merge whether to merge the plan vote with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the plan vote that was updated
    * @throws SystemException if a system exception occurred
    */
    public static com.ext.portlet.model.PlanVote updatePlanVote(
        com.ext.portlet.model.PlanVote planVote, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updatePlanVote(planVote, merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static boolean voteForPlan(java.lang.Long planId,
        java.lang.Long userId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().voteForPlan(planId, userId);
    }

    public static boolean unvote(java.lang.Long userId, java.lang.Long contestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().unvote(userId, contestId);
    }

    public static com.ext.portlet.model.PlanVote getPlanVote(
        java.lang.Long userId, java.lang.Long contestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanVote(userId, contestId);
    }

    public static int coutPlanVotes(java.lang.Long planId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().coutPlanVotes(planId);
    }

    public static java.util.List<com.ext.portlet.model.PlanVote> getPlanVotes(
        java.lang.Long planId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getPlanVotes(planId);
    }

    public static int countPlanVotes(com.ext.portlet.model.PlanType type)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countPlanVotes(type);
    }

    public static int countPlanVotes(com.ext.portlet.model.Contest contest)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countPlanVotes(contest);
    }

    public static int countPlanVotesByPlanId(java.lang.Long planId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().countPlanVotesByPlanId(planId);
    }

    public static void store(com.ext.portlet.model.PlanVote planVote)
        throws com.liferay.portal.kernel.exception.SystemException {
        getService().store(planVote);
    }

    public static void clearService() {
        _service = null;
    }

    public static PlanVoteLocalService getService() {
        if (_service == null) {
            Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlanVoteLocalService.class.getName());
            ClassLoader portletClassLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    "portletClassLoader");

            ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
                    PlanVoteLocalService.class.getName(), portletClassLoader);

            _service = new PlanVoteLocalServiceClp(classLoaderProxy);

            ClpSerializer.setClassLoader(portletClassLoader);

            ReferenceRegistry.registerReference(PlanVoteLocalServiceUtil.class,
                "_service");
            MethodCache.remove(PlanVoteLocalService.class);
        }

        return _service;
    }

    public void setService(PlanVoteLocalService service) {
        MethodCache.remove(PlanVoteLocalService.class);

        _service = service;

        ReferenceRegistry.registerReference(PlanVoteLocalServiceUtil.class,
            "_service");
        MethodCache.remove(PlanVoteLocalService.class);
    }
}