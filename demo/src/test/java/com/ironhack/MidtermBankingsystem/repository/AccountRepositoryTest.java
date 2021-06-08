package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.model.Account;
import com.ironhack.MidtermBankingsystem.model.AccountHolder;
import com.ironhack.MidtermBankingsystem.model.Admin;
import com.ironhack.MidtermBankingsystem.model.Checking;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountHolderRepository accountHolderRepository;

    @Autowired
    AdminRepository adminRepository;


    @BeforeEach
    void setUp(){

        AccountHolder owner1 = new AccountHolder ("Lieschen", "Müller", LocalDate.of(1999,12,12), "Hofplatz 16", 25879, "Hofhausen", "Hofland" );
        accountHolderRepository.save(owner1);

        Admin admin1 = new Admin("Pipi", "Langstrumpf", LocalDate.of(2002,06,06), "Villa Kunterbunt 12",25896,"Lostadt","Lolan");
        adminRepository.save(admin1);
        

        Account account1 = new Checking(123654, AccountStatus.ACTIVE, owner1,admin1);
        accountRepository. save(account1);

    }



    @Test
    void findAll(){
        List<Account> accountList = accountRepository.findAll();
        assertEquals(1, accountList.size());
    }



}