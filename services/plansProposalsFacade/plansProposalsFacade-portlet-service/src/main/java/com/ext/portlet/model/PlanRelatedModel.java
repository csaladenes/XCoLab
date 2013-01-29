package com.ext.portlet.model;

import com.ext.portlet.service.persistence.PlanRelatedPK;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the PlanRelated service. Represents a row in the &quot;xcolab_PlanRelated&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.PlanRelatedModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.PlanRelatedImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanRelated
 * @see com.ext.portlet.model.impl.PlanRelatedImpl
 * @see com.ext.portlet.model.impl.PlanRelatedModelImpl
 * @generated
 */
public interface PlanRelatedModel extends BaseModel<PlanRelated> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a plan related model instance should use the {@link PlanRelated} interface instead.
     */

    /**
     * Returns the primary key of this plan related.
     *
     * @return the primary key of this plan related
     */
    public PlanRelatedPK getPrimaryKey();

    /**
     * Sets the primary key of this plan related.
     *
     * @param primaryKey the primary key of this plan related
     */
    public void setPrimaryKey(PlanRelatedPK primaryKey);

    /**
     * Returns the section ID of this plan related.
     *
     * @return the section ID of this plan related
     */
    public long getSectionId();

    /**
     * Sets the section ID of this plan related.
     *
     * @param sectionId the section ID of this plan related
     */
    public void setSectionId(long sectionId);

    /**
     * Returns the related plan ID of this plan related.
     *
     * @return the related plan ID of this plan related
     */
    public long getRelatedPlanId();

    /**
     * Sets the related plan ID of this plan related.
     *
     * @param relatedPlanId the related plan ID of this plan related
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

    public int compareTo(PlanRelated planRelated);

    public int hashCode();

    public CacheModel<PlanRelated> toCacheModel();

    public PlanRelated toEscapedModel();

    public String toString();

    public String toXmlString();
}