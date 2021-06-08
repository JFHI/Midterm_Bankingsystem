package com.ironhack.MidtermBankingsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("admin")
public class Admin extends AccountHolder{



//    @OneToMany(mappedBy = "admittedBy")
//    @JsonIgnore
//    private List<Checking> checkingAccountsAdmitted;        //Anzeigen aller ckecking accounts, die ein Admin betreut


    public Admin() {
    }


    public Admin(String fName, String lName, LocalDate dateOfBirth, String street, Integer zipCode, String city, String country) {
        super(fName, lName, dateOfBirth, street, zipCode, city, country);

    }
}
