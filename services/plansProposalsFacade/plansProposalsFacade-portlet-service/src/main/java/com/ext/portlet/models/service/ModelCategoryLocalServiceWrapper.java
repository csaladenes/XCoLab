package com.ext.portlet.models.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ModelCategoryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ModelCategoryLocalService
 * @generated
 */
public class ModelCategoryLocalServiceWrapper
    implements ModelCategoryLocalService,
        ServiceWrapper<ModelCategoryLocalService> {
    private ModelCategoryLocalService _modelCategoryLocalService;

    public ModelCategoryLocalServiceWrapper(
        ModelCategoryLocalService modelCategoryLocalService) {
        _modelCategoryLocalService = modelCategoryLocalService;
    }

    /**
    * Adds the model category to the database. Also notifies the appropriate model listeners.
    *
    * @param modelCategory the model category
    * @return the model category that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.models.model.ModelCategory addModelCategory(
        com.ext.portlet.models.model.ModelCategory modelCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.addModelCategory(modelCategory);
    }

    /**
    * Creates a new model category with the primary key. Does not add the model category to the database.
    *
    * @param modelCategoryPK the primary key for the new model category
    * @return the new model category
    */
    public com.ext.portlet.models.model.ModelCategory createModelCategory(
        java.lang.Long modelCategoryPK) {
        return _modelCategoryLocalService.createModelCategory(modelCategoryPK);
    }

    /**
    * Deletes the model category with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param modelCategoryPK the primary key of the model category
    * @throws PortalException if a model category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public void deleteModelCategory(java.lang.Long modelCategoryPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        _modelCategoryLocalService.deleteModelCategory(modelCategoryPK);
    }

    /**
    * Deletes the model category from the database. Also notifies the appropriate model listeners.
    *
    * @param modelCategory the model category
    * @throws SystemException if a system exception occurred
    */
    public void deleteModelCategory(
        com.ext.portlet.models.model.ModelCategory modelCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelCategoryLocalService.deleteModelCategory(modelCategory);
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
        return _modelCategoryLocalService.dynamicQuery(dynamicQuery);
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
        return _modelCategoryLocalService.dynamicQuery(dynamicQuery, start, end);
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
        return _modelCategoryLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
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
        return _modelCategoryLocalService.dynamicQueryCount(dynamicQuery);
    }

    public com.ext.portlet.models.model.ModelCategory fetchModelCategory(
        java.lang.Long modelCategoryPK)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.fetchModelCategory(modelCategoryPK);
    }

    /**
    * Returns the model category with the primary key.
    *
    * @param modelCategoryPK the primary key of the model category
    * @return the model category
    * @throws PortalException if a model category with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.models.model.ModelCategory getModelCategory(
        java.lang.Long modelCategoryPK)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.getModelCategory(modelCategoryPK);
    }

    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.getPersistedModel(primaryKeyObj);
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
    public java.util.List<com.ext.portlet.models.model.ModelCategory> getModelCategories(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.getModelCategories(start, end);
    }

    /**
    * Returns the number of model categories.
    *
    * @return the number of model categories
    * @throws SystemException if a system exception occurred
    */
    public int getModelCategoriesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.getModelCategoriesCount();
    }

    /**
    * Updates the model category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param modelCategory the model category
    * @return the model category that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.models.model.ModelCategory updateModelCategory(
        com.ext.portlet.models.model.ModelCategory modelCategory)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.updateModelCategory(modelCategory);
    }

    /**
    * Updates the model category in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param modelCategory the model category
    * @param merge whether to merge the model category with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
    * @return the model category that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.models.model.ModelCategory updateModelCategory(
        com.ext.portlet.models.model.ModelCategory modelCategory, boolean merge)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _modelCategoryLocalService.updateModelCategory(modelCategory,
            merge);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier() {
        return _modelCategoryLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _modelCategoryLocalService.setBeanIdentifier(beanIdentifier);
    }

    /**
     * @deprecated Renamed to {@link #getWrappedService}
     */
    public ModelCategoryLocalService getWrappedModelCategoryLocalService() {
        return _modelCategoryLocalService;
    }

    /**
     * @deprecated Renamed to {@link #setWrappedService}
     */
    public void setWrappedModelCategoryLocalService(
        ModelCategoryLocalService modelCategoryLocalService) {
        _modelCategoryLocalService = modelCategoryLocalService;
    }

    public ModelCategoryLocalService getWrappedService() {
        return _modelCategoryLocalService;
    }

    public void setWrappedService(
        ModelCategoryLocalService modelCategoryLocalService) {
        _modelCategoryLocalService = modelCategoryLocalService;
    }
}