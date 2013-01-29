package com.ext.portlet.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Contest service. Represents a row in the &quot;xcolab_Contest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.model.impl.ContestModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.model.impl.ContestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Contest
 * @see com.ext.portlet.model.impl.ContestImpl
 * @see com.ext.portlet.model.impl.ContestModelImpl
 * @generated
 */
public interface ContestModel extends BaseModel<Contest> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a contest model instance should use the {@link Contest} interface instead.
     */

    /**
     * Returns the primary key of this contest.
     *
     * @return the primary key of this contest
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this contest.
     *
     * @param primaryKey the primary key of this contest
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the contest p k of this contest.
     *
     * @return the contest p k of this contest
     */
    public long getContestPK();

    /**
     * Sets the contest p k of this contest.
     *
     * @param ContestPK the contest p k of this contest
     */
    public void setContestPK(long ContestPK);

    /**
     * Returns the contest name of this contest.
     *
     * @return the contest name of this contest
     */
    @AutoEscape
    public String getContestName();

    /**
     * Sets the contest name of this contest.
     *
     * @param ContestName the contest name of this contest
     */
    public void setContestName(String ContestName);

    /**
     * Returns the contest short name of this contest.
     *
     * @return the contest short name of this contest
     */
    @AutoEscape
    public String getContestShortName();

    /**
     * Sets the contest short name of this contest.
     *
     * @param ContestShortName the contest short name of this contest
     */
    public void setContestShortName(String ContestShortName);

    /**
     * Returns the contest description of this contest.
     *
     * @return the contest description of this contest
     */
    @AutoEscape
    public String getContestDescription();

    /**
     * Sets the contest description of this contest.
     *
     * @param ContestDescription the contest description of this contest
     */
    public void setContestDescription(String ContestDescription);

    /**
     * Returns the contest model description of this contest.
     *
     * @return the contest model description of this contest
     */
    @AutoEscape
    public String getContestModelDescription();

    /**
     * Sets the contest model description of this contest.
     *
     * @param ContestModelDescription the contest model description of this contest
     */
    public void setContestModelDescription(String ContestModelDescription);

    /**
     * Returns the contest positions description of this contest.
     *
     * @return the contest positions description of this contest
     */
    @AutoEscape
    public String getContestPositionsDescription();

    /**
     * Sets the contest positions description of this contest.
     *
     * @param ContestPositionsDescription the contest positions description of this contest
     */
    public void setContestPositionsDescription(
        String ContestPositionsDescription);

    /**
     * Returns the default plan description of this contest.
     *
     * @return the default plan description of this contest
     */
    @AutoEscape
    public String getDefaultPlanDescription();

    /**
     * Sets the default plan description of this contest.
     *
     * @param defaultPlanDescription the default plan description of this contest
     */
    public void setDefaultPlanDescription(String defaultPlanDescription);

    /**
     * Returns the plan type ID of this contest.
     *
     * @return the plan type ID of this contest
     */
    public long getPlanTypeId();

    /**
     * Sets the plan type ID of this contest.
     *
     * @param PlanTypeId the plan type ID of this contest
     */
    public void setPlanTypeId(long PlanTypeId);

    /**
     * Returns the created of this contest.
     *
     * @return the created of this contest
     */
    public Date getCreated();

    /**
     * Sets the created of this contest.
     *
     * @param created the created of this contest
     */
    public void setCreated(Date created);

    /**
     * Returns the updated of this contest.
     *
     * @return the updated of this contest
     */
    public Date getUpdated();

    /**
     * Sets the updated of this contest.
     *
     * @param updated the updated of this contest
     */
    public void setUpdated(Date updated);

    /**
     * Returns the author ID of this contest.
     *
     * @return the author ID of this contest
     */
    public long getAuthorId();

    /**
     * Sets the author ID of this contest.
     *
     * @param authorId the author ID of this contest
     */
    public void setAuthorId(long authorId);

    /**
     * Returns the contest active of this contest.
     *
     * @return the contest active of this contest
     */
    public boolean getContestActive();

    /**
     * Returns <code>true</code> if this contest is contest active.
     *
     * @return <code>true</code> if this contest is contest active; <code>false</code> otherwise
     */
    public boolean isContestActive();

    /**
     * Sets whether this contest is contest active.
     *
     * @param contestActive the contest active of this contest
     */
    public void setContestActive(boolean contestActive);

    /**
     * Returns the plan template ID of this contest.
     *
     * @return the plan template ID of this contest
     */
    public long getPlanTemplateId();

    /**
     * Sets the plan template ID of this contest.
     *
     * @param planTemplateId the plan template ID of this contest
     */
    public void setPlanTemplateId(long planTemplateId);

    /**
     * Returns the focus area ID of this contest.
     *
     * @return the focus area ID of this contest
     */
    public long getFocusAreaId();

    /**
     * Sets the focus area ID of this contest.
     *
     * @param focusAreaId the focus area ID of this contest
     */
    public void setFocusAreaId(long focusAreaId);

    /**
     * Returns the contest logo ID of this contest.
     *
     * @return the contest logo ID of this contest
     */
    public long getContestLogoId();

    /**
     * Sets the contest logo ID of this contest.
     *
     * @param contestLogoId the contest logo ID of this contest
     */
    public void setContestLogoId(long contestLogoId);

    /**
     * Returns the featured of this contest.
     *
     * @return the featured of this contest
     */
    public boolean getFeatured();

    /**
     * Returns <code>true</code> if this contest is featured.
     *
     * @return <code>true</code> if this contest is featured; <code>false</code> otherwise
     */
    public boolean isFeatured();

    /**
     * Sets whether this contest is featured.
     *
     * @param featured the featured of this contest
     */
    public void setFeatured(boolean featured);

    /**
     * Returns the plans open by default of this contest.
     *
     * @return the plans open by default of this contest
     */
    public boolean getPlansOpenByDefault();

    /**
     * Returns <code>true</code> if this contest is plans open by default.
     *
     * @return <code>true</code> if this contest is plans open by default; <code>false</code> otherwise
     */
    public boolean isPlansOpenByDefault();

    /**
     * Sets whether this contest is plans open by default.
     *
     * @param plansOpenByDefault the plans open by default of this contest
     */
    public void setPlansOpenByDefault(boolean plansOpenByDefault);

    /**
     * Returns the flag of this contest.
     *
     * @return the flag of this contest
     */
    public int getFlag();

    /**
     * Sets the flag of this contest.
     *
     * @param flag the flag of this contest
     */
    public void setFlag(int flag);

    /**
     * Returns the flag text of this contest.
     *
     * @return the flag text of this contest
     */
    @AutoEscape
    public String getFlagText();

    /**
     * Sets the flag text of this contest.
     *
     * @param flagText the flag text of this contest
     */
    public void setFlagText(String flagText);

    /**
     * Returns the flag tooltip of this contest.
     *
     * @return the flag tooltip of this contest
     */
    @AutoEscape
    public String getFlagTooltip();

    /**
     * Sets the flag tooltip of this contest.
     *
     * @param flagTooltip the flag tooltip of this contest
     */
    public void setFlagTooltip(String flagTooltip);

    /**
     * Returns the group ID of this contest.
     *
     * @return the group ID of this contest
     */
    public long getGroupId();

    /**
     * Sets the group ID of this contest.
     *
     * @param groupId the group ID of this contest
     */
    public void setGroupId(long groupId);

    /**
     * Returns the discussion group ID of this contest.
     *
     * @return the discussion group ID of this contest
     */
    public long getDiscussionGroupId();

    /**
     * Sets the discussion group ID of this contest.
     *
     * @param discussionGroupId the discussion group ID of this contest
     */
    public void setDiscussionGroupId(long discussionGroupId);

    /**
     * Returns the weight of this contest.
     *
     * @return the weight of this contest
     */
    public int getWeight();

    /**
     * Sets the weight of this contest.
     *
     * @param weight the weight of this contest
     */
    public void setWeight(int weight);

    /**
     * Returns the resources url of this contest.
     *
     * @return the resources url of this contest
     */
    @AutoEscape
    public String getResourcesUrl();

    /**
     * Sets the resources url of this contest.
     *
     * @param resourcesUrl the resources url of this contest
     */
    public void setResourcesUrl(String resourcesUrl);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(Contest contest);

    public int hashCode();

    public CacheModel<Contest> toCacheModel();

    public Contest toEscapedModel();

    public String toString();

    public String toXmlString();
}