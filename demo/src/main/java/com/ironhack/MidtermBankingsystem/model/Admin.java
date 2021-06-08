package com.ironhack.MidtermBankingsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("admin")
public class Admin extends AccountHolder{


    private String adminId;

    @OneToMany(mappedBy = "admittedBy")
    @JsonIgnore
    private List<Checking> checkingAccountsAdmitted;        //Anzeigen aller ckecking accounts, die ein Admin betreut


    public Admin() {
    }

    public Admin(Integer accountHolderId, String fName, String lName, Date dateOfBirth, String street, Integer zipCode, String city, String country) {
        super(accountHolderId, fName, lName, dateOfBirth, street, zipCode, city, country);
    }



    public Admin(String adminId, List<Checking> checkingAccountsAdmitted) {
        this.adminId = adminId;
        this.checkingAccountsAdmitted = checkingAccountsAdmitted;
    }

    public Admin(String adminId) {
        this.adminId = adminId;
    }

    public Admin(Integer accountHolderId, String fName, String lName, Date dateOfBirth, String street, Integer zipCode, String city, String country, String adminId) {
        super(accountHolderId, fName, lName, dateOfBirth, street, zipCode, city, country);
        this.adminId = adminId;
    }

    public Admin(Integer accountHolderId, String fName, String lName, Date dateOfBirth, String street, Integer zipCode, String city, String country, String adminId, List<Checking> checkingAccountsAdmitted) {
        super(accountHolderId, fName, lName, dateOfBirth, street, zipCode, city, country);
        this.adminId = adminId;
        this.checkingAccountsAdmitted = checkingAccountsAdmitted;
    }

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public List<Checking> getCheckingAccountsAdmitted() {
        return checkingAccountsAdmitted;
    }

    public void setCheckingAccountsAdmitted(List<Checking> checkingAccountsAdmitted) {
        this.checkingAccountsAdmitted = checkingAccountsAdmitted;
    }
}
