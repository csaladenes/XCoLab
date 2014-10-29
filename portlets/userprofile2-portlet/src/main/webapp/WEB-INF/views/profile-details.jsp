<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core"
          xmlns:jsp="http://java.sun.com/JSP/Page"
          xmlns:fn="http://java.sun.com/jsp/jstl/functions"
          xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
          xmlns:spring="http://www.springframework.org/tags"
          xmlns:form="http://www.springframework.org/tags/form"
          xmlns:collab="http://climatecolab.org/tags/collab_1.0"
          xmlns:liferay-ui="http://liferay.com/tld/ui"
          xmlns:portlet="http://java.sun.com/portlet_2_0" version="2.0">
<jsp:directive.include file="./init.jspx" />

    <script type="text/javascript">
        function clearSendMessageForm() {
            jQuery(
                    ".sendMessagePopup .popuplogin_input, .sendMessagePopup textarea")
                    .val('');
        }

        function lockSendMessageForm() {
            jQuery(".sendMessagePopup").block({
                message : "Sending message"
            });
        }

        function messageSent() {
            jQuery.growlUI('Message has been sent', '');
        }
        function limitExceeded() {
            jQuery.growlUI('Your daily message limit has been reached. Please try again tomorrow.', '');
        }

        <c:if test="${userprofileBean.messageSent}">
                messageSent();
        </c:if>
        <c:if test="${userprofileBean.limitExceeded}">
                limitExceeded();
        </c:if>

        function hideSendMessageForm() {
            jQuery(".sendMessagePopup").hide();
        }

        function showSendMessageForm() {
            clearSendMessageForm();
            jQuery(".sendMessagePopup").show();

        }

        function sendMessageFormValid() {
            var valid = true;
            clearSendMessageForm();
            var subj = jQuery(".sendMessage_subject");
            var msg = jQuery(".sendMessage_message");

            if (jQuery.trim(subj.val()) == '') {
                subj.parent().find(".error").show();
                valid = false;
            }

            if (jQuery.trim(msg.val()) == '') {
                msg.parent().find(".error").show();
                valid = false;
            }

            return valid;
        }

        function clearSendMessageForm() {
            jQuery(".sendMessagePopup .error").hide();
            jQuery(".sendMessage_subject .sendMessage_message").val('');
        }
    </script>

    <div id="bread" class="pro">
        <a href="/web/guest/community">Community</a> <img
            src="/climatecolab-theme/images/arrow.gif" width="8" height="8" /> <a
            href="/web/guest/members">Members</a> <img
            src="/climatecolab-theme/images/arrow.gif" width="8" height="8" /> <a
            href="/web/guest/member/-/member/userId/${currentUser.userId}">${currentUser.screenName}</a>
    </div>


    <div id="main"
         class="${userprofileBean.viewingOwnProfile ? '' : 'full'} userProfile">

        <div class="comm_member" style="margin-top: 0;">
            <c:if test="${currentUser.attendsConference}">
                <a href="/web/guest/conference2014" class="attendingConference"><img src="/climatecolab-theme/images/attending-conference.png" alt="Attends MIT Conference 2014"/></a>
            </c:if>

            <div class="badge-container">
                <c:forEach items="${userprofileBean.badges.badges}" var="badge">
                    <div class="badge-big badge-${badge.badgeType}">

                            <span class="badge-title">
                                <a href="/web/guest/plans/-/plans/contestId/${badge.contestId}/planId/${badge.planId}" style="${badge.badgeTitle.length() gt 8 ? 'top: 26px;' : ''};">${badge.badgeTitle}</a>
                            </span>

                        <div class="badge-text" style="${badge.badgeText.length() gt 15 ? 'font-size: 7px;' : ''}${fn:substring(badge.badgeText,0,6) eq 'Judges' ? 'width: 47px;' : ''}">${badge.badgeText.length() gt 13 ? badge.badgeText : ''}</div>
                        <span class="badge-year">${badge.badgeYear}</span>
                    </div>
                </c:forEach>
            </div>

            <div class="comm_member-photo">
                <img src="${currentUser.portrait}" width="150" height="150"
                     alt="${currentUser.realName}" />
            </div>
            <div class="comm_member-info" style="width:300px;">
                <table border="0" cellpadding="0" cellspacing="0"
                       class="colab members topInfo">
                    <tr>
                        <td colspan="2"><h2>Member Profile</h2></td>
                    </tr>
                    <tr>
                        <td class="memname">${currentUser.realName}</td>
                    </tr>
                    <tr>
                        <td>
                            <div class="role-indicator" style="margin-top: 5px;">
                                <div style="width: 16px">
                                    <img
                                            src="/climatecolab-theme/images/icon_mem-${currentUser.role.lowerCase}.png"
                                            width="16" height="16" />
                                </div>
                                ${currentUser.role.printName}
                            </div>
                        </td>
                    </tr>
                </table>

                <div class="memdiv" style="background-color:#707070;"></div>
                <table border="0" cellpadding="0" cellspacing="0"
                       class="colab members otherInfo" style="width:300px;">
                    <tr>
                        <td class="b" nowrap="nowrap" width="50%">Screen Name</td>
                        <td>${currentUser.screenName}</td>
                    </tr>
                    <tr>
                        <td class="b" nowrap="nowrap" width="50%">Member Since</td>
                        <td>
                            <fmt:formatDate value="${currentUser.joinDate}" type="date" dateStyle="short" timeZone="America/New_York" />
                        </td>
                    </tr>

                    <c:if test="${userprofileBean.viewingOwnProfile}">
                        <tr>
                            <td class="b" width="50%">Email</td>
                            <td width="50%">
                                <a href="mailto:${currentUser.email}">${currentUser.email}</a>
                                <c:if test="${userprofileBean.displayEMailErrorMessage}">
                                    <span class="iceMsgError portlet-msg-error Error form_error_messageError">Please update your email address. Only votes from members with valid email addresses will be counted. </span>
                                </c:if>
                            </td>
                        </tr>
                    </c:if>
                    <c:if test="${not empty currentUser.country}">
                        <tr>
                            <td class="b" width="50%">Country</td>
                            <td width="50%">${currentUser.country}</td>
                        </tr>
                    </c:if>
                    <tr>
                      <td colspan="2">
                        <c:if test="${userprofileBean.viewingOwnProfile}">
                            <a href="./${currentUser.userId}/page/edit">
                                Manage profile and settings &gt;&gt;
                            </a>
                        </c:if>
                        <c:if test="${not userprofileBean.viewingOwnProfile and userprofileBean.canSendMessage}">
                            <a style="margin-top: 6px; display: block;" href="javascript:;"
                               onclick="if (! deferUntilLogin()) { return false; } else { showSendMessageForm(); }">Send
                                <strong>${currentUser.firstName}</strong> a Message </a>
                        </c:if>
                      </td>
                    </tr>
                </table>
            </div>
            <div class="clearfix"></div>
        </div>
        <p>
            <c:out value="${currentUser.filteredAbout}"/>
        </p>

        <h2 style="margin-top: 20px;">Proposals</h2>

        <c:if test="${fn:length(currentUser.proposals) == 0}">
            ${currentUser.firstName} has not yet contributed to any Climate CoLab proposals.
        </c:if>
        <!--<ice:dataTable styleClass="colab" value="${currentUser.proposals}"
                       rowClasses="t,nt" var="proposal">
            <ice:column>
                <collab:planLink planId="${proposal.planId}"
                                 contestId="${proposal.contestId}"
                                 text="${proposal.proposalName}" />
            </ice:column>
            <ice:column style="text-align: right;">
                <ice:outputText value="${proposal.proposalCreationDate}">
                    <f:convertDateTime pattern="MM/dd/yy" locale="en_US"
                                       timeZone="America/New_York" />
                </ice:outputText>
            </ice:column>

        </ice:dataTable>-->

        <h2>Supporting</h2>
        <c:if test="${empty currentUser.supportedPlans}">
            ${currentUser.firstName} has not yet supported any Climate CoLab proposals.
        </c:if>
        <!--<ice:dataTable var="supportedPlan"
                       value="${currentUser.supportedPlans}" styleClass="colab"
                       rowClasses="t,nt">
            <ice:column>
                <collab:planLink planId="${supportedPlan.planId}"
                                 contestId="${supportedPlan.contestId}"
                                 text="${supportedPlan.planName}" />
            </ice:column>

            <ice:column style="text-align: right;">
                <ice:outputText value="${supportedPlan.createdDate}">
                    <f:convertDateTime pattern="MM/dd/yy" locale="en_US"
                                       timeZone="America/New_York" />
                </ice:outputText>
            </ice:column>

        </ice:dataTable>-->

        <h2 style="margin-top: 20px;">Activities</h2>

        <!--<ice:dataTable styleClass="colab" value="${currentUser.activities}"
                       rowClasses="t,nt" var="activity">
            <ice:column>
                <ice:outputText value="${activity.body}" escape="false" />
            </ice:column>
            <ice:column style="text-align: right;">
                <ice:outputText value="${activity.createdDate}">
                    <f:convertDateTime pattern="MM/dd/yy" locale="en_US"
                                       timeZone="America/New_York" />
                </ice:outputText>
            </ice:column>

        </ice:dataTable>-->
        <div class="blue-button">
            <a href="/web/guest/activities/-/feeds?userId=${currentUser.userId}">SEE
                ALL</a>
        </div>

    </div>
    <!-- /main -->

    <c:if test="${userprofileBean.viewingOwnProfile}">
        <div class="right_col3">
            <div class="comm_rightcol">
                <div class="comm_rightcol-title">INBOX</div>
                <c:if test="${empty userprofileBean.messages}">
                    <p>No new messages.</p>
                </c:if>

                <!--<ice:panelSeries rendered="${not empty userprofileBean.messages}"
                                 var="message" value="${userprofileBean.messages}">
                    <ice:panelGroup styleClass="comm_rightcol-time">
                        <ice:outputText value="Today" rendered="${message.daysAgo == 0}" />
                        <ice:outputText value="Yesterday"
                                        rendered="${message.daysAgo == 1}" />
                        <ice:outputText value="${message.daysAgo} days ago"
                                        rendered="${message.daysAgo > 1}" />&#160;
                        <ice:outputText value="${message.createDate}">
                            <f:convertDateTime pattern="hh:mm a" locale="en_US"
                                               timeZone="America/New_York" />
                        </ice:outputText>
                    </ice:panelGroup>
                    <ice:panelGroup styleClass="activityBody">
                        <collab:userLinkSimple text="${message.from.screenName}"
                                               userId="${message.from.userId}" />
                        sent you a message:&#160; <a
                            href="/web/guest/messaging?p_p_id=${userprofileBean.messagingPortletId}&amp;messageId=${message.messageId}">${message.subject}</a>
                    </ice:panelGroup>
                </ice:panelSeries>-->

                <div class="rounded_button brn">
                    <a href="/web/guest/messaging?p_p_id=${userprofileBean.messagingPortletId}&amp;compose=true">COMPOSE</a>
                </div>
                <div class="rounded_button brn">
                    <a href="/web/guest/messaging">ALL MESSAGES</a>
                </div>

                <div class="clearfix"></div>
            </div>

            <div class="comm_rightcol">
                <div class="comm_rightcol-title">SUBSCRIBED ACTIVITY</div>
                <c:if test="${empty userprofileBean.subscribedActivities}">
                    <p>No new activities.</p>
                </c:if>
                <!--<ice:panelSeries var="activity"
                                 value="${userprofileBean.subscribedActivities}"
                                 rendered="${not empty userprofileBean.subscribedActivities}"
                                 rows="5">
                    <ice:panelGroup styleClass="comm_rightcol-time">
                        <ice:outputText value="Today" rendered="${activity.daysAgo == 0}" nospan='true'/>
                        <ice:outputText value="Yesterday"
                                        rendered="${activity.daysAgo == 1}" nospan='true'/>
                        <ice:outputText value="${activity.daysAgo} days ago"
                                        rendered="${activity.daysAgo > 1}" nospan='true' />
                        &#160;
                        <ice:outputText value="${activity.createdDate}" nospan='true'>
                            <f:convertDateTime pattern="hh:mm a" locale="en_US"
                                               timeZone="America/New_York" />
                        </ice:outputText>
                    </ice:panelGroup>
                    <ice:outputText value="${activity.body}" escape="false" styleClass="activityBody"/>
                </ice:panelSeries>
                <ice:panelGroup styleClass="rounded_button brn">
                    <a href="./${currentUser.userId}/page/subscriptionsManage">MANAGE</a>
                </ice:panelGroup>
                <ice:panelGroup styleClass="rounded_button brn">
                    <f:subview
                            rendered="${not empty userprofileBean.subscribedActivities}">
                        <a href="./${currentUser.userId}/page/subscriptions">SEE ALL</a>
                    </f:subview>
                </ice:panelGroup>-->
            </div>
        </div>
    </c:if>

    <!-- /right_col -->




    <div id="sendMessageOverlay" class="sendMessagePopup"
         style="position: fixed; width: 100%; height: 100%; top: 0; left: 0; z-index: 100; display: none;">
        <div class="savechanges-wrap ">
            <div class="savechanges">
                <h4>Send <strong>${currentUser.realName}</strong> a message</h4>
                <!--<ice:panelGroup>
                    <ice:form>
                        <ice:panelGroup>
                            <p>
                                <strong>Subject:</strong> &#160; <span class="error hidden">
                                        * value required</span><br />
                                <ice:inputText styleClass="popuplogin_input sendMessage_subject"
                                               value="${userprofileBean.messageSubject}" />
                            </p>
                            <c:if test="${userprofileBean.messageHoneypotPosition eq 0}">
                                <p class="p">
                                    <strong>Leave this blank:</strong> &#160; <span class="error hidden">
                                        * value required</span><br />
                                    <ice:inputText value="${userprofileBean.messageHoneypot}"
                                                   styleClass="popuplogin_input sendMessage_subject" />
                                </p>
                            </c:if>
                            <p>
                                <strong>Message:</strong> &#160; <span class="error hidden">
                                        * value required</span><br />
                                <ice:inputTextarea value="${userprofileBean.messageText}"
                                                   styleClass="sendMessage_message" />
                            </p>
                            <c:if test="${userprofileBean.messageHoneypotPosition eq 1}">
                                <p class="p">
                                    <strong>Leave this blank:</strong> &#160; <span class="error hidden">
                                        * value required</span><br />
                                    <ice:inputText value="${userprofileBean.messageHoneypot}"
                                                   styleClass="popuplogin_input sendMessage_subject" />
                                </p>
                            </c:if>
                        </ice:panelGroup>
                        <ice:panelGroup styleClass="btns">
                            <div class="blue-button">
                                <ice:commandLink styleClass="popuplogin_submit" value="Send"
                                                 onclick="if (sendMessageFormValid()) { lockSendMessageForm(); } else { return false; }"
                                                 actionListener="${userprofileBean.sendMessage}" />
                            </div>
                            <div class="gray-button">
                                <a href="javascript:;"
                                   onclick="clearSendMessageForm(); hideSendMessageForm(); return false;">Cancel</a>
                            </div>
                        </ice:panelGroup>
                    </ice:form>

                </ice:panelGroup>-->

            </div>
            <!-- /popup login -->
            <div class="clearfix"></div>
        </div>
    </div>
</jsp:root>