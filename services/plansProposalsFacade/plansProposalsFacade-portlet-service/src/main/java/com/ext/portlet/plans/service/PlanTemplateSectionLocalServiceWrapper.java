package com.ext.portlet.plans.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link PlanTemplateSectionLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       PlanTemplateSectionLocalService
 * @generated
 */
public class PlanTemplateSectionLocalServiceWrapper
    implements PlanTemplateSectionLocalService,
        ServiceWrapper<PlanTemplateSectionLocalService> {
    private PlanTemplateSectionLocalService _planTemplateSectionLocalService;

    public PlanTemplateSectionLocalServiceWrapper(
        PlanTemplateSectionLocalService planTemplateSectionLocalService) {
        _planTemplateSectionLocalService = planTemplateSectionLocalService;
    }

    /**
    * Adds the plan template section to the database. Also notifies the appropriate model listeners.
    *
    * @param planTemplateSection the plan template section
    * @return the plan template section that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTemplateSection addPlanTemplateSection(
        com.ext.portlet.plans.model.PlanTemplateSection planTemplateSection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.addPlanTemplateSection(planTemplateSection);
    }

    /**
    * Creates a new plan template section with the primary key. Does not add the plan template section to the database.
    *
    * @param planTemplateSectionPK the primary key for the new plan template section
    * @return the new plan template section
    */
    public com.ext.portlet.plans.model.PlanTemplateSection createPlanTemplateSection(
        com.ext.portlet.plans.service.persistence.PlanTemplateSectionPK planTemplateSectionPK) {
        return _planTemplateSectionLocalService.createPlanTemplateSection(planTemplateSectionPK);
    }

    /**
    * Deletes the plan template section with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param planTemplateSectionPK the primary key of the plan template section
    * @throws PortalException if a plan template section with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deletePlanTemplateSection(
        com.ext.portlet.plans.service.persistence.PlanTemplateSectionPK planTemplateSectionPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _planTemplateSectionLocalService.deletePlanTemplateSection(planTemplateSectionPK);
    }

    /**
    * Deletes the plan template section from the database. Also notifies the appropriate model listeners.
    *
    * @param planTemplateSection the plan template section
    * @throws SystemException if a system exception occurred
    */
    public void deletePlanTemplateSection(
        com.ext.portlet.plans.model.PlanTemplateSection planTemplateSection)
        throws com.liferay.portal.kernel.exception.SystemException {
        _planTemplateSectionLocalService.deletePlanTemplateSection(planTemplateSection);
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.dynamicQuery(dynamicQuery);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.dynamicQuery(dynamicQuery,
            start, end);
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
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.dynamicQuery(dynamicQuery,
            start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.plans.model.PlanTemplateSection fetchPlanTemplateSection(
        com.ext.portlet.plans.service.persistence.PlanTemplateSectionPK planTemplateSectionPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.fetchPlanTemplateSection(planTemplateSectionPK);
    }

    /**
    * Returns the plan template section with the primary key.
    *
    * @param planTemplateSectionPK the primary key of the plan template section
    * @return the plan template section
    * @throws PortalException if a plan template section with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTemplateSection getPlanTemplateSection(
        com.ext.portlet.plans.service.persistence.PlanTemplateSectionPK planTemplateSectionPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.getPlanTemplateSection(planTemplateSectionPK);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the plan template sections.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
    * </p>
    *
    * @param start the lower bound of the range of plan template sections
    * @param end the upper bound of the range of plan template sections (not inclusive)
    * @return the range of plan template sections
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<com.ext.portlet.plans.model.PlanTemplateSection> getPlanTemplateSections(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.getPlanTemplateSections(start,
            end);
    }

    /**
    * Returns the number of plan template sections.
    *
    * @return the number of plan template sections
    * @throws SystemException if a system exception occurred
    */
    public int getPlanTemplateSectionsCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.getPlanTemplateSectionsCount();
    }

    /**
    * Updates the plan template section in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planTemplateSection the plan template section
    * @return the plan template section that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTemplateSection updatePlanTemplateSection(
        com.ext.portlet.plans.model.PlanTemplateSection planTemplateSection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.updatePlanTemplateSection(planTemplateSection);
    }

    /**
    * Updates the plan template section in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param planTemplateSection the plan template section
    * @param merge whether to merge the plan template section with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the plan template section that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.plans.model.PlanTemplateSection updatePlanTemplateSection(
        com.ext.portlet.plans.model.PlanTemplateSection planTemplateSection,
        boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.updatePlanTemplateSection(planTemplateSection,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _planTemplateSectionLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _planTemplateSectionLocalService.setBeanIdentifier(beanIdentifier);
    }

    public java.util.List<com.ext.portlet.plans.model.PlanTemplateSection> findByPlanTemplateId(
        java.lang.Long planTemplateId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.findByPlanTemplateId(planTemplateId);
    }

    public com.ext.portlet.plans.model.PlanTemplateSection addPlanTemplateSection(
        java.lang.Long planTemplateId, java.lang.Long sectionId, int weight)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _planTemplateSectionLocalService.addPlanTemplateSection(planTemplateId,
            sectionId, weight);
    }

    public void removePlanTemplateSection(java.lang.Long planTemplateId,
        java.lang.Long sectionId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _planTemplateSectionLocalService.removePlanTemplateSection(planTemplateId,
            sectionId);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public PlanTemplateSectionLocalService getWrappedPlanTemplateSectionLocalService() {
        return _planTemplateSectionLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedPlanTemplateSectionLocalService(
        PlanTemplateSectionLocalService planTemplateSectionLocalService) {
        _planTemplateSectionLocalService = planTemplateSectionLocalService;
    }

    public PlanTemplateSectionLocalService getWrappedService() {
        return _planTemplateSectionLocalService;
    }

    public void setWrappedService(
        PlanTemplateSectionLocalService planTemplateSectionLocalService) {
        _planTemplateSectionLocalService = planTemplateSectionLocalService;
    }
}