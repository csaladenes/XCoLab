package com.ext.portlet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ext.portlet.service.http.ModelPositionServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.http.ModelPositionServiceSoap
 * @generated
 */
public class ModelPositionSoap implements Serializable {
    private long _id;
    private long _positionId;
    private long _modelId;

    public ModelPositionSoap() {
    }

    public static ModelPositionSoap toSoapModel(ModelPosition model) {
        ModelPositionSoap soapModel = new ModelPositionSoap();

        soapModel.setId(model.getId());
        soapModel.setPositionId(model.getPositionId());
        soapModel.setModelId(model.getModelId());

        return soapModel;
    }

    public static ModelPositionSoap[] toSoapModels(ModelPosition[] models) {
        ModelPositionSoap[] soapModels = new ModelPositionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ModelPositionSoap[][] toSoapModels(ModelPosition[][] models) {
        ModelPositionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ModelPositionSoap[models.length][models[0].length];
        } else {
            soapModels = new ModelPositionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ModelPositionSoap[] toSoapModels(List<ModelPosition> models) {
        List<ModelPositionSoap> soapModels = new ArrayList<ModelPositionSoap>(models.size());

        for (ModelPosition model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ModelPositionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public long getModelId() {
        return _modelId;
    }

    public void setModelId(long modelId) {
        _modelId = modelId;
    }
}
