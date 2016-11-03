package main.levels;

public class levelgen {

    public level getlevel(int i){
        switch (i){
            case 0:{return new level(0,1,1,"Tutorial",1,false);}
            case 1:{return new level(1,1,1,"Level 1",2,false);}
            case 2:{return new level(2,2,1,"Level 2",2,false);}
            case 3:{return new level(3,2,1,"Level 3",3,false);}
            case 4:{return new level(4,2,1,"Level 4",4,false);}
            case 5:{return new level(5,3,1,"Level 5",3,false);}
            case 6:{return new level(6,3,1,"Level 6",4,false);}
            case 7:{return new level(7,3,1,"Level 7",5,false);}
            case 8:{return new level(8,2,1,"Level 8",6,false);}
            case 9:{return new level(9,4,1,"Level 9",4,false);}
            case 10:{return new level(10,1,1,"Level 10",5,true);}
            case 11:{return new level(11,4,1,"Level 11",8,false);}
            case 12:{return new level(12,4,1,"Level 12",10,false);}
            case 13:{return new level(13,3,1,"Level 13",9,false);}
            case 14:{return new level(14,5,1,"Level 14",15,false);}
            case 15:{return new level(15,5,1,"Level 15",20,false);}
            case 16:{return new level(16,3,1,"Level 16",21,false);}
            case 17:{return new level(17,4,1,"Level 17",26,false);}
            case 18:{return new level(18,2,1,"Level 18",20,false);}
            case 19:{return new level(19,8,1,"Level 19",8,false);}
            case 20:{return new level(20,2,1,"Level 20",26,true);}
        }
        return null;
    }
}
