package com.ext.portlet.plans.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanType service. Represents a row in the &quot;Plans_PlanType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.plans.model.impl.PlanTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.plans.model.impl.PlanTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanType
 * @see com.ext.portlet.plans.model.impl.PlanTypeImpl
 * @see com.ext.portlet.plans.model.impl.PlanTypeModelImpl
 * @generated
 */
public interface PlanTypeModel extends BaseModel<PlanType> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan type model instance should use the {@link PlanType} interface instead.
     */

    /**
     * Returns the primary key of this plan type.
     *
     * @return the primary key of this plan type
     */
    public Long getPrimaryKey();

    /**
     * Sets the primary key of this plan type.
     *
     * @param primaryKey the primary key of this plan type
     */
    public void setPrimaryKey(Long primaryKey);

    /**
     * Returns the plan type ID of this plan type.
     *
     * @return the plan type ID of this plan type
     */
    public Long getPlanTypeId();

    /**
     * Sets the plan type ID of this plan type.
     *
     * @param planTypeId the plan type ID of this plan type
     */
    public void setPlanTypeId(Long planTypeId);

    /**
     * Returns the name of this plan type.
     *
     * @return the name of this plan type
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this plan type.
     *
     * @param name the name of this plan type
     */
    public void setName(String name);

    /**
     * Returns the description of this plan type.
     *
     * @return the description of this plan type
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this plan type.
     *
     * @param description the description of this plan type
     */
    public void setDescription(String description);

    /**
     * Returns the model ID of this plan type.
     *
     * @return the model ID of this plan type
     */
    public Long getModelId();

    /**
     * Sets the model ID of this plan type.
     *
     * @param modelId the model ID of this plan type
     */
    public void setModelId(Long modelId);

    /**
     * Returns the model type name of this plan type.
     *
     * @return the model type name of this plan type
     */
    @AutoEscape
    public String getModelTypeName();

    /**
     * Sets the model type name of this plan type.
     *
     * @param modelTypeName the model type name of this plan type
     */
    public void setModelTypeName(String modelTypeName);

    /**
     * Returns the published of this plan type.
     *
     * @return the published of this plan type
     */
    public Boolean getPublished();

    /**
     * Sets the published of this plan type.
     *
     * @param published the published of this plan type
     */
    public void setPublished(Boolean published);

    /**
     * Returns the published counterpart ID of this plan type.
     *
     * @return the published counterpart ID of this plan type
     */
    public Long getPublishedCounterpartId();

    /**
     * Sets the published counterpart ID of this plan type.
     *
     * @param publishedCounterpartId the published counterpart ID of this plan type
     */
    public void setPublishedCounterpartId(Long publishedCounterpartId);

    /**
     * Returns the is default of this plan type.
     *
     * @return the is default of this plan type
     */
    public Boolean getIsDefault();

    /**
     * Sets the is default of this plan type.
     *
     * @param isDefault the is default of this plan type
     */
    public void setIsDefault(Boolean isDefault);

    /**
     * Returns the default model ID of this plan type.
     *
     * @return the default model ID of this plan type
     */
    public Long getDefaultModelId();

    /**
     * Sets the default model ID of this plan type.
     *
     * @param defaultModelId the default model ID of this plan type
     */
    public void setDefaultModelId(Long defaultModelId);

    /**
     * Returns the default scenario ID of this plan type.
     *
     * @return the default scenario ID of this plan type
     */
    public Long getDefaultScenarioId();

    /**
     * Sets the default scenario ID of this plan type.
     *
     * @param defaultScenarioId the default scenario ID of this plan type
     */
    public void setDefaultScenarioId(Long defaultScenarioId);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(PlanType planType);

    public int hashCode();

    public CacheModel<PlanType> toCacheModel();

    public PlanType toEscapedModel();

    public String toString();

    public String toXmlString();
}