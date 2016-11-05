package main.Heroes;


public class rogue extends Heroes{

    public rogue(String pName, boolean pfemale, double pddemage,double phealth) {
        super(pfemale, pName, pddemage, phealth);
        Type="Rogue";
        init=8;
        armore=2;
    }
}
