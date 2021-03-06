package com.ext.portlet.model.impl;

import com.ext.portlet.model.BalloonText;
import com.ext.portlet.model.BalloonTextModel;
import com.ext.portlet.model.BalloonTextSoap;

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
 * The base model implementation for the BalloonText service. Represents a row in the &quot;xcolab_BalloonText&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.ext.portlet.model.BalloonTextModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link BalloonTextImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BalloonTextImpl
 * @see com.ext.portlet.model.BalloonText
 * @see com.ext.portlet.model.BalloonTextModel
 * @generated
 */
@JSON(strict = true)
public class BalloonTextModelImpl extends BaseModelImpl<BalloonText>
    implements BalloonTextModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a balloon text model instance should use the {@link com.ext.portlet.model.BalloonText} interface instead.
     */
    public static final String TABLE_NAME = "xcolab_BalloonText";
    public static final Object[][] TABLE_COLUMNS = {
            { "id_", Types.BIGINT },
            { "name", Types.VARCHAR },
            { "textBeforeForm", Types.CLOB },
            { "textAfterForm", Types.CLOB },
            { "textBeforeShareButtons", Types.CLOB },
            { "textAfterShareButtons", Types.CLOB },
            { "acceptTosText", Types.CLOB },
            { "emailTemplate", Types.CLOB },
            { "emailSubjectTemplate", Types.CLOB },
            { "twitterDescription", Types.CLOB },
            { "twitterSubject", Types.CLOB },
            { "facebookDescription", Types.CLOB },
            { "facebookSubject", Types.CLOB },
            { "enabled", Types.BOOLEAN }
        };
    public static final String TABLE_SQL_CREATE = "create table xcolab_BalloonText (id_ LONG not null primary key,name VARCHAR(75) null,textBeforeForm TEXT null,textAfterForm TEXT null,textBeforeShareButtons TEXT null,textAfterShareButtons TEXT null,acceptTosText TEXT null,emailTemplate TEXT null,emailSubjectTemplate TEXT null,twitterDescription TEXT null,twitterSubject TEXT null,facebookDescription TEXT null,facebookSubject TEXT null,enabled BOOLEAN)";
    public static final String TABLE_SQL_DROP = "drop table xcolab_BalloonText";
    public static final String ORDER_BY_JPQL = " ORDER BY balloonText.id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY xcolab_BalloonText.id_ ASC";
    public static final String DATA_SOURCE = "liferayDataSource";
    public static final String SESSION_FACTORY = "liferaySessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.com.ext.portlet.model.BalloonText"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.com.ext.portlet.model.BalloonText"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.column.bitmask.enabled.com.ext.portlet.model.BalloonText"),
            true);
    public static long ENABLED_COLUMN_BITMASK = 1L;
    public static long ID_COLUMN_BITMASK = 2L;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.com.ext.portlet.model.BalloonText"));
    private static ClassLoader _classLoader = BalloonText.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            BalloonText.class
        };
    private long _id;
    private String _name;
    private String _textBeforeForm;
    private String _textAfterForm;
    private String _textBeforeShareButtons;
    private String _textAfterShareButtons;
    private String _acceptTosText;
    private String _emailTemplate;
    private String _emailSubjectTemplate;
    private String _twitterDescription;
    private String _twitterSubject;
    private String _facebookDescription;
    private String _facebookSubject;
    private boolean _enabled;
    private boolean _originalEnabled;
    private boolean _setOriginalEnabled;
    private long _columnBitmask;
    private BalloonText _escapedModel;

    public BalloonTextModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static BalloonText toModel(BalloonTextSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        BalloonText model = new BalloonTextImpl();

        model.setId(soapModel.getId());
        model.setName(soapModel.getName());
        model.setTextBeforeForm(soapModel.getTextBeforeForm());
        model.setTextAfterForm(soapModel.getTextAfterForm());
        model.setTextBeforeShareButtons(soapModel.getTextBeforeShareButtons());
        model.setTextAfterShareButtons(soapModel.getTextAfterShareButtons());
        model.setAcceptTosText(soapModel.getAcceptTosText());
        model.setEmailTemplate(soapModel.getEmailTemplate());
        model.setEmailSubjectTemplate(soapModel.getEmailSubjectTemplate());
        model.setTwitterDescription(soapModel.getTwitterDescription());
        model.setTwitterSubject(soapModel.getTwitterSubject());
        model.setFacebookDescription(soapModel.getFacebookDescription());
        model.setFacebookSubject(soapModel.getFacebookSubject());
        model.setEnabled(soapModel.getEnabled());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<BalloonText> toModels(BalloonTextSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<BalloonText> models = new ArrayList<BalloonText>(soapModels.length);

        for (BalloonTextSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return BalloonText.class;
    }

    @Override
    public String getModelClassName() {
        return BalloonText.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("id", getId());
        attributes.put("name", getName());
        attributes.put("textBeforeForm", getTextBeforeForm());
        attributes.put("textAfterForm", getTextAfterForm());
        attributes.put("textBeforeShareButtons", getTextBeforeShareButtons());
        attributes.put("textAfterShareButtons", getTextAfterShareButtons());
        attributes.put("acceptTosText", getAcceptTosText());
        attributes.put("emailTemplate", getEmailTemplate());
        attributes.put("emailSubjectTemplate", getEmailSubjectTemplate());
        attributes.put("twitterDescription", getTwitterDescription());
        attributes.put("twitterSubject", getTwitterSubject());
        attributes.put("facebookDescription", getFacebookDescription());
        attributes.put("facebookSubject", getFacebookSubject());
        attributes.put("enabled", getEnabled());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long id = (Long) attributes.get("id");

        if (id != null) {
            setId(id);
        }

        String name = (String) attributes.get("name");

        if (name != null) {
            setName(name);
        }

        String textBeforeForm = (String) attributes.get("textBeforeForm");

        if (textBeforeForm != null) {
            setTextBeforeForm(textBeforeForm);
        }

        String textAfterForm = (String) attributes.get("textAfterForm");

        if (textAfterForm != null) {
            setTextAfterForm(textAfterForm);
        }

        String textBeforeShareButtons = (String) attributes.get(
                "textBeforeShareButtons");

        if (textBeforeShareButtons != null) {
            setTextBeforeShareButtons(textBeforeShareButtons);
        }

        String textAfterShareButtons = (String) attributes.get(
                "textAfterShareButtons");

        if (textAfterShareButtons != null) {
            setTextAfterShareButtons(textAfterShareButtons);
        }

        String acceptTosText = (String) attributes.get("acceptTosText");

        if (acceptTosText != null) {
            setAcceptTosText(acceptTosText);
        }

        String emailTemplate = (String) attributes.get("emailTemplate");

        if (emailTemplate != null) {
            setEmailTemplate(emailTemplate);
        }

        String emailSubjectTemplate = (String) attributes.get(
                "emailSubjectTemplate");

        if (emailSubjectTemplate != null) {
            setEmailSubjectTemplate(emailSubjectTemplate);
        }

        String twitterDescription = (String) attributes.get(
                "twitterDescription");

        if (twitterDescription != null) {
            setTwitterDescription(twitterDescription);
        }

        String twitterSubject = (String) attributes.get("twitterSubject");

        if (twitterSubject != null) {
            setTwitterSubject(twitterSubject);
        }

        String facebookDescription = (String) attributes.get(
                "facebookDescription");

        if (facebookDescription != null) {
            setFacebookDescription(facebookDescription);
        }

        String facebookSubject = (String) attributes.get("facebookSubject");

        if (facebookSubject != null) {
            setFacebookSubject(facebookSubject);
        }

        Boolean enabled = (Boolean) attributes.get("enabled");

        if (enabled != null) {
            setEnabled(enabled);
        }
    }

    @JSON
    @Override
    public long getId() {
        return _id;
    }

    @Override
    public void setId(long id) {
        _id = id;
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
    public String getTextBeforeForm() {
        if (_textBeforeForm == null) {
            return StringPool.BLANK;
        } else {
            return _textBeforeForm;
        }
    }

    @Override
    public void setTextBeforeForm(String textBeforeForm) {
        _textBeforeForm = textBeforeForm;
    }

    @JSON
    @Override
    public String getTextAfterForm() {
        if (_textAfterForm == null) {
            return StringPool.BLANK;
        } else {
            return _textAfterForm;
        }
    }

    @Override
    public void setTextAfterForm(String textAfterForm) {
        _textAfterForm = textAfterForm;
    }

    @JSON
    @Override
    public String getTextBeforeShareButtons() {
        if (_textBeforeShareButtons == null) {
            return StringPool.BLANK;
        } else {
            return _textBeforeShareButtons;
        }
    }

    @Override
    public void setTextBeforeShareButtons(String textBeforeShareButtons) {
        _textBeforeShareButtons = textBeforeShareButtons;
    }

    @JSON
    @Override
    public String getTextAfterShareButtons() {
        if (_textAfterShareButtons == null) {
            return StringPool.BLANK;
        } else {
            return _textAfterShareButtons;
        }
    }

    @Override
    public void setTextAfterShareButtons(String textAfterShareButtons) {
        _textAfterShareButtons = textAfterShareButtons;
    }

    @JSON
    @Override
    public String getAcceptTosText() {
        if (_acceptTosText == null) {
            return StringPool.BLANK;
        } else {
            return _acceptTosText;
        }
    }

    @Override
    public void setAcceptTosText(String acceptTosText) {
        _acceptTosText = acceptTosText;
    }

    @JSON
    @Override
    public String getEmailTemplate() {
        if (_emailTemplate == null) {
            return StringPool.BLANK;
        } else {
            return _emailTemplate;
        }
    }

    @Override
    public void setEmailTemplate(String emailTemplate) {
        _emailTemplate = emailTemplate;
    }

    @JSON
    @Override
    public String getEmailSubjectTemplate() {
        if (_emailSubjectTemplate == null) {
            return StringPool.BLANK;
        } else {
            return _emailSubjectTemplate;
        }
    }

    @Override
    public void setEmailSubjectTemplate(String emailSubjectTemplate) {
        _emailSubjectTemplate = emailSubjectTemplate;
    }

    @JSON
    @Override
    public String getTwitterDescription() {
        if (_twitterDescription == null) {
            return StringPool.BLANK;
        } else {
            return _twitterDescription;
        }
    }

    @Override
    public void setTwitterDescription(String twitterDescription) {
        _twitterDescription = twitterDescription;
    }

    @JSON
    @Override
    public String getTwitterSubject() {
        if (_twitterSubject == null) {
            return StringPool.BLANK;
        } else {
            return _twitterSubject;
        }
    }

    @Override
    public void setTwitterSubject(String twitterSubject) {
        _twitterSubject = twitterSubject;
    }

    @JSON
    @Override
    public String getFacebookDescription() {
        if (_facebookDescription == null) {
            return StringPool.BLANK;
        } else {
            return _facebookDescription;
        }
    }

    @Override
    public void setFacebookDescription(String facebookDescription) {
        _facebookDescription = facebookDescription;
    }

    @JSON
    @Override
    public String getFacebookSubject() {
        if (_facebookSubject == null) {
            return StringPool.BLANK;
        } else {
            return _facebookSubject;
        }
    }

    @Override
    public void setFacebookSubject(String facebookSubject) {
        _facebookSubject = facebookSubject;
    }

    @JSON
    @Override
    public boolean getEnabled() {
        return _enabled;
    }

    @Override
    public boolean isEnabled() {
        return _enabled;
    }

    @Override
    public void setEnabled(boolean enabled) {
        _columnBitmask |= ENABLED_COLUMN_BITMASK;

        if (!_setOriginalEnabled) {
            _setOriginalEnabled = true;

            _originalEnabled = _enabled;
        }

        _enabled = enabled;
    }

    public boolean getOriginalEnabled() {
        return _originalEnabled;
    }

    public long getColumnBitmask() {
        return _columnBitmask;
    }

    @Override
    public ExpandoBridge getExpandoBridge() {
        return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
            BalloonText.class.getName(), getPrimaryKey());
    }

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
        ExpandoBridge expandoBridge = getExpandoBridge();

        expandoBridge.setAttributes(serviceContext);
    }

    @Override
    public BalloonText toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (BalloonText) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        BalloonTextImpl balloonTextImpl = new BalloonTextImpl();

        balloonTextImpl.setId(getId());
        balloonTextImpl.setName(getName());
        balloonTextImpl.setTextBeforeForm(getTextBeforeForm());
        balloonTextImpl.setTextAfterForm(getTextAfterForm());
        balloonTextImpl.setTextBeforeShareButtons(getTextBeforeShareButtons());
        balloonTextImpl.setTextAfterShareButtons(getTextAfterShareButtons());
        balloonTextImpl.setAcceptTosText(getAcceptTosText());
        balloonTextImpl.setEmailTemplate(getEmailTemplate());
        balloonTextImpl.setEmailSubjectTemplate(getEmailSubjectTemplate());
        balloonTextImpl.setTwitterDescription(getTwitterDescription());
        balloonTextImpl.setTwitterSubject(getTwitterSubject());
        balloonTextImpl.setFacebookDescription(getFacebookDescription());
        balloonTextImpl.setFacebookSubject(getFacebookSubject());
        balloonTextImpl.setEnabled(getEnabled());

        balloonTextImpl.resetOriginalValues();

        return balloonTextImpl;
    }

    @Override
    public int compareTo(BalloonText balloonText) {
        long primaryKey = balloonText.getPrimaryKey();

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

        if (!(obj instanceof BalloonText)) {
            return false;
        }

        BalloonText balloonText = (BalloonText) obj;

        long primaryKey = balloonText.getPrimaryKey();

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
        BalloonTextModelImpl balloonTextModelImpl = this;

        balloonTextModelImpl._originalEnabled = balloonTextModelImpl._enabled;

        balloonTextModelImpl._setOriginalEnabled = false;

        balloonTextModelImpl._columnBitmask = 0;
    }

    @Override
    public CacheModel<BalloonText> toCacheModel() {
        BalloonTextCacheModel balloonTextCacheModel = new BalloonTextCacheModel();

        balloonTextCacheModel.id = getId();

        balloonTextCacheModel.name = getName();

        String name = balloonTextCacheModel.name;

        if ((name != null) && (name.length() == 0)) {
            balloonTextCacheModel.name = null;
        }

        balloonTextCacheModel.textBeforeForm = getTextBeforeForm();

        String textBeforeForm = balloonTextCacheModel.textBeforeForm;

        if ((textBeforeForm != null) && (textBeforeForm.length() == 0)) {
            balloonTextCacheModel.textBeforeForm = null;
        }

        balloonTextCacheModel.textAfterForm = getTextAfterForm();

        String textAfterForm = balloonTextCacheModel.textAfterForm;

        if ((textAfterForm != null) && (textAfterForm.length() == 0)) {
            balloonTextCacheModel.textAfterForm = null;
        }

        balloonTextCacheModel.textBeforeShareButtons = getTextBeforeShareButtons();

        String textBeforeShareButtons = balloonTextCacheModel.textBeforeShareButtons;

        if ((textBeforeShareButtons != null) &&
                (textBeforeShareButtons.length() == 0)) {
            balloonTextCacheModel.textBeforeShareButtons = null;
        }

        balloonTextCacheModel.textAfterShareButtons = getTextAfterShareButtons();

        String textAfterShareButtons = balloonTextCacheModel.textAfterShareButtons;

        if ((textAfterShareButtons != null) &&
                (textAfterShareButtons.length() == 0)) {
            balloonTextCacheModel.textAfterShareButtons = null;
        }

        balloonTextCacheModel.acceptTosText = getAcceptTosText();

        String acceptTosText = balloonTextCacheModel.acceptTosText;

        if ((acceptTosText != null) && (acceptTosText.length() == 0)) {
            balloonTextCacheModel.acceptTosText = null;
        }

        balloonTextCacheModel.emailTemplate = getEmailTemplate();

        String emailTemplate = balloonTextCacheModel.emailTemplate;

        if ((emailTemplate != null) && (emailTemplate.length() == 0)) {
            balloonTextCacheModel.emailTemplate = null;
        }

        balloonTextCacheModel.emailSubjectTemplate = getEmailSubjectTemplate();

        String emailSubjectTemplate = balloonTextCacheModel.emailSubjectTemplate;

        if ((emailSubjectTemplate != null) &&
                (emailSubjectTemplate.length() == 0)) {
            balloonTextCacheModel.emailSubjectTemplate = null;
        }

        balloonTextCacheModel.twitterDescription = getTwitterDescription();

        String twitterDescription = balloonTextCacheModel.twitterDescription;

        if ((twitterDescription != null) && (twitterDescription.length() == 0)) {
            balloonTextCacheModel.twitterDescription = null;
        }

        balloonTextCacheModel.twitterSubject = getTwitterSubject();

        String twitterSubject = balloonTextCacheModel.twitterSubject;

        if ((twitterSubject != null) && (twitterSubject.length() == 0)) {
            balloonTextCacheModel.twitterSubject = null;
        }

        balloonTextCacheModel.facebookDescription = getFacebookDescription();

        String facebookDescription = balloonTextCacheModel.facebookDescription;

        if ((facebookDescription != null) &&
                (facebookDescription.length() == 0)) {
            balloonTextCacheModel.facebookDescription = null;
        }

        balloonTextCacheModel.facebookSubject = getFacebookSubject();

        String facebookSubject = balloonTextCacheModel.facebookSubject;

        if ((facebookSubject != null) && (facebookSubject.length() == 0)) {
            balloonTextCacheModel.facebookSubject = null;
        }

        balloonTextCacheModel.enabled = getEnabled();

        return balloonTextCacheModel;
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(29);

        sb.append("{id=");
        sb.append(getId());
        sb.append(", name=");
        sb.append(getName());
        sb.append(", textBeforeForm=");
        sb.append(getTextBeforeForm());
        sb.append(", textAfterForm=");
        sb.append(getTextAfterForm());
        sb.append(", textBeforeShareButtons=");
        sb.append(getTextBeforeShareButtons());
        sb.append(", textAfterShareButtons=");
        sb.append(getTextAfterShareButtons());
        sb.append(", acceptTosText=");
        sb.append(getAcceptTosText());
        sb.append(", emailTemplate=");
        sb.append(getEmailTemplate());
        sb.append(", emailSubjectTemplate=");
        sb.append(getEmailSubjectTemplate());
        sb.append(", twitterDescription=");
        sb.append(getTwitterDescription());
        sb.append(", twitterSubject=");
        sb.append(getTwitterSubject());
        sb.append(", facebookDescription=");
        sb.append(getFacebookDescription());
        sb.append(", facebookSubject=");
        sb.append(getFacebookSubject());
        sb.append(", enabled=");
        sb.append(getEnabled());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(46);

        sb.append("<model><model-name>");
        sb.append("com.ext.portlet.model.BalloonText");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>id</column-name><column-value><![CDATA[");
        sb.append(getId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>name</column-name><column-value><![CDATA[");
        sb.append(getName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>textBeforeForm</column-name><column-value><![CDATA[");
        sb.append(getTextBeforeForm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>textAfterForm</column-name><column-value><![CDATA[");
        sb.append(getTextAfterForm());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>textBeforeShareButtons</column-name><column-value><![CDATA[");
        sb.append(getTextBeforeShareButtons());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>textAfterShareButtons</column-name><column-value><![CDATA[");
        sb.append(getTextAfterShareButtons());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>acceptTosText</column-name><column-value><![CDATA[");
        sb.append(getAcceptTosText());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emailTemplate</column-name><column-value><![CDATA[");
        sb.append(getEmailTemplate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>emailSubjectTemplate</column-name><column-value><![CDATA[");
        sb.append(getEmailSubjectTemplate());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>twitterDescription</column-name><column-value><![CDATA[");
        sb.append(getTwitterDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>twitterSubject</column-name><column-value><![CDATA[");
        sb.append(getTwitterSubject());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>facebookDescription</column-name><column-value><![CDATA[");
        sb.append(getFacebookDescription());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>facebookSubject</column-name><column-value><![CDATA[");
        sb.append(getFacebookSubject());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>enabled</column-name><column-value><![CDATA[");
        sb.append(getEnabled());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
