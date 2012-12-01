package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlansFilterPosition;
import com.ext.portlet.plans.service.PlansFilterPositionLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlansFilterPosition service. Represents a row in the &quot;Plans_PlansFilterPosition&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlansFilterPositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlansFilterPositionImpl
 * @see com.ext.portlet.plans.model.PlansFilterPosition
 * @generated
 */
public abstract class PlansFilterPositionBaseImpl
    extends PlansFilterPositionModelImpl implements PlansFilterPosition {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plans filter position model instance should use the {@link PlansFilterPosition} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlansFilterPositionLocalServiceUtil.addPlansFilterPosition(this);
        } else {
            PlansFilterPositionLocalServiceUtil.updatePlansFilterPosition(this);
        }
    }
}