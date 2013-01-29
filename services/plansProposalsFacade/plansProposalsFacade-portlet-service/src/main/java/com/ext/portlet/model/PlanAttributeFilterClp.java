package com.ext.portlet.model;

import com.ext.portlet.service.PlanAttributeFilterLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Proxy;


public class PlanAttributeFilterClp extends BaseModelImpl<PlanAttributeFilter>
    implements PlanAttributeFilter {
    private long _planAttributeFilterId;
    private String _attributeName;
    private long _planUserSettingsId;
    private Double _max;
    private Double _min;
    private String _stringVal;

    public PlanAttributeFilterClp() {
    }

    public Class<?> getModelClass() {
        return PlanAttributeFilter.class;
    }

    public String getModelClassName() {
        return PlanAttributeFilter.class.getName();
    }

    public long getPrimaryKey() {
        return _planAttributeFilterId;
    }

    public void setPrimaryKey(long primaryKey) {
        setPlanAttributeFilterId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_planAttributeFilterId);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public long getPlanAttributeFilterId() {
        return _planAttributeFilterId;
    }

    public void setPlanAttributeFilterId(long planAttributeFilterId) {
        _planAttributeFilterId = planAttributeFilterId;
    }

    public String getAttributeName() {
        return _attributeName;
    }

    public void setAttributeName(String attributeName) {
        _attributeName = attributeName;
    }

    public long getPlanUserSettingsId() {
        return _planUserSettingsId;
    }

    public void setPlanUserSettingsId(long planUserSettingsId) {
        _planUserSettingsId = planUserSettingsId;
    }

    public Double getMax() {
        return _max;
    }

    public void setMax(Double max) {
        _max = max;
    }

    public Double getMin() {
        return _min;
    }

    public void setMin(Double min) {
        _min = min;
    }

    public String getStringVal() {
        return _stringVal;
    }

    public void setStringVal(String stringVal) {
        _stringVal = stringVal;
    }

    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanAttributeFilterLocalServiceUtil.addPlanAttributeFilter(this);
        } else {
            PlanAttributeFilterLocalServiceUtil.updatePlanAttributeFilter(this);
        }
    }

    @Override
    public PlanAttributeFilter toEscapedModel() {
        return (PlanAttributeFilter) Proxy.newProxyInstance(PlanAttributeFilter.class.getClassLoader(),
            new Class[] { PlanAttributeFilter.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PlanAttributeFilterClp clone = new PlanAttributeFilterClp();

        clone.setPlanAttributeFilterId(getPlanAttributeFilterId());
        clone.setAttributeName(getAttributeName());
        clone.setPlanUserSettingsId(getPlanUserSettingsId());
        clone.setMax(getMax());
        clone.setMin(getMin());
        clone.setStringVal(getStringVal());

        return clone;
    }

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
        if (obj == null) {
            return false;
        }

        PlanAttributeFilterClp planAttributeFilter = null;

        try {
            planAttributeFilter = (PlanAttributeFilterClp) obj;
        } catch (ClassCastException cce) {
            return false;
        }

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