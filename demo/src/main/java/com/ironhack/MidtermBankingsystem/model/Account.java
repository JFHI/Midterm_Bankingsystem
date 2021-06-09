package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.utils.Utils;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="account_type",
        discriminatorType = DiscriminatorType.STRING)

public abstract class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    private Integer secretKey = Utils.RandomSecretKey();

    private BigDecimal balance = BigDecimal.valueOf(0);
    private BigDecimal penaltyFee = BigDecimal.valueOf(40);
    private BigDecimal monthlyMaintanceFee;
    private BigDecimal interestRate;

    public Account() {
    }


    public Account(BigDecimal balance, BigDecimal penaltyFee, BigDecimal monthlyMaintanceFee, BigDecimal interestRate) {
        setSecretKey(Utils.RandomSecretKey());
        this.balance = balance;
        this.monthlyMaintanceFee = monthlyMaintanceFee;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }


//    GETTER und SETTER

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setSecretKey(Integer secretKey) {
        this.secretKey = secretKey;
    }

    public Integer getSecretKey() {
        return secretKey;
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
