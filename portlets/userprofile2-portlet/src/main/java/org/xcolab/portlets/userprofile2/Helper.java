package org.xcolab.portlets.userprofile2;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.model.User;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.theme.ThemeDisplay;

import javax.portlet.PortletPreferences;
import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Helper {
    //public final static ThemeDisplay themeDisplay = getThemeDisplay();
    //public final static String portletId = themeDisplay.getPortletDisplay().getRootPortletId();
    //public final static long groupId = themeDisplay.getScopeGroupId();
    //public final static String primKey = themeDisplay.getPortletDisplay().getResourcePK();
    private static final String COLLAB_URL_PARAMETER_PREFIX = "_collab_param";



/*
    public static boolean isUserLoggedIn() {

        return getUserInfoMap() != null;
    }

    public static Object getLiferayUserInfo(String key) {
        return getUserInfoMap().get(key);
    }

    // The keys in the user info map are specific to Liferay
    public static String getLiferayUserId() {
        return (String) getLiferayUserInfo("liferay.user.id");
    }

    public static String getLiferayCompanyId() {
        return (String) getLiferayUserInfo("liferay.company.id");
    }

    public static String getLiferayUserEmail() {
        return getLiferayUser().getEmailAddress();
    }

    // Since the email is not in the user info map, we need to use
    // a Liferay API to get that information.
    /*public static User getLiferayUser() {
        try {
            return UserLocalServiceUtil.getUserById(Long.parseLong(getLiferayUserId()));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (PortalException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SystemException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }*/


    public static String getUrlParameterKey(String key) {
        return COLLAB_URL_PARAMETER_PREFIX + key;
    }

    public static boolean isUrlParameterKey(String key) {
        return key.startsWith(COLLAB_URL_PARAMETER_PREFIX);
    }

    public static String removeCollabPrefixFromParameterKey(String key) {
        return key.substring(COLLAB_URL_PARAMETER_PREFIX.length());
    }

    private final static String REQUEST_PARAM_NAME = "com.liferay.portal.kernel.servlet.PortletServletRequest";

    public static String filterLineBreaks(String content) {
        return content.replaceAll("\n", " <br />\n");
    }

    public static String filterLinkifyUrls(String content) {
        Pattern existingLinksPattern = Pattern.compile("(<a[^>]*>[^<]*</a>)|(\\[url=[^\\[]*\\[/url\\])");
        Matcher existingLinksMatcher = existingLinksPattern.matcher(content);
        
        List<Integer[]> linksBeginEnd = new ArrayList<Integer[]>(); 
        while (existingLinksMatcher.find()) {
            linksBeginEnd.add(new Integer[] {existingLinksMatcher.start(), existingLinksMatcher.end()});
        }
        

        Pattern pattern = Pattern.compile("(http://|www\\.)([{\\w-]*\\.)+\\w{1,4}([^\\s]*)");
        Matcher matcher = pattern.matcher(content);
        StringBuilder strBuilder = new StringBuilder();
        
        int lastIndex = 0;
        while (matcher.find()) {
            // check if this link isn't already part of existing <a href=...
            boolean partOfAnchor = false;
            for (Integer[] linkStartEnd: linksBeginEnd) {
                if (matcher.start() > linkStartEnd[0] && matcher.start() < linkStartEnd[1]) {
                    partOfAnchor = true;
                    break;
                }
            }
            if (partOfAnchor) {
                continue;
            }
            
            strBuilder.append(content.substring(lastIndex, matcher.start()));
            String url = content.substring(matcher.start(), matcher.end());
            strBuilder.append(createLink(url, url));
            
            strBuilder.append(content.substring(matcher.end(), matcher.end()));
            lastIndex = matcher.end();
        }
        

        strBuilder.append(content.substring(lastIndex));
        return strBuilder.toString();
    }
    

    private static String createLink(String url, String desc) {
        return createLink(url, desc, "");
    }

    private static String createLink(String url, String desc, String title) {
        if (! url.contains("http://")) {
            url = "http://" + url;
        }
        return "<a href='" + url + "' title='" + title + "' class='" + title + "'>" + desc + "</a>";
    }



}