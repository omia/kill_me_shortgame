package main.Heroes;

import java.lang.reflect.Method;

public class Warrior extends Heroes {

    public Warrior(String pName, boolean pfemale, double pddemage,double phealth) {
        super( pfemale,pName, pddemage,phealth);
        Type="Warrior";
        init=1;
        armore=5;

    }



}
