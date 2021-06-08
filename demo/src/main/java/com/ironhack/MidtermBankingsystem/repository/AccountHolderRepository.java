package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.model.AccountHolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountHolderRepository extends JpaRepository<AccountHolder, Integer> {

}
