package com.ext.portlet.model;

import com.ext.portlet.service.persistence.PlanTemplateSectionPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanTemplateSection service. Represents a row in the &quot;xcolab_PlanTemplateSection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.PlanTemplateSectionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.PlanTemplateSectionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplateSection
 * @see com.ext.portlet.model.impl.PlanTemplateSectionImpl
 * @see com.ext.portlet.model.impl.PlanTemplateSectionModelImpl
 * @generated
 */
public interface PlanTemplateSectionModel extends BaseModel<PlanTemplateSection> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan template section model instance should use the {@link PlanTemplateSection} interface instead.
     */

    /**
     * Returns the primary key of this plan template section.
     *
     * @return the primary key of this plan template section
     */
    public PlanTemplateSectionPK getPrimaryKey();

    /**
     * Sets the primary key of this plan template section.
     *
     * @param primaryKey the primary key of this plan template section
     */
    public void setPrimaryKey(PlanTemplateSectionPK primaryKey);

    /**
     * Returns the plan template ID of this plan template section.
     *
     * @return the plan template ID of this plan template section
     */
    public long getPlanTemplateId();

    /**
     * Sets the plan template ID of this plan template section.
     *
     * @param planTemplateId the plan template ID of this plan template section
     */
    public void setPlanTemplateId(long planTemplateId);

    /**
     * Returns the plan section ID of this plan template section.
     *
     * @return the plan section ID of this plan template section
     */
    public long getPlanSectionId();

    /**
     * Sets the plan section ID of this plan template section.
     *
     * @param planSectionId the plan section ID of this plan template section
     */
    public void setPlanSectionId(long planSectionId);

    /**
     * Returns the weight of this plan template section.
     *
     * @return the weight of this plan template section
     */
    public int getWeight();

    /**
     * Sets the weight of this plan template section.
     *
     * @param weight the weight of this plan template section
     */
    public void setWeight(int weight);

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

    public int compareTo(PlanTemplateSection planTemplateSection);

    public int hashCode();

    public CacheModel<PlanTemplateSection> toCacheModel();

    public PlanTemplateSection toEscapedModel();

    public String toString();

    public String toXmlString();
}