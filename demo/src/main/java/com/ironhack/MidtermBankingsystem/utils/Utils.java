package com.ironhack.MidtermBankingsystem.utils;

import java.util.Random;

public class Utils {



    public static Integer RandomSecretKey(){
        Random random = new Random();
        Integer secretNumber = random.nextInt(9999);
        secretNumber += 1000;
        return secretNumber;
    }

    public static Integer RandomCreditCardNumber(){
        Random random = new Random();
        Integer creditCardNumber = random.nextInt(999999);
        creditCardNumber += 100000;
        return creditCardNumber;
    }

    public static Integer RandomCheckingNumber(){
        Random random = new Random();
        Integer checkingNumber = random.nextInt(999_999_999);
        checkingNumber += 100_000_000;
        return checkingNumber;
    }


}


