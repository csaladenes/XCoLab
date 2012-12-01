package com.ext.portlet.models.model.impl;

import com.ext.portlet.models.model.ModelCategory;
import com.ext.portlet.models.model.ModelCategoryModel;
import com.ext.portlet.models.model.ModelCategorySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.List;

/**
 * The base model implementation for the ModelCategory service. Represents a row in the &quot;Models_ModelCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.models.model.ModelCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ModelCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ModelCategoryImpl
 * @see com.ext.portlet.models.model.ModelCategory
 * @see com.ext.portlet.models.model.ModelCategoryModel
 * @generated
 */
@JSON(strict = true)
public class ModelCategoryModelImpl extends BaseModelImpl<ModelCategory>
    implements ModelCategoryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a model category model instance should use the {@link com.ext.portlet.models.model.ModelCategory} interface instead.
     */
    public static final String TABLE_NAME = "Models_ModelCategory";
    public static final Object[][] TABLE_COLUMNS = {
            { "modelCategoryPK", Types.BIGINT },
            { "modelCategoryName", Types.VARCHAR },
            { "modelCategoryDescription", Types.VARCHAR },
            { "modelCategoryDisplayWeight", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table Models_ModelCategory (modelCategoryPK LONG not null primary key,modelCategoryName VARCHAR(75) null,modelCategoryDescription VARCHAR(75) null,modelCategoryDisplayWeight INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table Models_ModelCategory";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.models.model.ModelCategory"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.models.model.ModelCategory"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.models.model.ModelCategory"));
    private static ClassLoader _classLoader = ModelCategory.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            ModelCategory.class
        };
    private Long _modelCategoryPK;
    private String _modelCategoryName;
    private String _modelCategoryDescription;
    private Integer _modelCategoryDisplayWeight;
    private ModelCategory _escapedModelProxy;

    public ModelCategoryModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static ModelCategory toModel(ModelCategorySoap soapModel) {
        ModelCategory model = new ModelCategoryImpl();

        model.setModelCategoryPK(soapModel.getModelCategoryPK());
        model.setModelCategoryName(soapModel.getModelCategoryName());
        model.setModelCategoryDescription(soapModel.getModelCategoryDescription());
        model.setModelCategoryDisplayWeight(soapModel.getModelCategoryDisplayWeight());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<ModelCategory> toModels(ModelCategorySoap[] soapModels) {
        List<ModelCategory> models = new ArrayList<ModelCategory>(soapModels.length);

        for (ModelCategorySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public Long getPrimaryKey() {
        return _modelCategoryPK;
    }

    public void setPrimaryKey(Long primaryKey) {
        setModelCategoryPK(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_modelCategoryPK);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return ModelCategory.class;
    }

    public String getModelClassName() {
        return ModelCategory.class.getName();
    }

    @JSON
    public Long getModelCategoryPK() {
        return _modelCategoryPK;
    }

    public void setModelCategoryPK(Long modelCategoryPK) {
        _modelCategoryPK = modelCategoryPK;
    }

    @JSON
    public String getModelCategoryName() {
        if (_modelCategoryName == null) {
            return StringPool.BLANK;
        } else {
            return _modelCategoryName;
        }
    }

    public void setModelCategoryName(String modelCategoryName) {
        _modelCategoryName = modelCategoryName;
    }

    @JSON
    public String getModelCategoryDescription() {
        if (_modelCategoryDescription == null) {
            return StringPool.BLANK;
        } else {
            return _modelCategoryDescription;
        }
    }

    public void setModelCategoryDescription(String modelCategoryDescription) {
        _modelCategoryDescription = modelCategoryDescription;
    }

    @JSON
    public Integer getModelCategoryDisplayWeight() {
        return _modelCategoryDisplayWeight;
    }

    public void setModelCategoryDisplayWeight(
        Integer modelCategoryDisplayWeight) {
        _modelCategoryDisplayWeight = modelCategoryDisplayWeight;
    }

    @Override
    public ModelCategory toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (ModelCategory) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        ModelCategoryImpl modelCategoryImpl = new ModelCategoryImpl();

        modelCategoryImpl.setModelCategoryPK(getModelCategoryPK());
        modelCategoryImpl.setModelCategoryName(getModelCategoryName());
        modelCategoryImpl.setModelCategoryDescription(getModelCategoryDescription());
        modelCategoryImpl.setModelCategoryDisplayWeight(getModelCategoryDisplayWeight());

        modelCategoryImpl.resetOriginalValues();

        return modelCategoryImpl;
    }

    public int compareTo(ModelCategory modelCategory) {
        Long primaryKey = modelCategory.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        ModelCategory modelCategory = null;

        try {
            modelCategory = (ModelCategory) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        Long primaryKey = modelCategory.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey().hashCode();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<ModelCategory> toCacheModel() {
        ModelCategoryCacheModel modelCategoryCacheModel = new ModelCategoryCacheModel();

        modelCategoryCacheModel.modelCategoryPK = getModelCategoryPK();

        modelCategoryCacheModel.modelCategoryName = getModelCategoryName();

        String modelCategoryName = modelCategoryCacheModel.modelCategoryName;

        if ((modelCategoryName != null) && (modelCategoryName.length() == 0)) {
            modelCategoryCacheModel.modelCategoryName = null;
        }

        modelCategoryCacheModel.modelCategoryDescription = getModelCategoryDescription();

        String modelCategoryDescription = modelCategoryCacheModel.modelCategoryDescription;

        if ((modelCategoryDescription != null) &&
                (modelCategoryDescription.length() == 0)) {
            modelCategoryCacheModel.modelCategoryDescription = null;
        }

        modelCategoryCacheModel.modelCategoryDisplayWeight = getModelCategoryDisplayWeight();

        return modelCategoryCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{modelCategoryPK=");
        sb.append(getModelCategoryPK());
        sb.append(", modelCategoryName=");
        sb.append(getModelCategoryName());
        sb.append(", modelCategoryDescription=");
        sb.append(getModelCategoryDescription());
        sb.append(", modelCategoryDisplayWeight=");
        sb.append(getModelCategoryDisplayWeight());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.models.model.ModelCategory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>modelCategoryPK</column-name><column-value><![CDATA[");
        sb.append(getModelCategoryPK());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelCategoryName</column-name><column-value><![CDATA[");
        sb.append(getModelCategoryName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelCategoryDescription</column-name><column-value><![CDATA[");
        sb.append(getModelCategoryDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>modelCategoryDisplayWeight</column-name><column-value><![CDATA[");
        sb.append(getModelCategoryDisplayWeight());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}