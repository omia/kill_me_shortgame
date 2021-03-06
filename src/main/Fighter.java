package main;

import main.items.Default_Item;
import main.items.items;
import main.Util.util;

public abstract class Fighter implements Comparable<Fighter>{
    protected  String name;
    protected  String Type;
    protected double ddemage;
    protected util util;

    protected double maxhealt;

    protected items mainHand= new Default_Item("Empty","",0,0,0,0);
    protected items offHand= new Default_Item("Empty","",0,0,0,0);

    protected double init ;
    protected double armore;
    protected double health;
    protected boolean onfire=false;
    protected boolean frozen=false;
    protected int forzenvor=0;


    public Fighter(String pName, double pddemage, double pHealth){
        name=pName;
        ddemage=pddemage;
        health=pHealth;
        maxhealt=pHealth;
    }


    public void adddemage(double pdemage){health=health-pdemage;}
    public void addhealth(double phealth){health=health+phealth;}
    public void rasemaxhealt(double pmaxhealt){maxhealt=maxhealt+pmaxhealt;}
    public void raseinit(double pinit){init=init+pinit;}
    public void rasearmore(double parmore){armore=armore+parmore;}
    public void raseddemage(double rddemage){ddemage=ddemage+rddemage;}

    public String getType() {
        return Type;
    }

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

    public double getDamage(){return ddemage;}

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

    public boolean isOnfire() {
        return onfire;
    }

    public void setOnfire(boolean onfire) {
        this.onfire = onfire;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public void setFrozen(boolean frozen) {
        this.frozen = frozen;
    }

    public int getForzenvor() {
        return forzenvor;
    }

    public void setForzenvor(int forzenvor) {
        this.forzenvor = forzenvor;
    }

    public int compareTo(Fighter compareFighter) {

        int compareQuantity = (int) ((Fighter) compareFighter).getInit();

        //ascending order
        //return (int) (this.getInit() - compareQuantity);

        //descending order
        return (int) (compareQuantity - this.getInit());

    }
}
