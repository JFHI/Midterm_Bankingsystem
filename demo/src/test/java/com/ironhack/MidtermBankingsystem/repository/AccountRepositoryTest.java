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

import java.sql.Date;
import java.text.DateFormat;
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

        AccountHolder owner1 = new AccountHolder(1, "Lieschen", "Müller", new Date (1999,9,9), "Hofplatz 16", 25879, "Hofhausen", "Hofland" );
        accountHolderRepository.save(owner1);

        Admin admin1 = new Admin(1, "Pipi", "Langstrumpf", new Date(1999,9,9), "Villa Kunterbunt 12",25896,"Lostadt","Lolan","ad1");
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