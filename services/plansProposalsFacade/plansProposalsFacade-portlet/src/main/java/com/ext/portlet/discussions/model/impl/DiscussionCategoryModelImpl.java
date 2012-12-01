package com.ext.portlet.discussions.model.impl;

import com.ext.portlet.discussions.model.DiscussionCategory;
import com.ext.portlet.discussions.model.DiscussionCategoryModel;
import com.ext.portlet.discussions.model.DiscussionCategorySoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The base model implementation for the DiscussionCategory service. Represents a row in the &quot;Discussions_DiscussionCategory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.discussions.model.DiscussionCategoryModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DiscussionCategoryImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionCategoryImpl
 * @see com.ext.portlet.discussions.model.DiscussionCategory
 * @see com.ext.portlet.discussions.model.DiscussionCategoryModel
 * @generated
 */
@JSON(strict = true)
public class DiscussionCategoryModelImpl extends BaseModelImpl<DiscussionCategory>
    implements DiscussionCategoryModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a discussion category model instance should use the {@link com.ext.portlet.discussions.model.DiscussionCategory} interface instead.
     */
    public static final String TABLE_NAME = "Discussions_DiscussionCategory";
    public static final Object[][] TABLE_COLUMNS = {
            { "pk", Types.BIGINT },
            { "categoryId", Types.BIGINT },
            { "categoryGroupId", Types.BIGINT },
            { "authorId", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "description", Types.VARCHAR },
            { "createDate", Types.TIMESTAMP },
            { "deleted", Types.TIMESTAMP },
            { "threadsCount", Types.INTEGER },
            { "lastActivityDate", Types.TIMESTAMP },
            { "lastActivityAuthorId", Types.BIGINT }
        };
    public static final String TABLE_SQL_CREATE = "create table Discussions_DiscussionCategory (pk LONG not null primary key,categoryId LONG,categoryGroupId LONG,authorId LONG,name VARCHAR(75) null,description VARCHAR(75) null,createDate DATE null,deleted DATE null,threadsCount INTEGER,lastActivityDate DATE null,lastActivityAuthorId LONG)";
    public static final String TABLE_SQL_DROP = "drop table Discussions_DiscussionCategory";
    public static final String ORDER_BY_JPQL = " ORDER BY discussionCategory.createDate DESC";
    public static final String ORDER_BY_SQL = " ORDER BY Discussions_DiscussionCategory.createDate DESC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.discussions.model.DiscussionCategory"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.discussions.model.DiscussionCategory"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.discussions.model.DiscussionCategory"),
            true);
    public static long CATEGORYGROUPID_COLUMN_BITMASK = 1L;
    public static long CATEGORYID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.discussions.model.DiscussionCategory"));
    private static ClassLoader _classLoader = DiscussionCategory.class.getClassLoader();
    private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
            DiscussionCategory.class
        };
    private Long _pk;
    private Long _categoryId;
    private Long _originalCategoryId;
    private boolean _setOriginalCategoryId;
    private Long _categoryGroupId;
    private Long _originalCategoryGroupId;
    private boolean _setOriginalCategoryGroupId;
    private Long _authorId;
    private String _name;
    private String _description;
    private Date _createDate;
    private Date _deleted;
    private Integer _threadsCount;
    private Date _lastActivityDate;
    private Long _lastActivityAuthorId;
    private long _columnBitmask;
    private DiscussionCategory _escapedModelProxy;

    public DiscussionCategoryModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static DiscussionCategory toModel(DiscussionCategorySoap soapModel) {
        DiscussionCategory model = new DiscussionCategoryImpl();

        model.setPk(soapModel.getPk());
        model.setCategoryId(soapModel.getCategoryId());
        model.setCategoryGroupId(soapModel.getCategoryGroupId());
        model.setAuthorId(soapModel.getAuthorId());
        model.setName(soapModel.getName());
        model.setDescription(soapModel.getDescription());
        model.setCreateDate(soapModel.getCreateDate());
        model.setDeleted(soapModel.getDeleted());
        model.setThreadsCount(soapModel.getThreadsCount());
        model.setLastActivityDate(soapModel.getLastActivityDate());
        model.setLastActivityAuthorId(soapModel.getLastActivityAuthorId());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<DiscussionCategory> toModels(
        DiscussionCategorySoap[] soapModels) {
        List<DiscussionCategory> models = new ArrayList<DiscussionCategory>(soapModels.length);

        for (DiscussionCategorySoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
    }

    public Long getPrimaryKey() {
        return _pk;
    }

    public void setPrimaryKey(Long primaryKey) {
        setPk(primaryKey);
    }

    public Serializable getPrimaryKeyObj() {
        return new Long(_pk);
    }

    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    public Class<?> getModelClass() {
        return DiscussionCategory.class;
    }

    public String getModelClassName() {
        return DiscussionCategory.class.getName();
    }

    @JSON
    public Long getPk() {
        return _pk;
    }

    public void setPk(Long pk) {
        _pk = pk;
    }

    @JSON
    public Long getCategoryId() {
        return _categoryId;
    }

    public void setCategoryId(Long categoryId) {
        _columnBitmask |= CATEGORYID_COLUMN_BITMASK;

        if (!_setOriginalCategoryId) {
            _setOriginalCategoryId = true;

            _originalCategoryId = _categoryId;
        }

        _categoryId = categoryId;
    }

    public Long getOriginalCategoryId() {
        return _originalCategoryId;
    }

    @JSON
    public Long getCategoryGroupId() {
        return _categoryGroupId;
    }

    public void setCategoryGroupId(Long categoryGroupId) {
        _columnBitmask |= CATEGORYGROUPID_COLUMN_BITMASK;

        if (!_setOriginalCategoryGroupId) {
            _setOriginalCategoryGroupId = true;

            _originalCategoryGroupId = _categoryGroupId;
        }

        _categoryGroupId = categoryGroupId;
    }

    public Long getOriginalCategoryGroupId() {
        return _originalCategoryGroupId;
    }

    @JSON
    public Long getAuthorId() {
        return _authorId;
    }

    public void setAuthorId(Long authorId) {
        _authorId = authorId;
    }

    @JSON
    public String getName() {
        if (_name == null) {
            return StringPool.BLANK;
        } else {
            return _name;
        }
    }

    public void setName(String name) {
        _name = name;
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
    public Date getCreateDate() {
        return _createDate;
    }

    public void setCreateDate(Date createDate) {
        _columnBitmask = -1L;

        _createDate = createDate;
    }

    @JSON
    public Date getDeleted() {
        return _deleted;
    }

    public void setDeleted(Date deleted) {
        _deleted = deleted;
    }

    @JSON
    public Integer getThreadsCount() {
        return _threadsCount;
    }

    public void setThreadsCount(Integer threadsCount) {
        _threadsCount = threadsCount;
    }

    @JSON
    public Date getLastActivityDate() {
        return _lastActivityDate;
    }

    public void setLastActivityDate(Date lastActivityDate) {
        _lastActivityDate = lastActivityDate;
    }

    @JSON
    public Long getLastActivityAuthorId() {
        return _lastActivityAuthorId;
    }

    public void setLastActivityAuthorId(Long lastActivityAuthorId) {
        _lastActivityAuthorId = lastActivityAuthorId;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public DiscussionCategory toEscapedModel() {
        if (_escapedModelProxy == null) {
            _escapedModelProxy = (DiscussionCategory) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelProxyInterfaces,
                    new AutoEscapeBeanHandler(this));
        }

        return _escapedModelProxy;
    }

    @Override
    public Object clone() {
        DiscussionCategoryImpl discussionCategoryImpl = new DiscussionCategoryImpl();

        discussionCategoryImpl.setPk(getPk());
        discussionCategoryImpl.setCategoryId(getCategoryId());
        discussionCategoryImpl.setCategoryGroupId(getCategoryGroupId());
        discussionCategoryImpl.setAuthorId(getAuthorId());
        discussionCategoryImpl.setName(getName());
        discussionCategoryImpl.setDescription(getDescription());
        discussionCategoryImpl.setCreateDate(getCreateDate());
        discussionCategoryImpl.setDeleted(getDeleted());
        discussionCategoryImpl.setThreadsCount(getThreadsCount());
        discussionCategoryImpl.setLastActivityDate(getLastActivityDate());
        discussionCategoryImpl.setLastActivityAuthorId(getLastActivityAuthorId());

        discussionCategoryImpl.resetOriginalValues();

        return discussionCategoryImpl;
    }

    public int compareTo(DiscussionCategory discussionCategory) {
        int value = 0;

        value = DateUtil.compareTo(getCreateDate(),
                discussionCategory.getCreateDate());

        value = value * -1;

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        DiscussionCategory discussionCategory = null;

        try {
            discussionCategory = (DiscussionCategory) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        Long primaryKey = discussionCategory.getPrimaryKey();

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
        DiscussionCategoryModelImpl discussionCategoryModelImpl = this;

        discussionCategoryModelImpl._originalCategoryId = discussionCategoryModelImpl._categoryId;

        discussionCategoryModelImpl._setOriginalCategoryId = false;

        discussionCategoryModelImpl._originalCategoryGroupId = discussionCategoryModelImpl._categoryGroupId;

        discussionCategoryModelImpl._setOriginalCategoryGroupId = false;

        discussionCategoryModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<DiscussionCategory> toCacheModel() {
        DiscussionCategoryCacheModel discussionCategoryCacheModel = new DiscussionCategoryCacheModel();

        discussionCategoryCacheModel.pk = getPk();

        discussionCategoryCacheModel.categoryId = getCategoryId();

        discussionCategoryCacheModel.categoryGroupId = getCategoryGroupId();

        discussionCategoryCacheModel.authorId = getAuthorId();

        discussionCategoryCacheModel.name = getName();

        String name = discussionCategoryCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            discussionCategoryCacheModel.name = null;
        }

        discussionCategoryCacheModel.description = getDescription();

        String description = discussionCategoryCacheModel.description;

        if ((description != null) && (description.length() == 0)) {
            discussionCategoryCacheModel.description = null;
        }

        Date createDate = getCreateDate();

        if (createDate != null) {
            discussionCategoryCacheModel.createDate = createDate.getTime();
        } else {
            discussionCategoryCacheModel.createDate = Long.MIN_VALUE;
        }

        Date deleted = getDeleted();

        if (deleted != null) {
            discussionCategoryCacheModel.deleted = deleted.getTime();
        } else {
            discussionCategoryCacheModel.deleted = Long.MIN_VALUE;
        }

        discussionCategoryCacheModel.threadsCount = getThreadsCount();

        Date lastActivityDate = getLastActivityDate();

        if (lastActivityDate != null) {
            discussionCategoryCacheModel.lastActivityDate = lastActivityDate.getTime();
        } else {
            discussionCategoryCacheModel.lastActivityDate = Long.MIN_VALUE;
        }

        discussionCategoryCacheModel.lastActivityAuthorId = getLastActivityAuthorId();

        return discussionCategoryCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{pk=");
        sb.append(getPk());
        sb.append(", categoryId=");
        sb.append(getCategoryId());
        sb.append(", categoryGroupId=");
        sb.append(getCategoryGroupId());
        sb.append(", authorId=");
        sb.append(getAuthorId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", description=");
        sb.append(getDescription());
        sb.append(", createDate=");
        sb.append(getCreateDate());
        sb.append(", deleted=");
        sb.append(getDeleted());
        sb.append(", threadsCount=");
        sb.append(getThreadsCount());
        sb.append(", lastActivityDate=");
        sb.append(getLastActivityDate());
        sb.append(", lastActivityAuthorId=");
        sb.append(getLastActivityAuthorId());
        sb.append("}");

        return sb.toString();
    }

    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.discussions.model.DiscussionCategory");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>pk</column-name><column-value><![CDATA[");
        sb.append(getPk());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>categoryId</column-name><column-value><![CDATA[");
        sb.append(getCategoryId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>categoryGroupId</column-name><column-value><![CDATA[");
        sb.append(getCategoryGroupId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>authorId</column-name><column-value><![CDATA[");
        sb.append(getAuthorId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>description</column-name><column-value><![CDATA[");
        sb.append(getDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>createDate</column-name><column-value><![CDATA[");
        sb.append(getCreateDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>deleted</column-name><column-value><![CDATA[");
        sb.append(getDeleted());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>threadsCount</column-name><column-value><![CDATA[");
        sb.append(getThreadsCount());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastActivityDate</column-name><column-value><![CDATA[");
        sb.append(getLastActivityDate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lastActivityAuthorId</column-name><column-value><![CDATA[");
        sb.append(getLastActivityAuthorId());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}