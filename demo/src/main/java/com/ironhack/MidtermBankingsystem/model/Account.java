package com.ironhack.MidtermBankingsystem.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Account {

    //Id ? Braucht man ja eigentlich nicht > Account als parent class existiert ja nur übergeordnet und soll zur Vererbung dienen

    private Integer secretKey;          //PIN oder Passwort
    private BigDecimal balance;
    private BigDecimal penaltyFee;
    private BigDecimal monthlyMaintanceFee;
    private BigDecimal interestRate;

    public Account() {
    }

    public Account(Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate) {
        this.secretKey = secretKey;
        this.balance = balance;
        this.penaltyFee = penaltyFee;
        this.monthlyMaintanceFee = monthlyMaintanceFee;
        this.interestRate = interestRate;
    }

    public Integer getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(Integer secretKey) {
        this.secretKey = secretKey;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public BigDecimal getMonthlyMaintanceFee() {
        return monthlyMaintanceFee;
    }

    public void setMonthlyMaintanceFee(BigDecimal monthlyMaintanceFee) {
        this.monthlyMaintanceFee = monthlyMaintanceFee;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
