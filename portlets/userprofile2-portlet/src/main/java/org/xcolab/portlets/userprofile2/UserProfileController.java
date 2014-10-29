package org.xcolab.portlets.userprofile2;

import com.ext.portlet.model.StaffMember;
import com.ext.portlet.service.StaffMemberLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("view")
public class UserProfileController {
    @RequestMapping
    public String showProfileDetails(PortletRequest request, PortletResponse response, @RequestParam Map<String, String> requestParams, Model model) throws SystemException, PortalException {
        User currentUser = PortalUtil.getUser(request);
        UserProfileBean userProfileBean = new UserProfileBean(currentUser, requestParams);
        model.addAttribute("userProfileBean", userProfileBean);
        model.addAttribute("currentUser", userProfileBean.getCurrentUser());
        model.addAttribute("userSubscriptionsBean", userProfileBean.getSubscriptionsBean());

        //return the name of the view to be rendered
        return "profile-details";
    }
}
