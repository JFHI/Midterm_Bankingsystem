package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("checking")
public class Checking extends Account {

    private Integer checkingNumber;         //Kontonr.

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;

    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;

    @ManyToOne()
    @JoinColumn (name = "admitted_by")
    private Admin admittedBy;               //soll AdminId sein


    public Checking() {
    }


    public Checking(Integer id, Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate) {
        super(id, secretKey, balance, penaltyFee, monthlyMaintanceFee, interestRate);
    }

    public Checking(Integer checkingNumber, AccountStatus status, AccountHolder ownedBy, Admin admittedBy) {
        this.checkingNumber = checkingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
        this.admittedBy = admittedBy;
    }

    public Checking(Integer id, Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate, Integer checkingNumber, AccountStatus status, AccountHolder ownedBy, Admin admittedBy) {
        super(id, secretKey, balance, penaltyFee, monthlyMaintanceFee, interestRate);
        this.checkingNumber = checkingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
        this.admittedBy = admittedBy;
    }

    public Integer getCheckingNumber() {
        return checkingNumber;
    }

    public void setCheckingNumber(Integer checkingNumber) {
        this.checkingNumber = checkingNumber;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }


}
