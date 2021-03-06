package com.ext.portlet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the ModelInputItem service. Represents a row in the &quot;xcolab_ModelInputItem&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.ModelInputItemModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.ModelInputItemImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelInputItem
 * @see com.ext.portlet.model.impl.ModelInputItemImpl
 * @see com.ext.portlet.model.impl.ModelInputItemModelImpl
 * @generated
 */
public interface ModelInputItemModel extends BaseModel<ModelInputItem> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a model input item model instance should use the {@link ModelInputItem} interface instead.
     */

    /**
     * Returns the primary key of this model input item.
     *
     * @return the primary key of this model input item
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this model input item.
     *
     * @param primaryKey the primary key of this model input item
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the model input item p k of this model input item.
     *
     * @return the model input item p k of this model input item
     */
    public long getModelInputItemPK();

    /**
     * Sets the model input item p k of this model input item.
     *
     * @param modelInputItemPK the model input item p k of this model input item
     */
    public void setModelInputItemPK(long modelInputItemPK);

    /**
     * Returns the model ID of this model input item.
     *
     * @return the model ID of this model input item
     */
    public long getModelId();

    /**
     * Sets the model ID of this model input item.
     *
     * @param modelId the model ID of this model input item
     */
    public void setModelId(long modelId);

    /**
     * Returns the model input item i d of this model input item.
     *
     * @return the model input item i d of this model input item
     */
    public long getModelInputItemID();

    /**
     * Sets the model input item i d of this model input item.
     *
     * @param modelInputItemID the model input item i d of this model input item
     */
    public void setModelInputItemID(long modelInputItemID);

    /**
     * Returns the model group ID of this model input item.
     *
     * @return the model group ID of this model input item
     */
    public long getModelGroupId();

    /**
     * Sets the model group ID of this model input item.
     *
     * @param modelGroupId the model group ID of this model input item
     */
    public void setModelGroupId(long modelGroupId);

    /**
     * Returns the display item order of this model input item.
     *
     * @return the display item order of this model input item
     */
    public int getDisplayItemOrder();

    /**
     * Sets the display item order of this model input item.
     *
     * @param displayItemOrder the display item order of this model input item
     */
    public void setDisplayItemOrder(int displayItemOrder);

    /**
     * Returns the type of this model input item.
     *
     * @return the type of this model input item
     */
    @AutoEscape
    public String getType();

    /**
     * Sets the type of this model input item.
     *
     * @param type the type of this model input item
     */
    public void setType(String type);

    /**
     * Returns the properties of this model input item.
     *
     * @return the properties of this model input item
     */
    @AutoEscape
    public String getProperties();

    /**
     * Sets the properties of this model input item.
     *
     * @param properties the properties of this model input item
     */
    public void setProperties(String properties);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ModelInputItem modelInputItem);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ModelInputItem> toCacheModel();

    @Override
    public ModelInputItem toEscapedModel();

    @Override
    public ModelInputItem toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}
