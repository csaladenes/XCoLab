package com.ext.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link OntologySpaceLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see OntologySpaceLocalService
 * @generated
 */
public class OntologySpaceLocalServiceWrapper
    implements OntologySpaceLocalService,
        ServiceWrapper<OntologySpaceLocalService> {
    private OntologySpaceLocalService _ontologySpaceLocalService;

    public OntologySpaceLocalServiceWrapper(
        OntologySpaceLocalService ontologySpaceLocalService) {
        _ontologySpaceLocalService = ontologySpaceLocalService;
    }

    /**
    * Adds the ontology space to the database. Also notifies the appropriate model listeners.
    *
    * @param ontologySpace the ontology space
    * @return the ontology space that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.OntologySpace addOntologySpace(
        com.ext.portlet.model.OntologySpace ontologySpace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.addOntologySpace(ontologySpace);
    }

    /**
    * Creates a new ontology space with the primary key. Does not add the ontology space to the database.
    *
    * @param id the primary key for the new ontology space
    * @return the new ontology space
    */
    @Override
    public com.ext.portlet.model.OntologySpace createOntologySpace(long id) {
        return _ontologySpaceLocalService.createOntologySpace(id);
    }

    /**
    * Deletes the ontology space with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the ontology space
    * @return the ontology space that was removed
    * @throws PortalException if a ontology space with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.OntologySpace deleteOntologySpace(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.deleteOntologySpace(id);
    }

    /**
    * Deletes the ontology space from the database. Also notifies the appropriate model listeners.
    *
    * @param ontologySpace the ontology space
    * @return the ontology space that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.OntologySpace deleteOntologySpace(
        com.ext.portlet.model.OntologySpace ontologySpace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.deleteOntologySpace(ontologySpace);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _ontologySpaceLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.OntologySpaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.OntologySpaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.dynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.dynamicQueryCount(dynamicQuery,
            projection);
    }

    @Override
    public com.ext.portlet.model.OntologySpace fetchOntologySpace(long id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.fetchOntologySpace(id);
    }

    /**
    * Returns the ontology space with the primary key.
    *
    * @param id the primary key of the ontology space
    * @return the ontology space
    * @throws PortalException if a ontology space with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.OntologySpace getOntologySpace(long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.getOntologySpace(id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the ontology spaces.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.OntologySpaceModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of ontology spaces
    * @param end the upper bound of the range of ontology spaces (not inclusive)
    * @return the range of ontology spaces
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<com.ext.portlet.model.OntologySpace> getOntologySpaces(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.getOntologySpaces(start, end);
    }

    /**
    * Returns the number of ontology spaces.
    *
    * @return the number of ontology spaces
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getOntologySpacesCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.getOntologySpacesCount();
    }

    /**
    * Updates the ontology space in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ontologySpace the ontology space
    * @return the ontology space that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public com.ext.portlet.model.OntologySpace updateOntologySpace(
        com.ext.portlet.model.OntologySpace ontologySpace)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.updateOntologySpace(ontologySpace);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ontologySpaceLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ontologySpaceLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ontologySpaceLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    @Override
    public com.ext.portlet.model.OntologySpace createSpace(
        java.lang.String name, java.lang.String description)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.createSpace(name, description);
    }

    @Override
    public void store(com.ext.portlet.model.OntologySpace space)
        throws com.liferay.portal.kernel.exception.SystemException {
        _ontologySpaceLocalService.store(space);
    }

    @Override
    public com.ext.portlet.model.OntologyTerm getTopTerm(
        com.ext.portlet.model.OntologySpace space)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ontologySpaceLocalService.getTopTerm(space);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public OntologySpaceLocalService getWrappedOntologySpaceLocalService() {
        return _ontologySpaceLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedOntologySpaceLocalService(
        OntologySpaceLocalService ontologySpaceLocalService) {
        _ontologySpaceLocalService = ontologySpaceLocalService;
    }

    @Override
    public OntologySpaceLocalService getWrappedService() {
        return _ontologySpaceLocalService;
    }

    @Override
    public void setWrappedService(
        OntologySpaceLocalService ontologySpaceLocalService) {
        _ontologySpaceLocalService = ontologySpaceLocalService;
    }
}
