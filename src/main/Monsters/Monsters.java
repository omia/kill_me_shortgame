package main.Monsters;
import main.Fighter;

public abstract class Monsters extends Fighter{

    protected String Race;


    public Monsters(String pName,double pddemage,double phealth){
        super(pName,pddemage,phealth);
    }

    public String getRace() {
        return Race;
    }
}
