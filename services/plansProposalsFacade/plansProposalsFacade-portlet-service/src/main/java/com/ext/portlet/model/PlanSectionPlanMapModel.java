package com.ext.portlet.model;

import com.ext.portlet.service.persistence.PlanSectionPlanMapPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanSectionPlanMap service. Represents a row in the &quot;xcolab_PlanSectionPlanMap&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.PlanSectionPlanMapModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.PlanSectionPlanMapImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanSectionPlanMap
 * @see com.ext.portlet.model.impl.PlanSectionPlanMapImpl
 * @see com.ext.portlet.model.impl.PlanSectionPlanMapModelImpl
 * @generated
 */
public interface PlanSectionPlanMapModel extends BaseModel<PlanSectionPlanMap> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan section plan map model instance should use the {@link PlanSectionPlanMap} interface instead.
     */

    /**
     * Returns the primary key of this plan section plan map.
     *
     * @return the primary key of this plan section plan map
     */
    public PlanSectionPlanMapPK getPrimaryKey();

    /**
     * Sets the primary key of this plan section plan map.
     *
     * @param primaryKey the primary key of this plan section plan map
     */
    public void setPrimaryKey(PlanSectionPlanMapPK primaryKey);

    /**
     * Returns the section ID of this plan section plan map.
     *
     * @return the section ID of this plan section plan map
     */
    public long getSectionId();

    /**
     * Sets the section ID of this plan section plan map.
     *
     * @param sectionId the section ID of this plan section plan map
     */
    public void setSectionId(long sectionId);

    /**
     * Returns the related plan ID of this plan section plan map.
     *
     * @return the related plan ID of this plan section plan map
     */
    public long getRelatedPlanId();

    /**
     * Sets the related plan ID of this plan section plan map.
     *
     * @param relatedPlanId the related plan ID of this plan section plan map
     */
    public void setRelatedPlanId(long relatedPlanId);

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

    public int compareTo(PlanSectionPlanMap planSectionPlanMap);

    public int hashCode();

    public CacheModel<PlanSectionPlanMap> toCacheModel();

    public PlanSectionPlanMap toEscapedModel();

    public String toString();

    public String toXmlString();
}