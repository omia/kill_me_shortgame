package main.Monsters;

/**
 * Created by omia on 11/6/2016.
 */
public class Dragon extends Monsters {
    public Dragon(String pName, double pddemage, double phealth) {
        super(pName, pddemage, phealth);
        Race="Dragon";
        init=main.Util.util.randInt(15,25);
        armore=20;
    }
}
