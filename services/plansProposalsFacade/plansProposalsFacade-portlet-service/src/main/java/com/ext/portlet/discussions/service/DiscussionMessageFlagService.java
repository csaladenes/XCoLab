package com.ext.portlet.discussions.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.jsonwebservice.JSONWebService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Transactional;

/**
 * The interface for the discussion message flag remote service.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DiscussionMessageFlagServiceUtil
 * @see com.ext.portlet.discussions.service.base.DiscussionMessageFlagServiceBaseImpl
 * @see com.ext.portlet.discussions.service.impl.DiscussionMessageFlagServiceImpl
 * @generated
 */
@JSONWebService
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
    PortalException.class, SystemException.class}
)
public interface DiscussionMessageFlagService {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link DiscussionMessageFlagServiceUtil} to access the discussion message flag remote service. Add custom service methods to {@link com.ext.portlet.discussions.service.impl.DiscussionMessageFlagServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
     */
}