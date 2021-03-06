package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanAttributeFilter;
import com.ext.portlet.model.PlanAttributeFilterModel;
import com.ext.portlet.model.PlanAttributeFilterSoap;

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
 * The base model implementation for the PlanAttributeFilter service. Represents a row in the &quot;xcolab_PlanAttributeFilter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.model.PlanAttributeFilterModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanAttributeFilterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanAttributeFilterImpl
 * @see com.ext.portlet.model.PlanAttributeFilter
 * @see com.ext.portlet.model.PlanAttributeFilterModel
 * @generated
 */
@JSON(strict = true)
public class PlanAttributeFilterModelImpl extends BaseModelImpl<PlanAttributeFilter>
    implements PlanAttributeFilterModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan attribute filter model instance should use the {@link com.ext.portlet.model.PlanAttributeFilter} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_PlanAttributeFilter";
    public static final Object[][] TABLE_COLUMNS = {
            { "planAttributeFilterId", Types.BIGINT },
            { "attributeName", Types.VARCHAR },
            { "planUserSettingsId", Types.BIGINT },
            { "max", Types.DOUBLE },
            { "min", Types.DOUBLE },
            { "stringVal", Types.VARCHAR }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_PlanAttributeFilter (planAttributeFilterId LONG not null primary key,attributeName VARCHAR(75) null,planUserSettingsId LONG,max DOUBLE,min DOUBLE,stringVal VARCHAR(2048) null)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_PlanAttributeFilter";
    public static final String ORDER_BY_JPQL = " ORDER BY planAttributeFilter.planAttributeFilterId ASC";
    public static final String ORDER_BY_SQL = " ORDER BY xcolab_PlanAttributeFilter.planAttributeFilterId ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.model.PlanAttributeFilter"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.model.PlanAttributeFilter"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.model.PlanAttributeFilter"),
            true);
    public static long ATTRIBUTENAME_COLUMN_BITMASK = 1L;
    public static long PLANUSERSETTINGSID_COLUMN_BITMASK = 2L;
    public static long PLANATTRIBUTEFILTERID_COLUMN_BITMASK = 4L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.model.PlanAttributeFilter"));
    private static ClassLoader _classLoader = PlanAttributeFilter.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            PlanAttributeFilter.class
        };
    private long _planAttributeFilterId;
    private String _attributeName;
    private String _originalAttributeName;
    private long _planUserSettingsId;
    private long _originalPlanUserSettingsId;
    private boolean _setOriginalPlanUserSettingsId;
    private Double _max;
    private Double _min;
    private String _stringVal;
    private long _columnBitmask;
    private PlanAttributeFilter _escapedModel;

    public PlanAttributeFilterModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static PlanAttributeFilter toModel(PlanAttributeFilterSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        PlanAttributeFilter model = new PlanAttributeFilterImpl();

        model.setPlanAttributeFilterId(soapModel.getPlanAttributeFilterId());
        model.setAttributeName(soapModel.getAttributeName());
        model.setPlanUserSettingsId(soapModel.getPlanUserSettingsId());
        model.setMax(soapModel.getMax());
        model.setMin(soapModel.getMin());
        model.setStringVal(soapModel.getStringVal());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<PlanAttributeFilter> toModels(
        PlanAttributeFilterSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<PlanAttributeFilter> models = new ArrayList<PlanAttributeFilter>(soapModels.length);

        for (PlanAttributeFilterSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _planAttributeFilterId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPlanAttributeFilterId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _planAttributeFilterId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return PlanAttributeFilter.class;
    }

    @Override
    public String getModelClassName() {
        return PlanAttributeFilter.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("planAttributeFilterId", getPlanAttributeFilterId());
        attributes.put("attributeName", getAttributeName());
        attributes.put("planUserSettingsId", getPlanUserSettingsId());
        attributes.put("max", getMax());
        attributes.put("min", getMin());
        attributes.put("stringVal", getStringVal());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long planAttributeFilterId = (Long) attributes.get(
                "planAttributeFilterId");

        if (planAttributeFilterId != null) {
            setPlanAttributeFilterId(planAttributeFilterId);
        }

        String attributeName = (String) attributes.get("attributeName");

        if (attributeName != null) {
            setAttributeName(attributeName);
        }

        Long planUserSettingsId = (Long) attributes.get("planUserSettingsId");

        if (planUserSettingsId != null) {
            setPlanUserSettingsId(planUserSettingsId);
        }

        Double max = (Double) attributes.get("max");

        if (max != null) {
            setMax(max);
        }

        Double min = (Double) attributes.get("min");

        if (min != null) {
            setMin(min);
        }

        String stringVal = (String) attributes.get("stringVal");

        if (stringVal != null) {
            setStringVal(stringVal);
        }
    }

    @JSON
    @Override
    public long getPlanAttributeFilterId() {
        return _planAttributeFilterId;
    }

    @Override
    public void setPlanAttributeFilterId(long planAttributeFilterId) {
        _planAttributeFilterId = planAttributeFilterId;
    }

    @JSON
    @Override
    public String getAttributeName() {
        if (_attributeName == null) {
            return StringPool.BLANK;
        } else {
            return _attributeName;
        }
    }

    @Override
    public void setAttributeName(String attributeName) {
        _columnBitmask |= ATTRIBUTENAME_COLUMN_BITMASK;

        if (_originalAttributeName == null) {
            _originalAttributeName = _attributeName;
        }

        _attributeName = attributeName;
    }

    public String getOriginalAttributeName() {
        return GetterUtil.getString(_originalAttributeName);
    }

    @JSON
    @Override
    public long getPlanUserSettingsId() {
        return _planUserSettingsId;
    }

    @Override
    public void setPlanUserSettingsId(long planUserSettingsId) {
        _columnBitmask |= PLANUSERSETTINGSID_COLUMN_BITMASK;

        if (!_setOriginalPlanUserSettingsId) {
            _setOriginalPlanUserSettingsId = true;

            _originalPlanUserSettingsId = _planUserSettingsId;
        }

        _planUserSettingsId = planUserSettingsId;
    }

    public long getOriginalPlanUserSettingsId() {
        return _originalPlanUserSettingsId;
    }

    @JSON
    @Override
    public Double getMax() {
        return _max;
    }

    @Override
    public void setMax(Double max) {
        _max = max;
    }

    @JSON
    @Override
    public Double getMin() {
        return _min;
    }

    @Override
    public void setMin(Double min) {
        _min = min;
    }

    @JSON
    @Override
    public String getStringVal() {
        if (_stringVal == null) {
            return StringPool.BLANK;
        } else {
            return _stringVal;
        }
    }

    @Override
    public void setStringVal(String stringVal) {
        _stringVal = stringVal;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            PlanAttributeFilter.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public PlanAttributeFilter toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (PlanAttributeFilter) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PlanAttributeFilterImpl planAttributeFilterImpl = new PlanAttributeFilterImpl();

        planAttributeFilterImpl.setPlanAttributeFilterId(getPlanAttributeFilterId());
        planAttributeFilterImpl.setAttributeName(getAttributeName());
        planAttributeFilterImpl.setPlanUserSettingsId(getPlanUserSettingsId());
        planAttributeFilterImpl.setMax(getMax());
        planAttributeFilterImpl.setMin(getMin());
        planAttributeFilterImpl.setStringVal(getStringVal());

        planAttributeFilterImpl.resetOriginalValues();

        return planAttributeFilterImpl;
    }

    @Override
    public int compareTo(PlanAttributeFilter planAttributeFilter) {
        long primaryKey = planAttributeFilter.getPrimaryKey();

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
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PlanAttributeFilter)) {
            return false;
        }

        PlanAttributeFilter planAttributeFilter = (PlanAttributeFilter) obj;

        long primaryKey = planAttributeFilter.getPrimaryKey();

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
        PlanAttributeFilterModelImpl planAttributeFilterModelImpl = this;

        planAttributeFilterModelImpl._originalAttributeName = planAttributeFilterModelImpl._attributeName;

        planAttributeFilterModelImpl._originalPlanUserSettingsId = planAttributeFilterModelImpl._planUserSettingsId;

        planAttributeFilterModelImpl._setOriginalPlanUserSettingsId = false;

        planAttributeFilterModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<PlanAttributeFilter> toCacheModel() {
        PlanAttributeFilterCacheModel planAttributeFilterCacheModel = new PlanAttributeFilterCacheModel();

        planAttributeFilterCacheModel.planAttributeFilterId = getPlanAttributeFilterId();

        planAttributeFilterCacheModel.attributeName = getAttributeName();

        String attributeName = planAttributeFilterCacheModel.attributeName;

        if ((attributeName != null) && (attributeName.length() == 0)) {
            planAttributeFilterCacheModel.attributeName = null;
        }

        planAttributeFilterCacheModel.planUserSettingsId = getPlanUserSettingsId();

        planAttributeFilterCacheModel.max = getMax();

        planAttributeFilterCacheModel.min = getMin();

        planAttributeFilterCacheModel.stringVal = getStringVal();

        String stringVal = planAttributeFilterCacheModel.stringVal;

        if ((stringVal != null) && (stringVal.length() == 0)) {
            planAttributeFilterCacheModel.stringVal = null;
        }

        return planAttributeFilterCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{planAttributeFilterId=");
        sb.append(getPlanAttributeFilterId());
        sb.append(", attributeName=");
        sb.append(getAttributeName());
        sb.append(", planUserSettingsId=");
        sb.append(getPlanUserSettingsId());
        sb.append(", max=");
        sb.append(getMax());
        sb.append(", min=");
        sb.append(getMin());
        sb.append(", stringVal=");
        sb.append(getStringVal());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.PlanAttributeFilter");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>planAttributeFilterId</column-name><column-value><![CDATA[");
        sb.append(getPlanAttributeFilterId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>attributeName</column-name><column-value><![CDATA[");
        sb.append(getAttributeName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>planUserSettingsId</column-name><column-value><![CDATA[");
        sb.append(getPlanUserSettingsId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>max</column-name><column-value><![CDATA[");
        sb.append(getMax());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>min</column-name><column-value><![CDATA[");
        sb.append(getMin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stringVal</column-name><column-value><![CDATA[");
        sb.append(getStringVal());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
