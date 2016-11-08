package main.levels;


import main.Monsters.*;
import main.Util.Names;
import main.Util.util;

public  class level {

    private int level_id;
    private int level_monster_count;
    private int gesdema;
    private String level_name;
    private util util = new util();
    private boolean boss;
    private int type;
    private double geslif;

    public level(int pid,int pmonstercount,int ptype,String pname, int paldemmage,boolean pboss){
        level_id=pid;
        level_monster_count=pmonstercount;
        level_name=pname;
        gesdema=paldemmage;
        boss=pboss;
        type=ptype;
    }

    public boolean isBoss() {
        return boss;
    }

    public int getType() {
        return type;
    }

    public int getLevel_id() {
        return level_id;
    }

    public int getLevel_monster_count() {
        return level_monster_count;
    }

    public String getLevel_name() {
        return level_name;
    }

    public double getgeslif(){return geslif;}

    public Monsters createMonster(int nr,int minlif,int maxlif){
        int lif=util.randInt(minlif,maxlif);
        geslif=geslif+lif;

        Monsters returnmonster = new Vampire(Names.generateName(),gesdema/level_monster_count, lif);
        switch (nr) {
            case 1:returnmonster= new Vampire(Names.generateName(),gesdema / level_monster_count, lif); break;
            case 2:returnmonster= new Zombie(Names.generateName(), gesdema / level_monster_count, lif); break;
            case 3:returnmonster= new Werewolf(Names.generateName(), gesdema / level_monster_count, lif); break;
            case 4:returnmonster= new Dragon(Names.generateName(), gesdema / level_monster_count, lif); break;
            case 5:returnmonster= new Clowns(Names.generateName(), gesdema / level_monster_count, lif); break;
        }
        return returnmonster;
    }

    public Monsters[] getlevelMonster(level plevel){
        Monsters[] Monster =new Monsters[plevel.getLevel_monster_count()];
        switch (type) {
            case 1:
                if (boss) {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                       Monster[i]=createMonster(1, 10, 20);
                    }
                } else {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(1, 4, 10);
                    }
                }
                break;
            case 2:
                if (boss) {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(2, 20, 30);
                    }
                } else {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(2, 14, 20);
                    }
                }
                break;
            case 3:
                if (boss) {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(3, 30, 40);
                    }
                } else {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(3, 24, 30);
                    }
                }
                break;
            case 4:
                if (boss) {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(4,40,50);
                    }
                } else {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(4,34,40);
                    }}
                break;
            case 5:
                if (boss) {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(5,50,60);
                    }
                } else {
                    for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                        Monster[i]=createMonster(5,44,50);
                    }}
                break;
            case 6:
            if (boss) {
                for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                    Monster[i]=createMonster(util.randInt(1,5),50,60);
                }
            } else {
                for (int i = 0; i < plevel.getLevel_monster_count(); i++) {
                    Monster[i]=createMonster(util.randInt(1,5),44,50);
                }}
            break;
        }
    return Monster;

    }




}
