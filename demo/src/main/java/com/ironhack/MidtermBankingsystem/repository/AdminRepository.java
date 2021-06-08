package com.ironhack.MidtermBankingsystem.repository;

import com.ironhack.MidtermBankingsystem.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
