package main;

import main.items.Default_Item;
import main.items.items;

public abstract class Fighter {
    protected  String name;
    protected double ddemage;

    protected double maxhealt;

    protected items mainHand= new Default_Item("Empty","",0,0,0,0);
    protected items offHand= new Default_Item("Empty","",0,0,0,0);

    protected double init;
    protected double armore;
    protected double health;

    public Fighter(String pName,double pddemage, double pHealth){
        name=pName;
        ddemage=pddemage;
        health=pHealth;
        maxhealt=pHealth;
    }

    public void adddemage(double pdemage){health=health-pdemage;}
    public void addhealth(double phealth){health=health+phealth;}
    public void rasemaxhealt(double pmaxhealt){maxhealt=maxhealt+pmaxhealt;}
    public void addinit(double pinit){init=init+pinit;}
    public void addarmore(double parmore){armore=armore+parmore;}


    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxhealt() {
        return maxhealt+mainHand.getLifebonus()+offHand.getLifebonus();
    }

    public double getDdemage() {
        return ddemage+mainHand.getDemagebonus()+offHand.getDemagebonus();
    }

    public double getInit() {
        return init+mainHand.getInitbonus()+offHand.getInitbonus();
    }

    public double getArmore() {
        return armore+mainHand.getArmorebonus()+offHand.getArmorebonus();
    }

    public items getMainHand() {
        return mainHand;
    }

    public void setMainHand(items mainHand) {
        this.mainHand = mainHand;
    }

    public items getOffHand() {
        return offHand;
    }

    public void setOffHand(items offHand) {
        this.offHand = offHand;
    }
}
