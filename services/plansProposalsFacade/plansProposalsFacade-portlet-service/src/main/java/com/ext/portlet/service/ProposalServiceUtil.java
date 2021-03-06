package com.ext.portlet.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableService;

/**
 * Provides the remote service utility for Proposal. This utility wraps
 * {@link com.ext.portlet.service.impl.ProposalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see ProposalService
 * @see com.ext.portlet.service.base.ProposalServiceBaseImpl
 * @see com.ext.portlet.service.impl.ProposalServiceImpl
 * @generated
 */
public class ProposalServiceUtil {
    private static ProposalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.service.impl.ProposalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    /**
    * This method returns the index of the latest version of a proposal within a given contestPhaseId
    *
    * @param contestPhaseId    The ID of the contest phase
    * @param proposalId        The ID of the proposal
    * @return The index of the latest version in a list of all versions of the proposal
    * @throws PortalException
    * @throws SystemException
    */
    public static com.liferay.portal.kernel.json.JSONObject getProposalVersionFirstIndex(
        long contestPhaseId, long proposalId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getProposalVersionFirstIndex(contestPhaseId, proposalId);
    }

    /**
    * This method returns the index of the passed version of a proposal
    *
    * @param version           The proposal version
    * @param proposalId        The ID of the proposal
    * @return The index of the latest version in a list of all versions of the proposal
    * @throws PortalException
    * @throws SystemException
    */
    public static com.liferay.portal.kernel.json.JSONObject getProposalVersionIndex(
        long version, long proposalId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getProposalVersionIndex(version, proposalId);
    }

    /**
    * @param contestPhaseId ID of contest phase or -1 for general query
    * @param proposalId
    * @param start
    * @param end
    * @return
    * @throws PortalException
    * @throws SystemException
    */
    public static com.liferay.portal.kernel.json.JSONObject getProposalVersions(
        long contestId, long contestPhaseId, long proposalId, int start, int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getProposalVersions(contestId, contestPhaseId, proposalId,
            start, end);
    }

    public static com.liferay.portal.kernel.json.JSONObject getProposalVersions(
        long proposalId, int start, int end)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getProposalVersions(proposalId, start, end);
    }

    public static com.liferay.portal.kernel.json.JSONArray getProposalContestSections(
        long proposalId, int version, long contestId)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .getProposalContestSections(proposalId, version, contestId);
    }

    public static void clearService() {
        _service = null;
    }

    public static ProposalService getService() {
        if (_service == null) {
            InvokableService invokableService = (InvokableService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    ProposalService.class.getName());

            if (invokableService instanceof ProposalService) {
                _service = (ProposalService) invokableService;
            } else {
                _service = new ProposalServiceClp(invokableService);
            }

            ReferenceRegistry.registerReference(ProposalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(ProposalService service) {
    }
}
