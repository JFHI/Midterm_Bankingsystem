package com.ironhack.MidtermBankingsystem.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="user_type",
        discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("owner")

public class AccountHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountHolderId;
    private String fName;
    private String lName;
    private LocalDate dateOfBirth;
    private String street;
    private Integer zipCode;
    private String city;
    private String country;

    @OneToMany(mappedBy = "ownedBy")
    @JsonIgnore
    private List<Checking> checkingAccountsOwned;        //Anzeigen aller ckecking accounts, die ein Accounthoöder hat

    public AccountHolder() {
    }

    public AccountHolder(String fName, String lName, LocalDate dateOfBirth, String street, Integer zipCode, String city, String country) {
        this.fName = fName;
        this.lName = lName;
        this.dateOfBirth = dateOfBirth;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
        this.checkingAccountsOwned = checkingAccountsOwned;
    }


}
