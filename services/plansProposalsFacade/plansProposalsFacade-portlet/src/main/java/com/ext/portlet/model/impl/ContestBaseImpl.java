package com.ext.portlet.model.impl;

import com.ext.portlet.model.Contest;
import com.ext.portlet.service.ContestLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the Contest service. Represents a row in the &quot;xcolab_Contest&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ContestImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ContestImpl
 * @see com.ext.portlet.model.Contest
 * @generated
 */
public abstract class ContestBaseImpl extends ContestModelImpl
    implements Contest {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a contest model instance should use the {@link Contest} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ContestLocalServiceUtil.addContest(this);
        } else {
            ContestLocalServiceUtil.updateContest(this);
        }
    }
}
