package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.utils.Utils;
import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="account_type",
        discriminatorType = DiscriminatorType.STRING)

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;

    private Integer secretKey = Utils.RandomSecretKey();

    private BigDecimal balance;
    private BigDecimal penaltyFee = BigDecimal.valueOf(40);
    private BigDecimal interestRate;

    public Account() {
    }


    public Account(BigDecimal balance, BigDecimal penaltyFee, BigDecimal interestRate) {
        setSecretKey(Utils.RandomSecretKey());
        this.balance = balance;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;

    }

    public Account(Integer id, AccountStatus status, Integer secretKey, BigDecimal balance, BigDecimal penaltyFee, BigDecimal interestRate) {
        this.id = id;
        this.status = status;
        this.secretKey = secretKey;
        this.balance = balance;
        this.penaltyFee = penaltyFee;
        this.interestRate = interestRate;
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


    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public AccountStatus getStatus(){
        return status;
    }

    public void setStatus(AccountStatus status){
        this.status = status;
    }
}
