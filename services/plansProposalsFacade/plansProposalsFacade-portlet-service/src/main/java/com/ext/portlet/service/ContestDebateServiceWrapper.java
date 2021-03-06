package com.ext.portlet.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ContestDebateService}.
 *
 * @author Brian Wing Shun Chan
 * @see ContestDebateService
 * @generated
 */
public class ContestDebateServiceWrapper implements ContestDebateService,
    ServiceWrapper<ContestDebateService> {
    private ContestDebateService _contestDebateService;

    public ContestDebateServiceWrapper(
        ContestDebateService contestDebateService) {
        _contestDebateService = contestDebateService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _contestDebateService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _contestDebateService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _contestDebateService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public ContestDebateService getWrappedContestDebateService() {
        return _contestDebateService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedContestDebateService(
        ContestDebateService contestDebateService) {
        _contestDebateService = contestDebateService;
    }

    @Override
    public ContestDebateService getWrappedService() {
        return _contestDebateService;
    }

    @Override
    public void setWrappedService(ContestDebateService contestDebateService) {
        _contestDebateService = contestDebateService;
    }
}
