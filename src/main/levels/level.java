package main.levels;


import main.Monsters.Monsters;
import main.Monsters.Vampire;
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

    public level(int pid,int pmonstercount,int ptype,String pname, int paldemmage,boolean pboss){
        level_id=pid;
        level_monster_count=pmonstercount;
        level_name=pname;
        gesdema=paldemmage;
        boss=pboss;
        type=ptype;
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

    public Monsters[] getlevelMonster(level plevel){
        Monsters[] Monster =new Monsters[plevel.getLevel_monster_count()];
        if (boss){
        for (int i=0; i<plevel.getLevel_monster_count();i++){
            Monster[i]= new Vampire(Names.generateName(),gesdema/level_monster_count,util.randInt(10,20));
        }}
        else {
            for (int i=0; i<plevel.getLevel_monster_count();i++){
                Monster[i]= new Vampire(Names.generateName(),gesdema/level_monster_count,util.randInt(4,10));
            }
        }
    return Monster;
    }



}
