package main.Util;


import main.Heroes.Heroes;
import main.main;

import java.util.Random;


public class util {


    public  int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }


}
