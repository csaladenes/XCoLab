package com.ext.portlet.plans.service.persistence;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import java.io.Serializable;


public class PlanPositionItemPK implements Comparable<PlanPositionItemPK>,
    Serializable {
    public Long planPositionsId;
    public Long positionId;

    public PlanPositionItemPK() {
    }

    public PlanPositionItemPK(Long planPositionsId, Long positionId) {
        this.planPositionsId = planPositionsId;
        this.positionId = positionId;
    }

    public Long getPlanPositionsId() {
        return planPositionsId;
    }

    public void setPlanPositionsId(Long planPositionsId) {
        this.planPositionsId = planPositionsId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public int compareTo(PlanPositionItemPK pk) {
        if (pk == null) {
            return -1;
        }

        int value = 0;

        if (planPositionsId < pk.planPositionsId) {
            value = -1;
        } else if (planPositionsId > pk.planPositionsId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        if (positionId < pk.positionId) {
            value = -1;
        } else if (positionId > pk.positionId) {
            value = 1;
        } else {
            value = 0;
        }

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        PlanPositionItemPK pk = null;

        try {
            pk = (PlanPositionItemPK) obj;
        } catch (ClassCastException cce) {
            return false;
        }

        if ((planPositionsId == pk.planPositionsId) &&
                (positionId == pk.positionId)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (String.valueOf(planPositionsId) + String.valueOf(positionId)).hashCode();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(10);

        sb.append(StringPool.OPEN_CURLY_BRACE);

        sb.append("planPositionsId");
        sb.append(StringPool.EQUAL);
        sb.append(planPositionsId);

        sb.append(StringPool.COMMA);
        sb.append(StringPool.SPACE);
        sb.append("positionId");
        sb.append(StringPool.EQUAL);
        sb.append(positionId);

        sb.append(StringPool.CLOSE_CURLY_BRACE);

        return sb.toString();
    }
}