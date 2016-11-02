package main;

public abstract class Fighter {
    protected  String name;
    protected double health;
    protected double ddemage;

    public Fighter(String pName,double pddemage){
        name=pName;
        ddemage=pddemage;
    }
}
