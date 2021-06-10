package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.utils.Utils;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("creditCard")
public class CreditCard extends Account{

    private Integer creditCardNumber;         //creditcardnr.
    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;
    private BigDecimal creditLimit;
    private BigDecimal interestRate= BigDecimal.valueOf(0.2);

    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;



    public CreditCard() {
    }


    public CreditCard(AccountStatus status, BigDecimal creditLimit, AccountHolder ownedBy) {
        setCreditCardNumber(Utils.RandomCreditCardNumber());
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
