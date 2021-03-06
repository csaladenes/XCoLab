package com.ext.portlet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ext.portlet.service.http.PlanPropertyFilterServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.http.PlanPropertyFilterServiceSoap
 * @generated
 */
public class PlanPropertyFilterSoap implements Serializable {
    private long _planPropertyFilterId;
    private String _propertyName;
    private long _planUserSettingsId;
    private String _value;

    public PlanPropertyFilterSoap() {
    }

    public static PlanPropertyFilterSoap toSoapModel(PlanPropertyFilter model) {
        PlanPropertyFilterSoap soapModel = new PlanPropertyFilterSoap();

        soapModel.setPlanPropertyFilterId(model.getPlanPropertyFilterId());
        soapModel.setPropertyName(model.getPropertyName());
        soapModel.setPlanUserSettingsId(model.getPlanUserSettingsId());
        soapModel.setValue(model.getValue());

        return soapModel;
    }

    public static PlanPropertyFilterSoap[] toSoapModels(
        PlanPropertyFilter[] models) {
        PlanPropertyFilterSoap[] soapModels = new PlanPropertyFilterSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PlanPropertyFilterSoap[][] toSoapModels(
        PlanPropertyFilter[][] models) {
        PlanPropertyFilterSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PlanPropertyFilterSoap[models.length][models[0].length];
        } else {
            soapModels = new PlanPropertyFilterSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PlanPropertyFilterSoap[] toSoapModels(
        List<PlanPropertyFilter> models) {
        List<PlanPropertyFilterSoap> soapModels = new ArrayList<PlanPropertyFilterSoap>(models.size());

        for (PlanPropertyFilter model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PlanPropertyFilterSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _planPropertyFilterId;
    }

    public void setPrimaryKey(long pk) {
        setPlanPropertyFilterId(pk);
    }

    public long getPlanPropertyFilterId() {
        return _planPropertyFilterId;
    }

    public void setPlanPropertyFilterId(long planPropertyFilterId) {
        _planPropertyFilterId = planPropertyFilterId;
    }

    public String getPropertyName() {
        return _propertyName;
    }

    public void setPropertyName(String propertyName) {
        _propertyName = propertyName;
    }

    public long getPlanUserSettingsId() {
        return _planUserSettingsId;
    }

    public void setPlanUserSettingsId(long planUserSettingsId) {
        _planUserSettingsId = planUserSettingsId;
    }

    public String getValue() {
        return _value;
    }

    public void setValue(String value) {
        _value = value;
    }
}
