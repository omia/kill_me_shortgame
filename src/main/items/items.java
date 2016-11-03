package main.items;


public abstract class items {
    protected String Name;
    protected String Description;

    protected double initbonus;
    protected double lifebonus;
    protected double armorebonus;
    protected double demagebonus;


    public items(String pname,String pdescription,double inb,double lib,double arb, double deb){
        Name=pname;
        Description=pdescription;
        initbonus=inb;
        lifebonus=lib;
        armorebonus=arb;
        demagebonus=deb;
    }

    public String getDescription() {
        return Description;
    }

    public String getName() {
        return Name;
    }

    public double getInitbonus() {
        return initbonus;
    }

    public double getLifebonus() {
        return lifebonus;
    }

    public double getArmorebonus() {
        return armorebonus;
    }

    public double getDemagebonus() {
        return demagebonus;
    }
}
