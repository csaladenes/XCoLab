package com.ext.portlet.models.model;

import com.liferay.portal.model.ModelWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ModelGlobalPreference}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ModelGlobalPreference
 * @generated
 */
public class ModelGlobalPreferenceWrapper implements ModelGlobalPreference,
    ModelWrapper<ModelGlobalPreference> {
    private ModelGlobalPreference _modelGlobalPreference;

    public ModelGlobalPreferenceWrapper(
        ModelGlobalPreference modelGlobalPreference) {
        _modelGlobalPreference = modelGlobalPreference;
    }

    public Class<?> getModelClass() {
        return ModelGlobalPreference.class;
    }

    public String getModelClassName() {
        return ModelGlobalPreference.class.getName();
    }

    /**
    * Returns the primary key of this model global preference.
    *
    * @return the primary key of this model global preference
    */
    public java.lang.Long getPrimaryKey() {
        return _modelGlobalPreference.getPrimaryKey();
    }

    /**
    * Sets the primary key of this model global preference.
    *
    * @param primaryKey the primary key of this model global preference
    */
    public void setPrimaryKey(java.lang.Long primaryKey) {
        _modelGlobalPreference.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the model global preference p k of this model global preference.
    *
    * @return the model global preference p k of this model global preference
    */
    public java.lang.Long getModelGlobalPreferencePK() {
        return _modelGlobalPreference.getModelGlobalPreferencePK();
    }

    /**
    * Sets the model global preference p k of this model global preference.
    *
    * @param modelGlobalPreferencePK the model global preference p k of this model global preference
    */
    public void setModelGlobalPreferencePK(
        java.lang.Long modelGlobalPreferencePK) {
        _modelGlobalPreference.setModelGlobalPreferencePK(modelGlobalPreferencePK);
    }

    /**
    * Returns the model ID of this model global preference.
    *
    * @return the model ID of this model global preference
    */
    public java.lang.Long getModelId() {
        return _modelGlobalPreference.getModelId();
    }

    /**
    * Sets the model ID of this model global preference.
    *
    * @param modelId the model ID of this model global preference
    */
    public void setModelId(java.lang.Long modelId) {
        _modelGlobalPreference.setModelId(modelId);
    }

    /**
    * Returns the visible of this model global preference.
    *
    * @return the visible of this model global preference
    */
    public java.lang.Boolean getVisible() {
        return _modelGlobalPreference.getVisible();
    }

    /**
    * Sets the visible of this model global preference.
    *
    * @param visible the visible of this model global preference
    */
    public void setVisible(java.lang.Boolean visible) {
        _modelGlobalPreference.setVisible(visible);
    }

    /**
    * Returns the weight of this model global preference.
    *
    * @return the weight of this model global preference
    */
    public java.lang.Integer getWeight() {
        return _modelGlobalPreference.getWeight();
    }

    /**
    * Sets the weight of this model global preference.
    *
    * @param weight the weight of this model global preference
    */
    public void setWeight(java.lang.Integer weight) {
        _modelGlobalPreference.setWeight(weight);
    }

    /**
    * Returns the expert evaluation page ID of this model global preference.
    *
    * @return the expert evaluation page ID of this model global preference
    */
    public java.lang.Long getExpertEvaluationPageId() {
        return _modelGlobalPreference.getExpertEvaluationPageId();
    }

    /**
    * Sets the expert evaluation page ID of this model global preference.
    *
    * @param expertEvaluationPageId the expert evaluation page ID of this model global preference
    */
    public void setExpertEvaluationPageId(java.lang.Long expertEvaluationPageId) {
        _modelGlobalPreference.setExpertEvaluationPageId(expertEvaluationPageId);
    }

    /**
    * Returns the model category ID of this model global preference.
    *
    * @return the model category ID of this model global preference
    */
    public java.lang.Long getModelCategoryId() {
        return _modelGlobalPreference.getModelCategoryId();
    }

    /**
    * Sets the model category ID of this model global preference.
    *
    * @param modelCategoryId the model category ID of this model global preference
    */
    public void setModelCategoryId(java.lang.Long modelCategoryId) {
        _modelGlobalPreference.setModelCategoryId(modelCategoryId);
    }

    public boolean isNew() {
        return _modelGlobalPreference.isNew();
    }

    public void setNew(boolean n) {
        _modelGlobalPreference.setNew(n);
    }

    public boolean isCachedModel() {
        return _modelGlobalPreference.isCachedModel();
    }

    public void setCachedModel(boolean cachedModel) {
        _modelGlobalPreference.setCachedModel(cachedModel);
    }

    public boolean isEscapedModel() {
        return _modelGlobalPreference.isEscapedModel();
    }

    public java.io.Serializable getPrimaryKeyObj() {
        return _modelGlobalPreference.getPrimaryKeyObj();
    }

    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _modelGlobalPreference.setPrimaryKeyObj(primaryKeyObj);
    }

    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _modelGlobalPreference.getExpandoBridge();
    }

    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _modelGlobalPreference.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new ModelGlobalPreferenceWrapper((ModelGlobalPreference) _modelGlobalPreference.clone());
    }

    public int compareTo(ModelGlobalPreference modelGlobalPreference) {
        return _modelGlobalPreference.compareTo(modelGlobalPreference);
    }

    @Override
    public int hashCode() {
        return _modelGlobalPreference.hashCode();
    }

    public com.liferay.portal.model.CacheModel<ModelGlobalPreference> toCacheModel() {
        return _modelGlobalPreference.toCacheModel();
    }

    public ModelGlobalPreference toEscapedModel() {
        return new ModelGlobalPreferenceWrapper(_modelGlobalPreference.toEscapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _modelGlobalPreference.toString();
    }

    public java.lang.String toXmlString() {
        return _modelGlobalPreference.toXmlString();
    }

    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _modelGlobalPreference.persist();
    }

    /**
     * @deprecated Renamed to {@link #getWrappedModel}
     */
    public ModelGlobalPreference getWrappedModelGlobalPreference() {
        return _modelGlobalPreference;
    }

    public ModelGlobalPreference getWrappedModel() {
        return _modelGlobalPreference;
    }

    public void resetOriginalValues() {
        _modelGlobalPreference.resetOriginalValues();
    }
}