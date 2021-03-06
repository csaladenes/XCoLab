package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanTemplate;
import com.ext.portlet.service.PlanTemplateLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the PlanTemplate service. Represents a row in the &quot;xcolab_PlanTemplate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanTemplateImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplateImpl
 * @see com.ext.portlet.model.PlanTemplate
 * @generated
 */
public abstract class PlanTemplateBaseImpl extends PlanTemplateModelImpl
    implements PlanTemplate {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a plan template model instance should use the {@link PlanTemplate} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PlanTemplateLocalServiceUtil.addPlanTemplate(this);
        } else {
            PlanTemplateLocalServiceUtil.updatePlanTemplate(this);
        }
    }
}
