package com.ext.portlet.ontology.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the OntologySpace service. Represents a row in the &quot;ontology_OntologySpace&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ext.portlet.ontology.model.impl.OntologySpaceModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ext.portlet.ontology.model.impl.OntologySpaceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OntologySpace
 * @see com.ext.portlet.ontology.model.impl.OntologySpaceImpl
 * @see com.ext.portlet.ontology.model.impl.OntologySpaceModelImpl
 * @generated
 */
public interface OntologySpaceModel extends BaseModel<OntologySpace> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a ontology space model instance should use the {@link OntologySpace} interface instead.
     */

    /**
     * Returns the primary key of this ontology space.
     *
     * @return the primary key of this ontology space
     */
    public Long getPrimaryKey();

    /**
     * Sets the primary key of this ontology space.
     *
     * @param primaryKey the primary key of this ontology space
     */
    public void setPrimaryKey(Long primaryKey);

    /**
     * Returns the ID of this ontology space.
     *
     * @return the ID of this ontology space
     */
    public Long getId();

    /**
     * Sets the ID of this ontology space.
     *
     * @param id the ID of this ontology space
     */
    public void setId(Long id);

    /**
     * Returns the name of this ontology space.
     *
     * @return the name of this ontology space
     */
    @AutoEscape
    public String getName();

    /**
     * Sets the name of this ontology space.
     *
     * @param name the name of this ontology space
     */
    public void setName(String name);

    /**
     * Returns the description of this ontology space.
     *
     * @return the description of this ontology space
     */
    @AutoEscape
    public String getDescription();

    /**
     * Sets the description of this ontology space.
     *
     * @param description the description of this ontology space
     */
    public void setDescription(String description);

    public boolean isNew();

    public void setNew(boolean n);

    public boolean isCachedModel();

    public void setCachedModel(boolean cachedModel);

    public boolean isEscapedModel();

    public Serializable getPrimaryKeyObj();

    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    public ExpandoBridge getExpandoBridge();

    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    public Object clone();

    public int compareTo(OntologySpace ontologySpace);

    public int hashCode();

    public CacheModel<OntologySpace> toCacheModel();

    public OntologySpace toEscapedModel();

    public String toString();

    public String toXmlString();
}