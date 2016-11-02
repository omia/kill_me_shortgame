package main.levels;

public class levelgen {

    public level getlevel(int i){
        switch (i){
            case 0:{return new level(0,1,"Tutorial",1);}
            case 1:{return new level(1,1,"Level 1",2);}
            case 2:{return new level(2,2,"Level 2",2);}
            case 3:{return new level(3,2,"Level 3",3);}
            case 4:{return new level(4,2,"Level 4",4);}
            case 5:{return new level(5,3,"Level 5",3);}
            case 6:{return new level(6,3,"Level 6",4);}
            case 7:{return new level(7,3,"Level 7",5);}
            case 8:{return new level(8,2,"Level 8",6);}
            case 9:{return new level(9,4,"Level 9",4);}
            case 10:{return new level(10,1,"Level 10",5);}
            case 11:{return new level(11,4,"Level 11",8);}
            case 12:{return new level(12,4,"Level 12",10);}
            case 13:{return new level(13,3,"Level 13",9);}
            case 14:{return new level(14,5,"Level 14",15);}
            case 15:{return new level(15,5,"Level 15",20);}
            case 16:{return new level(16,3,"Level 16",21);}
            case 17:{return new level(17,4,"Level 17",26);}
            case 18:{return new level(18,2,"Level 18",20);}
            case 19:{return new level(19,8,"Level 19",8);}
            case 20:{return new level(20,2,"Level 20",26);}
        }
        return null;
    }
}
