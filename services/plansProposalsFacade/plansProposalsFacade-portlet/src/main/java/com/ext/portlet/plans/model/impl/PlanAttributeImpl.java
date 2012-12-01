package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.PlanConstants.Attribute;
import com.ext.portlet.plans.TypedValueConverter;

/**
 * The extended model implementation for the PlanAttribute service. Represents a row in the &quot;plansProposalsFacade_PlanAttribute&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * Helper methods and all application logic should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.plans.model.PlanAttribute} interface.
 * </p>
 *
 * @author Brian Wing Shun Chan
 */
public class PlanAttributeImpl extends PlanAttributeBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this class directly. All methods that expect a plan attribute model instance should use the {@link com.ext.portlet.plans.model.PlanAttribute} interface instead.
     */

    private Object typedValue;
    
    public PlanAttributeImpl() {
    }
    
    public Object getTypedValue() {
        if (typedValue != null) {
            return typedValue;
        }
        Attribute attribute = Attribute.valueOf(getAttributeName());
        typedValue = TypedValueConverter.getValue(attribute.getAttributeClass(), getAttributeValue());
        return typedValue;
    }
    
    @Override
    public void setAttributeValue(String attributeValue) {
        typedValue = null;
        super.setAttributeValue(attributeValue);
    }
}