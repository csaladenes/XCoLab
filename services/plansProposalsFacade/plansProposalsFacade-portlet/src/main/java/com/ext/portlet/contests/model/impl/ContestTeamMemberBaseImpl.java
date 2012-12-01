package com.ext.portlet.contests.model.impl;

import com.ext.portlet.contests.model.ContestTeamMember;
import com.ext.portlet.contests.service.ContestTeamMemberLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the ContestTeamMember service. Represents a row in the &quot;Contests_ContestTeamMember&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContestTeamMemberImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContestTeamMemberImpl
 * @see com.ext.portlet.contests.model.ContestTeamMember
 * @generated
 */
public abstract class ContestTeamMemberBaseImpl
    extends ContestTeamMemberModelImpl implements ContestTeamMember {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a contest team member model instance should use the {@link ContestTeamMember} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContestTeamMemberLocalServiceUtil.addContestTeamMember(this);
        } else {
            ContestTeamMemberLocalServiceUtil.updateContestTeamMember(this);
        }
    }
}