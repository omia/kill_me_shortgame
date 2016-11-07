package main.Monsters;

import main.Util.util;

public class Vampire extends Monsters {


    public Vampire(String pName, double pddemage,double phealth) {
        super(pName, pddemage,phealth);
        Race="Vampire";
        init=main.Util.util.randInt(8,12);
        armore=1;
    }
}
