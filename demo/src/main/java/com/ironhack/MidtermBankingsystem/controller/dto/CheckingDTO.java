package com.ironhack.MidtermBankingsystem.controller.dto;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;

import java.math.BigDecimal;

public class CheckingDTO extends AccountDTO {


    private AccountStatus status;

    private Integer ownedById;

    public CheckingDTO() {
    }

    public CheckingDTO(BigDecimal balance, AccountStatus status, Integer ownedById) {
        this.status = status;
        this.ownedById = ownedById;
        setBalance(balance);
    }



    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public Integer getOwnedById() {
        return ownedById;
    }

    public void setOwnedById(Integer ownedById) {
        this.ownedById = ownedById;
    }
}

