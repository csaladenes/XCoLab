package com.ext.portlet.plans.service.impl;

import java.util.Date;

import com.ext.portlet.plans.NoSuchPlanTeamHistoryException;
import com.ext.portlet.plans.model.PlanTeamHistory;
import com.ext.portlet.plans.service.base.PlanTeamHistoryLocalServiceBaseImpl;
import com.liferay.counter.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the plan team history local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.plans.service.PlanTeamHistoryLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.plans.service.base.PlanTeamHistoryLocalServiceBaseImpl
 * @see com.ext.portlet.plans.service.PlanTeamHistoryLocalServiceUtil
 */
public class PlanTeamHistoryLocalServiceImpl
    extends PlanTeamHistoryLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.ext.portlet.plans.service.PlanTeamHistoryLocalServiceUtil} to access the plan team history local service.
     */

    public PlanTeamHistory newHistoryItem(Long planId, Long userId, String action, Long updateAuthorId) throws SystemException {
        return newHistoryItem(planId, userId, action, null, updateAuthorId);
    }
        
    public PlanTeamHistory newHistoryItem(Long planId, Long userId, String action, String payload, Long updateAuthorId) throws SystemException {
        long id = CounterLocalServiceUtil.increment(PlanTeamHistory.class.getName());
        
        PlanTeamHistory planTeamHistory = createPlanTeamHistory(id);
        
        planTeamHistory.setPlanId(planId);
        planTeamHistory.setUserId(userId);
        planTeamHistory.setAction(action);
        planTeamHistory.setPayload(payload);
        planTeamHistory.setUpdateAuthorId(updateAuthorId);
        planTeamHistory.setCreated(new Date());
        
        planTeamHistory.store();
        
        return planTeamHistory;
    }
    
    public PlanTeamHistory getLastUserActionInPlan(Long planId, Long userId) throws NoSuchPlanTeamHistoryException, SystemException {
        return planTeamHistoryPersistence.findByLastUserActionInPlan(planId, userId);
    }
}