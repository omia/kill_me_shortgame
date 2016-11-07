package main.Monsters;

/**
 * Created by Omia on 05.11.2016.
 */
public class Zombie extends Monsters {
    public Zombie(String pName, double pddemage, double phealth) {
        super(pName, pddemage, phealth);
        Race="Zombie";
        init=main.Util.util.randInt(1,5);
        armore=4;
    }
}
