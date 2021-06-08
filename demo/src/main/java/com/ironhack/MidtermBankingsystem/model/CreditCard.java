package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("creditCard")
public class CreditCard {

    private Integer creditCardNumber;         //creditcardnr.

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;

    private BigDecimal creditLimit;


    public CreditCard() {
    }

    public CreditCard(Integer creditCardNumber, AccountStatus status, BigDecimal creditLimit) {
        this.creditCardNumber = creditCardNumber;
        this.status = status;
        this.creditLimit = creditLimit;
    }

    public Integer getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(Integer creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }


}
