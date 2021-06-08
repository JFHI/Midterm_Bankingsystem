package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("2")
public class Checking extends Account {

    @Id
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
