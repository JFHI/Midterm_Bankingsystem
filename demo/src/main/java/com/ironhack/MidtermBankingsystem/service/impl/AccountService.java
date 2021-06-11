package com.ironhack.MidtermBankingsystem.service.impl;

import com.ironhack.MidtermBankingsystem.controller.dto.AccountDTO;
import com.ironhack.MidtermBankingsystem.controller.dto.AccountStatusDTO;
import com.ironhack.MidtermBankingsystem.controller.dto.CheckingDTO;
import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.model.Account;
import com.ironhack.MidtermBankingsystem.model.AccountHolder;
import com.ironhack.MidtermBankingsystem.model.Checking;
import com.ironhack.MidtermBankingsystem.repository.AccountHolderRepository;
import com.ironhack.MidtermBankingsystem.repository.AccountRepository;
import com.ironhack.MidtermBankingsystem.service.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    public AccountRepository accountRepository;

    @Autowired
    public AccountHolderRepository accountHolderRepository;





    public void updateStatus(Integer id, AccountStatusDTO statusDTO) {
        Optional<Account> account = accountRepository.findById(id);
        if (account.isPresent()) {
            try {
                account.get().setStatus(statusDTO.getAccountStatus());
                accountRepository.save(account.get());
            } catch (Exception e) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Status value not valid.");
            }
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The accountId doesn't exist.");
        }
    }


    public Account create(CheckingDTO checkingDTO) {

        Optional<AccountHolder> accountHolder = accountHolderRepository.findById(checkingDTO.getOwnedById());
        Account newCkecking = new Checking(checkingDTO.getBalance(), checkingDTO.getStatus(), accountHolder.get());

            return accountRepository.save(newCkecking);

    }

}