package org.xcolab.portlets.randomproposals;

import java.util.List;


public class ProposalsModel{
	private RandomProposalsPreferences _preferences;
	private String _baseImagePath;

	private static List<ProposalWrapper> _proposals;
	
	public ProposalsModel(List<ProposalWrapper> proposals, RandomProposalsPreferences preferences, String baseImagePath){
		_proposals = proposals;
		_preferences = preferences;
		_baseImagePath = baseImagePath;
	}
	
	public RandomProposalsPreferences getPreferences() {
		return _preferences;
	}

	public String getBaseImagePath() {
		return _baseImagePath;
	}
	
	public List<ProposalWrapper> getProposals(){
		return _proposals;		
	}
 
}