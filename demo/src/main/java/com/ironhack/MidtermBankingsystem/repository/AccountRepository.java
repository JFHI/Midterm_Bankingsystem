package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {


}
