package com.ext.portlet.service.base;

import com.ext.portlet.service.PlansUserSettingsServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlansUserSettingsServiceClpInvoker {
    private String _methodName462;
    private String[] _methodParameterTypes462;
    private String _methodName463;
    private String[] _methodParameterTypes463;

    public PlansUserSettingsServiceClpInvoker() {
        _methodName462 = "getBeanIdentifier";

        _methodParameterTypes462 = new String[] {  };

        _methodName463 = "setBeanIdentifier";

        _methodParameterTypes463 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName462.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes462, parameterTypes)) {
            return PlansUserSettingsServiceUtil.getBeanIdentifier();
        }

        if (_methodName463.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes463, parameterTypes)) {
            PlansUserSettingsServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
