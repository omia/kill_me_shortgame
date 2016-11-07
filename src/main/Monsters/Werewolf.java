package main.Monsters;

/**
 * Created by Omia on 05.11.2016.
 */
public class Werewolf extends Monsters {
    public Werewolf(String pName, double pddemage, double phealth) {
        super(pName, pddemage, phealth);
        Race="Werewolf";
        init=main.Util.util.randInt(8,12);
        armore=4;
    }
}
