package org.xcolab.portlets.reporting.beans.proposalsinyear;

import com.ext.portlet.model.Contest;

/**
* @author pdeboer
*         First created on 01/07/14 at 10:46
*/
public class ProposalWithFinalistAndContent {
    private String url;
    private Long id;
    private String content = "";
    private String contentWithSectionTitles = "";
    private int proposalRibbon = 0;
    private int usedVersion = 0;
    private String proposalName = "";
	private boolean proposalMoved = false;
	private Contest contest;

	public boolean isProposalMoved() {
		return proposalMoved;
	}

	public void setProposalMoved(boolean proposalMoved) {
		this.proposalMoved = proposalMoved;
	}

	public Contest getContest() {
		return contest;
	}

	public void setContest(Contest contest) {
		this.contest = contest;
	}

	public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContentWithSectionTitles() {
        return contentWithSectionTitles;
    }

    public void setContentWithSectionTitles(String contentWithSectionTitles) {
        this.contentWithSectionTitles = contentWithSectionTitles;
    }

    public int getProposalRibbon() {
        return proposalRibbon;
    }

    public void setProposalRibbon(int proposalRibbon) {
        this.proposalRibbon = proposalRibbon;
    }

    public int getUsedVersion() {
        return usedVersion;
    }

    public void setUsedVersion(int usedVersion) {
        this.usedVersion = usedVersion;
    }

    public String getProposalName() {
        return proposalName;
    }

    public void setProposalName(String proposalName) {
        this.proposalName = proposalName;
    }
}
