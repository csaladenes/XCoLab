package com.ext.portlet.models.model;

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ModelPosition service. Represents a row in the &quot;Models_ModelPosition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.models.model.impl.ModelPositionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.models.model.impl.ModelPositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelPosition
 * @see com.ext.portlet.models.model.impl.ModelPositionImpl
 * @see com.ext.portlet.models.model.impl.ModelPositionModelImpl
 * @generated
 */
public interface ModelPositionModel extends BaseModel<ModelPosition> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a model position model instance should use the {@link ModelPosition} interface instead.
     */

    /**
     * Returns the primary key of this model position.
     *
     * @return the primary key of this model position
     */
    public Long getPrimaryKey();

    /**
     * Sets the primary key of this model position.
     *
     * @param primaryKey the primary key of this model position
     */
    public void setPrimaryKey(Long primaryKey);

    /**
     * Returns the ID of this model position.
     *
     * @return the ID of this model position
     */
    public Long getId();

    /**
     * Sets the ID of this model position.
     *
     * @param id the ID of this model position
     */
    public void setId(Long id);

    /**
     * Returns the position ID of this model position.
     *
     * @return the position ID of this model position
     */
    public Long getPositionId();

    /**
     * Sets the position ID of this model position.
     *
     * @param positionId the position ID of this model position
     */
    public void setPositionId(Long positionId);

    /**
     * Returns the model ID of this model position.
     *
     * @return the model ID of this model position
     */
    public Long getModelId();

    /**
     * Sets the model ID of this model position.
     *
     * @param modelId the model ID of this model position
     */
    public void setModelId(Long modelId);

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

    public int compareTo(ModelPosition modelPosition);

    public int hashCode();

    public CacheModel<ModelPosition> toCacheModel();

    public ModelPosition toEscapedModel();

    public String toString();

    public String toXmlString();
}