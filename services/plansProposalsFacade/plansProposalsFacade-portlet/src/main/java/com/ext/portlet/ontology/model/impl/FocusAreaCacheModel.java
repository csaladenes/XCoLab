package com.ext.portlet.ontology.model.impl;

import com.ext.portlet.ontology.model.FocusArea;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing FocusArea in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see FocusArea
 * @generated
 */
public class FocusAreaCacheModel implements CacheModel<FocusArea>, Serializable {
    public Long id;
    public String name;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(5);

        sb.append("{id=");
        sb.append(id);
        sb.append(", name=");
        sb.append(name);
        sb.append("}");

        return sb.toString();
    }

    public FocusArea toEntityModel() {
        FocusAreaImpl focusAreaImpl = new FocusAreaImpl();

        focusAreaImpl.setId(id);

        if (name == null) {
            focusAreaImpl.setName(StringPool.BLANK);
        } else {
            focusAreaImpl.setName(name);
        }

        focusAreaImpl.resetOriginalValues();

        return focusAreaImpl;
    }
}