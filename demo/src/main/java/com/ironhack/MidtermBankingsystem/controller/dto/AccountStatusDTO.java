package com.ironhack.MidtermBankingsystem.controller.dto;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.utils.Utils;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;

public class AccountStatusDTO {

    @NotEmpty(message = "Status can't be empty or null")
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AccountStatus getAccountStatus(){
        return AccountStatus.valueOf(status);
    }

    public void setAccountStatus(AccountStatus accountStatus){
        this.status = accountStatus.toString();
    }
}
