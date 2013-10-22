<jsp:root xmlns:c="http://java.sun.com/jsp/jstl/core"
	xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:fn="http://java.sun.com/jsp/jstl/functions"
	xmlns:fmt="http://java.sun.com/jsp/jstl/fmt"
	xmlns:spring="http://www.springframework.org/tags"
	xmlns:form="http://www.springframework.org/tags/form"
	xmlns:f="http://java.sun.com/jsf/core"
	xmlns:liferay-faces="http://liferay.com/tld/faces"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:ui="http://java.sun.com/jsf/facelets"
	xmlns:ice="http://www.icesoft.com/icefaces/component"
	xmlns:portlet="http://java.sun.com/portlet_2_0" version="2.0">


	<portlet:actionURL var="createAccountURL">
		<portlet:param name="saveLastPath" value="${isRegistering ? 0 : 1 }" />
		<portlet:param name="isRegistering" value="true" />
		<portlet:param name="redirect" value="${redirect}" />
	</portlet:actionURL>
	<div class="popupreg_form">
		<div class="popupreg_head">
			<h1>Join the CoLab</h1>
		</div>

        <p><a href="https://www.regonline.com/builder/site/Default.aspx?EventID=1285844">To register for the Crowds &amp; Climate Conference, click here</a></p>
        
		<div class="is-required">
			<img src="/climatecolab-theme/images/reg-star.png" width="8"
				height="7" align="texttop" /> is a required field.
		</div>

		<c:if test="${ error != null and isRegistering }">
			<div class="error-message">${error}</div>
		</c:if>

		<form action="/loginregister-portlet/fileUploadServlet" method="post"
			enctype="multipart/form-data" target="_fileUploadFrame"
			id="fileUploadForm">
			<input type="file" name="file" id="portraitUploadInput" />
		</form>

		<form:form action="${createAccountURL }" commandName="createUserBean"
			id="registrationForm">
			<input type="hidden" name="action" value="add" />
			<div class="reg_errors"><!--  --></div>
			<form:errors cssClass="alert alert-error" />
			<table class="reg">
				<tr>
					<th nowrap="nowrap">Screen name <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:input cssClass="popupreg_input" path="screenName" /><br />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="screenName" />
						</div></td>

					<th class="second" rowspan="4">Photo</th>
					<td rowspan="4"><c:choose>
							<c:when test="${ imageId != null }">
								<img src="/image/contest?img_id=${imageId }" id="userPortrait"
									width="150" height="150" />
							</c:when>
							<c:otherwise>
								<img src="/image/user_male_portrait?img_id=" id="userPortrait"
									width="150" height="150" />
							</c:otherwise>
						</c:choose>

						<div id="uploadImageContainer"><!--  --></div></td>

				</tr>
				<tr>
					<th nowrap="nowrap">Email <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:input cssClass="popupreg_input" path="email" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="email" />
						</div>
                       <span style="color:#900;"> We require a valid email address in order to count your vote. </span>
                    </td>
				</tr>

				<tr>
					<th nowrap="nowrap">First name <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:input cssClass="popupreg_input" path="firstName" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="firstName" />
						</div></td>
				</tr>

				<tr>
					<th nowrap="nowrap">Last name <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:input cssClass="popupreg_input" path="lastName" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="lastName" />
						</div></td>
				</tr>

				<tr>
					<th nowrap="nowrap">Password <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:password cssClass="popupreg_input" path="password" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="password" />
						</div></td>
				</tr>


				<tr>
					<th nowrap="nowrap">Retype Password <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td><form:password cssClass="popupreg_input"
							path="retypePassword" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="retypePassword" />
						</div></td>

					<th class="second">Country</th>
					<td><form:input cssClass="popupreg_input" path="country" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="country" />
						</div></td>
				</tr>

				<tr>
					<th>Short Bio</th>
					<td colspan="3"><form:textarea
							cssClass="ckeditor shortBioContent" path="shortBio" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="shortBio" />
						</div></td>
				</tr>

				<tr>
					<th nowrap="nowrap">Retype the numbers <img
						src="/climatecolab-theme/images/reg-star.png" width="8" height="7"
						align="texttop" /></th>
					<td colspan="3">
						<portlet:resourceURL var="getCaptchaImage" id="ajaxHandler"/>
						<img src="${getCaptchaImage }" style="margin-bottom: 10px;"/><br />
						<form:input cssClass="popupreg_input" path="captchaText" />
						<div class="reg_errors"><!--  -->
							<form:errors cssClass="alert alert-error" path="captchaText" />
						</div>
					</td>
				</tr>

				<tr>
					<th nowrap="nowrap">Terms of use</th>
					<td class="popupreg_terms-right" colspan="3">By registering
						for this site, you agree to abide<br /> by the 
						<a href="/web/guest/resources/-/wiki/Main/Terms+of+use">Terms of Use</a>
					</td>
				</tr>
				<tr>
					<th></th>
					<td colspan="3">
						<div class="blue-button">
							<a href="javascript:;" onclick="pageTracker._trackPageview('/user/registerSubmit');updateTextarea();jQuery('#registrationForm').submit();">CREATE
								account</a>
						</div>
					</td>
				</tr>
			</table>
			<div class="clearfix">
				<!--  -->
			</div>

			<form:hidden id="userRegistrationImageId" path="imageId" />
		</form:form>
		<script type="text/javascript" src="/html/js/editor/ckeditor/ckeditor.js"><!-- --></script>
		<script>
			function updateTextarea() {
				for ( var instance in CKEDITOR.instances) {
					CKEDITOR.instances[instance].updateElement();
				}
			}
			updateTextarea();
		</script>


		<iframe name="_fileUploadFrame" id="fileUploadFrame" class="hidden"
			style="display: none;">
			<!-- comment -->
		</iframe>

		<script type="text/javascript">
			jQuery("#portraitUploadInput").change(function() {
				jQuery("#fileUploadForm").submit();
				jQuery("#userPortrait").block();

			});
			jQuery("#fileUploadFrame").load(
					function() {
						try {
							var response = eval("("
									+ jQuery(this).contents().text() + ")");
							
							jQuery("#userPortrait").attr("src",
									"/image/contest?img_id=" + response.imageId);
							jQuery("#userPortrait").unblock();
							jQuery("#userRegistrationImageId")
									.val(response.imageId);
						}
						catch (e) {
							// ignore
						}

					});

			function updateUploadBtnOffset() {
				var container = jQuery("#uploadImageContainer");
				var containerOffset = container.offset();
				

				jQuery("#portraitUploadInput").offset(containerOffset);
				
			}
			jQuery(function() {
				updateUploadBtnOffset();
				$(window).resize(updateUploadBtnOffset);
				
			});
			
			
		</script>



	</div>

</jsp:root>