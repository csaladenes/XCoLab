package org.xcolab.proposals.events;

import com.ext.portlet.model.Proposal;
import com.liferay.portal.model.User;

public class ProposalVotedOnEvent extends BaseProposalUserActivityEvent {

    public ProposalVotedOnEvent(Proposal proposal, User user) {
        super(proposal, user);
    }

}
