package com.ironhack.MidtermBankingsystem.model;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@DiscriminatorValue("saving")
public class Saving extends Account {

    private Integer savingNumber;         //Kontonr.

    @Enumerated(value = EnumType.STRING)
    private AccountStatus status;

    @ManyToOne()
    @JoinColumn (name = "owned_by")
    private AccountHolder ownedBy;

    public Saving() {
    }

    public Saving (BigDecimal balance, Integer savingNumber, AccountStatus status, AccountHolder ownedBy) {
        this.savingNumber = savingNumber;
        this.status = status;
        this.ownedBy = ownedBy;
        setBalance(balance);
    }



    @Override
    public void setBalance(BigDecimal balance) {
        BigDecimal vgl = new BigDecimal(100);
        if (balance.compareTo(BigDecimal.valueOf(100))<0){
            super.setBalance(balance.subtract(getPenaltyFee()));
            System.out.println();
        } else{
            super.setBalance(balance);
        }
    }


}
