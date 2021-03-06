package org.xcolab.portlets.proposals.requests;

import com.ext.portlet.service.ContestEmailTemplateLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;
import org.xcolab.portlets.proposals.wrappers.ContestEmailTemplateWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Manuel Thurner
 */
public class ContestEmailTemplateBean {
    protected Map<String, ContestEmailTemplateWrapper> emailTemplates;

    public ContestEmailTemplateBean(String[] templateNames, String proposalName, String contestName) throws SystemException {
        this.emailTemplates = new HashMap<String, ContestEmailTemplateWrapper>();
        for (String templateToLoad : templateNames) {
            emailTemplates.put(templateToLoad, new ContestEmailTemplateWrapper(
                    ContestEmailTemplateLocalServiceUtil.getEmailTemplateByType(templateToLoad),
                    proposalName,
                    contestName
            ));
        }
    }

    public Map<String, ContestEmailTemplateWrapper> getEmailTemplates() {
        return emailTemplates;
    }
}
