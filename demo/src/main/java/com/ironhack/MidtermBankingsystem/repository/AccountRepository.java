package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.enums.AccountStatus;
import com.ironhack.MidtermBankingsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


    List<Account> findByStatus(AccountStatus status);

    Optional<Account> findById(Integer id);

}
