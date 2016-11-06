package main.Heroes;

/**
 * Created by Omia on 05.11.2016.
 */
public class Snowman extends Heroes {
    public Snowman(String pName, boolean pfemale, double pddemage,double phealth) {
        super(pfemale, pName, pddemage, phealth);
        Type="Snowman";
        init=1;
        armore=1;
    }

    @Override
    public String getSpecialdisc() {
        return "You freeze the Enemy.";
    }
}
