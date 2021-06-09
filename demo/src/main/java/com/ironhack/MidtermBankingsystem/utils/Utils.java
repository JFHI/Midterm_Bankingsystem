package com.ironhack.MidtermBankingsystem.utils;

import java.util.Random;

public class Utils {



    public static Integer RandomSecretKey(){
        Random random = new Random();
        Integer secretNumber = random.nextInt(9999);
        secretNumber += 0000;
        return secretNumber;
    }




}


