package main.Weapons;

public abstract class Weapons {

    private String name;
    private double dammultiplier;
    private boolean cuofhan;

    public Weapons (String pName, double pdammultiplier, boolean pcuofhan){
        name=pName;
        dammultiplier=pdammultiplier;
        cuofhan=pcuofhan;
    }
}
