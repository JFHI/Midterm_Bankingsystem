package com.ironhack.MidtermBankingsystem.service.interfaces;

import com.ironhack.MidtermBankingsystem.controller.dto.AccountStatusDTO;
import com.ironhack.MidtermBankingsystem.controller.dto.CheckingDTO;
import com.ironhack.MidtermBankingsystem.model.Account;

import java.text.ParseException;

public interface IAccountService {

    Account create(CheckingDTO checkingDTO) throws ParseException;

    void updateStatus(Integer id, AccountStatusDTO accountStatusDTO);

}



