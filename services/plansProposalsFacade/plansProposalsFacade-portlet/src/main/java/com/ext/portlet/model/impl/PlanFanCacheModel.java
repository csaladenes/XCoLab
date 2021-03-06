package com.ext.portlet.model.impl;

import com.ext.portlet.model.PlanFan;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing PlanFan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see PlanFan
 * @generated
 */
public class PlanFanCacheModel implements CacheModel<PlanFan>, Externalizable {
    public long id;
    public long userId;
    public long planId;
    public long created;
    public long deleted;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(11);

        sb.append("{id=");
        sb.append(id);
        sb.append(", userId=");
        sb.append(userId);
        sb.append(", planId=");
        sb.append(planId);
        sb.append(", created=");
        sb.append(created);
        sb.append(", deleted=");
        sb.append(deleted);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public PlanFan toEntityModel() {
        PlanFanImpl planFanImpl = new PlanFanImpl();

        planFanImpl.setId(id);
        planFanImpl.setUserId(userId);
        planFanImpl.setPlanId(planId);

        if (created == Long.MIN_VALUE) {
            planFanImpl.setCreated(null);
        } else {
            planFanImpl.setCreated(new Date(created));
        }

        if (deleted == Long.MIN_VALUE) {
            planFanImpl.setDeleted(null);
        } else {
            planFanImpl.setDeleted(new Date(deleted));
        }

        planFanImpl.resetOriginalValues();

        return planFanImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        id = objectInput.readLong();
        userId = objectInput.readLong();
        planId = objectInput.readLong();
        created = objectInput.readLong();
        deleted = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(id);
        objectOutput.writeLong(userId);
        objectOutput.writeLong(planId);
        objectOutput.writeLong(created);
        objectOutput.writeLong(deleted);
    }
}
