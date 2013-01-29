package com.ext.portlet.model.impl;

import com.ext.portlet.model.OntologyTermEntity;
import com.ext.portlet.service.OntologyTermEntityLocalServiceUtil;

import com.liferay.portal.kernel.exception.SystemException;

/**
 * The extended model base implementation for the OntologyTermEntity service. Represents a row in the &quot;xcolab_OntologyTermEntity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OntologyTermEntityImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OntologyTermEntityImpl
 * @see com.ext.portlet.model.OntologyTermEntity
 * @generated
 */
public abstract class OntologyTermEntityBaseImpl
    extends OntologyTermEntityModelImpl implements OntologyTermEntity {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a ontology term entity model instance should use the {@link OntologyTermEntity} interface instead.
     */
    public void persist() throws SystemException {
        if (this.isNew()) {
            OntologyTermEntityLocalServiceUtil.addOntologyTermEntity(this);
        } else {
            OntologyTermEntityLocalServiceUtil.updateOntologyTermEntity(this);
        }
    }
}