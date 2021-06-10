package com.ironhack.MidtermBankingsystem.service;

import com.ironhack.MidtermBankingsystem.controller.dto.AccountStatusDTO;
import com.ironhack.MidtermBankingsystem.model.Account;
import com.ironhack.MidtermBankingsystem.repository.AccountRepository;
import com.ironhack.MidtermBankingsystem.service.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class AccountService implements IAccountService {

    @Autowired
    public AccountRepository accountRepository;


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

}