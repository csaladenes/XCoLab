package com.ext.portlet.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.ext.portlet.NoSuchContestPhaseException;
import com.ext.portlet.contests.ContestStatus;
import com.ext.portlet.model.Contest;
import com.ext.portlet.model.ContestPhase;
import com.ext.portlet.model.ContestPhaseColumn;
import com.ext.portlet.model.PlanItem;
import com.ext.portlet.service.ContestLocalServiceUtil;
import com.ext.portlet.service.ContestPhaseColumnLocalServiceUtil;
import com.ext.portlet.service.ContestPhaseLocalServiceUtil;
import com.ext.portlet.service.ContestPhaseTypeLocalServiceUtil;
import com.ext.portlet.service.PlanItemLocalServiceUtil;
import com.ext.portlet.service.base.ContestPhaseLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the contest phase local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.ext.portlet.service.ContestPhaseLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.base.ContestPhaseLocalServiceBaseImpl
 * @see com.ext.portlet.service.ContestPhaseLocalServiceUtil
 */
public class ContestPhaseLocalServiceImpl
    extends ContestPhaseLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.ext.portlet.service.ContestPhaseLocalServiceUtil} to access the contest phase local service.
     */

    public List<PlanItem> getPlans(ContestPhase contestPhase) throws SystemException, PortalException {
        return PlanItemLocalServiceUtil.getPlans(Collections.emptyMap(),Collections.emptyMap(),0L,contestPhase.getContestPhasePK(),
                0,Integer.MAX_VALUE,"","",false);
        //return PlanItemLocalServiceUtil.getPlansInContestPhase(this);
    }

    public ContestStatus getContestStatus(ContestPhase contestPhase) throws SystemException, PortalException {
        String status = ContestPhaseTypeLocalServiceUtil.getContestPhaseType(contestPhase.getContestPhaseType()).getStatus();
        return status == null?null:ContestStatus.valueOf(status);
    }

    public List<String> getPhaseColumns(ContestPhase contestPhase) throws SystemException {
        List<String> ret = new ArrayList<String>();
        for (ContestPhaseColumn phaseColumn: ContestPhaseColumnLocalServiceUtil.getPhaseColumns(contestPhase.getContestPhasePK())) {
            ret.add(phaseColumn.getColumnName());
        }
        return ret;
    }

    public List<ContestPhaseColumn> getPhaseColumnsRaw(ContestPhase contestPhase) throws SystemException {
        return ContestPhaseColumnLocalServiceUtil.getPhaseColumns(contestPhase.getContestPhasePK());
    }


    public List<ContestPhase> getPreviousPhases(ContestPhase contestPhase) throws SystemException, PortalException {
        List<ContestPhase> phases = ContestPhaseLocalServiceUtil.getPhasesForContest(getContest(contestPhase));
        List<ContestPhase> ret = new ArrayList<ContestPhase>();
        for (ContestPhase phase: phases) {
            if (phase.getPhaseStartDate().before(contestPhase.getPhaseStartDate())) {
                ret.add(phase);
            }
        }
        return ret;
    }

    public ContestPhase getNextContestPhase(ContestPhase contestPhase) throws SystemException, PortalException {
        boolean currentFound = false;
        for (ContestPhase phase: ContestPhaseLocalServiceUtil.getPhasesForContest(getContest(contestPhase))) {
            if (currentFound) {
                return phase;
            }
            if (phase.getContestPhasePK() == contestPhase.getContestPhasePK()) {
                currentFound = true;
            }
        }
        throw new SystemException("Can't find next phase for phase with id: " + contestPhase.getContestPhasePK());
    }

    public boolean getPhaseActive(ContestPhase contestPhase) {
        if (contestPhase.getPhaseStartDate() != null && contestPhase.getPhaseEndDate() != null) {
            java.util.Date now = new java.util.Date();
            return now.after(contestPhase.getPhaseStartDate()) && now.before(contestPhase.getPhaseEndDate());
        }
        return false;
    }

    

   public List<ContestPhase> getPhasesForContest(Contest contest) throws SystemException {
       List<ContestPhase> result = new ArrayList<ContestPhase>();
       return contestPhasePersistence.findByContestId(contest.getContestPK());
   }

   public ContestPhase getActivePhaseForContest(Contest contest) throws NoSuchContestPhaseException, SystemException {
       Date now = new Date();
       return contestPhasePersistence.findByContestIdStartEnd(contest.getContestPK(), now, now);
   }


   /** from ContestPhaseImpl **/


   public Contest getContest(ContestPhase contestPhase) throws SystemException, PortalException {
       return ContestLocalServiceUtil.getContest(contestPhase.getContestPK());
   }
   
   public String getName(ContestPhase contestPhase) throws PortalException, SystemException {
       return ContestPhaseTypeLocalServiceUtil.getContestPhaseType(contestPhase.getContestPhaseType()).getName();
   }

}