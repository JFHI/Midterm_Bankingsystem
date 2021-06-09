package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("saving")
public class Saving extends Account {

    private Integer savingNumber;         //Kontonr.

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;

    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;

    public Saving() {
    }

    public Saving (Integer savingNumber, AccountStatus status, AccountHolder ownedBy) {
        this.savingNumber = savingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
    }
//
//    public Saving(Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate, Integer savingNumber, AccountStatus status, AccountHolder ownedBy) {
//        super(secretKey, balance, penaltyFee, monthlyMaintanceFee, interestRate);
//        this.savingNumber = savingNumber;
//        this.status = status;
//        this.ownedBy = ownedBy;
//    }
}
