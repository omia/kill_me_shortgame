package main.Heroes;
import main.Fighter;


public abstract class Heroes extends Fighter{

    private int level;
    private boolean female;
    private double xp;
    private double health;
    private int level_complieted=0;
    protected String mainHand;
    protected String offHand;


    public Heroes(boolean pfemale,String pName,double pddemage){
        super(pName,pddemage);
        female=pfemale;
        level=1;
        xp=0;
        health=20;
    }


    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public boolean isFemale() {
        return female;
    }

    public double getXp() {
        return xp;
    }

    public double getHealth() {
        return health;
    }

    public double getDdemage() {
        return ddemage;
    }

    public void add_xp(double pxp){xp=xp+pxp; if (xp==level*10){level++;xp=xp-level*10;}}
    public void addLevel_complieted(){level_complieted++;}
}
