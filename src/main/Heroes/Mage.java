package main.Heroes;

/**
 * Created by omia on 11/5/2016.
 */
public class Mage extends Heroes {
    public Mage(String pName, boolean pfemale, double pddemage,double phealth) {
        super(pfemale, pName, pddemage, phealth);
        Type="Mage";
        init=7;
        armore=3;
    }
}
