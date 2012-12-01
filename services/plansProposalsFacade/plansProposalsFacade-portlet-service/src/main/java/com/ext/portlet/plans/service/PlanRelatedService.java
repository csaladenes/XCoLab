package com.ext.portlet.plans.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * The interface for the plan related remote service.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanRelatedServiceUtil
 * @see com.ext.portlet.plans.service.base.PlanRelatedServiceBaseImpl
 * @see com.ext.portlet.plans.service.impl.PlanRelatedServiceImpl
 * @generated
 */
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface PlanRelatedService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PlanRelatedServiceUtil} to access the plan related remote service. Add custom service methods to {@link com.ext.portlet.plans.service.impl.PlanRelatedServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
}