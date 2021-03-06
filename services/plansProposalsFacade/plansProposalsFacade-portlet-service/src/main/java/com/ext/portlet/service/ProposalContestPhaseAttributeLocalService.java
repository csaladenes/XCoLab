package com.ext.portlet.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * Provides the local service interface for ProposalContestPhaseAttribute. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ProposalContestPhaseAttributeLocalServiceUtil
 * @see com.ext.portlet.service.base.ProposalContestPhaseAttributeLocalServiceBaseImpl
 * @see com.ext.portlet.service.impl.ProposalContestPhaseAttributeLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface ProposalContestPhaseAttributeLocalService
    extends BaseLocalService, InvokableLocalService, PersistedModelLocalService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link ProposalContestPhaseAttributeLocalServiceUtil} to access the proposal contest phase attribute local service. Add custom service methods to {@link com.ext.portlet.service.impl.ProposalContestPhaseAttributeLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */

    /**
    * Adds the proposal contest phase attribute to the database. Also notifies the appropriate model listeners.
    *
    * @param proposalContestPhaseAttribute the proposal contest phase attribute
    * @return the proposal contest phase attribute that was added
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ProposalContestPhaseAttribute addProposalContestPhaseAttribute(
        com.ext.portlet.model.ProposalContestPhaseAttribute proposalContestPhaseAttribute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Creates a new proposal contest phase attribute with the primary key. Does not add the proposal contest phase attribute to the database.
    *
    * @param id the primary key for the new proposal contest phase attribute
    * @return the new proposal contest phase attribute
    */
    public com.ext.portlet.model.ProposalContestPhaseAttribute createProposalContestPhaseAttribute(
        long id);

    /**
    * Deletes the proposal contest phase attribute with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param id the primary key of the proposal contest phase attribute
    * @return the proposal contest phase attribute that was removed
    * @throws PortalException if a proposal contest phase attribute with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ProposalContestPhaseAttribute deleteProposalContestPhaseAttribute(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Deletes the proposal contest phase attribute from the database. Also notifies the appropriate model listeners.
    *
    * @param proposalContestPhaseAttribute the proposal contest phase attribute
    * @return the proposal contest phase attribute that was removed
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ProposalContestPhaseAttribute deleteProposalContestPhaseAttribute(
        com.ext.portlet.model.ProposalContestPhaseAttribute proposalContestPhaseAttribute)
        throws com.liferay.portal.kernel.exception.SystemException;

    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalContestPhaseAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalContestPhaseAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.model.ProposalContestPhaseAttribute fetchProposalContestPhaseAttribute(
        long id) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the proposal contest phase attribute with the primary key.
    *
    * @param id the primary key of the proposal contest phase attribute
    * @return the proposal contest phase attribute
    * @throws PortalException if a proposal contest phase attribute with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.model.ProposalContestPhaseAttribute getProposalContestPhaseAttribute(
        long id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    @Override
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the proposal contest phase attributes.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.ext.portlet.model.impl.ProposalContestPhaseAttributeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of proposal contest phase attributes
    * @param end the upper bound of the range of proposal contest phase attributes (not inclusive)
    * @return the range of proposal contest phase attributes
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.ext.portlet.model.ProposalContestPhaseAttribute> getProposalContestPhaseAttributes(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of proposal contest phase attributes.
    *
    * @return the number of proposal contest phase attributes
    * @throws SystemException if a system exception occurred
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public int getProposalContestPhaseAttributesCount()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Updates the proposal contest phase attribute in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param proposalContestPhaseAttribute the proposal contest phase attribute
    * @return the proposal contest phase attribute that was updated
    * @throws SystemException if a system exception occurred
    */
    public com.ext.portlet.model.ProposalContestPhaseAttribute updateProposalContestPhaseAttribute(
        com.ext.portlet.model.ProposalContestPhaseAttribute proposalContestPhaseAttribute)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public java.lang.String getBeanIdentifier();

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public void setBeanIdentifier(java.lang.String beanIdentifier);

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable;

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public boolean isAttributeSetAndTrue(long proposalId, long contestPhaseId,
        java.lang.String attributeName, long additionalId)
        throws com.liferay.portal.kernel.exception.SystemException;

    public boolean persistAttribute(long proposalId, long contestPhaseId,
        java.lang.String attributeName, long additionalId, long numericValue);

    public boolean persistAttribute(long proposalId, long contestPhaseId,
        java.lang.String attributeName, long additionalId,
        java.lang.String stringValue);

    public boolean persistSelectedJudgesAttribute(long proposalId,
        long contestPhaseId, java.util.List<java.lang.Long> selectedJudges);

    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.model.ProposalContestPhaseAttribute getOrCreateAttribute(
        long proposalId, long contestPhaseId, java.lang.String attributeName,
        long additionalId);

    /**
    * <p>Returns list of proposal phase attributes associated with given proposal in context of a phase</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a phase
    * @return list of proposal phase attributes
    * @throws SystemException in case of LR error
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.ext.portlet.model.ProposalContestPhaseAttribute> getProposalContestPhaseAttributes(
        long proposalId, long contestPhaseId)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Returns a proposal phase attribute by attributeName associated with given proposal in context of a phase and additionalId</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a phase
    * @param attributeName name of attribute
    * @param additionalId additional id to find attribute
    * @return proposal phase attribute
    * @throws SystemException in case of LR error
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.model.ProposalContestPhaseAttribute getProposalContestPhaseAttribute(
        long proposalId, long contestPhaseId, java.lang.String attributeName,
        long additionalId)
        throws com.ext.portlet.NoSuchProposalContestPhaseAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Returns proposal phase attribute (if exists)</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a phase
    * @param attributeName name of an attribute
    * @return proposal phase attribute
    * @throws NoSuchProposalContestPhaseAttributeException if there is no attribute with given name
    * @throws SystemException in case of lr error
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public com.ext.portlet.model.ProposalContestPhaseAttribute getProposalContestPhaseAttribute(
        long proposalId, long contestPhaseId, java.lang.String attributeName)
        throws com.ext.portlet.NoSuchProposalContestPhaseAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Returns all contest phase attributes</p>
    *
    * @param contestPhaseId id of a phase
    * @return proposal phase attributes
    * @throws NoSuchProposalContestPhaseAttributeException if there is no attribute with given name
    * @throws SystemException in case of lr error
    */
    @Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
    public java.util.List<com.ext.portlet.model.ProposalContestPhaseAttribute> getAllContestPhaseAttributes(
        long contestPhaseId)
        throws com.ext.portlet.NoSuchProposalContestPhaseAttributeException,
            com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Sets numeric value for contest phase attribute, sets default values to other "values" - 0 and null where applicable</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a contest phase
    * @param attributeName name of an attribute
    * @param value value to be set
    * @throws SystemException in case of LR error
    */
    public void setProposalContestPhaseAttribute(long proposalId,
        long contestPhaseId, java.lang.String attributeName, long value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Sets string value for contest phase attribute, sets default values to other "values" - 0 and null where applicable</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a contest phase
    * @param attributeName name of an attribute
    * @param value value to be set
    * @throws SystemException in case of LR error
    */
    public void setProposalContestPhaseAttribute(long proposalId,
        long contestPhaseId, java.lang.String attributeName,
        java.lang.String value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Sets real value for contest phase attribute, sets default values to other "values" - 0 and null where applicable</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a contest phase
    * @param attributeName name of an attribute
    * @param value value to be set
    * @throws SystemException in case of LR error
    */
    public void setProposalContestPhaseAttribute(long proposalId,
        long contestPhaseId, java.lang.String attributeName, double value)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Sets values contest phase attribute</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a contest phase
    * @param attributeName name of an attribute
    * @throws SystemException in case of LR error
    */
    public void setProposalContestPhaseAttribute(long proposalId,
        long contestPhaseId, java.lang.String attributeName, long longValue,
        java.lang.String stringValue, double realValue)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * <p>Removes proposal phase attribute with given name</p>
    *
    * @param proposalId id of a proposal
    * @param contestPhaseId id of a contest phase
    * @param attributeName name of an attribute
    * @throws SystemException in case of LR error
    */
    public void deleteProposalContestPhaseAttribute(long proposalId,
        long contestPhaseId, java.lang.String attributeName)
        throws com.liferay.portal.kernel.exception.SystemException;
}
