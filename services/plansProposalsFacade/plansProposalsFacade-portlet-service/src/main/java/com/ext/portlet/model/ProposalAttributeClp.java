package com.ext.portlet.model;

import com.ext.portlet.service.ClpSerializer;
import com.ext.portlet.service.ProposalAttributeLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class ProposalAttributeClp extends BaseModelImpl<ProposalAttribute>
    implements ProposalAttribute {
    private long _id;
    private long _proposalId;
    private int _version;
    private int _versionWhenCreated;
    private String _name;
    private long _additionalId;
    private long _numericValue;
    private String _stringValue;
    private double _realValue;
    private BaseModel<?> _proposalAttributeRemoteModel;

    public ProposalAttributeClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return ProposalAttribute.class;
    }

    @Override
    public String getModelClassName() {
        return ProposalAttribute.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("proposalId", getProposalId());
        attributes.put("version", getVersion());
        attributes.put("versionWhenCreated", getVersionWhenCreated());
        attributes.put("name", getName());
        attributes.put("additionalId", getAdditionalId());
        attributes.put("numericValue", getNumericValue());
        attributes.put("stringValue", getStringValue());
        attributes.put("realValue", getRealValue());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        Long proposalId = (Long) attributes.get("proposalId");

        if (proposalId != null) {
            setProposalId(proposalId);
        }

        Integer version = (Integer) attributes.get("version");

        if (version != null) {
            setVersion(version);
        }

        Integer versionWhenCreated = (Integer) attributes.get(
                "versionWhenCreated");

        if (versionWhenCreated != null) {
            setVersionWhenCreated(versionWhenCreated);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long additionalId = (Long) attributes.get("additionalId");

        if (additionalId != null) {
            setAdditionalId(additionalId);
        }

        Long numericValue = (Long) attributes.get("numericValue");

        if (numericValue != null) {
            setNumericValue(numericValue);
        }

        String stringValue = (String) attributes.get("stringValue");

        if (stringValue != null) {
            setStringValue(stringValue);
        }

        Double realValue = (Double) attributes.get("realValue");

        if (realValue != null) {
            setRealValue(realValue);
        }
    }

    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setId", long.class);

                method.invoke(_proposalAttributeRemoteModel, id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getProposalId() {
        return _proposalId;
    }

    @Override
    public void setProposalId(long proposalId) {
        _proposalId = proposalId;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setProposalId", long.class);

                method.invoke(_proposalAttributeRemoteModel, proposalId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVersion() {
        return _version;
    }

    @Override
    public void setVersion(int version) {
        _version = version;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setVersion", int.class);

                method.invoke(_proposalAttributeRemoteModel, version);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getVersionWhenCreated() {
        return _versionWhenCreated;
    }

    @Override
    public void setVersionWhenCreated(int versionWhenCreated) {
        _versionWhenCreated = versionWhenCreated;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setVersionWhenCreated",
                        int.class);

                method.invoke(_proposalAttributeRemoteModel, versionWhenCreated);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getName() {
        return _name;
    }

    @Override
    public void setName(String name) {
        _name = name;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setName", String.class);

                method.invoke(_proposalAttributeRemoteModel, name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getAdditionalId() {
        return _additionalId;
    }

    @Override
    public void setAdditionalId(long additionalId) {
        _additionalId = additionalId;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setAdditionalId", long.class);

                method.invoke(_proposalAttributeRemoteModel, additionalId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getNumericValue() {
        return _numericValue;
    }

    @Override
    public void setNumericValue(long numericValue) {
        _numericValue = numericValue;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setNumericValue", long.class);

                method.invoke(_proposalAttributeRemoteModel, numericValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getStringValue() {
        return _stringValue;
    }

    @Override
    public void setStringValue(String stringValue) {
        _stringValue = stringValue;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setStringValue", String.class);

                method.invoke(_proposalAttributeRemoteModel, stringValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public double getRealValue() {
        return _realValue;
    }

    @Override
    public void setRealValue(double realValue) {
        _realValue = realValue;

        if (_proposalAttributeRemoteModel != null) {
            try {
                Class<?> clazz = _proposalAttributeRemoteModel.getClass();

                Method method = clazz.getMethod("setRealValue", double.class);

                method.invoke(_proposalAttributeRemoteModel, realValue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getProposalAttributeRemoteModel() {
        return _proposalAttributeRemoteModel;
    }

    public void setProposalAttributeRemoteModel(
        BaseModel<?> proposalAttributeRemoteModel) {
        _proposalAttributeRemoteModel = proposalAttributeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _proposalAttributeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_proposalAttributeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ProposalAttributeLocalServiceUtil.addProposalAttribute(this);
        } else {
            ProposalAttributeLocalServiceUtil.updateProposalAttribute(this);
        }
    }

    @Override
    public ProposalAttribute toEscapedModel() {
        return (ProposalAttribute) ProxyUtil.newProxyInstance(ProposalAttribute.class.getClassLoader(),
            new Class[] { ProposalAttribute.class },
            new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        ProposalAttributeClp clone = new ProposalAttributeClp();

        clone.setId(getId());
        clone.setProposalId(getProposalId());
        clone.setVersion(getVersion());
        clone.setVersionWhenCreated(getVersionWhenCreated());
        clone.setName(getName());
        clone.setAdditionalId(getAdditionalId());
        clone.setNumericValue(getNumericValue());
        clone.setStringValue(getStringValue());
        clone.setRealValue(getRealValue());

        return clone;
    }

    @Override
    public int compareTo(ProposalAttribute proposalAttribute) {
        long primaryKey = proposalAttribute.getPrimaryKey();

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

        if (!(obj instanceof ProposalAttributeClp)) {
            return false;
        }

        ProposalAttributeClp proposalAttribute = (ProposalAttributeClp) obj;

        long primaryKey = proposalAttribute.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", proposalId=");
        sb.append(getProposalId());
        sb.append(", version=");
        sb.append(getVersion());
        sb.append(", versionWhenCreated=");
        sb.append(getVersionWhenCreated());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", additionalId=");
        sb.append(getAdditionalId());
        sb.append(", numericValue=");
        sb.append(getNumericValue());
        sb.append(", stringValue=");
        sb.append(getStringValue());
        sb.append(", realValue=");
        sb.append(getRealValue());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.ProposalAttribute");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>proposalId</column-name><column-value><![CDATA[");
        sb.append(getProposalId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>version</column-name><column-value><![CDATA[");
        sb.append(getVersion());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>versionWhenCreated</column-name><column-value><![CDATA[");
        sb.append(getVersionWhenCreated());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>additionalId</column-name><column-value><![CDATA[");
        sb.append(getAdditionalId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>numericValue</column-name><column-value><![CDATA[");
        sb.append(getNumericValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>stringValue</column-name><column-value><![CDATA[");
        sb.append(getStringValue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>realValue</column-name><column-value><![CDATA[");
        sb.append(getRealValue());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
