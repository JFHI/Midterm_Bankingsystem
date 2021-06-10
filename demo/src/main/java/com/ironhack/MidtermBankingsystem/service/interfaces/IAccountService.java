package com.ironhack.MidtermBankingsystem.service.interfaces;

import com.ironhack.MidtermBankingsystem.controller.dto.AccountStatusDTO;
import com.ironhack.MidtermBankingsystem.model.Account;

public interface IAccountService {


    void updateStatus(Integer id, AccountStatusDTO accountStatusDTO);

}



//Doctor Bsp:

//      Doctor store(DoctorDTO doctorDTO);
//
//    void updateStatus(String id, DoctorStatusDTO doctorStatusDTO);
//
//    void updateDepartment(String id, DoctorDepartmentDTO doctorDepartmentDTO);