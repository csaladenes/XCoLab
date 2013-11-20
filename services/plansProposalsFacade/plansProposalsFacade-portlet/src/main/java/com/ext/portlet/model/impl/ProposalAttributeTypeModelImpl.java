package com.ext.portlet.model.impl;

import com.ext.portlet.model.ProposalAttributeType;
import com.ext.portlet.model.ProposalAttributeTypeModel;
import com.ext.portlet.model.ProposalAttributeTypeSoap;

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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the ProposalAttributeType service. Represents a row in the &quot;xcolab_ProposalAttributeType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.model.ProposalAttributeTypeModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ProposalAttributeTypeImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProposalAttributeTypeImpl
 * @see com.ext.portlet.model.ProposalAttributeType
 * @see com.ext.portlet.model.ProposalAttributeTypeModel
 * @generated
 */
@JSON(strict = true)
public class ProposalAttributeTypeModelImpl extends BaseModelImpl<ProposalAttributeType>
    implements ProposalAttributeTypeModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a proposal attribute type model instance should use the {@link com.ext.portlet.model.ProposalAttributeType} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_ProposalAttributeType";
    public static final Object[][] TABLE_COLUMNS = {
            { "name", Types.VARCHAR },
            { "visibleInVersionHistory", Types.BOOLEAN },
            { "copyOnPromote", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_ProposalAttributeType (name VARCHAR(75) not null primary key,visibleInVersionHistory BOOLEAN,copyOnPromote BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_ProposalAttributeType";
    public static final String ORDER_BY_JPQL = " ORDER BY proposalAttributeType.name ASC";
    public static final String ORDER_BY_SQL = " ORDER BY xcolab_ProposalAttributeType.name ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.model.ProposalAttributeType"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.model.ProposalAttributeType"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.model.ProposalAttributeType"));
    private static ClassLoader _classLoader = ProposalAttributeType.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            ProposalAttributeType.class
        };
    private String _name;
    private boolean _visibleInVersionHistory;
    private boolean _copyOnPromote;
    private ProposalAttributeType _escapedModel;

    public ProposalAttributeTypeModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static ProposalAttributeType toModel(
        ProposalAttributeTypeSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        ProposalAttributeType model = new ProposalAttributeTypeImpl();

        model.setName(soapModel.getName());
        model.setVisibleInVersionHistory(soapModel.getVisibleInVersionHistory());
        model.setCopyOnPromote(soapModel.getCopyOnPromote());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<ProposalAttributeType> toModels(
        ProposalAttributeTypeSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<ProposalAttributeType> models = new ArrayList<ProposalAttributeType>(soapModels.length);

        for (ProposalAttributeTypeSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public String getPrimaryKey() {
        return _name;
    }

    @Override
    public void setPrimaryKey(String primaryKey) {
        setName(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _name;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey((String) primaryKeyObj);
    }

    @Override
    public Class<?> getModelClass() {
        return ProposalAttributeType.class;
    }

    @Override
    public String getModelClassName() {
        return ProposalAttributeType.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("name", getName());
        attributes.put("visibleInVersionHistory", getVisibleInVersionHistory());
        attributes.put("copyOnPromote", getCopyOnPromote());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Boolean visibleInVersionHistory = (Boolean) attributes.get(
                "visibleInVersionHistory");

        if (visibleInVersionHistory != null) {
            setVisibleInVersionHistory(visibleInVersionHistory);
        }

        Boolean copyOnPromote = (Boolean) attributes.get("copyOnPromote");

        if (copyOnPromote != null) {
            setCopyOnPromote(copyOnPromote);
        }
    }

    @JSON
    @Override
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    @Override
    public void setName(String name) {
        _name = name;
    }

    @JSON
    @Override
    public boolean getVisibleInVersionHistory() {
        return _visibleInVersionHistory;
    }

    @Override
    public boolean isVisibleInVersionHistory() {
        return _visibleInVersionHistory;
    }

    @Override
    public void setVisibleInVersionHistory(boolean visibleInVersionHistory) {
        _visibleInVersionHistory = visibleInVersionHistory;
    }

    @JSON
    @Override
    public boolean getCopyOnPromote() {
        return _copyOnPromote;
    }

    @Override
    public boolean isCopyOnPromote() {
        return _copyOnPromote;
    }

    @Override
    public void setCopyOnPromote(boolean copyOnPromote) {
        _copyOnPromote = copyOnPromote;
    }

    @Override
    public ProposalAttributeType toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (ProposalAttributeType) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        ProposalAttributeTypeImpl proposalAttributeTypeImpl = new ProposalAttributeTypeImpl();

        proposalAttributeTypeImpl.setName(getName());
        proposalAttributeTypeImpl.setVisibleInVersionHistory(getVisibleInVersionHistory());
        proposalAttributeTypeImpl.setCopyOnPromote(getCopyOnPromote());

        proposalAttributeTypeImpl.resetOriginalValues();

        return proposalAttributeTypeImpl;
    }

    @Override
    public int compareTo(ProposalAttributeType proposalAttributeType) {
        String primaryKey = proposalAttributeType.getPrimaryKey();

        return getPrimaryKey().compareTo(primaryKey);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ProposalAttributeType)) {
            return false;
        }

        ProposalAttributeType proposalAttributeType = (ProposalAttributeType) obj;

        String primaryKey = proposalAttributeType.getPrimaryKey();

        if (getPrimaryKey().equals(primaryKey)) {
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
    public CacheModel<ProposalAttributeType> toCacheModel() {
        ProposalAttributeTypeCacheModel proposalAttributeTypeCacheModel = new ProposalAttributeTypeCacheModel();

        proposalAttributeTypeCacheModel.name = getName();

        String name = proposalAttributeTypeCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            proposalAttributeTypeCacheModel.name = null;
        }

        proposalAttributeTypeCacheModel.visibleInVersionHistory = getVisibleInVersionHistory();

        proposalAttributeTypeCacheModel.copyOnPromote = getCopyOnPromote();

        return proposalAttributeTypeCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{name=");
        sb.append(getName());
        sb.append(", visibleInVersionHistory=");
        sb.append(getVisibleInVersionHistory());
        sb.append(", copyOnPromote=");
        sb.append(getCopyOnPromote());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.ProposalAttributeType");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>visibleInVersionHistory</column-name><column-value><![CDATA[");
        sb.append(getVisibleInVersionHistory());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>copyOnPromote</column-name><column-value><![CDATA[");
        sb.append(getCopyOnPromote());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
