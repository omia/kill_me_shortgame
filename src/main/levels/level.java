package main.levels;


import main.Monsters.Monsters;
import main.Monsters.Vampire;
import main.Util.Names;

public  class level {

    private int level_id;
    private int level_monster_count;
    private int gesdema;
    private String level_name;

    public level(int pid,int pmonstercount,String pname, int paldemmage){
        level_id=pid;
        level_monster_count=pmonstercount;
        level_name=pname;
        gesdema=paldemmage;
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
        for (int i=0; i<plevel.getLevel_monster_count();i++){
            Monster[i]= new Vampire(Names.generateName(),gesdema/level_monster_count);
        }
    return Monster;
    }



}
