package com.ext.portlet.model.impl;

import com.ext.portlet.model.MessagingIgnoredRecipients;
import com.ext.portlet.model.MessagingIgnoredRecipientsModel;
import com.ext.portlet.model.MessagingIgnoredRecipientsSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the MessagingIgnoredRecipients service. Represents a row in the &quot;xcolab_MessagingIgnoredRecipients&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.model.MessagingIgnoredRecipientsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MessagingIgnoredRecipientsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessagingIgnoredRecipientsImpl
 * @see com.ext.portlet.model.MessagingIgnoredRecipients
 * @see com.ext.portlet.model.MessagingIgnoredRecipientsModel
 * @generated
 */
@JSON(strict = true)
public class MessagingIgnoredRecipientsModelImpl extends BaseModelImpl<MessagingIgnoredRecipients>
    implements MessagingIgnoredRecipientsModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a messaging ignored recipients model instance should use the {@link com.ext.portlet.model.MessagingIgnoredRecipients} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_MessagingIgnoredRecipients";
    public static final Object[][] TABLE_COLUMNS = {
            { "ignoredRecipientId", Types.BIGINT },
            { "email", Types.VARCHAR },
            { "name", Types.VARCHAR },
            { "userId", Types.BIGINT },
            { "createDate", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_MessagingIgnoredRecipients (ignoredRecipientId LONG not null primary key,email VARCHAR(512) null,name VARCHAR(512) null,userId LONG,createDate DATE null)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_MessagingIgnoredRecipients";
    public static final String ORDER_BY_JPQL = " ORDER BY messagingIgnoredRecipients.email ASC";
    public static final String ORDER_BY_SQL = " ORDER BY xcolab_MessagingIgnoredRecipients.email ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.model.MessagingIgnoredRecipients"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.model.MessagingIgnoredRecipients"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.model.MessagingIgnoredRecipients"),
            true);
    public static long EMAIL_COLUMN_BITMASK = 1L;
    public static long USERID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.model.MessagingIgnoredRecipients"));
    private static ClassLoader _classLoader = MessagingIgnoredRecipients.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            MessagingIgnoredRecipients.class
        };
    private long _ignoredRecipientId;
    private String _email;
    private String _originalEmail;
    private String _name;
    private long _userId;
    private String _userUuid;
    private long _originalUserId;
    private boolean _setOriginalUserId;
    private Date _createDate;
    private long _columnBitmask;
    private MessagingIgnoredRecipients _escapedModel;

    public MessagingIgnoredRecipientsModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static MessagingIgnoredRecipients toModel(
        MessagingIgnoredRecipientsSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        MessagingIgnoredRecipients model = new MessagingIgnoredRecipientsImpl();

        model.setIgnoredRecipientId(soapModel.getIgnoredRecipientId());
        model.setEmail(soapModel.getEmail());
        model.setName(soapModel.getName());
        model.setUserId(soapModel.getUserId());
        model.setCreateDate(soapModel.getCreateDate());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<MessagingIgnoredRecipients> toModels(
        MessagingIgnoredRecipientsSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<MessagingIgnoredRecipients> models = new ArrayList<MessagingIgnoredRecipients>(soapModels.length);

        for (MessagingIgnoredRecipientsSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    @Override
    public long getPrimaryKey() {
        return _ignoredRecipientId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setIgnoredRecipientId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _ignoredRecipientId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Class<?> getModelClass() {
        return MessagingIgnoredRecipients.class;
    }

    @Override
    public String getModelClassName() {
        return MessagingIgnoredRecipients.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ignoredRecipientId", getIgnoredRecipientId());
        attributes.put("email", getEmail());
        attributes.put("name", getName());
        attributes.put("userId", getUserId());
        attributes.put("createDate", getCreateDate());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long ignoredRecipientId = (Long) attributes.get("ignoredRecipientId");

        if (ignoredRecipientId != null) {
            setIgnoredRecipientId(ignoredRecipientId);
        }

        String email = (String) attributes.get("email");

        if (email != null) {
            setEmail(email);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        Long userId = (Long) attributes.get("userId");

        if (userId != null) {
            setUserId(userId);
        }

        Date createDate = (Date) attributes.get("createDate");

        if (createDate != null) {
            setCreateDate(createDate);
        }
    }

    @JSON
    @Override
    public long getIgnoredRecipientId() {
        return _ignoredRecipientId;
    }

    @Override
    public void setIgnoredRecipientId(long ignoredRecipientId) {
        _ignoredRecipientId = ignoredRecipientId;
    }

    @JSON
    @Override
    public String getEmail() {
        if (_email == null) {
            return StringPool.BLANK;
        } else {
            return _email;
        }
    }

    @Override
    public void setEmail(String email) {
        _columnBitmask = -1L;

        if (_originalEmail == null) {
            _originalEmail = _email;
        }

        _email = email;
    }

    public String getOriginalEmail() {
        return GetterUtil.getString(_originalEmail);
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
    public long getUserId() {
        return _userId;
    }

    @Override
    public void setUserId(long userId) {
        _columnBitmask |= USERID_COLUMN_BITMASK;

        if (!_setOriginalUserId) {
            _setOriginalUserId = true;

            _originalUserId = _userId;
        }

        _userId = userId;
    }

    @Override
    public String getUserUuid() throws SystemException {
        return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
    }

    @Override
    public void setUserUuid(String userUuid) {
        _userUuid = userUuid;
    }

    public long getOriginalUserId() {
        return _originalUserId;
    }

    @JSON
    @Override
    public Date getCreateDate() {
        return _createDate;
    }

    @Override
    public void setCreateDate(Date createDate) {
        _createDate = createDate;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            MessagingIgnoredRecipients.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public MessagingIgnoredRecipients toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (MessagingIgnoredRecipients) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        MessagingIgnoredRecipientsImpl messagingIgnoredRecipientsImpl = new MessagingIgnoredRecipientsImpl();

        messagingIgnoredRecipientsImpl.setIgnoredRecipientId(getIgnoredRecipientId());
        messagingIgnoredRecipientsImpl.setEmail(getEmail());
        messagingIgnoredRecipientsImpl.setName(getName());
        messagingIgnoredRecipientsImpl.setUserId(getUserId());
        messagingIgnoredRecipientsImpl.setCreateDate(getCreateDate());

        messagingIgnoredRecipientsImpl.resetOriginalValues();

        return messagingIgnoredRecipientsImpl;
    }

    @Override
    public int compareTo(MessagingIgnoredRecipients messagingIgnoredRecipients) {
        int value = 0;

        value = getEmail().compareTo(messagingIgnoredRecipients.getEmail());

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

        if (!(obj instanceof MessagingIgnoredRecipients)) {
            return false;
        }

        MessagingIgnoredRecipients messagingIgnoredRecipients = (MessagingIgnoredRecipients) obj;

        long primaryKey = messagingIgnoredRecipients.getPrimaryKey();

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
        MessagingIgnoredRecipientsModelImpl messagingIgnoredRecipientsModelImpl = this;

        messagingIgnoredRecipientsModelImpl._originalEmail = messagingIgnoredRecipientsModelImpl._email;

        messagingIgnoredRecipientsModelImpl._originalUserId = messagingIgnoredRecipientsModelImpl._userId;

        messagingIgnoredRecipientsModelImpl._setOriginalUserId = false;

        messagingIgnoredRecipientsModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<MessagingIgnoredRecipients> toCacheModel() {
        MessagingIgnoredRecipientsCacheModel messagingIgnoredRecipientsCacheModel =
            new MessagingIgnoredRecipientsCacheModel();

        messagingIgnoredRecipientsCacheModel.ignoredRecipientId = getIgnoredRecipientId();

        messagingIgnoredRecipientsCacheModel.email = getEmail();

        String email = messagingIgnoredRecipientsCacheModel.email;

        if ((email != null) && (email.length() == 0)) {
            messagingIgnoredRecipientsCacheModel.email = null;
        }

        messagingIgnoredRecipientsCacheModel.name = getName();

        String name = messagingIgnoredRecipientsCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            messagingIgnoredRecipientsCacheModel.name = null;
        }

        messagingIgnoredRecipientsCacheModel.userId = getUserId();

        Date createDate = getCreateDate();

        if (createDate != null) {
            messagingIgnoredRecipientsCacheModel.createDate = createDate.getTime();
        } else {
            messagingIgnoredRecipientsCacheModel.createDate = Long.MIN_VALUE;
        }

        return messagingIgnoredRecipientsCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{ignoredRecipientId=");
        sb.append(getIgnoredRecipientId());
        sb.append(", email=");
        sb.append(getEmail());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", userId=");
        sb.append(getUserId());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(19);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.MessagingIgnoredRecipients");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>ignoredRecipientId</column-name><column-value><![CDATA[");
        sb.append(getIgnoredRecipientId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>email</column-name><column-value><![CDATA[");
        sb.append(getEmail());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>userId</column-name><column-value><![CDATA[");
        sb.append(getUserId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
