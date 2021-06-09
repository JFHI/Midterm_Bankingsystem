package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Formatter;
import java.util.Random;

@Entity
@DiscriminatorValue("checking")
public class Checking extends Account {

    private Integer checkingNumber;
    private final BigDecimal monthlyMaintanceFeemonthlyMaintanceFeeChecking = BigDecimal.valueOf(12);

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;


    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;



    public Checking() {
    }


    public Checking(Integer checkingNumber, AccountStatus status, AccountHolder ownedBy) {
        this.checkingNumber = checkingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
    }

    @Override
    public void setBalance(BigDecimal balance) {
        if (BigDecimal.valueOf(balance)<BigDecimal.valueOf(250)) {

        }
        super.setBalance(balance);
    }

    //Getter und Setter
    public Integer getCheckingNumber() {
        return checkingNumber;
    }

    public void setCheckingNumber(Integer checkingNumber) {
        this.checkingNumber = checkingNumber;
    }

    public BigDecimal getMonthlyMaintanceFeemonthlyMaintanceFeeChecking() {
        return monthlyMaintanceFeemonthlyMaintanceFeeChecking;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public AccountHolder getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(AccountHolder ownedBy) {
        this.ownedBy = ownedBy;
    }
}
