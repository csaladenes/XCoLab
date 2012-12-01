package com.ext.portlet.plans.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ClassLoaderProxy;
import com.liferay.portal.kernel.util.MethodCache;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * The utility for the plan attribute remote service. This utility wraps {@link com.ext.portlet.plans.service.impl.PlanAttributeServiceImpl} and is the primary access point for service operations in application layer code running on a remote server.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanAttributeService
 * @see com.ext.portlet.plans.service.base.PlanAttributeServiceBaseImpl
 * @see com.ext.portlet.plans.service.impl.PlanAttributeServiceImpl
 * @generated
 */
public class PlanAttributeServiceUtil {
    private static PlanAttributeService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link com.ext.portlet.plans.service.impl.PlanAttributeServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */
    public static void clearService() {
        _service = null;
    }

    public static PlanAttributeService getService() {
        if (_service == null) {
            Object object = PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    PlanAttributeService.class.getName());
            ClassLoader portletClassLoader = (ClassLoader) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    "portletClassLoader");

            ClassLoaderProxy classLoaderProxy = new ClassLoaderProxy(object,
                    PlanAttributeService.class.getName(), portletClassLoader);

            _service = new PlanAttributeServiceClp(classLoaderProxy);

            ClpSerializer.setClassLoader(portletClassLoader);

            ReferenceRegistry.registerReference(PlanAttributeServiceUtil.class,
                "_service");
            MethodCache.remove(PlanAttributeService.class);
        }

        return _service;
    }

    public void setService(PlanAttributeService service) {
        MethodCache.remove(PlanAttributeService.class);

        _service = service;

        ReferenceRegistry.registerReference(PlanAttributeServiceUtil.class,
            "_service");
        MethodCache.remove(PlanAttributeService.class);
    }
}