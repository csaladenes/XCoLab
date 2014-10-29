package org.xcolab.portlets.userprofile2;

import com.ext.portlet.model.StaffMember;
import com.ext.portlet.service.StaffMemberLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.User;
import com.liferay.portal.util.PortalUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("view")
public class UserProfileController {
    @RequestMapping
    public String showProfileDetails(@RequestParam(required = false) final String userId, PortletRequest request, PortletResponse response, Model model) throws SystemException, PortalException {
        User currentUser = PortalUtil.getUser(request);
        Map<String,String> requestParams = new HashMap<>();
        //requestParams.put("userId", userId.toString());
        UserProfileBean userProfileBean = new UserProfileBean(currentUser, requestParams);
        model.addAttribute("userProfileBean", userProfileBean);
        model.addAttribute("currentUser", userProfileBean.getCurrentUser());
        model.addAttribute("userSubscriptionsBean", userProfileBean.getSubscriptionsBean());

        //return the name of the view to be rendered
        return "profile-details";
    }
}
