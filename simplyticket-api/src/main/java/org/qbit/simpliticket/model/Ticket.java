package org.qbit.simpliticket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Benek on 17.10.2016.
 */
@Entity
@Table(name = "TICKET")
public class Ticket extends AbstractEntity {

    @Column(name = "SNOW_REF_NUMBER", nullable = false)
    private String snowRefNumber;

    @Column(name = "THIRD_PARTY_REF_NUMBER", nullable = false)
    private String thirdPartyRefNumber;

    public String getSnowRefNumber() {
        return snowRefNumber;
    }

    public void setSnowRefNumber(String snowRefNumber) {
        this.snowRefNumber = snowRefNumber;
    }

    public String getThirdPartyRefNumber() {
        return thirdPartyRefNumber;
    }

    public void setThirdPartyRefNumber(String thirdPartyRefNumber) {
        this.thirdPartyRefNumber = thirdPartyRefNumber;
    }
}

