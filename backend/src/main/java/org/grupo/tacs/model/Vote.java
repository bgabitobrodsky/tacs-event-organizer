package org.grupo.tacs.model;

import org.grupo.tacs.extras.Helper;

import java.time.LocalDateTime;

public class Vote {
    User user;
    LocalDateTime votingDate;
    String readAbleVotingDate;

    Long optionParentID;

    public Vote(Long idOpcion, User votante){
        this.user = votante;
        this.optionParentID = idOpcion;
        this.votingDate = LocalDateTime.now();
        this.readAbleVotingDate= Helper.getReadableDate(this.votingDate);
    }
}