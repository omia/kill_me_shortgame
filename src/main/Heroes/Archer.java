package main.Heroes;

/**
 * Created by Omia on 05.11.2016.
 */
public class Archer extends Heroes {
    public Archer(String pName, boolean pfemale, double pddemage,double phealth) {
        super(pfemale, pName, pddemage, phealth);
        Type="Archer";
        init=12;
        armore=4;
    }
}
