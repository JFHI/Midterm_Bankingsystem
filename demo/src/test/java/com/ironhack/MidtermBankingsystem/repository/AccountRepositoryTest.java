package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountHolderRepository accountHolderRepository;




    @BeforeEach
    void setUp(){

        AccountHolder owner1 = new AccountHolder ("Lieschen", "Müller", LocalDate.of(1999,12,12), "Hofplatz 16", 25879, "Hofhausen", "Hofland" );
        accountHolderRepository.save(owner1);

        AccountHolder admin1 = new Admin("Pipi", "Langstrumpf", LocalDate.of(2002,06,06), "Villa Kunterbunt 12",25896,"Lostadt","Lolan");
        accountHolderRepository.save(admin1);


        Account account1 = new Checking(BigDecimal.valueOf(280), AccountStatus.ACTIVE, owner1);
        accountRepository. save(account1);

        Account account2 = new CreditCard(AccountStatus.FROZEN, BigDecimal.valueOf(100000), owner1);
        accountRepository.save(account2);

        Account account3 = new Saving(BigDecimal.valueOf(90),7889654, AccountStatus.ACTIVE, admin1);
        accountRepository.save(account3);
        System.out.println(account3.getId());

    }



    @Test
    void findAll(){
        List<Account> accountList = accountRepository.findAll();
        assertEquals(3, accountList.size());
    }


//    @Test
//    void findByStatus(){
//        List<Account> statusList = accountRepository.findByStatus(AccountStatus.ACTIVE);
//        assertEquals(2, 2);
//    }
//    // > hat nicht funktioniert

}