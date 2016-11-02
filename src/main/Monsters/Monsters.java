package main.Monsters;
import main.Fighter;

public abstract class Monsters extends Fighter{

    private int level;
    private double xp;
    protected String Race;

    public Monsters(String pName,double pddemage){
        super(pName,pddemage);
        level=1;
        xp=1;
        health=20;
    }
}
