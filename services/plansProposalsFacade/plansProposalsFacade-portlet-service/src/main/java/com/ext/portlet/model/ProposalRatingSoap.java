package com.ext.portlet.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.ext.portlet.service.http.ProposalRatingServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.ext.portlet.service.http.ProposalRatingServiceSoap
 * @generated
 */
public class ProposalRatingSoap implements Serializable {
    private long _id;
    private long _proposalId;
    private long _contestPhaseId;
    private long _userId;
    private long _ratingValueId;
    private String _comment;
    private boolean _commentEnabled;
    private String _otherDataString;

    public ProposalRatingSoap() {
    }

    public static ProposalRatingSoap toSoapModel(ProposalRating model) {
        ProposalRatingSoap soapModel = new ProposalRatingSoap();

        soapModel.setId(model.getId());
        soapModel.setProposalId(model.getProposalId());
        soapModel.setContestPhaseId(model.getContestPhaseId());
        soapModel.setUserId(model.getUserId());
        soapModel.setRatingValueId(model.getRatingValueId());
        soapModel.setComment(model.getComment());
        soapModel.setCommentEnabled(model.getCommentEnabled());
        soapModel.setOtherDataString(model.getOtherDataString());

        return soapModel;
    }

    public static ProposalRatingSoap[] toSoapModels(ProposalRating[] models) {
        ProposalRatingSoap[] soapModels = new ProposalRatingSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static ProposalRatingSoap[][] toSoapModels(ProposalRating[][] models) {
        ProposalRatingSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new ProposalRatingSoap[models.length][models[0].length];
        } else {
            soapModels = new ProposalRatingSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static ProposalRatingSoap[] toSoapModels(List<ProposalRating> models) {
        List<ProposalRatingSoap> soapModels = new ArrayList<ProposalRatingSoap>(models.size());

        for (ProposalRating model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new ProposalRatingSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _id;
    }

    public void setPrimaryKey(long pk) {
        setId(pk);
    }

    public long getId() {
        return _id;
    }

    public void setId(long id) {
        _id = id;
    }

    public long getProposalId() {
        return _proposalId;
    }

    public void setProposalId(long proposalId) {
        _proposalId = proposalId;
    }

    public long getContestPhaseId() {
        return _contestPhaseId;
    }

    public void setContestPhaseId(long contestPhaseId) {
        _contestPhaseId = contestPhaseId;
    }

    public long getUserId() {
        return _userId;
    }

    public void setUserId(long userId) {
        _userId = userId;
    }

    public long getRatingValueId() {
        return _ratingValueId;
    }

    public void setRatingValueId(long ratingValueId) {
        _ratingValueId = ratingValueId;
    }

    public String getComment() {
        return _comment;
    }

    public void setComment(String comment) {
        _comment = comment;
    }

    public boolean getCommentEnabled() {
        return _commentEnabled;
    }

    public boolean isCommentEnabled() {
        return _commentEnabled;
    }

    public void setCommentEnabled(boolean commentEnabled) {
        _commentEnabled = commentEnabled;
    }

    public String getOtherDataString() {
        return _otherDataString;
    }

    public void setOtherDataString(String otherDataString) {
        _otherDataString = otherDataString;
    }
}
