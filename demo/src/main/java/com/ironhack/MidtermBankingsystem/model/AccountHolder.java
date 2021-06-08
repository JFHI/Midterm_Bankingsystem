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

    public Integer getAccountHolderId() {
        return accountHolderId;
    }

    public void setAccountHolderId(Integer accountHolderId) {
        this.accountHolderId = accountHolderId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Checking> getCheckingAccountsOwned() {
        return checkingAccountsOwned;
    }

    public void setCheckingAccountsOwned(List<Checking> checkingAccountsOwned) {
        this.checkingAccountsOwned = checkingAccountsOwned;
    }
}
