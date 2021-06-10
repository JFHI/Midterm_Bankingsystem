package com.ironhack.MidtermBankingsystem.controller;

import com.ironhack.MidtermBankingsystem.controller.dto.AccountStatusDTO;
import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.model.Account;
import com.ironhack.MidtermBankingsystem.repository.AccountRepository;
import com.ironhack.MidtermBankingsystem.service.interfaces.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private IAccountService accountService;

    @GetMapping("/accounts")
    @ResponseStatus(HttpStatus.OK)
    public List<Account> findAll(){
        return accountRepository.findAll();
    }

    @GetMapping ("/accounts/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Account findById(@PathVariable Integer id){
        return accountRepository.findById(id).get();
    }

    @PatchMapping("/accounts/{id}/status")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStatus(@PathVariable Integer id, @RequestBody @Valid AccountStatusDTO accountStatusDTO){
        accountService.updateStatus(id, accountStatusDTO);
    }

//    @PutMapping ("/accounts/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void update(@PathVariable Integer id), @RequestBody Integer id)

}
