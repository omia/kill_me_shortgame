package main;


import main.Heroes.Heroes;
import main.gui.*;
import main.levels.levelgen;
import main.Util.util;

public class main {
private Heroes mainHero;
private main mainclass;
private gui_herocre gui_herocreate;
private gui_mainmen gui_mainmen;
private levelgen levelgen = new levelgen();
private util util =new util();




    public static void main(String[] args) {
    new  gui_start(new main());}




    //Variablen vor changing

public Heroes getMainHero(){return mainHero;}
public void start(main pmain){mainclass=pmain; gui_herocreate = new gui_herocre(pmain);}
public void herocreattomainmen(main pmain, Heroes phero){mainHero=phero; gui_mainmen = new gui_mainmen(pmain); gui_mainmen.Information_update();}
public void mainbutstory(main pmain){new gui_levelselect(mainclass,mainHero);}
public void mainbutranbattle(main pmain){gui_battle ranbattle = new gui_battle(pmain,levelgen.getlevel(util.randInt(1,100),true),mainHero,false);}
public void showmainmen(){gui_mainmen.setVisible(true); gui_mainmen.Information_update();}
public void hidemainmen(){gui_mainmen.setVisible(false);}

}
