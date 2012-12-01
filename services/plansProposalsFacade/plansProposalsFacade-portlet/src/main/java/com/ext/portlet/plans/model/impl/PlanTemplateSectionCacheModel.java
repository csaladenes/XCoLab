package com.ext.portlet.plans.model.impl;

import com.ext.portlet.plans.model.PlanTemplateSection;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing PlanTemplateSection in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PlanTemplateSection
 * @generated
 */
public class PlanTemplateSectionCacheModel implements CacheModel<PlanTemplateSection>,
    Serializable {
    public Long planTemplateId;
    public Long planSectionId;
    public Integer weight;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{planTemplateId=");
        sb.append(planTemplateId);
        sb.append(", planSectionId=");
        sb.append(planSectionId);
        sb.append(", weight=");
        sb.append(weight);
        sb.append("}");

        return sb.toString();
    }

    public PlanTemplateSection toEntityModel() {
        PlanTemplateSectionImpl planTemplateSectionImpl = new PlanTemplateSectionImpl();

        planTemplateSectionImpl.setPlanTemplateId(planTemplateId);
        planTemplateSectionImpl.setPlanSectionId(planSectionId);
        planTemplateSectionImpl.setWeight(weight);

        planTemplateSectionImpl.resetOriginalValues();

        return planTemplateSectionImpl;
    }
}