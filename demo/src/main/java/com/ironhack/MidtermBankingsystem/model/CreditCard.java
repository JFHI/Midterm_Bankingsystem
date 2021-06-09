package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("creditCard")
public class CreditCard extends Account{

    private Integer creditCardNumber;         //creditcardnr.
    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;
    private BigDecimal creditLimit;

    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;



    public CreditCard() {
    }


    public CreditCard(Integer creditCardNumber, AccountStatus status, BigDecimal creditLimit, AccountHolder ownedBy) {
        this.creditCardNumber= creditCardNumber;
        this.status = status;
        this.creditLimit = creditLimit;
        this.ownedBy = ownedBy;

    }


//GETTER und SETTER


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

    public AccountHolder getOwnedBy() {
        return ownedBy;
    }

    public void setOwnedBy(AccountHolder ownedBy) {
        this.ownedBy = ownedBy;
    }
}
