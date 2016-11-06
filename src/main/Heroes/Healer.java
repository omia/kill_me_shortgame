package main.Heroes;

/**
 * Created by Omia on 05.11.2016.
 */
public class Healer extends Heroes {

    public Healer(String pName, boolean pfemale, double pddemage,double phealth) {
        super(pfemale, pName, pddemage, phealth);
        Type="Healer";
        init=6;
        armore=2;
    }

    @Override
    public String getSpecialdisc() {
        return "You heal yourself!";
    }
}
