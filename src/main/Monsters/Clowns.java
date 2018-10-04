package main.Monsters;

import main.items.*;

/**
 * Created by Omia on 05.11.2016.
 */
public class Clowns extends Monsters {
    public Clowns(String pName, double pddemage, double phealth) {
        super(pName, pddemage, phealth);
        Race="Clown";
        init=main.Util.util.randInt(2,6);
        armore=1;
        mainHand=new Default_Item("Chainsaw of Doom","This Chainsaw was forged\n in a Mountain far far away",0,0,0,0);
    }
}
