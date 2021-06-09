package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import org.hibernate.annotations.Target;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Formatter;
import java.util.Random;

@Entity
@DiscriminatorValue("checking")
public class Checking extends Account {

    private Integer checkingNumber;

    private BigDecimal monthlyMaintanceFee = BigDecimal.valueOf(12);

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;


    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;



    public Checking() {
    }


    public Checking(BigDecimal balance, Integer checkingNumber, AccountStatus status, AccountHolder ownedBy) {
        this.checkingNumber = checkingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
        setBalance(balance);
    }

    @Override
    public void setBalance(BigDecimal balance) {
        BigDecimal vgl = new BigDecimal(250);
        if (balance.compareTo(BigDecimal.valueOf(250))<0){
           super.setBalance(balance.subtract(getPenaltyFee()));
            System.out.println();
        } else{
            super.setBalance(balance);
        }
    }



    //Getter und Setter
    public Integer getCheckingNumber() {
        return checkingNumber;
    }

    public void setCheckingNumber(Integer checkingNumber) {
        this.checkingNumber = checkingNumber;
    }

    public BigDecimal getMonthlyMaintanceFee() {
        return monthlyMaintanceFee;
    }

    public void setMonthlyMaintanceFee(BigDecimal monthlyMaintanceFee) {
        this.monthlyMaintanceFee = monthlyMaintanceFee;
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
