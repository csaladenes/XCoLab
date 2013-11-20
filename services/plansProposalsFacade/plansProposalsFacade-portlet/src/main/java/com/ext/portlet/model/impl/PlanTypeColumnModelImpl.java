package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanTypeColumn;
import com.ext.portlet.model.PlanTypeColumnModel;
import com.ext.portlet.model.PlanTypeColumnSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the PlanTypeColumn service. Represents a row in the &quot;xcolab_PlanTypeColumn&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.model.PlanTypeColumnModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanTypeColumnImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTypeColumnImpl
 * @see com.ext.portlet.model.PlanTypeColumn
 * @see com.ext.portlet.model.PlanTypeColumnModel
 * @generated
 */
@JSON(strict = true)
public class PlanTypeColumnModelImpl extends BaseModelImpl<PlanTypeColumn>
    implements PlanTypeColumnModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan type column model instance should use the {@link com.ext.portlet.model.PlanTypeColumn} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_PlanTypeColumn";
    public static final Object[][] TABLE_COLUMNS = {
            { "planTypeColumnId", Types.BIGINT },
            { "planTypeId", Types.BIGINT },
            { "weight", Types.INTEGER },
            { "columnName", Types.VARCHAR },
            { "visibleByDefault", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_PlanTypeColumn (planTypeColumnId LONG not null primary key,planTypeId LONG,weight INTEGER,columnName VARCHAR(75) null,visibleByDefault BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_PlanTypeColumn";
    public static final String ORDER_BY_JPQL = " ORDER BY planTypeColumn.weight ASC, planTypeColumn.columnName ASC";
    public static final String ORDER_BY_SQL = " ORDER BY xcolab_PlanTypeColumn.weight ASC, xcolab_PlanTypeColumn.columnName ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.model.PlanTypeColumn"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.model.PlanTypeColumn"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.model.PlanTypeColumn"));
    private static ClassLoader _classLoader = PlanTypeColumn.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PlanTypeColumn.class
        };
    private long _planTypeColumnId;
    private long _planTypeId;
    private int _weight;
    private String _columnName;
    private boolean _visibleByDefault;
    private PlanTypeColumn _escapedModel;

    public PlanTypeColumnModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PlanTypeColumn toModel(PlanTypeColumnSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        PlanTypeColumn model = new PlanTypeColumnImpl();

        model.setPlanTypeColumnId(soapModel.getPlanTypeColumnId());
        model.setPlanTypeId(soapModel.getPlanTypeId());
        model.setWeight(soapModel.getWeight());
        model.setColumnName(soapModel.getColumnName());
        model.setVisibleByDefault(soapModel.getVisibleByDefault());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PlanTypeColumn> toModels(PlanTypeColumnSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<PlanTypeColumn> models = new ArrayList<PlanTypeColumn>(soapModels.length);

        for (PlanTypeColumnSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _planTypeColumnId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPlanTypeColumnId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _planTypeColumnId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return PlanTypeColumn.class;
    }

    @Override
    public String getModelClassName() {
        return PlanTypeColumn.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("planTypeColumnId", getPlanTypeColumnId());
        attributes.put("planTypeId", getPlanTypeId());
        attributes.put("weight", getWeight());
        attributes.put("columnName", getColumnName());
        attributes.put("visibleByDefault", getVisibleByDefault());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long planTypeColumnId = (Long) attributes.get("planTypeColumnId");

        if (planTypeColumnId != null) {
            setPlanTypeColumnId(planTypeColumnId);
        }

        Long planTypeId = (Long) attributes.get("planTypeId");

        if (planTypeId != null) {
            setPlanTypeId(planTypeId);
        }

        Integer weight = (Integer) attributes.get("weight");

        if (weight != null) {
            setWeight(weight);
        }

        String columnName = (String) attributes.get("columnName");

        if (columnName != null) {
            setColumnName(columnName);
        }

        Boolean visibleByDefault = (Boolean) attributes.get("visibleByDefault");

        if (visibleByDefault != null) {
            setVisibleByDefault(visibleByDefault);
        }
    }

    @JSON
    @Override
    public long getPlanTypeColumnId() {
        return _planTypeColumnId;
    }

    @Override
    public void setPlanTypeColumnId(long planTypeColumnId) {
        _planTypeColumnId = planTypeColumnId;
    }

    @JSON
    @Override
    public long getPlanTypeId() {
        return _planTypeId;
    }

    @Override
    public void setPlanTypeId(long planTypeId) {
        _planTypeId = planTypeId;
    }

    @JSON
    @Override
    public int getWeight() {
        return _weight;
    }

    @Override
    public void setWeight(int weight) {
        _weight = weight;
    }

    @JSON
    @Override
    public String getColumnName() {
        if (_columnName == null) {
            return StringPool.BLANK;
        } else {
            return _columnName;
        }
    }

    @Override
    public void setColumnName(String columnName) {
        _columnName = columnName;
    }

    @JSON
    @Override
    public boolean getVisibleByDefault() {
        return _visibleByDefault;
    }

    @Override
    public boolean isVisibleByDefault() {
        return _visibleByDefault;
    }

    @Override
    public void setVisibleByDefault(boolean visibleByDefault) {
        _visibleByDefault = visibleByDefault;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            PlanTypeColumn.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public PlanTypeColumn toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PlanTypeColumn) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PlanTypeColumnImpl planTypeColumnImpl = new PlanTypeColumnImpl();

        planTypeColumnImpl.setPlanTypeColumnId(getPlanTypeColumnId());
        planTypeColumnImpl.setPlanTypeId(getPlanTypeId());
        planTypeColumnImpl.setWeight(getWeight());
        planTypeColumnImpl.setColumnName(getColumnName());
        planTypeColumnImpl.setVisibleByDefault(getVisibleByDefault());

        planTypeColumnImpl.resetOriginalValues();

        return planTypeColumnImpl;
    }

    @Override
    public int compareTo(PlanTypeColumn planTypeColumn) {
        int value = 0;

        if (getWeight() < planTypeColumn.getWeight()) {
            value = -1;
        } else if (getWeight() > planTypeColumn.getWeight()) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        value = getColumnName()
                    .compareToIgnoreCase(planTypeColumn.getColumnName());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PlanTypeColumn)) {
            return false;
        }

        PlanTypeColumn planTypeColumn = (PlanTypeColumn) obj;

        long primaryKey = planTypeColumn.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<PlanTypeColumn> toCacheModel() {
        PlanTypeColumnCacheModel planTypeColumnCacheModel = new PlanTypeColumnCacheModel();

        planTypeColumnCacheModel.planTypeColumnId = getPlanTypeColumnId();

        planTypeColumnCacheModel.planTypeId = getPlanTypeId();

        planTypeColumnCacheModel.weight = getWeight();

        planTypeColumnCacheModel.columnName = getColumnName();

        String columnName = planTypeColumnCacheModel.columnName;

        if ((columnName != null) && (columnName.length() == 0)) {
            planTypeColumnCacheModel.columnName = null;
        }

        planTypeColumnCacheModel.visibleByDefault = getVisibleByDefault();

        return planTypeColumnCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{planTypeColumnId=");
        sb.append(getPlanTypeColumnId());
        sb.append(", planTypeId=");
        sb.append(getPlanTypeId());
        sb.append(", weight=");
        sb.append(getWeight());
        sb.append(", columnName=");
        sb.append(getColumnName());
        sb.append(", visibleByDefault=");
        sb.append(getVisibleByDefault());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.PlanTypeColumn");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>planTypeColumnId</column-name><column-value><![CDATA[");
        sb.append(getPlanTypeColumnId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>planTypeId</column-name><column-value><![CDATA[");
        sb.append(getPlanTypeId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>weight</column-name><column-value><![CDATA[");
        sb.append(getWeight());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>columnName</column-name><column-value><![CDATA[");
        sb.append(getColumnName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visibleByDefault</column-name><column-value><![CDATA[");
        sb.append(getVisibleByDefault());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
