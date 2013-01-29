package com.ext.portlet.service.base;

import com.ext.portlet.model.FocusAreaOntologyTerm;
import com.ext.portlet.service.ActivitySubscriptionLocalService;
import com.ext.portlet.service.ActivitySubscriptionService;
import com.ext.portlet.service.ContestDebateLocalService;
import com.ext.portlet.service.ContestDebateService;
import com.ext.portlet.service.ContestLocalService;
import com.ext.portlet.service.ContestPhaseColumnLocalService;
import com.ext.portlet.service.ContestPhaseColumnService;
import com.ext.portlet.service.ContestPhaseLocalService;
import com.ext.portlet.service.ContestPhaseService;
import com.ext.portlet.service.ContestPhaseTypeLocalService;
import com.ext.portlet.service.ContestPhaseTypeService;
import com.ext.portlet.service.ContestService;
import com.ext.portlet.service.ContestTeamMemberLocalService;
import com.ext.portlet.service.ContestTeamMemberService;
import com.ext.portlet.service.DiscussionCategoryGroupLocalService;
import com.ext.portlet.service.DiscussionCategoryGroupService;
import com.ext.portlet.service.DiscussionCategoryLocalService;
import com.ext.portlet.service.DiscussionCategoryService;
import com.ext.portlet.service.DiscussionMessageFlagLocalService;
import com.ext.portlet.service.DiscussionMessageFlagService;
import com.ext.portlet.service.DiscussionMessageLocalService;
import com.ext.portlet.service.DiscussionMessageService;
import com.ext.portlet.service.FocusAreaLocalService;
import com.ext.portlet.service.FocusAreaOntologyTermLocalService;
import com.ext.portlet.service.FocusAreaOntologyTermService;
import com.ext.portlet.service.FocusAreaService;
import com.ext.portlet.service.MessageLocalService;
import com.ext.portlet.service.MessageRecipientStatusLocalService;
import com.ext.portlet.service.MessageRecipientStatusService;
import com.ext.portlet.service.MessageService;
import com.ext.portlet.service.MessagingUserPreferencesLocalService;
import com.ext.portlet.service.MessagingUserPreferencesService;
import com.ext.portlet.service.ModelCategoryLocalService;
import com.ext.portlet.service.ModelCategoryService;
import com.ext.portlet.service.ModelDiscussionLocalService;
import com.ext.portlet.service.ModelDiscussionService;
import com.ext.portlet.service.ModelGlobalPreferenceLocalService;
import com.ext.portlet.service.ModelGlobalPreferenceService;
import com.ext.portlet.service.ModelInputGroupLocalService;
import com.ext.portlet.service.ModelInputGroupService;
import com.ext.portlet.service.ModelInputItemLocalService;
import com.ext.portlet.service.ModelInputItemService;
import com.ext.portlet.service.ModelOutputChartOrderLocalService;
import com.ext.portlet.service.ModelOutputChartOrderService;
import com.ext.portlet.service.ModelOutputItemLocalService;
import com.ext.portlet.service.ModelOutputItemService;
import com.ext.portlet.service.ModelPositionLocalService;
import com.ext.portlet.service.ModelPositionService;
import com.ext.portlet.service.OntologySpaceLocalService;
import com.ext.portlet.service.OntologySpaceService;
import com.ext.portlet.service.OntologyTermEntityLocalService;
import com.ext.portlet.service.OntologyTermEntityService;
import com.ext.portlet.service.OntologyTermLocalService;
import com.ext.portlet.service.OntologyTermService;
import com.ext.portlet.service.PlanAttributeFilterLocalService;
import com.ext.portlet.service.PlanAttributeFilterService;
import com.ext.portlet.service.PlanAttributeLocalService;
import com.ext.portlet.service.PlanAttributeService;
import com.ext.portlet.service.PlanColumnSettingsLocalService;
import com.ext.portlet.service.PlanColumnSettingsService;
import com.ext.portlet.service.PlanDescriptionLocalService;
import com.ext.portlet.service.PlanDescriptionService;
import com.ext.portlet.service.PlanFanLocalService;
import com.ext.portlet.service.PlanFanService;
import com.ext.portlet.service.PlanItemLocalService;
import com.ext.portlet.service.PlanItemService;
import com.ext.portlet.service.PlanMetaLocalService;
import com.ext.portlet.service.PlanMetaService;
import com.ext.portlet.service.PlanModelRunLocalService;
import com.ext.portlet.service.PlanModelRunService;
import com.ext.portlet.service.PlanPositionItemLocalService;
import com.ext.portlet.service.PlanPositionItemService;
import com.ext.portlet.service.PlanPositionLocalService;
import com.ext.portlet.service.PlanPositionService;
import com.ext.portlet.service.PlanPositionsLocalService;
import com.ext.portlet.service.PlanPositionsService;
import com.ext.portlet.service.PlanPropertyFilterLocalService;
import com.ext.portlet.service.PlanPropertyFilterService;
import com.ext.portlet.service.PlanRelatedLocalService;
import com.ext.portlet.service.PlanRelatedService;
import com.ext.portlet.service.PlanSectionDefinitionLocalService;
import com.ext.portlet.service.PlanSectionDefinitionService;
import com.ext.portlet.service.PlanSectionLocalService;
import com.ext.portlet.service.PlanSectionPlanMapLocalService;
import com.ext.portlet.service.PlanSectionPlanMapService;
import com.ext.portlet.service.PlanSectionService;
import com.ext.portlet.service.PlanTeamHistoryLocalService;
import com.ext.portlet.service.PlanTeamHistoryService;
import com.ext.portlet.service.PlanTemplateLocalService;
import com.ext.portlet.service.PlanTemplateSectionLocalService;
import com.ext.portlet.service.PlanTemplateSectionService;
import com.ext.portlet.service.PlanTemplateService;
import com.ext.portlet.service.PlanTypeAttributeLocalService;
import com.ext.portlet.service.PlanTypeAttributeService;
import com.ext.portlet.service.PlanTypeColumnLocalService;
import com.ext.portlet.service.PlanTypeColumnService;
import com.ext.portlet.service.PlanTypeLocalService;
import com.ext.portlet.service.PlanTypeService;
import com.ext.portlet.service.PlanVoteLocalService;
import com.ext.portlet.service.PlanVoteService;
import com.ext.portlet.service.PlansFilterLocalService;
import com.ext.portlet.service.PlansFilterPositionLocalService;
import com.ext.portlet.service.PlansFilterPositionService;
import com.ext.portlet.service.PlansFilterService;
import com.ext.portlet.service.PlansUserSettingsLocalService;
import com.ext.portlet.service.PlansUserSettingsService;
import com.ext.portlet.service.persistence.ActivitySubscriptionPersistence;
import com.ext.portlet.service.persistence.ContestDebatePersistence;
import com.ext.portlet.service.persistence.ContestPersistence;
import com.ext.portlet.service.persistence.ContestPhaseColumnPersistence;
import com.ext.portlet.service.persistence.ContestPhasePersistence;
import com.ext.portlet.service.persistence.ContestPhaseTypePersistence;
import com.ext.portlet.service.persistence.ContestTeamMemberPersistence;
import com.ext.portlet.service.persistence.DiscussionCategoryGroupPersistence;
import com.ext.portlet.service.persistence.DiscussionCategoryPersistence;
import com.ext.portlet.service.persistence.DiscussionMessageFlagPersistence;
import com.ext.portlet.service.persistence.DiscussionMessagePersistence;
import com.ext.portlet.service.persistence.FocusAreaOntologyTermPersistence;
import com.ext.portlet.service.persistence.FocusAreaPersistence;
import com.ext.portlet.service.persistence.MessagePersistence;
import com.ext.portlet.service.persistence.MessageRecipientStatusPersistence;
import com.ext.portlet.service.persistence.MessagingUserPreferencesPersistence;
import com.ext.portlet.service.persistence.ModelCategoryPersistence;
import com.ext.portlet.service.persistence.ModelDiscussionPersistence;
import com.ext.portlet.service.persistence.ModelGlobalPreferencePersistence;
import com.ext.portlet.service.persistence.ModelInputGroupPersistence;
import com.ext.portlet.service.persistence.ModelInputItemPersistence;
import com.ext.portlet.service.persistence.ModelOutputChartOrderPersistence;
import com.ext.portlet.service.persistence.ModelOutputItemPersistence;
import com.ext.portlet.service.persistence.ModelPositionPersistence;
import com.ext.portlet.service.persistence.OntologySpacePersistence;
import com.ext.portlet.service.persistence.OntologyTermEntityPersistence;
import com.ext.portlet.service.persistence.OntologyTermPersistence;
import com.ext.portlet.service.persistence.PlanAttributeFilterPersistence;
import com.ext.portlet.service.persistence.PlanAttributePersistence;
import com.ext.portlet.service.persistence.PlanColumnSettingsPersistence;
import com.ext.portlet.service.persistence.PlanDescriptionPersistence;
import com.ext.portlet.service.persistence.PlanFanPersistence;
import com.ext.portlet.service.persistence.PlanItemFinder;
import com.ext.portlet.service.persistence.PlanItemPersistence;
import com.ext.portlet.service.persistence.PlanMetaPersistence;
import com.ext.portlet.service.persistence.PlanModelRunPersistence;
import com.ext.portlet.service.persistence.PlanPositionItemPersistence;
import com.ext.portlet.service.persistence.PlanPositionPersistence;
import com.ext.portlet.service.persistence.PlanPositionsPersistence;
import com.ext.portlet.service.persistence.PlanPropertyFilterPersistence;
import com.ext.portlet.service.persistence.PlanRelatedPersistence;
import com.ext.portlet.service.persistence.PlanSectionDefinitionPersistence;
import com.ext.portlet.service.persistence.PlanSectionPersistence;
import com.ext.portlet.service.persistence.PlanSectionPlanMapPersistence;
import com.ext.portlet.service.persistence.PlanTeamHistoryPersistence;
import com.ext.portlet.service.persistence.PlanTemplatePersistence;
import com.ext.portlet.service.persistence.PlanTemplateSectionPersistence;
import com.ext.portlet.service.persistence.PlanTypeAttributePersistence;
import com.ext.portlet.service.persistence.PlanTypeColumnPersistence;
import com.ext.portlet.service.persistence.PlanTypePersistence;
import com.ext.portlet.service.persistence.PlanVotePersistence;
import com.ext.portlet.service.persistence.PlansFilterPersistence;
import com.ext.portlet.service.persistence.PlansFilterPositionPersistence;
import com.ext.portlet.service.persistence.PlansUserSettingsPersistence;

import com.liferay.counter.service.CounterLocalService;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ResourceLocalService;
import com.liferay.portal.service.ResourceService;
import com.liferay.portal.service.UserLocalService;
import com.liferay.portal.service.UserService;
import com.liferay.portal.service.base.PrincipalBean;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;

import javax.sql.DataSource;

/**
 * The base implementation of the focus area ontology term remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link com.ext.portlet.service.impl.FocusAreaOntologyTermServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.impl.FocusAreaOntologyTermServiceImpl
 * @see com.ext.portlet.service.FocusAreaOntologyTermServiceUtil
 * @generated
 */
public abstract class FocusAreaOntologyTermServiceBaseImpl extends PrincipalBean
    implements FocusAreaOntologyTermService, IdentifiableBean {
    @BeanReference(type = ActivitySubscriptionLocalService.class)
    protected ActivitySubscriptionLocalService activitySubscriptionLocalService;
    @BeanReference(type = ActivitySubscriptionService.class)
    protected ActivitySubscriptionService activitySubscriptionService;
    @BeanReference(type = ActivitySubscriptionPersistence.class)
    protected ActivitySubscriptionPersistence activitySubscriptionPersistence;
    @BeanReference(type = ContestLocalService.class)
    protected ContestLocalService contestLocalService;
    @BeanReference(type = ContestService.class)
    protected ContestService contestService;
    @BeanReference(type = ContestPersistence.class)
    protected ContestPersistence contestPersistence;
    @BeanReference(type = ContestDebateLocalService.class)
    protected ContestDebateLocalService contestDebateLocalService;
    @BeanReference(type = ContestDebateService.class)
    protected ContestDebateService contestDebateService;
    @BeanReference(type = ContestDebatePersistence.class)
    protected ContestDebatePersistence contestDebatePersistence;
    @BeanReference(type = ContestPhaseLocalService.class)
    protected ContestPhaseLocalService contestPhaseLocalService;
    @BeanReference(type = ContestPhaseService.class)
    protected ContestPhaseService contestPhaseService;
    @BeanReference(type = ContestPhasePersistence.class)
    protected ContestPhasePersistence contestPhasePersistence;
    @BeanReference(type = ContestPhaseColumnLocalService.class)
    protected ContestPhaseColumnLocalService contestPhaseColumnLocalService;
    @BeanReference(type = ContestPhaseColumnService.class)
    protected ContestPhaseColumnService contestPhaseColumnService;
    @BeanReference(type = ContestPhaseColumnPersistence.class)
    protected ContestPhaseColumnPersistence contestPhaseColumnPersistence;
    @BeanReference(type = ContestPhaseTypeLocalService.class)
    protected ContestPhaseTypeLocalService contestPhaseTypeLocalService;
    @BeanReference(type = ContestPhaseTypeService.class)
    protected ContestPhaseTypeService contestPhaseTypeService;
    @BeanReference(type = ContestPhaseTypePersistence.class)
    protected ContestPhaseTypePersistence contestPhaseTypePersistence;
    @BeanReference(type = ContestTeamMemberLocalService.class)
    protected ContestTeamMemberLocalService contestTeamMemberLocalService;
    @BeanReference(type = ContestTeamMemberService.class)
    protected ContestTeamMemberService contestTeamMemberService;
    @BeanReference(type = ContestTeamMemberPersistence.class)
    protected ContestTeamMemberPersistence contestTeamMemberPersistence;
    @BeanReference(type = DiscussionCategoryLocalService.class)
    protected DiscussionCategoryLocalService discussionCategoryLocalService;
    @BeanReference(type = DiscussionCategoryService.class)
    protected DiscussionCategoryService discussionCategoryService;
    @BeanReference(type = DiscussionCategoryPersistence.class)
    protected DiscussionCategoryPersistence discussionCategoryPersistence;
    @BeanReference(type = DiscussionCategoryGroupLocalService.class)
    protected DiscussionCategoryGroupLocalService discussionCategoryGroupLocalService;
    @BeanReference(type = DiscussionCategoryGroupService.class)
    protected DiscussionCategoryGroupService discussionCategoryGroupService;
    @BeanReference(type = DiscussionCategoryGroupPersistence.class)
    protected DiscussionCategoryGroupPersistence discussionCategoryGroupPersistence;
    @BeanReference(type = DiscussionMessageLocalService.class)
    protected DiscussionMessageLocalService discussionMessageLocalService;
    @BeanReference(type = DiscussionMessageService.class)
    protected DiscussionMessageService discussionMessageService;
    @BeanReference(type = DiscussionMessagePersistence.class)
    protected DiscussionMessagePersistence discussionMessagePersistence;
    @BeanReference(type = DiscussionMessageFlagLocalService.class)
    protected DiscussionMessageFlagLocalService discussionMessageFlagLocalService;
    @BeanReference(type = DiscussionMessageFlagService.class)
    protected DiscussionMessageFlagService discussionMessageFlagService;
    @BeanReference(type = DiscussionMessageFlagPersistence.class)
    protected DiscussionMessageFlagPersistence discussionMessageFlagPersistence;
    @BeanReference(type = FocusAreaLocalService.class)
    protected FocusAreaLocalService focusAreaLocalService;
    @BeanReference(type = FocusAreaService.class)
    protected FocusAreaService focusAreaService;
    @BeanReference(type = FocusAreaPersistence.class)
    protected FocusAreaPersistence focusAreaPersistence;
    @BeanReference(type = FocusAreaOntologyTermLocalService.class)
    protected FocusAreaOntologyTermLocalService focusAreaOntologyTermLocalService;
    @BeanReference(type = FocusAreaOntologyTermService.class)
    protected FocusAreaOntologyTermService focusAreaOntologyTermService;
    @BeanReference(type = FocusAreaOntologyTermPersistence.class)
    protected FocusAreaOntologyTermPersistence focusAreaOntologyTermPersistence;
    @BeanReference(type = MessageLocalService.class)
    protected MessageLocalService messageLocalService;
    @BeanReference(type = MessageService.class)
    protected MessageService messageService;
    @BeanReference(type = MessagePersistence.class)
    protected MessagePersistence messagePersistence;
    @BeanReference(type = MessageRecipientStatusLocalService.class)
    protected MessageRecipientStatusLocalService messageRecipientStatusLocalService;
    @BeanReference(type = MessageRecipientStatusService.class)
    protected MessageRecipientStatusService messageRecipientStatusService;
    @BeanReference(type = MessageRecipientStatusPersistence.class)
    protected MessageRecipientStatusPersistence messageRecipientStatusPersistence;
    @BeanReference(type = MessagingUserPreferencesLocalService.class)
    protected MessagingUserPreferencesLocalService messagingUserPreferencesLocalService;
    @BeanReference(type = MessagingUserPreferencesService.class)
    protected MessagingUserPreferencesService messagingUserPreferencesService;
    @BeanReference(type = MessagingUserPreferencesPersistence.class)
    protected MessagingUserPreferencesPersistence messagingUserPreferencesPersistence;
    @BeanReference(type = ModelCategoryLocalService.class)
    protected ModelCategoryLocalService modelCategoryLocalService;
    @BeanReference(type = ModelCategoryService.class)
    protected ModelCategoryService modelCategoryService;
    @BeanReference(type = ModelCategoryPersistence.class)
    protected ModelCategoryPersistence modelCategoryPersistence;
    @BeanReference(type = ModelDiscussionLocalService.class)
    protected ModelDiscussionLocalService modelDiscussionLocalService;
    @BeanReference(type = ModelDiscussionService.class)
    protected ModelDiscussionService modelDiscussionService;
    @BeanReference(type = ModelDiscussionPersistence.class)
    protected ModelDiscussionPersistence modelDiscussionPersistence;
    @BeanReference(type = ModelGlobalPreferenceLocalService.class)
    protected ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService;
    @BeanReference(type = ModelGlobalPreferenceService.class)
    protected ModelGlobalPreferenceService modelGlobalPreferenceService;
    @BeanReference(type = ModelGlobalPreferencePersistence.class)
    protected ModelGlobalPreferencePersistence modelGlobalPreferencePersistence;
    @BeanReference(type = ModelInputGroupLocalService.class)
    protected ModelInputGroupLocalService modelInputGroupLocalService;
    @BeanReference(type = ModelInputGroupService.class)
    protected ModelInputGroupService modelInputGroupService;
    @BeanReference(type = ModelInputGroupPersistence.class)
    protected ModelInputGroupPersistence modelInputGroupPersistence;
    @BeanReference(type = ModelInputItemLocalService.class)
    protected ModelInputItemLocalService modelInputItemLocalService;
    @BeanReference(type = ModelInputItemService.class)
    protected ModelInputItemService modelInputItemService;
    @BeanReference(type = ModelInputItemPersistence.class)
    protected ModelInputItemPersistence modelInputItemPersistence;
    @BeanReference(type = ModelOutputChartOrderLocalService.class)
    protected ModelOutputChartOrderLocalService modelOutputChartOrderLocalService;
    @BeanReference(type = ModelOutputChartOrderService.class)
    protected ModelOutputChartOrderService modelOutputChartOrderService;
    @BeanReference(type = ModelOutputChartOrderPersistence.class)
    protected ModelOutputChartOrderPersistence modelOutputChartOrderPersistence;
    @BeanReference(type = ModelOutputItemLocalService.class)
    protected ModelOutputItemLocalService modelOutputItemLocalService;
    @BeanReference(type = ModelOutputItemService.class)
    protected ModelOutputItemService modelOutputItemService;
    @BeanReference(type = ModelOutputItemPersistence.class)
    protected ModelOutputItemPersistence modelOutputItemPersistence;
    @BeanReference(type = ModelPositionLocalService.class)
    protected ModelPositionLocalService modelPositionLocalService;
    @BeanReference(type = ModelPositionService.class)
    protected ModelPositionService modelPositionService;
    @BeanReference(type = ModelPositionPersistence.class)
    protected ModelPositionPersistence modelPositionPersistence;
    @BeanReference(type = OntologySpaceLocalService.class)
    protected OntologySpaceLocalService ontologySpaceLocalService;
    @BeanReference(type = OntologySpaceService.class)
    protected OntologySpaceService ontologySpaceService;
    @BeanReference(type = OntologySpacePersistence.class)
    protected OntologySpacePersistence ontologySpacePersistence;
    @BeanReference(type = OntologyTermLocalService.class)
    protected OntologyTermLocalService ontologyTermLocalService;
    @BeanReference(type = OntologyTermService.class)
    protected OntologyTermService ontologyTermService;
    @BeanReference(type = OntologyTermPersistence.class)
    protected OntologyTermPersistence ontologyTermPersistence;
    @BeanReference(type = OntologyTermEntityLocalService.class)
    protected OntologyTermEntityLocalService ontologyTermEntityLocalService;
    @BeanReference(type = OntologyTermEntityService.class)
    protected OntologyTermEntityService ontologyTermEntityService;
    @BeanReference(type = OntologyTermEntityPersistence.class)
    protected OntologyTermEntityPersistence ontologyTermEntityPersistence;
    @BeanReference(type = PlanAttributeLocalService.class)
    protected PlanAttributeLocalService planAttributeLocalService;
    @BeanReference(type = PlanAttributeService.class)
    protected PlanAttributeService planAttributeService;
    @BeanReference(type = PlanAttributePersistence.class)
    protected PlanAttributePersistence planAttributePersistence;
    @BeanReference(type = PlanAttributeFilterLocalService.class)
    protected PlanAttributeFilterLocalService planAttributeFilterLocalService;
    @BeanReference(type = PlanAttributeFilterService.class)
    protected PlanAttributeFilterService planAttributeFilterService;
    @BeanReference(type = PlanAttributeFilterPersistence.class)
    protected PlanAttributeFilterPersistence planAttributeFilterPersistence;
    @BeanReference(type = PlanColumnSettingsLocalService.class)
    protected PlanColumnSettingsLocalService planColumnSettingsLocalService;
    @BeanReference(type = PlanColumnSettingsService.class)
    protected PlanColumnSettingsService planColumnSettingsService;
    @BeanReference(type = PlanColumnSettingsPersistence.class)
    protected PlanColumnSettingsPersistence planColumnSettingsPersistence;
    @BeanReference(type = PlanDescriptionLocalService.class)
    protected PlanDescriptionLocalService planDescriptionLocalService;
    @BeanReference(type = PlanDescriptionService.class)
    protected PlanDescriptionService planDescriptionService;
    @BeanReference(type = PlanDescriptionPersistence.class)
    protected PlanDescriptionPersistence planDescriptionPersistence;
    @BeanReference(type = PlanFanLocalService.class)
    protected PlanFanLocalService planFanLocalService;
    @BeanReference(type = PlanFanService.class)
    protected PlanFanService planFanService;
    @BeanReference(type = PlanFanPersistence.class)
    protected PlanFanPersistence planFanPersistence;
    @BeanReference(type = PlanItemLocalService.class)
    protected PlanItemLocalService planItemLocalService;
    @BeanReference(type = PlanItemService.class)
    protected PlanItemService planItemService;
    @BeanReference(type = PlanItemPersistence.class)
    protected PlanItemPersistence planItemPersistence;
    @BeanReference(type = PlanItemFinder.class)
    protected PlanItemFinder planItemFinder;
    @BeanReference(type = PlanMetaLocalService.class)
    protected PlanMetaLocalService planMetaLocalService;
    @BeanReference(type = PlanMetaService.class)
    protected PlanMetaService planMetaService;
    @BeanReference(type = PlanMetaPersistence.class)
    protected PlanMetaPersistence planMetaPersistence;
    @BeanReference(type = PlanModelRunLocalService.class)
    protected PlanModelRunLocalService planModelRunLocalService;
    @BeanReference(type = PlanModelRunService.class)
    protected PlanModelRunService planModelRunService;
    @BeanReference(type = PlanModelRunPersistence.class)
    protected PlanModelRunPersistence planModelRunPersistence;
    @BeanReference(type = PlanPositionLocalService.class)
    protected PlanPositionLocalService planPositionLocalService;
    @BeanReference(type = PlanPositionService.class)
    protected PlanPositionService planPositionService;
    @BeanReference(type = PlanPositionPersistence.class)
    protected PlanPositionPersistence planPositionPersistence;
    @BeanReference(type = PlanPositionItemLocalService.class)
    protected PlanPositionItemLocalService planPositionItemLocalService;
    @BeanReference(type = PlanPositionItemService.class)
    protected PlanPositionItemService planPositionItemService;
    @BeanReference(type = PlanPositionItemPersistence.class)
    protected PlanPositionItemPersistence planPositionItemPersistence;
    @BeanReference(type = PlanPositionsLocalService.class)
    protected PlanPositionsLocalService planPositionsLocalService;
    @BeanReference(type = PlanPositionsService.class)
    protected PlanPositionsService planPositionsService;
    @BeanReference(type = PlanPositionsPersistence.class)
    protected PlanPositionsPersistence planPositionsPersistence;
    @BeanReference(type = PlanPropertyFilterLocalService.class)
    protected PlanPropertyFilterLocalService planPropertyFilterLocalService;
    @BeanReference(type = PlanPropertyFilterService.class)
    protected PlanPropertyFilterService planPropertyFilterService;
    @BeanReference(type = PlanPropertyFilterPersistence.class)
    protected PlanPropertyFilterPersistence planPropertyFilterPersistence;
    @BeanReference(type = PlanRelatedLocalService.class)
    protected PlanRelatedLocalService planRelatedLocalService;
    @BeanReference(type = PlanRelatedService.class)
    protected PlanRelatedService planRelatedService;
    @BeanReference(type = PlanRelatedPersistence.class)
    protected PlanRelatedPersistence planRelatedPersistence;
    @BeanReference(type = PlanSectionLocalService.class)
    protected PlanSectionLocalService planSectionLocalService;
    @BeanReference(type = PlanSectionService.class)
    protected PlanSectionService planSectionService;
    @BeanReference(type = PlanSectionPersistence.class)
    protected PlanSectionPersistence planSectionPersistence;
    @BeanReference(type = PlanSectionDefinitionLocalService.class)
    protected PlanSectionDefinitionLocalService planSectionDefinitionLocalService;
    @BeanReference(type = PlanSectionDefinitionService.class)
    protected PlanSectionDefinitionService planSectionDefinitionService;
    @BeanReference(type = PlanSectionDefinitionPersistence.class)
    protected PlanSectionDefinitionPersistence planSectionDefinitionPersistence;
    @BeanReference(type = PlanSectionPlanMapLocalService.class)
    protected PlanSectionPlanMapLocalService planSectionPlanMapLocalService;
    @BeanReference(type = PlanSectionPlanMapService.class)
    protected PlanSectionPlanMapService planSectionPlanMapService;
    @BeanReference(type = PlanSectionPlanMapPersistence.class)
    protected PlanSectionPlanMapPersistence planSectionPlanMapPersistence;
    @BeanReference(type = PlansFilterLocalService.class)
    protected PlansFilterLocalService plansFilterLocalService;
    @BeanReference(type = PlansFilterService.class)
    protected PlansFilterService plansFilterService;
    @BeanReference(type = PlansFilterPersistence.class)
    protected PlansFilterPersistence plansFilterPersistence;
    @BeanReference(type = PlansFilterPositionLocalService.class)
    protected PlansFilterPositionLocalService plansFilterPositionLocalService;
    @BeanReference(type = PlansFilterPositionService.class)
    protected PlansFilterPositionService plansFilterPositionService;
    @BeanReference(type = PlansFilterPositionPersistence.class)
    protected PlansFilterPositionPersistence plansFilterPositionPersistence;
    @BeanReference(type = PlansUserSettingsLocalService.class)
    protected PlansUserSettingsLocalService plansUserSettingsLocalService;
    @BeanReference(type = PlansUserSettingsService.class)
    protected PlansUserSettingsService plansUserSettingsService;
    @BeanReference(type = PlansUserSettingsPersistence.class)
    protected PlansUserSettingsPersistence plansUserSettingsPersistence;
    @BeanReference(type = PlanTeamHistoryLocalService.class)
    protected PlanTeamHistoryLocalService planTeamHistoryLocalService;
    @BeanReference(type = PlanTeamHistoryService.class)
    protected PlanTeamHistoryService planTeamHistoryService;
    @BeanReference(type = PlanTeamHistoryPersistence.class)
    protected PlanTeamHistoryPersistence planTeamHistoryPersistence;
    @BeanReference(type = PlanTemplateLocalService.class)
    protected PlanTemplateLocalService planTemplateLocalService;
    @BeanReference(type = PlanTemplateService.class)
    protected PlanTemplateService planTemplateService;
    @BeanReference(type = PlanTemplatePersistence.class)
    protected PlanTemplatePersistence planTemplatePersistence;
    @BeanReference(type = PlanTemplateSectionLocalService.class)
    protected PlanTemplateSectionLocalService planTemplateSectionLocalService;
    @BeanReference(type = PlanTemplateSectionService.class)
    protected PlanTemplateSectionService planTemplateSectionService;
    @BeanReference(type = PlanTemplateSectionPersistence.class)
    protected PlanTemplateSectionPersistence planTemplateSectionPersistence;
    @BeanReference(type = PlanTypeLocalService.class)
    protected PlanTypeLocalService planTypeLocalService;
    @BeanReference(type = PlanTypeService.class)
    protected PlanTypeService planTypeService;
    @BeanReference(type = PlanTypePersistence.class)
    protected PlanTypePersistence planTypePersistence;
    @BeanReference(type = PlanTypeAttributeLocalService.class)
    protected PlanTypeAttributeLocalService planTypeAttributeLocalService;
    @BeanReference(type = PlanTypeAttributeService.class)
    protected PlanTypeAttributeService planTypeAttributeService;
    @BeanReference(type = PlanTypeAttributePersistence.class)
    protected PlanTypeAttributePersistence planTypeAttributePersistence;
    @BeanReference(type = PlanTypeColumnLocalService.class)
    protected PlanTypeColumnLocalService planTypeColumnLocalService;
    @BeanReference(type = PlanTypeColumnService.class)
    protected PlanTypeColumnService planTypeColumnService;
    @BeanReference(type = PlanTypeColumnPersistence.class)
    protected PlanTypeColumnPersistence planTypeColumnPersistence;
    @BeanReference(type = PlanVoteLocalService.class)
    protected PlanVoteLocalService planVoteLocalService;
    @BeanReference(type = PlanVoteService.class)
    protected PlanVoteService planVoteService;
    @BeanReference(type = PlanVotePersistence.class)
    protected PlanVotePersistence planVotePersistence;
    @BeanReference(type = CounterLocalService.class)
    protected CounterLocalService counterLocalService;
    @BeanReference(type = ResourceLocalService.class)
    protected ResourceLocalService resourceLocalService;
    @BeanReference(type = ResourceService.class)
    protected ResourceService resourceService;
    @BeanReference(type = ResourcePersistence.class)
    protected ResourcePersistence resourcePersistence;
    @BeanReference(type = UserLocalService.class)
    protected UserLocalService userLocalService;
    @BeanReference(type = UserService.class)
    protected UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link com.ext.portlet.service.FocusAreaOntologyTermServiceUtil} to access the focus area ontology term remote service.
     */

    /**
     * Returns the activity subscription local service.
     *
     * @return the activity subscription local service
     */
    public ActivitySubscriptionLocalService getActivitySubscriptionLocalService() {
        return activitySubscriptionLocalService;
    }

    /**
     * Sets the activity subscription local service.
     *
     * @param activitySubscriptionLocalService the activity subscription local service
     */
    public void setActivitySubscriptionLocalService(
        ActivitySubscriptionLocalService activitySubscriptionLocalService) {
        this.activitySubscriptionLocalService = activitySubscriptionLocalService;
    }

    /**
     * Returns the activity subscription remote service.
     *
     * @return the activity subscription remote service
     */
    public ActivitySubscriptionService getActivitySubscriptionService() {
        return activitySubscriptionService;
    }

    /**
     * Sets the activity subscription remote service.
     *
     * @param activitySubscriptionService the activity subscription remote service
     */
    public void setActivitySubscriptionService(
        ActivitySubscriptionService activitySubscriptionService) {
        this.activitySubscriptionService = activitySubscriptionService;
    }

    /**
     * Returns the activity subscription persistence.
     *
     * @return the activity subscription persistence
     */
    public ActivitySubscriptionPersistence getActivitySubscriptionPersistence() {
        return activitySubscriptionPersistence;
    }

    /**
     * Sets the activity subscription persistence.
     *
     * @param activitySubscriptionPersistence the activity subscription persistence
     */
    public void setActivitySubscriptionPersistence(
        ActivitySubscriptionPersistence activitySubscriptionPersistence) {
        this.activitySubscriptionPersistence = activitySubscriptionPersistence;
    }

    /**
     * Returns the contest local service.
     *
     * @return the contest local service
     */
    public ContestLocalService getContestLocalService() {
        return contestLocalService;
    }

    /**
     * Sets the contest local service.
     *
     * @param contestLocalService the contest local service
     */
    public void setContestLocalService(ContestLocalService contestLocalService) {
        this.contestLocalService = contestLocalService;
    }

    /**
     * Returns the contest remote service.
     *
     * @return the contest remote service
     */
    public ContestService getContestService() {
        return contestService;
    }

    /**
     * Sets the contest remote service.
     *
     * @param contestService the contest remote service
     */
    public void setContestService(ContestService contestService) {
        this.contestService = contestService;
    }

    /**
     * Returns the contest persistence.
     *
     * @return the contest persistence
     */
    public ContestPersistence getContestPersistence() {
        return contestPersistence;
    }

    /**
     * Sets the contest persistence.
     *
     * @param contestPersistence the contest persistence
     */
    public void setContestPersistence(ContestPersistence contestPersistence) {
        this.contestPersistence = contestPersistence;
    }

    /**
     * Returns the contest debate local service.
     *
     * @return the contest debate local service
     */
    public ContestDebateLocalService getContestDebateLocalService() {
        return contestDebateLocalService;
    }

    /**
     * Sets the contest debate local service.
     *
     * @param contestDebateLocalService the contest debate local service
     */
    public void setContestDebateLocalService(
        ContestDebateLocalService contestDebateLocalService) {
        this.contestDebateLocalService = contestDebateLocalService;
    }

    /**
     * Returns the contest debate remote service.
     *
     * @return the contest debate remote service
     */
    public ContestDebateService getContestDebateService() {
        return contestDebateService;
    }

    /**
     * Sets the contest debate remote service.
     *
     * @param contestDebateService the contest debate remote service
     */
    public void setContestDebateService(
        ContestDebateService contestDebateService) {
        this.contestDebateService = contestDebateService;
    }

    /**
     * Returns the contest debate persistence.
     *
     * @return the contest debate persistence
     */
    public ContestDebatePersistence getContestDebatePersistence() {
        return contestDebatePersistence;
    }

    /**
     * Sets the contest debate persistence.
     *
     * @param contestDebatePersistence the contest debate persistence
     */
    public void setContestDebatePersistence(
        ContestDebatePersistence contestDebatePersistence) {
        this.contestDebatePersistence = contestDebatePersistence;
    }

    /**
     * Returns the contest phase local service.
     *
     * @return the contest phase local service
     */
    public ContestPhaseLocalService getContestPhaseLocalService() {
        return contestPhaseLocalService;
    }

    /**
     * Sets the contest phase local service.
     *
     * @param contestPhaseLocalService the contest phase local service
     */
    public void setContestPhaseLocalService(
        ContestPhaseLocalService contestPhaseLocalService) {
        this.contestPhaseLocalService = contestPhaseLocalService;
    }

    /**
     * Returns the contest phase remote service.
     *
     * @return the contest phase remote service
     */
    public ContestPhaseService getContestPhaseService() {
        return contestPhaseService;
    }

    /**
     * Sets the contest phase remote service.
     *
     * @param contestPhaseService the contest phase remote service
     */
    public void setContestPhaseService(ContestPhaseService contestPhaseService) {
        this.contestPhaseService = contestPhaseService;
    }

    /**
     * Returns the contest phase persistence.
     *
     * @return the contest phase persistence
     */
    public ContestPhasePersistence getContestPhasePersistence() {
        return contestPhasePersistence;
    }

    /**
     * Sets the contest phase persistence.
     *
     * @param contestPhasePersistence the contest phase persistence
     */
    public void setContestPhasePersistence(
        ContestPhasePersistence contestPhasePersistence) {
        this.contestPhasePersistence = contestPhasePersistence;
    }

    /**
     * Returns the contest phase column local service.
     *
     * @return the contest phase column local service
     */
    public ContestPhaseColumnLocalService getContestPhaseColumnLocalService() {
        return contestPhaseColumnLocalService;
    }

    /**
     * Sets the contest phase column local service.
     *
     * @param contestPhaseColumnLocalService the contest phase column local service
     */
    public void setContestPhaseColumnLocalService(
        ContestPhaseColumnLocalService contestPhaseColumnLocalService) {
        this.contestPhaseColumnLocalService = contestPhaseColumnLocalService;
    }

    /**
     * Returns the contest phase column remote service.
     *
     * @return the contest phase column remote service
     */
    public ContestPhaseColumnService getContestPhaseColumnService() {
        return contestPhaseColumnService;
    }

    /**
     * Sets the contest phase column remote service.
     *
     * @param contestPhaseColumnService the contest phase column remote service
     */
    public void setContestPhaseColumnService(
        ContestPhaseColumnService contestPhaseColumnService) {
        this.contestPhaseColumnService = contestPhaseColumnService;
    }

    /**
     * Returns the contest phase column persistence.
     *
     * @return the contest phase column persistence
     */
    public ContestPhaseColumnPersistence getContestPhaseColumnPersistence() {
        return contestPhaseColumnPersistence;
    }

    /**
     * Sets the contest phase column persistence.
     *
     * @param contestPhaseColumnPersistence the contest phase column persistence
     */
    public void setContestPhaseColumnPersistence(
        ContestPhaseColumnPersistence contestPhaseColumnPersistence) {
        this.contestPhaseColumnPersistence = contestPhaseColumnPersistence;
    }

    /**
     * Returns the contest phase type local service.
     *
     * @return the contest phase type local service
     */
    public ContestPhaseTypeLocalService getContestPhaseTypeLocalService() {
        return contestPhaseTypeLocalService;
    }

    /**
     * Sets the contest phase type local service.
     *
     * @param contestPhaseTypeLocalService the contest phase type local service
     */
    public void setContestPhaseTypeLocalService(
        ContestPhaseTypeLocalService contestPhaseTypeLocalService) {
        this.contestPhaseTypeLocalService = contestPhaseTypeLocalService;
    }

    /**
     * Returns the contest phase type remote service.
     *
     * @return the contest phase type remote service
     */
    public ContestPhaseTypeService getContestPhaseTypeService() {
        return contestPhaseTypeService;
    }

    /**
     * Sets the contest phase type remote service.
     *
     * @param contestPhaseTypeService the contest phase type remote service
     */
    public void setContestPhaseTypeService(
        ContestPhaseTypeService contestPhaseTypeService) {
        this.contestPhaseTypeService = contestPhaseTypeService;
    }

    /**
     * Returns the contest phase type persistence.
     *
     * @return the contest phase type persistence
     */
    public ContestPhaseTypePersistence getContestPhaseTypePersistence() {
        return contestPhaseTypePersistence;
    }

    /**
     * Sets the contest phase type persistence.
     *
     * @param contestPhaseTypePersistence the contest phase type persistence
     */
    public void setContestPhaseTypePersistence(
        ContestPhaseTypePersistence contestPhaseTypePersistence) {
        this.contestPhaseTypePersistence = contestPhaseTypePersistence;
    }

    /**
     * Returns the contest team member local service.
     *
     * @return the contest team member local service
     */
    public ContestTeamMemberLocalService getContestTeamMemberLocalService() {
        return contestTeamMemberLocalService;
    }

    /**
     * Sets the contest team member local service.
     *
     * @param contestTeamMemberLocalService the contest team member local service
     */
    public void setContestTeamMemberLocalService(
        ContestTeamMemberLocalService contestTeamMemberLocalService) {
        this.contestTeamMemberLocalService = contestTeamMemberLocalService;
    }

    /**
     * Returns the contest team member remote service.
     *
     * @return the contest team member remote service
     */
    public ContestTeamMemberService getContestTeamMemberService() {
        return contestTeamMemberService;
    }

    /**
     * Sets the contest team member remote service.
     *
     * @param contestTeamMemberService the contest team member remote service
     */
    public void setContestTeamMemberService(
        ContestTeamMemberService contestTeamMemberService) {
        this.contestTeamMemberService = contestTeamMemberService;
    }

    /**
     * Returns the contest team member persistence.
     *
     * @return the contest team member persistence
     */
    public ContestTeamMemberPersistence getContestTeamMemberPersistence() {
        return contestTeamMemberPersistence;
    }

    /**
     * Sets the contest team member persistence.
     *
     * @param contestTeamMemberPersistence the contest team member persistence
     */
    public void setContestTeamMemberPersistence(
        ContestTeamMemberPersistence contestTeamMemberPersistence) {
        this.contestTeamMemberPersistence = contestTeamMemberPersistence;
    }

    /**
     * Returns the discussion category local service.
     *
     * @return the discussion category local service
     */
    public DiscussionCategoryLocalService getDiscussionCategoryLocalService() {
        return discussionCategoryLocalService;
    }

    /**
     * Sets the discussion category local service.
     *
     * @param discussionCategoryLocalService the discussion category local service
     */
    public void setDiscussionCategoryLocalService(
        DiscussionCategoryLocalService discussionCategoryLocalService) {
        this.discussionCategoryLocalService = discussionCategoryLocalService;
    }

    /**
     * Returns the discussion category remote service.
     *
     * @return the discussion category remote service
     */
    public DiscussionCategoryService getDiscussionCategoryService() {
        return discussionCategoryService;
    }

    /**
     * Sets the discussion category remote service.
     *
     * @param discussionCategoryService the discussion category remote service
     */
    public void setDiscussionCategoryService(
        DiscussionCategoryService discussionCategoryService) {
        this.discussionCategoryService = discussionCategoryService;
    }

    /**
     * Returns the discussion category persistence.
     *
     * @return the discussion category persistence
     */
    public DiscussionCategoryPersistence getDiscussionCategoryPersistence() {
        return discussionCategoryPersistence;
    }

    /**
     * Sets the discussion category persistence.
     *
     * @param discussionCategoryPersistence the discussion category persistence
     */
    public void setDiscussionCategoryPersistence(
        DiscussionCategoryPersistence discussionCategoryPersistence) {
        this.discussionCategoryPersistence = discussionCategoryPersistence;
    }

    /**
     * Returns the discussion category group local service.
     *
     * @return the discussion category group local service
     */
    public DiscussionCategoryGroupLocalService getDiscussionCategoryGroupLocalService() {
        return discussionCategoryGroupLocalService;
    }

    /**
     * Sets the discussion category group local service.
     *
     * @param discussionCategoryGroupLocalService the discussion category group local service
     */
    public void setDiscussionCategoryGroupLocalService(
        DiscussionCategoryGroupLocalService discussionCategoryGroupLocalService) {
        this.discussionCategoryGroupLocalService = discussionCategoryGroupLocalService;
    }

    /**
     * Returns the discussion category group remote service.
     *
     * @return the discussion category group remote service
     */
    public DiscussionCategoryGroupService getDiscussionCategoryGroupService() {
        return discussionCategoryGroupService;
    }

    /**
     * Sets the discussion category group remote service.
     *
     * @param discussionCategoryGroupService the discussion category group remote service
     */
    public void setDiscussionCategoryGroupService(
        DiscussionCategoryGroupService discussionCategoryGroupService) {
        this.discussionCategoryGroupService = discussionCategoryGroupService;
    }

    /**
     * Returns the discussion category group persistence.
     *
     * @return the discussion category group persistence
     */
    public DiscussionCategoryGroupPersistence getDiscussionCategoryGroupPersistence() {
        return discussionCategoryGroupPersistence;
    }

    /**
     * Sets the discussion category group persistence.
     *
     * @param discussionCategoryGroupPersistence the discussion category group persistence
     */
    public void setDiscussionCategoryGroupPersistence(
        DiscussionCategoryGroupPersistence discussionCategoryGroupPersistence) {
        this.discussionCategoryGroupPersistence = discussionCategoryGroupPersistence;
    }

    /**
     * Returns the discussion message local service.
     *
     * @return the discussion message local service
     */
    public DiscussionMessageLocalService getDiscussionMessageLocalService() {
        return discussionMessageLocalService;
    }

    /**
     * Sets the discussion message local service.
     *
     * @param discussionMessageLocalService the discussion message local service
     */
    public void setDiscussionMessageLocalService(
        DiscussionMessageLocalService discussionMessageLocalService) {
        this.discussionMessageLocalService = discussionMessageLocalService;
    }

    /**
     * Returns the discussion message remote service.
     *
     * @return the discussion message remote service
     */
    public DiscussionMessageService getDiscussionMessageService() {
        return discussionMessageService;
    }

    /**
     * Sets the discussion message remote service.
     *
     * @param discussionMessageService the discussion message remote service
     */
    public void setDiscussionMessageService(
        DiscussionMessageService discussionMessageService) {
        this.discussionMessageService = discussionMessageService;
    }

    /**
     * Returns the discussion message persistence.
     *
     * @return the discussion message persistence
     */
    public DiscussionMessagePersistence getDiscussionMessagePersistence() {
        return discussionMessagePersistence;
    }

    /**
     * Sets the discussion message persistence.
     *
     * @param discussionMessagePersistence the discussion message persistence
     */
    public void setDiscussionMessagePersistence(
        DiscussionMessagePersistence discussionMessagePersistence) {
        this.discussionMessagePersistence = discussionMessagePersistence;
    }

    /**
     * Returns the discussion message flag local service.
     *
     * @return the discussion message flag local service
     */
    public DiscussionMessageFlagLocalService getDiscussionMessageFlagLocalService() {
        return discussionMessageFlagLocalService;
    }

    /**
     * Sets the discussion message flag local service.
     *
     * @param discussionMessageFlagLocalService the discussion message flag local service
     */
    public void setDiscussionMessageFlagLocalService(
        DiscussionMessageFlagLocalService discussionMessageFlagLocalService) {
        this.discussionMessageFlagLocalService = discussionMessageFlagLocalService;
    }

    /**
     * Returns the discussion message flag remote service.
     *
     * @return the discussion message flag remote service
     */
    public DiscussionMessageFlagService getDiscussionMessageFlagService() {
        return discussionMessageFlagService;
    }

    /**
     * Sets the discussion message flag remote service.
     *
     * @param discussionMessageFlagService the discussion message flag remote service
     */
    public void setDiscussionMessageFlagService(
        DiscussionMessageFlagService discussionMessageFlagService) {
        this.discussionMessageFlagService = discussionMessageFlagService;
    }

    /**
     * Returns the discussion message flag persistence.
     *
     * @return the discussion message flag persistence
     */
    public DiscussionMessageFlagPersistence getDiscussionMessageFlagPersistence() {
        return discussionMessageFlagPersistence;
    }

    /**
     * Sets the discussion message flag persistence.
     *
     * @param discussionMessageFlagPersistence the discussion message flag persistence
     */
    public void setDiscussionMessageFlagPersistence(
        DiscussionMessageFlagPersistence discussionMessageFlagPersistence) {
        this.discussionMessageFlagPersistence = discussionMessageFlagPersistence;
    }

    /**
     * Returns the focus area local service.
     *
     * @return the focus area local service
     */
    public FocusAreaLocalService getFocusAreaLocalService() {
        return focusAreaLocalService;
    }

    /**
     * Sets the focus area local service.
     *
     * @param focusAreaLocalService the focus area local service
     */
    public void setFocusAreaLocalService(
        FocusAreaLocalService focusAreaLocalService) {
        this.focusAreaLocalService = focusAreaLocalService;
    }

    /**
     * Returns the focus area remote service.
     *
     * @return the focus area remote service
     */
    public FocusAreaService getFocusAreaService() {
        return focusAreaService;
    }

    /**
     * Sets the focus area remote service.
     *
     * @param focusAreaService the focus area remote service
     */
    public void setFocusAreaService(FocusAreaService focusAreaService) {
        this.focusAreaService = focusAreaService;
    }

    /**
     * Returns the focus area persistence.
     *
     * @return the focus area persistence
     */
    public FocusAreaPersistence getFocusAreaPersistence() {
        return focusAreaPersistence;
    }

    /**
     * Sets the focus area persistence.
     *
     * @param focusAreaPersistence the focus area persistence
     */
    public void setFocusAreaPersistence(
        FocusAreaPersistence focusAreaPersistence) {
        this.focusAreaPersistence = focusAreaPersistence;
    }

    /**
     * Returns the focus area ontology term local service.
     *
     * @return the focus area ontology term local service
     */
    public FocusAreaOntologyTermLocalService getFocusAreaOntologyTermLocalService() {
        return focusAreaOntologyTermLocalService;
    }

    /**
     * Sets the focus area ontology term local service.
     *
     * @param focusAreaOntologyTermLocalService the focus area ontology term local service
     */
    public void setFocusAreaOntologyTermLocalService(
        FocusAreaOntologyTermLocalService focusAreaOntologyTermLocalService) {
        this.focusAreaOntologyTermLocalService = focusAreaOntologyTermLocalService;
    }

    /**
     * Returns the focus area ontology term remote service.
     *
     * @return the focus area ontology term remote service
     */
    public FocusAreaOntologyTermService getFocusAreaOntologyTermService() {
        return focusAreaOntologyTermService;
    }

    /**
     * Sets the focus area ontology term remote service.
     *
     * @param focusAreaOntologyTermService the focus area ontology term remote service
     */
    public void setFocusAreaOntologyTermService(
        FocusAreaOntologyTermService focusAreaOntologyTermService) {
        this.focusAreaOntologyTermService = focusAreaOntologyTermService;
    }

    /**
     * Returns the focus area ontology term persistence.
     *
     * @return the focus area ontology term persistence
     */
    public FocusAreaOntologyTermPersistence getFocusAreaOntologyTermPersistence() {
        return focusAreaOntologyTermPersistence;
    }

    /**
     * Sets the focus area ontology term persistence.
     *
     * @param focusAreaOntologyTermPersistence the focus area ontology term persistence
     */
    public void setFocusAreaOntologyTermPersistence(
        FocusAreaOntologyTermPersistence focusAreaOntologyTermPersistence) {
        this.focusAreaOntologyTermPersistence = focusAreaOntologyTermPersistence;
    }

    /**
     * Returns the message local service.
     *
     * @return the message local service
     */
    public MessageLocalService getMessageLocalService() {
        return messageLocalService;
    }

    /**
     * Sets the message local service.
     *
     * @param messageLocalService the message local service
     */
    public void setMessageLocalService(MessageLocalService messageLocalService) {
        this.messageLocalService = messageLocalService;
    }

    /**
     * Returns the message remote service.
     *
     * @return the message remote service
     */
    public MessageService getMessageService() {
        return messageService;
    }

    /**
     * Sets the message remote service.
     *
     * @param messageService the message remote service
     */
    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    /**
     * Returns the message persistence.
     *
     * @return the message persistence
     */
    public MessagePersistence getMessagePersistence() {
        return messagePersistence;
    }

    /**
     * Sets the message persistence.
     *
     * @param messagePersistence the message persistence
     */
    public void setMessagePersistence(MessagePersistence messagePersistence) {
        this.messagePersistence = messagePersistence;
    }

    /**
     * Returns the message recipient status local service.
     *
     * @return the message recipient status local service
     */
    public MessageRecipientStatusLocalService getMessageRecipientStatusLocalService() {
        return messageRecipientStatusLocalService;
    }

    /**
     * Sets the message recipient status local service.
     *
     * @param messageRecipientStatusLocalService the message recipient status local service
     */
    public void setMessageRecipientStatusLocalService(
        MessageRecipientStatusLocalService messageRecipientStatusLocalService) {
        this.messageRecipientStatusLocalService = messageRecipientStatusLocalService;
    }

    /**
     * Returns the message recipient status remote service.
     *
     * @return the message recipient status remote service
     */
    public MessageRecipientStatusService getMessageRecipientStatusService() {
        return messageRecipientStatusService;
    }

    /**
     * Sets the message recipient status remote service.
     *
     * @param messageRecipientStatusService the message recipient status remote service
     */
    public void setMessageRecipientStatusService(
        MessageRecipientStatusService messageRecipientStatusService) {
        this.messageRecipientStatusService = messageRecipientStatusService;
    }

    /**
     * Returns the message recipient status persistence.
     *
     * @return the message recipient status persistence
     */
    public MessageRecipientStatusPersistence getMessageRecipientStatusPersistence() {
        return messageRecipientStatusPersistence;
    }

    /**
     * Sets the message recipient status persistence.
     *
     * @param messageRecipientStatusPersistence the message recipient status persistence
     */
    public void setMessageRecipientStatusPersistence(
        MessageRecipientStatusPersistence messageRecipientStatusPersistence) {
        this.messageRecipientStatusPersistence = messageRecipientStatusPersistence;
    }

    /**
     * Returns the messaging user preferences local service.
     *
     * @return the messaging user preferences local service
     */
    public MessagingUserPreferencesLocalService getMessagingUserPreferencesLocalService() {
        return messagingUserPreferencesLocalService;
    }

    /**
     * Sets the messaging user preferences local service.
     *
     * @param messagingUserPreferencesLocalService the messaging user preferences local service
     */
    public void setMessagingUserPreferencesLocalService(
        MessagingUserPreferencesLocalService messagingUserPreferencesLocalService) {
        this.messagingUserPreferencesLocalService = messagingUserPreferencesLocalService;
    }

    /**
     * Returns the messaging user preferences remote service.
     *
     * @return the messaging user preferences remote service
     */
    public MessagingUserPreferencesService getMessagingUserPreferencesService() {
        return messagingUserPreferencesService;
    }

    /**
     * Sets the messaging user preferences remote service.
     *
     * @param messagingUserPreferencesService the messaging user preferences remote service
     */
    public void setMessagingUserPreferencesService(
        MessagingUserPreferencesService messagingUserPreferencesService) {
        this.messagingUserPreferencesService = messagingUserPreferencesService;
    }

    /**
     * Returns the messaging user preferences persistence.
     *
     * @return the messaging user preferences persistence
     */
    public MessagingUserPreferencesPersistence getMessagingUserPreferencesPersistence() {
        return messagingUserPreferencesPersistence;
    }

    /**
     * Sets the messaging user preferences persistence.
     *
     * @param messagingUserPreferencesPersistence the messaging user preferences persistence
     */
    public void setMessagingUserPreferencesPersistence(
        MessagingUserPreferencesPersistence messagingUserPreferencesPersistence) {
        this.messagingUserPreferencesPersistence = messagingUserPreferencesPersistence;
    }

    /**
     * Returns the model category local service.
     *
     * @return the model category local service
     */
    public ModelCategoryLocalService getModelCategoryLocalService() {
        return modelCategoryLocalService;
    }

    /**
     * Sets the model category local service.
     *
     * @param modelCategoryLocalService the model category local service
     */
    public void setModelCategoryLocalService(
        ModelCategoryLocalService modelCategoryLocalService) {
        this.modelCategoryLocalService = modelCategoryLocalService;
    }

    /**
     * Returns the model category remote service.
     *
     * @return the model category remote service
     */
    public ModelCategoryService getModelCategoryService() {
        return modelCategoryService;
    }

    /**
     * Sets the model category remote service.
     *
     * @param modelCategoryService the model category remote service
     */
    public void setModelCategoryService(
        ModelCategoryService modelCategoryService) {
        this.modelCategoryService = modelCategoryService;
    }

    /**
     * Returns the model category persistence.
     *
     * @return the model category persistence
     */
    public ModelCategoryPersistence getModelCategoryPersistence() {
        return modelCategoryPersistence;
    }

    /**
     * Sets the model category persistence.
     *
     * @param modelCategoryPersistence the model category persistence
     */
    public void setModelCategoryPersistence(
        ModelCategoryPersistence modelCategoryPersistence) {
        this.modelCategoryPersistence = modelCategoryPersistence;
    }

    /**
     * Returns the model discussion local service.
     *
     * @return the model discussion local service
     */
    public ModelDiscussionLocalService getModelDiscussionLocalService() {
        return modelDiscussionLocalService;
    }

    /**
     * Sets the model discussion local service.
     *
     * @param modelDiscussionLocalService the model discussion local service
     */
    public void setModelDiscussionLocalService(
        ModelDiscussionLocalService modelDiscussionLocalService) {
        this.modelDiscussionLocalService = modelDiscussionLocalService;
    }

    /**
     * Returns the model discussion remote service.
     *
     * @return the model discussion remote service
     */
    public ModelDiscussionService getModelDiscussionService() {
        return modelDiscussionService;
    }

    /**
     * Sets the model discussion remote service.
     *
     * @param modelDiscussionService the model discussion remote service
     */
    public void setModelDiscussionService(
        ModelDiscussionService modelDiscussionService) {
        this.modelDiscussionService = modelDiscussionService;
    }

    /**
     * Returns the model discussion persistence.
     *
     * @return the model discussion persistence
     */
    public ModelDiscussionPersistence getModelDiscussionPersistence() {
        return modelDiscussionPersistence;
    }

    /**
     * Sets the model discussion persistence.
     *
     * @param modelDiscussionPersistence the model discussion persistence
     */
    public void setModelDiscussionPersistence(
        ModelDiscussionPersistence modelDiscussionPersistence) {
        this.modelDiscussionPersistence = modelDiscussionPersistence;
    }

    /**
     * Returns the model global preference local service.
     *
     * @return the model global preference local service
     */
    public ModelGlobalPreferenceLocalService getModelGlobalPreferenceLocalService() {
        return modelGlobalPreferenceLocalService;
    }

    /**
     * Sets the model global preference local service.
     *
     * @param modelGlobalPreferenceLocalService the model global preference local service
     */
    public void setModelGlobalPreferenceLocalService(
        ModelGlobalPreferenceLocalService modelGlobalPreferenceLocalService) {
        this.modelGlobalPreferenceLocalService = modelGlobalPreferenceLocalService;
    }

    /**
     * Returns the model global preference remote service.
     *
     * @return the model global preference remote service
     */
    public ModelGlobalPreferenceService getModelGlobalPreferenceService() {
        return modelGlobalPreferenceService;
    }

    /**
     * Sets the model global preference remote service.
     *
     * @param modelGlobalPreferenceService the model global preference remote service
     */
    public void setModelGlobalPreferenceService(
        ModelGlobalPreferenceService modelGlobalPreferenceService) {
        this.modelGlobalPreferenceService = modelGlobalPreferenceService;
    }

    /**
     * Returns the model global preference persistence.
     *
     * @return the model global preference persistence
     */
    public ModelGlobalPreferencePersistence getModelGlobalPreferencePersistence() {
        return modelGlobalPreferencePersistence;
    }

    /**
     * Sets the model global preference persistence.
     *
     * @param modelGlobalPreferencePersistence the model global preference persistence
     */
    public void setModelGlobalPreferencePersistence(
        ModelGlobalPreferencePersistence modelGlobalPreferencePersistence) {
        this.modelGlobalPreferencePersistence = modelGlobalPreferencePersistence;
    }

    /**
     * Returns the model input group local service.
     *
     * @return the model input group local service
     */
    public ModelInputGroupLocalService getModelInputGroupLocalService() {
        return modelInputGroupLocalService;
    }

    /**
     * Sets the model input group local service.
     *
     * @param modelInputGroupLocalService the model input group local service
     */
    public void setModelInputGroupLocalService(
        ModelInputGroupLocalService modelInputGroupLocalService) {
        this.modelInputGroupLocalService = modelInputGroupLocalService;
    }

    /**
     * Returns the model input group remote service.
     *
     * @return the model input group remote service
     */
    public ModelInputGroupService getModelInputGroupService() {
        return modelInputGroupService;
    }

    /**
     * Sets the model input group remote service.
     *
     * @param modelInputGroupService the model input group remote service
     */
    public void setModelInputGroupService(
        ModelInputGroupService modelInputGroupService) {
        this.modelInputGroupService = modelInputGroupService;
    }

    /**
     * Returns the model input group persistence.
     *
     * @return the model input group persistence
     */
    public ModelInputGroupPersistence getModelInputGroupPersistence() {
        return modelInputGroupPersistence;
    }

    /**
     * Sets the model input group persistence.
     *
     * @param modelInputGroupPersistence the model input group persistence
     */
    public void setModelInputGroupPersistence(
        ModelInputGroupPersistence modelInputGroupPersistence) {
        this.modelInputGroupPersistence = modelInputGroupPersistence;
    }

    /**
     * Returns the model input item local service.
     *
     * @return the model input item local service
     */
    public ModelInputItemLocalService getModelInputItemLocalService() {
        return modelInputItemLocalService;
    }

    /**
     * Sets the model input item local service.
     *
     * @param modelInputItemLocalService the model input item local service
     */
    public void setModelInputItemLocalService(
        ModelInputItemLocalService modelInputItemLocalService) {
        this.modelInputItemLocalService = modelInputItemLocalService;
    }

    /**
     * Returns the model input item remote service.
     *
     * @return the model input item remote service
     */
    public ModelInputItemService getModelInputItemService() {
        return modelInputItemService;
    }

    /**
     * Sets the model input item remote service.
     *
     * @param modelInputItemService the model input item remote service
     */
    public void setModelInputItemService(
        ModelInputItemService modelInputItemService) {
        this.modelInputItemService = modelInputItemService;
    }

    /**
     * Returns the model input item persistence.
     *
     * @return the model input item persistence
     */
    public ModelInputItemPersistence getModelInputItemPersistence() {
        return modelInputItemPersistence;
    }

    /**
     * Sets the model input item persistence.
     *
     * @param modelInputItemPersistence the model input item persistence
     */
    public void setModelInputItemPersistence(
        ModelInputItemPersistence modelInputItemPersistence) {
        this.modelInputItemPersistence = modelInputItemPersistence;
    }

    /**
     * Returns the model output chart order local service.
     *
     * @return the model output chart order local service
     */
    public ModelOutputChartOrderLocalService getModelOutputChartOrderLocalService() {
        return modelOutputChartOrderLocalService;
    }

    /**
     * Sets the model output chart order local service.
     *
     * @param modelOutputChartOrderLocalService the model output chart order local service
     */
    public void setModelOutputChartOrderLocalService(
        ModelOutputChartOrderLocalService modelOutputChartOrderLocalService) {
        this.modelOutputChartOrderLocalService = modelOutputChartOrderLocalService;
    }

    /**
     * Returns the model output chart order remote service.
     *
     * @return the model output chart order remote service
     */
    public ModelOutputChartOrderService getModelOutputChartOrderService() {
        return modelOutputChartOrderService;
    }

    /**
     * Sets the model output chart order remote service.
     *
     * @param modelOutputChartOrderService the model output chart order remote service
     */
    public void setModelOutputChartOrderService(
        ModelOutputChartOrderService modelOutputChartOrderService) {
        this.modelOutputChartOrderService = modelOutputChartOrderService;
    }

    /**
     * Returns the model output chart order persistence.
     *
     * @return the model output chart order persistence
     */
    public ModelOutputChartOrderPersistence getModelOutputChartOrderPersistence() {
        return modelOutputChartOrderPersistence;
    }

    /**
     * Sets the model output chart order persistence.
     *
     * @param modelOutputChartOrderPersistence the model output chart order persistence
     */
    public void setModelOutputChartOrderPersistence(
        ModelOutputChartOrderPersistence modelOutputChartOrderPersistence) {
        this.modelOutputChartOrderPersistence = modelOutputChartOrderPersistence;
    }

    /**
     * Returns the model output item local service.
     *
     * @return the model output item local service
     */
    public ModelOutputItemLocalService getModelOutputItemLocalService() {
        return modelOutputItemLocalService;
    }

    /**
     * Sets the model output item local service.
     *
     * @param modelOutputItemLocalService the model output item local service
     */
    public void setModelOutputItemLocalService(
        ModelOutputItemLocalService modelOutputItemLocalService) {
        this.modelOutputItemLocalService = modelOutputItemLocalService;
    }

    /**
     * Returns the model output item remote service.
     *
     * @return the model output item remote service
     */
    public ModelOutputItemService getModelOutputItemService() {
        return modelOutputItemService;
    }

    /**
     * Sets the model output item remote service.
     *
     * @param modelOutputItemService the model output item remote service
     */
    public void setModelOutputItemService(
        ModelOutputItemService modelOutputItemService) {
        this.modelOutputItemService = modelOutputItemService;
    }

    /**
     * Returns the model output item persistence.
     *
     * @return the model output item persistence
     */
    public ModelOutputItemPersistence getModelOutputItemPersistence() {
        return modelOutputItemPersistence;
    }

    /**
     * Sets the model output item persistence.
     *
     * @param modelOutputItemPersistence the model output item persistence
     */
    public void setModelOutputItemPersistence(
        ModelOutputItemPersistence modelOutputItemPersistence) {
        this.modelOutputItemPersistence = modelOutputItemPersistence;
    }

    /**
     * Returns the model position local service.
     *
     * @return the model position local service
     */
    public ModelPositionLocalService getModelPositionLocalService() {
        return modelPositionLocalService;
    }

    /**
     * Sets the model position local service.
     *
     * @param modelPositionLocalService the model position local service
     */
    public void setModelPositionLocalService(
        ModelPositionLocalService modelPositionLocalService) {
        this.modelPositionLocalService = modelPositionLocalService;
    }

    /**
     * Returns the model position remote service.
     *
     * @return the model position remote service
     */
    public ModelPositionService getModelPositionService() {
        return modelPositionService;
    }

    /**
     * Sets the model position remote service.
     *
     * @param modelPositionService the model position remote service
     */
    public void setModelPositionService(
        ModelPositionService modelPositionService) {
        this.modelPositionService = modelPositionService;
    }

    /**
     * Returns the model position persistence.
     *
     * @return the model position persistence
     */
    public ModelPositionPersistence getModelPositionPersistence() {
        return modelPositionPersistence;
    }

    /**
     * Sets the model position persistence.
     *
     * @param modelPositionPersistence the model position persistence
     */
    public void setModelPositionPersistence(
        ModelPositionPersistence modelPositionPersistence) {
        this.modelPositionPersistence = modelPositionPersistence;
    }

    /**
     * Returns the ontology space local service.
     *
     * @return the ontology space local service
     */
    public OntologySpaceLocalService getOntologySpaceLocalService() {
        return ontologySpaceLocalService;
    }

    /**
     * Sets the ontology space local service.
     *
     * @param ontologySpaceLocalService the ontology space local service
     */
    public void setOntologySpaceLocalService(
        OntologySpaceLocalService ontologySpaceLocalService) {
        this.ontologySpaceLocalService = ontologySpaceLocalService;
    }

    /**
     * Returns the ontology space remote service.
     *
     * @return the ontology space remote service
     */
    public OntologySpaceService getOntologySpaceService() {
        return ontologySpaceService;
    }

    /**
     * Sets the ontology space remote service.
     *
     * @param ontologySpaceService the ontology space remote service
     */
    public void setOntologySpaceService(
        OntologySpaceService ontologySpaceService) {
        this.ontologySpaceService = ontologySpaceService;
    }

    /**
     * Returns the ontology space persistence.
     *
     * @return the ontology space persistence
     */
    public OntologySpacePersistence getOntologySpacePersistence() {
        return ontologySpacePersistence;
    }

    /**
     * Sets the ontology space persistence.
     *
     * @param ontologySpacePersistence the ontology space persistence
     */
    public void setOntologySpacePersistence(
        OntologySpacePersistence ontologySpacePersistence) {
        this.ontologySpacePersistence = ontologySpacePersistence;
    }

    /**
     * Returns the ontology term local service.
     *
     * @return the ontology term local service
     */
    public OntologyTermLocalService getOntologyTermLocalService() {
        return ontologyTermLocalService;
    }

    /**
     * Sets the ontology term local service.
     *
     * @param ontologyTermLocalService the ontology term local service
     */
    public void setOntologyTermLocalService(
        OntologyTermLocalService ontologyTermLocalService) {
        this.ontologyTermLocalService = ontologyTermLocalService;
    }

    /**
     * Returns the ontology term remote service.
     *
     * @return the ontology term remote service
     */
    public OntologyTermService getOntologyTermService() {
        return ontologyTermService;
    }

    /**
     * Sets the ontology term remote service.
     *
     * @param ontologyTermService the ontology term remote service
     */
    public void setOntologyTermService(OntologyTermService ontologyTermService) {
        this.ontologyTermService = ontologyTermService;
    }

    /**
     * Returns the ontology term persistence.
     *
     * @return the ontology term persistence
     */
    public OntologyTermPersistence getOntologyTermPersistence() {
        return ontologyTermPersistence;
    }

    /**
     * Sets the ontology term persistence.
     *
     * @param ontologyTermPersistence the ontology term persistence
     */
    public void setOntologyTermPersistence(
        OntologyTermPersistence ontologyTermPersistence) {
        this.ontologyTermPersistence = ontologyTermPersistence;
    }

    /**
     * Returns the ontology term entity local service.
     *
     * @return the ontology term entity local service
     */
    public OntologyTermEntityLocalService getOntologyTermEntityLocalService() {
        return ontologyTermEntityLocalService;
    }

    /**
     * Sets the ontology term entity local service.
     *
     * @param ontologyTermEntityLocalService the ontology term entity local service
     */
    public void setOntologyTermEntityLocalService(
        OntologyTermEntityLocalService ontologyTermEntityLocalService) {
        this.ontologyTermEntityLocalService = ontologyTermEntityLocalService;
    }

    /**
     * Returns the ontology term entity remote service.
     *
     * @return the ontology term entity remote service
     */
    public OntologyTermEntityService getOntologyTermEntityService() {
        return ontologyTermEntityService;
    }

    /**
     * Sets the ontology term entity remote service.
     *
     * @param ontologyTermEntityService the ontology term entity remote service
     */
    public void setOntologyTermEntityService(
        OntologyTermEntityService ontologyTermEntityService) {
        this.ontologyTermEntityService = ontologyTermEntityService;
    }

    /**
     * Returns the ontology term entity persistence.
     *
     * @return the ontology term entity persistence
     */
    public OntologyTermEntityPersistence getOntologyTermEntityPersistence() {
        return ontologyTermEntityPersistence;
    }

    /**
     * Sets the ontology term entity persistence.
     *
     * @param ontologyTermEntityPersistence the ontology term entity persistence
     */
    public void setOntologyTermEntityPersistence(
        OntologyTermEntityPersistence ontologyTermEntityPersistence) {
        this.ontologyTermEntityPersistence = ontologyTermEntityPersistence;
    }

    /**
     * Returns the plan attribute local service.
     *
     * @return the plan attribute local service
     */
    public PlanAttributeLocalService getPlanAttributeLocalService() {
        return planAttributeLocalService;
    }

    /**
     * Sets the plan attribute local service.
     *
     * @param planAttributeLocalService the plan attribute local service
     */
    public void setPlanAttributeLocalService(
        PlanAttributeLocalService planAttributeLocalService) {
        this.planAttributeLocalService = planAttributeLocalService;
    }

    /**
     * Returns the plan attribute remote service.
     *
     * @return the plan attribute remote service
     */
    public PlanAttributeService getPlanAttributeService() {
        return planAttributeService;
    }

    /**
     * Sets the plan attribute remote service.
     *
     * @param planAttributeService the plan attribute remote service
     */
    public void setPlanAttributeService(
        PlanAttributeService planAttributeService) {
        this.planAttributeService = planAttributeService;
    }

    /**
     * Returns the plan attribute persistence.
     *
     * @return the plan attribute persistence
     */
    public PlanAttributePersistence getPlanAttributePersistence() {
        return planAttributePersistence;
    }

    /**
     * Sets the plan attribute persistence.
     *
     * @param planAttributePersistence the plan attribute persistence
     */
    public void setPlanAttributePersistence(
        PlanAttributePersistence planAttributePersistence) {
        this.planAttributePersistence = planAttributePersistence;
    }

    /**
     * Returns the plan attribute filter local service.
     *
     * @return the plan attribute filter local service
     */
    public PlanAttributeFilterLocalService getPlanAttributeFilterLocalService() {
        return planAttributeFilterLocalService;
    }

    /**
     * Sets the plan attribute filter local service.
     *
     * @param planAttributeFilterLocalService the plan attribute filter local service
     */
    public void setPlanAttributeFilterLocalService(
        PlanAttributeFilterLocalService planAttributeFilterLocalService) {
        this.planAttributeFilterLocalService = planAttributeFilterLocalService;
    }

    /**
     * Returns the plan attribute filter remote service.
     *
     * @return the plan attribute filter remote service
     */
    public PlanAttributeFilterService getPlanAttributeFilterService() {
        return planAttributeFilterService;
    }

    /**
     * Sets the plan attribute filter remote service.
     *
     * @param planAttributeFilterService the plan attribute filter remote service
     */
    public void setPlanAttributeFilterService(
        PlanAttributeFilterService planAttributeFilterService) {
        this.planAttributeFilterService = planAttributeFilterService;
    }

    /**
     * Returns the plan attribute filter persistence.
     *
     * @return the plan attribute filter persistence
     */
    public PlanAttributeFilterPersistence getPlanAttributeFilterPersistence() {
        return planAttributeFilterPersistence;
    }

    /**
     * Sets the plan attribute filter persistence.
     *
     * @param planAttributeFilterPersistence the plan attribute filter persistence
     */
    public void setPlanAttributeFilterPersistence(
        PlanAttributeFilterPersistence planAttributeFilterPersistence) {
        this.planAttributeFilterPersistence = planAttributeFilterPersistence;
    }

    /**
     * Returns the plan column settings local service.
     *
     * @return the plan column settings local service
     */
    public PlanColumnSettingsLocalService getPlanColumnSettingsLocalService() {
        return planColumnSettingsLocalService;
    }

    /**
     * Sets the plan column settings local service.
     *
     * @param planColumnSettingsLocalService the plan column settings local service
     */
    public void setPlanColumnSettingsLocalService(
        PlanColumnSettingsLocalService planColumnSettingsLocalService) {
        this.planColumnSettingsLocalService = planColumnSettingsLocalService;
    }

    /**
     * Returns the plan column settings remote service.
     *
     * @return the plan column settings remote service
     */
    public PlanColumnSettingsService getPlanColumnSettingsService() {
        return planColumnSettingsService;
    }

    /**
     * Sets the plan column settings remote service.
     *
     * @param planColumnSettingsService the plan column settings remote service
     */
    public void setPlanColumnSettingsService(
        PlanColumnSettingsService planColumnSettingsService) {
        this.planColumnSettingsService = planColumnSettingsService;
    }

    /**
     * Returns the plan column settings persistence.
     *
     * @return the plan column settings persistence
     */
    public PlanColumnSettingsPersistence getPlanColumnSettingsPersistence() {
        return planColumnSettingsPersistence;
    }

    /**
     * Sets the plan column settings persistence.
     *
     * @param planColumnSettingsPersistence the plan column settings persistence
     */
    public void setPlanColumnSettingsPersistence(
        PlanColumnSettingsPersistence planColumnSettingsPersistence) {
        this.planColumnSettingsPersistence = planColumnSettingsPersistence;
    }

    /**
     * Returns the plan description local service.
     *
     * @return the plan description local service
     */
    public PlanDescriptionLocalService getPlanDescriptionLocalService() {
        return planDescriptionLocalService;
    }

    /**
     * Sets the plan description local service.
     *
     * @param planDescriptionLocalService the plan description local service
     */
    public void setPlanDescriptionLocalService(
        PlanDescriptionLocalService planDescriptionLocalService) {
        this.planDescriptionLocalService = planDescriptionLocalService;
    }

    /**
     * Returns the plan description remote service.
     *
     * @return the plan description remote service
     */
    public PlanDescriptionService getPlanDescriptionService() {
        return planDescriptionService;
    }

    /**
     * Sets the plan description remote service.
     *
     * @param planDescriptionService the plan description remote service
     */
    public void setPlanDescriptionService(
        PlanDescriptionService planDescriptionService) {
        this.planDescriptionService = planDescriptionService;
    }

    /**
     * Returns the plan description persistence.
     *
     * @return the plan description persistence
     */
    public PlanDescriptionPersistence getPlanDescriptionPersistence() {
        return planDescriptionPersistence;
    }

    /**
     * Sets the plan description persistence.
     *
     * @param planDescriptionPersistence the plan description persistence
     */
    public void setPlanDescriptionPersistence(
        PlanDescriptionPersistence planDescriptionPersistence) {
        this.planDescriptionPersistence = planDescriptionPersistence;
    }

    /**
     * Returns the plan fan local service.
     *
     * @return the plan fan local service
     */
    public PlanFanLocalService getPlanFanLocalService() {
        return planFanLocalService;
    }

    /**
     * Sets the plan fan local service.
     *
     * @param planFanLocalService the plan fan local service
     */
    public void setPlanFanLocalService(PlanFanLocalService planFanLocalService) {
        this.planFanLocalService = planFanLocalService;
    }

    /**
     * Returns the plan fan remote service.
     *
     * @return the plan fan remote service
     */
    public PlanFanService getPlanFanService() {
        return planFanService;
    }

    /**
     * Sets the plan fan remote service.
     *
     * @param planFanService the plan fan remote service
     */
    public void setPlanFanService(PlanFanService planFanService) {
        this.planFanService = planFanService;
    }

    /**
     * Returns the plan fan persistence.
     *
     * @return the plan fan persistence
     */
    public PlanFanPersistence getPlanFanPersistence() {
        return planFanPersistence;
    }

    /**
     * Sets the plan fan persistence.
     *
     * @param planFanPersistence the plan fan persistence
     */
    public void setPlanFanPersistence(PlanFanPersistence planFanPersistence) {
        this.planFanPersistence = planFanPersistence;
    }

    /**
     * Returns the plan item local service.
     *
     * @return the plan item local service
     */
    public PlanItemLocalService getPlanItemLocalService() {
        return planItemLocalService;
    }

    /**
     * Sets the plan item local service.
     *
     * @param planItemLocalService the plan item local service
     */
    public void setPlanItemLocalService(
        PlanItemLocalService planItemLocalService) {
        this.planItemLocalService = planItemLocalService;
    }

    /**
     * Returns the plan item remote service.
     *
     * @return the plan item remote service
     */
    public PlanItemService getPlanItemService() {
        return planItemService;
    }

    /**
     * Sets the plan item remote service.
     *
     * @param planItemService the plan item remote service
     */
    public void setPlanItemService(PlanItemService planItemService) {
        this.planItemService = planItemService;
    }

    /**
     * Returns the plan item persistence.
     *
     * @return the plan item persistence
     */
    public PlanItemPersistence getPlanItemPersistence() {
        return planItemPersistence;
    }

    /**
     * Sets the plan item persistence.
     *
     * @param planItemPersistence the plan item persistence
     */
    public void setPlanItemPersistence(PlanItemPersistence planItemPersistence) {
        this.planItemPersistence = planItemPersistence;
    }

    /**
     * Returns the plan item finder.
     *
     * @return the plan item finder
     */
    public PlanItemFinder getPlanItemFinder() {
        return planItemFinder;
    }

    /**
     * Sets the plan item finder.
     *
     * @param planItemFinder the plan item finder
     */
    public void setPlanItemFinder(PlanItemFinder planItemFinder) {
        this.planItemFinder = planItemFinder;
    }

    /**
     * Returns the plan meta local service.
     *
     * @return the plan meta local service
     */
    public PlanMetaLocalService getPlanMetaLocalService() {
        return planMetaLocalService;
    }

    /**
     * Sets the plan meta local service.
     *
     * @param planMetaLocalService the plan meta local service
     */
    public void setPlanMetaLocalService(
        PlanMetaLocalService planMetaLocalService) {
        this.planMetaLocalService = planMetaLocalService;
    }

    /**
     * Returns the plan meta remote service.
     *
     * @return the plan meta remote service
     */
    public PlanMetaService getPlanMetaService() {
        return planMetaService;
    }

    /**
     * Sets the plan meta remote service.
     *
     * @param planMetaService the plan meta remote service
     */
    public void setPlanMetaService(PlanMetaService planMetaService) {
        this.planMetaService = planMetaService;
    }

    /**
     * Returns the plan meta persistence.
     *
     * @return the plan meta persistence
     */
    public PlanMetaPersistence getPlanMetaPersistence() {
        return planMetaPersistence;
    }

    /**
     * Sets the plan meta persistence.
     *
     * @param planMetaPersistence the plan meta persistence
     */
    public void setPlanMetaPersistence(PlanMetaPersistence planMetaPersistence) {
        this.planMetaPersistence = planMetaPersistence;
    }

    /**
     * Returns the plan model run local service.
     *
     * @return the plan model run local service
     */
    public PlanModelRunLocalService getPlanModelRunLocalService() {
        return planModelRunLocalService;
    }

    /**
     * Sets the plan model run local service.
     *
     * @param planModelRunLocalService the plan model run local service
     */
    public void setPlanModelRunLocalService(
        PlanModelRunLocalService planModelRunLocalService) {
        this.planModelRunLocalService = planModelRunLocalService;
    }

    /**
     * Returns the plan model run remote service.
     *
     * @return the plan model run remote service
     */
    public PlanModelRunService getPlanModelRunService() {
        return planModelRunService;
    }

    /**
     * Sets the plan model run remote service.
     *
     * @param planModelRunService the plan model run remote service
     */
    public void setPlanModelRunService(PlanModelRunService planModelRunService) {
        this.planModelRunService = planModelRunService;
    }

    /**
     * Returns the plan model run persistence.
     *
     * @return the plan model run persistence
     */
    public PlanModelRunPersistence getPlanModelRunPersistence() {
        return planModelRunPersistence;
    }

    /**
     * Sets the plan model run persistence.
     *
     * @param planModelRunPersistence the plan model run persistence
     */
    public void setPlanModelRunPersistence(
        PlanModelRunPersistence planModelRunPersistence) {
        this.planModelRunPersistence = planModelRunPersistence;
    }

    /**
     * Returns the plan position local service.
     *
     * @return the plan position local service
     */
    public PlanPositionLocalService getPlanPositionLocalService() {
        return planPositionLocalService;
    }

    /**
     * Sets the plan position local service.
     *
     * @param planPositionLocalService the plan position local service
     */
    public void setPlanPositionLocalService(
        PlanPositionLocalService planPositionLocalService) {
        this.planPositionLocalService = planPositionLocalService;
    }

    /**
     * Returns the plan position remote service.
     *
     * @return the plan position remote service
     */
    public PlanPositionService getPlanPositionService() {
        return planPositionService;
    }

    /**
     * Sets the plan position remote service.
     *
     * @param planPositionService the plan position remote service
     */
    public void setPlanPositionService(PlanPositionService planPositionService) {
        this.planPositionService = planPositionService;
    }

    /**
     * Returns the plan position persistence.
     *
     * @return the plan position persistence
     */
    public PlanPositionPersistence getPlanPositionPersistence() {
        return planPositionPersistence;
    }

    /**
     * Sets the plan position persistence.
     *
     * @param planPositionPersistence the plan position persistence
     */
    public void setPlanPositionPersistence(
        PlanPositionPersistence planPositionPersistence) {
        this.planPositionPersistence = planPositionPersistence;
    }

    /**
     * Returns the plan position item local service.
     *
     * @return the plan position item local service
     */
    public PlanPositionItemLocalService getPlanPositionItemLocalService() {
        return planPositionItemLocalService;
    }

    /**
     * Sets the plan position item local service.
     *
     * @param planPositionItemLocalService the plan position item local service
     */
    public void setPlanPositionItemLocalService(
        PlanPositionItemLocalService planPositionItemLocalService) {
        this.planPositionItemLocalService = planPositionItemLocalService;
    }

    /**
     * Returns the plan position item remote service.
     *
     * @return the plan position item remote service
     */
    public PlanPositionItemService getPlanPositionItemService() {
        return planPositionItemService;
    }

    /**
     * Sets the plan position item remote service.
     *
     * @param planPositionItemService the plan position item remote service
     */
    public void setPlanPositionItemService(
        PlanPositionItemService planPositionItemService) {
        this.planPositionItemService = planPositionItemService;
    }

    /**
     * Returns the plan position item persistence.
     *
     * @return the plan position item persistence
     */
    public PlanPositionItemPersistence getPlanPositionItemPersistence() {
        return planPositionItemPersistence;
    }

    /**
     * Sets the plan position item persistence.
     *
     * @param planPositionItemPersistence the plan position item persistence
     */
    public void setPlanPositionItemPersistence(
        PlanPositionItemPersistence planPositionItemPersistence) {
        this.planPositionItemPersistence = planPositionItemPersistence;
    }

    /**
     * Returns the plan positions local service.
     *
     * @return the plan positions local service
     */
    public PlanPositionsLocalService getPlanPositionsLocalService() {
        return planPositionsLocalService;
    }

    /**
     * Sets the plan positions local service.
     *
     * @param planPositionsLocalService the plan positions local service
     */
    public void setPlanPositionsLocalService(
        PlanPositionsLocalService planPositionsLocalService) {
        this.planPositionsLocalService = planPositionsLocalService;
    }

    /**
     * Returns the plan positions remote service.
     *
     * @return the plan positions remote service
     */
    public PlanPositionsService getPlanPositionsService() {
        return planPositionsService;
    }

    /**
     * Sets the plan positions remote service.
     *
     * @param planPositionsService the plan positions remote service
     */
    public void setPlanPositionsService(
        PlanPositionsService planPositionsService) {
        this.planPositionsService = planPositionsService;
    }

    /**
     * Returns the plan positions persistence.
     *
     * @return the plan positions persistence
     */
    public PlanPositionsPersistence getPlanPositionsPersistence() {
        return planPositionsPersistence;
    }

    /**
     * Sets the plan positions persistence.
     *
     * @param planPositionsPersistence the plan positions persistence
     */
    public void setPlanPositionsPersistence(
        PlanPositionsPersistence planPositionsPersistence) {
        this.planPositionsPersistence = planPositionsPersistence;
    }

    /**
     * Returns the plan property filter local service.
     *
     * @return the plan property filter local service
     */
    public PlanPropertyFilterLocalService getPlanPropertyFilterLocalService() {
        return planPropertyFilterLocalService;
    }

    /**
     * Sets the plan property filter local service.
     *
     * @param planPropertyFilterLocalService the plan property filter local service
     */
    public void setPlanPropertyFilterLocalService(
        PlanPropertyFilterLocalService planPropertyFilterLocalService) {
        this.planPropertyFilterLocalService = planPropertyFilterLocalService;
    }

    /**
     * Returns the plan property filter remote service.
     *
     * @return the plan property filter remote service
     */
    public PlanPropertyFilterService getPlanPropertyFilterService() {
        return planPropertyFilterService;
    }

    /**
     * Sets the plan property filter remote service.
     *
     * @param planPropertyFilterService the plan property filter remote service
     */
    public void setPlanPropertyFilterService(
        PlanPropertyFilterService planPropertyFilterService) {
        this.planPropertyFilterService = planPropertyFilterService;
    }

    /**
     * Returns the plan property filter persistence.
     *
     * @return the plan property filter persistence
     */
    public PlanPropertyFilterPersistence getPlanPropertyFilterPersistence() {
        return planPropertyFilterPersistence;
    }

    /**
     * Sets the plan property filter persistence.
     *
     * @param planPropertyFilterPersistence the plan property filter persistence
     */
    public void setPlanPropertyFilterPersistence(
        PlanPropertyFilterPersistence planPropertyFilterPersistence) {
        this.planPropertyFilterPersistence = planPropertyFilterPersistence;
    }

    /**
     * Returns the plan related local service.
     *
     * @return the plan related local service
     */
    public PlanRelatedLocalService getPlanRelatedLocalService() {
        return planRelatedLocalService;
    }

    /**
     * Sets the plan related local service.
     *
     * @param planRelatedLocalService the plan related local service
     */
    public void setPlanRelatedLocalService(
        PlanRelatedLocalService planRelatedLocalService) {
        this.planRelatedLocalService = planRelatedLocalService;
    }

    /**
     * Returns the plan related remote service.
     *
     * @return the plan related remote service
     */
    public PlanRelatedService getPlanRelatedService() {
        return planRelatedService;
    }

    /**
     * Sets the plan related remote service.
     *
     * @param planRelatedService the plan related remote service
     */
    public void setPlanRelatedService(PlanRelatedService planRelatedService) {
        this.planRelatedService = planRelatedService;
    }

    /**
     * Returns the plan related persistence.
     *
     * @return the plan related persistence
     */
    public PlanRelatedPersistence getPlanRelatedPersistence() {
        return planRelatedPersistence;
    }

    /**
     * Sets the plan related persistence.
     *
     * @param planRelatedPersistence the plan related persistence
     */
    public void setPlanRelatedPersistence(
        PlanRelatedPersistence planRelatedPersistence) {
        this.planRelatedPersistence = planRelatedPersistence;
    }

    /**
     * Returns the plan section local service.
     *
     * @return the plan section local service
     */
    public PlanSectionLocalService getPlanSectionLocalService() {
        return planSectionLocalService;
    }

    /**
     * Sets the plan section local service.
     *
     * @param planSectionLocalService the plan section local service
     */
    public void setPlanSectionLocalService(
        PlanSectionLocalService planSectionLocalService) {
        this.planSectionLocalService = planSectionLocalService;
    }

    /**
     * Returns the plan section remote service.
     *
     * @return the plan section remote service
     */
    public PlanSectionService getPlanSectionService() {
        return planSectionService;
    }

    /**
     * Sets the plan section remote service.
     *
     * @param planSectionService the plan section remote service
     */
    public void setPlanSectionService(PlanSectionService planSectionService) {
        this.planSectionService = planSectionService;
    }

    /**
     * Returns the plan section persistence.
     *
     * @return the plan section persistence
     */
    public PlanSectionPersistence getPlanSectionPersistence() {
        return planSectionPersistence;
    }

    /**
     * Sets the plan section persistence.
     *
     * @param planSectionPersistence the plan section persistence
     */
    public void setPlanSectionPersistence(
        PlanSectionPersistence planSectionPersistence) {
        this.planSectionPersistence = planSectionPersistence;
    }

    /**
     * Returns the plan section definition local service.
     *
     * @return the plan section definition local service
     */
    public PlanSectionDefinitionLocalService getPlanSectionDefinitionLocalService() {
        return planSectionDefinitionLocalService;
    }

    /**
     * Sets the plan section definition local service.
     *
     * @param planSectionDefinitionLocalService the plan section definition local service
     */
    public void setPlanSectionDefinitionLocalService(
        PlanSectionDefinitionLocalService planSectionDefinitionLocalService) {
        this.planSectionDefinitionLocalService = planSectionDefinitionLocalService;
    }

    /**
     * Returns the plan section definition remote service.
     *
     * @return the plan section definition remote service
     */
    public PlanSectionDefinitionService getPlanSectionDefinitionService() {
        return planSectionDefinitionService;
    }

    /**
     * Sets the plan section definition remote service.
     *
     * @param planSectionDefinitionService the plan section definition remote service
     */
    public void setPlanSectionDefinitionService(
        PlanSectionDefinitionService planSectionDefinitionService) {
        this.planSectionDefinitionService = planSectionDefinitionService;
    }

    /**
     * Returns the plan section definition persistence.
     *
     * @return the plan section definition persistence
     */
    public PlanSectionDefinitionPersistence getPlanSectionDefinitionPersistence() {
        return planSectionDefinitionPersistence;
    }

    /**
     * Sets the plan section definition persistence.
     *
     * @param planSectionDefinitionPersistence the plan section definition persistence
     */
    public void setPlanSectionDefinitionPersistence(
        PlanSectionDefinitionPersistence planSectionDefinitionPersistence) {
        this.planSectionDefinitionPersistence = planSectionDefinitionPersistence;
    }

    /**
     * Returns the plan section plan map local service.
     *
     * @return the plan section plan map local service
     */
    public PlanSectionPlanMapLocalService getPlanSectionPlanMapLocalService() {
        return planSectionPlanMapLocalService;
    }

    /**
     * Sets the plan section plan map local service.
     *
     * @param planSectionPlanMapLocalService the plan section plan map local service
     */
    public void setPlanSectionPlanMapLocalService(
        PlanSectionPlanMapLocalService planSectionPlanMapLocalService) {
        this.planSectionPlanMapLocalService = planSectionPlanMapLocalService;
    }

    /**
     * Returns the plan section plan map remote service.
     *
     * @return the plan section plan map remote service
     */
    public PlanSectionPlanMapService getPlanSectionPlanMapService() {
        return planSectionPlanMapService;
    }

    /**
     * Sets the plan section plan map remote service.
     *
     * @param planSectionPlanMapService the plan section plan map remote service
     */
    public void setPlanSectionPlanMapService(
        PlanSectionPlanMapService planSectionPlanMapService) {
        this.planSectionPlanMapService = planSectionPlanMapService;
    }

    /**
     * Returns the plan section plan map persistence.
     *
     * @return the plan section plan map persistence
     */
    public PlanSectionPlanMapPersistence getPlanSectionPlanMapPersistence() {
        return planSectionPlanMapPersistence;
    }

    /**
     * Sets the plan section plan map persistence.
     *
     * @param planSectionPlanMapPersistence the plan section plan map persistence
     */
    public void setPlanSectionPlanMapPersistence(
        PlanSectionPlanMapPersistence planSectionPlanMapPersistence) {
        this.planSectionPlanMapPersistence = planSectionPlanMapPersistence;
    }

    /**
     * Returns the plans filter local service.
     *
     * @return the plans filter local service
     */
    public PlansFilterLocalService getPlansFilterLocalService() {
        return plansFilterLocalService;
    }

    /**
     * Sets the plans filter local service.
     *
     * @param plansFilterLocalService the plans filter local service
     */
    public void setPlansFilterLocalService(
        PlansFilterLocalService plansFilterLocalService) {
        this.plansFilterLocalService = plansFilterLocalService;
    }

    /**
     * Returns the plans filter remote service.
     *
     * @return the plans filter remote service
     */
    public PlansFilterService getPlansFilterService() {
        return plansFilterService;
    }

    /**
     * Sets the plans filter remote service.
     *
     * @param plansFilterService the plans filter remote service
     */
    public void setPlansFilterService(PlansFilterService plansFilterService) {
        this.plansFilterService = plansFilterService;
    }

    /**
     * Returns the plans filter persistence.
     *
     * @return the plans filter persistence
     */
    public PlansFilterPersistence getPlansFilterPersistence() {
        return plansFilterPersistence;
    }

    /**
     * Sets the plans filter persistence.
     *
     * @param plansFilterPersistence the plans filter persistence
     */
    public void setPlansFilterPersistence(
        PlansFilterPersistence plansFilterPersistence) {
        this.plansFilterPersistence = plansFilterPersistence;
    }

    /**
     * Returns the plans filter position local service.
     *
     * @return the plans filter position local service
     */
    public PlansFilterPositionLocalService getPlansFilterPositionLocalService() {
        return plansFilterPositionLocalService;
    }

    /**
     * Sets the plans filter position local service.
     *
     * @param plansFilterPositionLocalService the plans filter position local service
     */
    public void setPlansFilterPositionLocalService(
        PlansFilterPositionLocalService plansFilterPositionLocalService) {
        this.plansFilterPositionLocalService = plansFilterPositionLocalService;
    }

    /**
     * Returns the plans filter position remote service.
     *
     * @return the plans filter position remote service
     */
    public PlansFilterPositionService getPlansFilterPositionService() {
        return plansFilterPositionService;
    }

    /**
     * Sets the plans filter position remote service.
     *
     * @param plansFilterPositionService the plans filter position remote service
     */
    public void setPlansFilterPositionService(
        PlansFilterPositionService plansFilterPositionService) {
        this.plansFilterPositionService = plansFilterPositionService;
    }

    /**
     * Returns the plans filter position persistence.
     *
     * @return the plans filter position persistence
     */
    public PlansFilterPositionPersistence getPlansFilterPositionPersistence() {
        return plansFilterPositionPersistence;
    }

    /**
     * Sets the plans filter position persistence.
     *
     * @param plansFilterPositionPersistence the plans filter position persistence
     */
    public void setPlansFilterPositionPersistence(
        PlansFilterPositionPersistence plansFilterPositionPersistence) {
        this.plansFilterPositionPersistence = plansFilterPositionPersistence;
    }

    /**
     * Returns the plans user settings local service.
     *
     * @return the plans user settings local service
     */
    public PlansUserSettingsLocalService getPlansUserSettingsLocalService() {
        return plansUserSettingsLocalService;
    }

    /**
     * Sets the plans user settings local service.
     *
     * @param plansUserSettingsLocalService the plans user settings local service
     */
    public void setPlansUserSettingsLocalService(
        PlansUserSettingsLocalService plansUserSettingsLocalService) {
        this.plansUserSettingsLocalService = plansUserSettingsLocalService;
    }

    /**
     * Returns the plans user settings remote service.
     *
     * @return the plans user settings remote service
     */
    public PlansUserSettingsService getPlansUserSettingsService() {
        return plansUserSettingsService;
    }

    /**
     * Sets the plans user settings remote service.
     *
     * @param plansUserSettingsService the plans user settings remote service
     */
    public void setPlansUserSettingsService(
        PlansUserSettingsService plansUserSettingsService) {
        this.plansUserSettingsService = plansUserSettingsService;
    }

    /**
     * Returns the plans user settings persistence.
     *
     * @return the plans user settings persistence
     */
    public PlansUserSettingsPersistence getPlansUserSettingsPersistence() {
        return plansUserSettingsPersistence;
    }

    /**
     * Sets the plans user settings persistence.
     *
     * @param plansUserSettingsPersistence the plans user settings persistence
     */
    public void setPlansUserSettingsPersistence(
        PlansUserSettingsPersistence plansUserSettingsPersistence) {
        this.plansUserSettingsPersistence = plansUserSettingsPersistence;
    }

    /**
     * Returns the plan team history local service.
     *
     * @return the plan team history local service
     */
    public PlanTeamHistoryLocalService getPlanTeamHistoryLocalService() {
        return planTeamHistoryLocalService;
    }

    /**
     * Sets the plan team history local service.
     *
     * @param planTeamHistoryLocalService the plan team history local service
     */
    public void setPlanTeamHistoryLocalService(
        PlanTeamHistoryLocalService planTeamHistoryLocalService) {
        this.planTeamHistoryLocalService = planTeamHistoryLocalService;
    }

    /**
     * Returns the plan team history remote service.
     *
     * @return the plan team history remote service
     */
    public PlanTeamHistoryService getPlanTeamHistoryService() {
        return planTeamHistoryService;
    }

    /**
     * Sets the plan team history remote service.
     *
     * @param planTeamHistoryService the plan team history remote service
     */
    public void setPlanTeamHistoryService(
        PlanTeamHistoryService planTeamHistoryService) {
        this.planTeamHistoryService = planTeamHistoryService;
    }

    /**
     * Returns the plan team history persistence.
     *
     * @return the plan team history persistence
     */
    public PlanTeamHistoryPersistence getPlanTeamHistoryPersistence() {
        return planTeamHistoryPersistence;
    }

    /**
     * Sets the plan team history persistence.
     *
     * @param planTeamHistoryPersistence the plan team history persistence
     */
    public void setPlanTeamHistoryPersistence(
        PlanTeamHistoryPersistence planTeamHistoryPersistence) {
        this.planTeamHistoryPersistence = planTeamHistoryPersistence;
    }

    /**
     * Returns the plan template local service.
     *
     * @return the plan template local service
     */
    public PlanTemplateLocalService getPlanTemplateLocalService() {
        return planTemplateLocalService;
    }

    /**
     * Sets the plan template local service.
     *
     * @param planTemplateLocalService the plan template local service
     */
    public void setPlanTemplateLocalService(
        PlanTemplateLocalService planTemplateLocalService) {
        this.planTemplateLocalService = planTemplateLocalService;
    }

    /**
     * Returns the plan template remote service.
     *
     * @return the plan template remote service
     */
    public PlanTemplateService getPlanTemplateService() {
        return planTemplateService;
    }

    /**
     * Sets the plan template remote service.
     *
     * @param planTemplateService the plan template remote service
     */
    public void setPlanTemplateService(PlanTemplateService planTemplateService) {
        this.planTemplateService = planTemplateService;
    }

    /**
     * Returns the plan template persistence.
     *
     * @return the plan template persistence
     */
    public PlanTemplatePersistence getPlanTemplatePersistence() {
        return planTemplatePersistence;
    }

    /**
     * Sets the plan template persistence.
     *
     * @param planTemplatePersistence the plan template persistence
     */
    public void setPlanTemplatePersistence(
        PlanTemplatePersistence planTemplatePersistence) {
        this.planTemplatePersistence = planTemplatePersistence;
    }

    /**
     * Returns the plan template section local service.
     *
     * @return the plan template section local service
     */
    public PlanTemplateSectionLocalService getPlanTemplateSectionLocalService() {
        return planTemplateSectionLocalService;
    }

    /**
     * Sets the plan template section local service.
     *
     * @param planTemplateSectionLocalService the plan template section local service
     */
    public void setPlanTemplateSectionLocalService(
        PlanTemplateSectionLocalService planTemplateSectionLocalService) {
        this.planTemplateSectionLocalService = planTemplateSectionLocalService;
    }

    /**
     * Returns the plan template section remote service.
     *
     * @return the plan template section remote service
     */
    public PlanTemplateSectionService getPlanTemplateSectionService() {
        return planTemplateSectionService;
    }

    /**
     * Sets the plan template section remote service.
     *
     * @param planTemplateSectionService the plan template section remote service
     */
    public void setPlanTemplateSectionService(
        PlanTemplateSectionService planTemplateSectionService) {
        this.planTemplateSectionService = planTemplateSectionService;
    }

    /**
     * Returns the plan template section persistence.
     *
     * @return the plan template section persistence
     */
    public PlanTemplateSectionPersistence getPlanTemplateSectionPersistence() {
        return planTemplateSectionPersistence;
    }

    /**
     * Sets the plan template section persistence.
     *
     * @param planTemplateSectionPersistence the plan template section persistence
     */
    public void setPlanTemplateSectionPersistence(
        PlanTemplateSectionPersistence planTemplateSectionPersistence) {
        this.planTemplateSectionPersistence = planTemplateSectionPersistence;
    }

    /**
     * Returns the plan type local service.
     *
     * @return the plan type local service
     */
    public PlanTypeLocalService getPlanTypeLocalService() {
        return planTypeLocalService;
    }

    /**
     * Sets the plan type local service.
     *
     * @param planTypeLocalService the plan type local service
     */
    public void setPlanTypeLocalService(
        PlanTypeLocalService planTypeLocalService) {
        this.planTypeLocalService = planTypeLocalService;
    }

    /**
     * Returns the plan type remote service.
     *
     * @return the plan type remote service
     */
    public PlanTypeService getPlanTypeService() {
        return planTypeService;
    }

    /**
     * Sets the plan type remote service.
     *
     * @param planTypeService the plan type remote service
     */
    public void setPlanTypeService(PlanTypeService planTypeService) {
        this.planTypeService = planTypeService;
    }

    /**
     * Returns the plan type persistence.
     *
     * @return the plan type persistence
     */
    public PlanTypePersistence getPlanTypePersistence() {
        return planTypePersistence;
    }

    /**
     * Sets the plan type persistence.
     *
     * @param planTypePersistence the plan type persistence
     */
    public void setPlanTypePersistence(PlanTypePersistence planTypePersistence) {
        this.planTypePersistence = planTypePersistence;
    }

    /**
     * Returns the plan type attribute local service.
     *
     * @return the plan type attribute local service
     */
    public PlanTypeAttributeLocalService getPlanTypeAttributeLocalService() {
        return planTypeAttributeLocalService;
    }

    /**
     * Sets the plan type attribute local service.
     *
     * @param planTypeAttributeLocalService the plan type attribute local service
     */
    public void setPlanTypeAttributeLocalService(
        PlanTypeAttributeLocalService planTypeAttributeLocalService) {
        this.planTypeAttributeLocalService = planTypeAttributeLocalService;
    }

    /**
     * Returns the plan type attribute remote service.
     *
     * @return the plan type attribute remote service
     */
    public PlanTypeAttributeService getPlanTypeAttributeService() {
        return planTypeAttributeService;
    }

    /**
     * Sets the plan type attribute remote service.
     *
     * @param planTypeAttributeService the plan type attribute remote service
     */
    public void setPlanTypeAttributeService(
        PlanTypeAttributeService planTypeAttributeService) {
        this.planTypeAttributeService = planTypeAttributeService;
    }

    /**
     * Returns the plan type attribute persistence.
     *
     * @return the plan type attribute persistence
     */
    public PlanTypeAttributePersistence getPlanTypeAttributePersistence() {
        return planTypeAttributePersistence;
    }

    /**
     * Sets the plan type attribute persistence.
     *
     * @param planTypeAttributePersistence the plan type attribute persistence
     */
    public void setPlanTypeAttributePersistence(
        PlanTypeAttributePersistence planTypeAttributePersistence) {
        this.planTypeAttributePersistence = planTypeAttributePersistence;
    }

    /**
     * Returns the plan type column local service.
     *
     * @return the plan type column local service
     */
    public PlanTypeColumnLocalService getPlanTypeColumnLocalService() {
        return planTypeColumnLocalService;
    }

    /**
     * Sets the plan type column local service.
     *
     * @param planTypeColumnLocalService the plan type column local service
     */
    public void setPlanTypeColumnLocalService(
        PlanTypeColumnLocalService planTypeColumnLocalService) {
        this.planTypeColumnLocalService = planTypeColumnLocalService;
    }

    /**
     * Returns the plan type column remote service.
     *
     * @return the plan type column remote service
     */
    public PlanTypeColumnService getPlanTypeColumnService() {
        return planTypeColumnService;
    }

    /**
     * Sets the plan type column remote service.
     *
     * @param planTypeColumnService the plan type column remote service
     */
    public void setPlanTypeColumnService(
        PlanTypeColumnService planTypeColumnService) {
        this.planTypeColumnService = planTypeColumnService;
    }

    /**
     * Returns the plan type column persistence.
     *
     * @return the plan type column persistence
     */
    public PlanTypeColumnPersistence getPlanTypeColumnPersistence() {
        return planTypeColumnPersistence;
    }

    /**
     * Sets the plan type column persistence.
     *
     * @param planTypeColumnPersistence the plan type column persistence
     */
    public void setPlanTypeColumnPersistence(
        PlanTypeColumnPersistence planTypeColumnPersistence) {
        this.planTypeColumnPersistence = planTypeColumnPersistence;
    }

    /**
     * Returns the plan vote local service.
     *
     * @return the plan vote local service
     */
    public PlanVoteLocalService getPlanVoteLocalService() {
        return planVoteLocalService;
    }

    /**
     * Sets the plan vote local service.
     *
     * @param planVoteLocalService the plan vote local service
     */
    public void setPlanVoteLocalService(
        PlanVoteLocalService planVoteLocalService) {
        this.planVoteLocalService = planVoteLocalService;
    }

    /**
     * Returns the plan vote remote service.
     *
     * @return the plan vote remote service
     */
    public PlanVoteService getPlanVoteService() {
        return planVoteService;
    }

    /**
     * Sets the plan vote remote service.
     *
     * @param planVoteService the plan vote remote service
     */
    public void setPlanVoteService(PlanVoteService planVoteService) {
        this.planVoteService = planVoteService;
    }

    /**
     * Returns the plan vote persistence.
     *
     * @return the plan vote persistence
     */
    public PlanVotePersistence getPlanVotePersistence() {
        return planVotePersistence;
    }

    /**
     * Sets the plan vote persistence.
     *
     * @param planVotePersistence the plan vote persistence
     */
    public void setPlanVotePersistence(PlanVotePersistence planVotePersistence) {
        this.planVotePersistence = planVotePersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the resource remote service.
     *
     * @return the resource remote service
     */
    public ResourceService getResourceService() {
        return resourceService;
    }

    /**
     * Sets the resource remote service.
     *
     * @param resourceService the resource remote service
     */
    public void setResourceService(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    /**
     * Returns the resource persistence.
     *
     * @return the resource persistence
     */
    public ResourcePersistence getResourcePersistence() {
        return resourcePersistence;
    }

    /**
     * Sets the resource persistence.
     *
     * @param resourcePersistence the resource persistence
     */
    public void setResourcePersistence(ResourcePersistence resourcePersistence) {
        this.resourcePersistence = resourcePersistence;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
    }

    public void destroy() {
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    protected Class<?> getModelClass() {
        return FocusAreaOntologyTerm.class;
    }

    protected String getModelClassName() {
        return FocusAreaOntologyTerm.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = focusAreaOntologyTermPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}