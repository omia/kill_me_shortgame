package main.Heroes;
import main.Fighter;
import main.items.items;


public abstract class Heroes extends Fighter{

    private int level;
    private boolean female;
    private double xp;
    private int level_complieted=0;
    private items item;


    public Heroes(boolean pfemale,String pName,double pddemage,double phealth){
        super(pName,pddemage,phealth);
        female=pfemale;
        level=1;
        xp=0;
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

    public int getLevel_complieted(){return level_complieted;}


    public void add_xp(double pxp){xp=xp+pxp; if (xp>=level*10){level++;xp=xp-(level-1)*10;}}
    public void addLevel_complieted(){level_complieted++;}
    public void heal(){health=maxhealt;}
    public abstract String getSpecialdisc();
}
