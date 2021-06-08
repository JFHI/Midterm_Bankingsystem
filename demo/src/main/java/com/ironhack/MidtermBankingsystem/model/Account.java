package com.ironhack.MidtermBankingsystem.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="account_type",
        discriminatorType = DiscriminatorType.INTEGER)

public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer secretKey;          //PIN oder Passwort
    private BigDecimal balance;
    private BigDecimal penaltyFee;
    private BigDecimal monthlyMaintanceFee;
    private BigDecimal interestRate;

    public Account() {
    }

    public Account(Integer id, Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate) {
        this.id = id;
        this.secretKey = secretKey;
        this.balance = balance;
        this.penaltyFee = penaltyFee;
        this.monthlyMaintanceFee = monthlyMaintanceFee;
        this.interestRate = interestRate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
