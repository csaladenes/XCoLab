package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlansFilter;
import com.ext.portlet.plans.service.PlansFilterLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlansFilter service. Represents a row in the &quot;Plans_PlansFilter&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlansFilterImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlansFilterImpl
 * @see com.ext.portlet.plans.model.PlansFilter
 * @generated
 */
public abstract class PlansFilterBaseImpl extends PlansFilterModelImpl
    implements PlansFilter {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plans filter model instance should use the {@link PlansFilter} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlansFilterLocalServiceUtil.addPlansFilter(this);
        } else {
            PlansFilterLocalServiceUtil.updatePlansFilter(this);
        }
    }
}