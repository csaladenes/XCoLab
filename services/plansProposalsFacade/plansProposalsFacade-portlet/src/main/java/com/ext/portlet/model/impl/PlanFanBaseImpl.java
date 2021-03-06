package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanFan;
import com.ext.portlet.service.PlanFanLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanFan service. Represents a row in the &quot;xcolab_PlanFan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanFanImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanFanImpl
 * @see com.ext.portlet.model.PlanFan
 * @generated
 */
public abstract class PlanFanBaseImpl extends PlanFanModelImpl
    implements PlanFan {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan fan model instance should use the {@link PlanFan} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanFanLocalServiceUtil.addPlanFan(this);
        } else {
            PlanFanLocalServiceUtil.updatePlanFan(this);
        }
    }
}
