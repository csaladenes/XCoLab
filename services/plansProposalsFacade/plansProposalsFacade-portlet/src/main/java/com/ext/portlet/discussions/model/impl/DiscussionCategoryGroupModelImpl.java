package com.ext.portlet.discussions.model.impl;

import com.ext.portlet.discussions.model.DiscussionCategoryGroup;
import com.ext.portlet.discussions.model.DiscussionCategoryGroupModel;
import com.ext.portlet.discussions.model.DiscussionCategoryGroupSoap;

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
 * The base model implementation for the DiscussionCategoryGroup service. Represents a row in the &quot;Discussions_DiscussionCategoryGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.discussions.model.DiscussionCategoryGroupModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiscussionCategoryGroupImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionCategoryGroupImpl
 * @see com.ext.portlet.discussions.model.DiscussionCategoryGroup
 * @see com.ext.portlet.discussions.model.DiscussionCategoryGroupModel
 * @generated
 */
@JSON(strict = true)
public class DiscussionCategoryGroupModelImpl extends BaseModelImpl<DiscussionCategoryGroup>
    implements DiscussionCategoryGroupModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a discussion category group model instance should use the {@link com.ext.portlet.discussions.model.DiscussionCategoryGroup} interface instead.
     */
    public static final String TABLE_NAME = "Discussions_DiscussionCategoryGroup";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "description", Types.VARCHAR },
            { "url", Types.VARCHAR },
            { "commentsThread", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table Discussions_DiscussionCategoryGroup (id_ LONG not null primary key,description VARCHAR(75) null,url VARCHAR(75) null,commentsThread LONG)";
    public static final String TABLE_SQL_DROP = "drop table Discussions_DiscussionCategoryGroup";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.discussions.model.DiscussionCategoryGroup"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.discussions.model.DiscussionCategoryGroup"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.discussions.model.DiscussionCategoryGroup"));
    private static ClassLoader _classLoader = DiscussionCategoryGroup.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            DiscussionCategoryGroup.class
        };
    private Long _id;
    private String _description;
    private String _url;
    private Long _commentsThread;
    private DiscussionCategoryGroup _escapedModelProxy;

    public DiscussionCategoryGroupModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static DiscussionCategoryGroup toModel(
        DiscussionCategoryGroupSoap soapModel) {
        DiscussionCategoryGroup model = new DiscussionCategoryGroupImpl();

        model.setId(soapModel.getId());
        model.setDescription(soapModel.getDescription());
        model.setUrl(soapModel.getUrl());
        model.setCommentsThread(soapModel.getCommentsThread());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<DiscussionCategoryGroup> toModels(
        DiscussionCategoryGroupSoap[] soapModels) {
        List<DiscussionCategoryGroup> models = new ArrayList<DiscussionCategoryGroup>(soapModels.length);

        for (DiscussionCategoryGroupSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public Long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(Long primaryKey) {
        setId(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_id);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return DiscussionCategoryGroup.class;
    }

    public String getModelClassName() {
        return DiscussionCategoryGroup.class.getName();
    }

    @JSON
    public Long getId() {
        return _id;
    }

    public void setId(Long id) {
        _id = id;
    }

    @JSON
    public String getDescription() {
        if (_description == null) {
            return StringPool.BLANK;
        } else {
            return _description;
        }
    }

    public void setDescription(String description) {
        _description = description;
    }

    @JSON
    public String getUrl() {
        if (_url == null) {
            return StringPool.BLANK;
        } else {
            return _url;
        }
    }

    public void setUrl(String url) {
        _url = url;
    }

    @JSON
    public Long getCommentsThread() {
        return _commentsThread;
    }

    public void setCommentsThread(Long commentsThread) {
        _commentsThread = commentsThread;
    }

    @Override
    public DiscussionCategoryGroup toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (DiscussionCategoryGroup) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        DiscussionCategoryGroupImpl discussionCategoryGroupImpl = new DiscussionCategoryGroupImpl();

        discussionCategoryGroupImpl.setId(getId());
        discussionCategoryGroupImpl.setDescription(getDescription());
        discussionCategoryGroupImpl.setUrl(getUrl());
        discussionCategoryGroupImpl.setCommentsThread(getCommentsThread());

        discussionCategoryGroupImpl.resetOriginalValues();

        return discussionCategoryGroupImpl;
    }

    public int compareTo(DiscussionCategoryGroup discussionCategoryGroup) {
        Long primaryKey = discussionCategoryGroup.getPrimaryKey();

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

        DiscussionCategoryGroup discussionCategoryGroup = null;

        try {
            discussionCategoryGroup = (DiscussionCategoryGroup) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        Long primaryKey = discussionCategoryGroup.getPrimaryKey();

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
    public CacheModel<DiscussionCategoryGroup> toCacheModel() {
        DiscussionCategoryGroupCacheModel discussionCategoryGroupCacheModel = new DiscussionCategoryGroupCacheModel();

        discussionCategoryGroupCacheModel.id = getId();

        discussionCategoryGroupCacheModel.description = getDescription();

        String description = discussionCategoryGroupCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            discussionCategoryGroupCacheModel.description = null;
        }

        discussionCategoryGroupCacheModel.url = getUrl();

        String url = discussionCategoryGroupCacheModel.url;

        if ((url != null) && (url.length() == 0)) {
            discussionCategoryGroupCacheModel.url = null;
        }

        discussionCategoryGroupCacheModel.commentsThread = getCommentsThread();

        return discussionCategoryGroupCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", url=");
        sb.append(getUrl());
        sb.append(", commentsThread=");
        sb.append(getCommentsThread());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.discussions.model.DiscussionCategoryGroup");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>url</column-name><column-value><![CDATA[");
        sb.append(getUrl());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>commentsThread</column-name><column-value><![CDATA[");
        sb.append(getCommentsThread());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}