package main.levels;

public class levelgen {

    public static level getlevel(int i,boolean random){
        int Type=0;
        if (random){Type=6;}
        else if (i<=20&&i>=0){Type=1;}
        else if (i<=40&&i>20){Type=2;}
        else if (i<=60&&i>40){Type=3;}
        else if (i<=80&&i>60){Type=4;}
        else if (i<1000&&i>80){Type=5;}
        switch (i){
            case 0:{return new level(0,1,Type,"Tutorial",1,false);}
            case 1:{return new level(1,1,Type,"Level 1",2,false);}
            case 2:{return new level(2,2,Type,"Level 2",2,false);}
            case 3:{return new level(3,2,Type,"Level 3",3,false);}
            case 4:{return new level(4,2,Type,"Level 4",4,false);}
            case 5:{return new level(5,3,Type,"Level 5",3,false);}
            case 6:{return new level(6,3,Type,"Level 6",4,false);}
            case 7:{return new level(7,3,Type,"Level 7",5,false);}
            case 8:{return new level(8,2,Type,"Level 8",6,false);}
            case 9:{return new level(9,4,Type,"Level 9",4,false);}
            case 10:{return new level(10,1,Type,"Level 10",5,true);}
            case 11:{return new level(11,4,Type,"Level 11",8,false);}
            case 12:{return new level(12,4,Type,"Level 12",10,false);}
            case 13:{return new level(13,3,Type,"Level 13",9,false);}
            case 14:{return new level(14,5,Type,"Level 14",10,false);}
            case 15:{return new level(15,5,Type,"Level 15",20,false);}
            case 16:{return new level(16,3,Type,"Level 16",21,false);}
            case 17:{return new level(17,4,Type,"Level 17",26,false);}
            case 18:{return new level(18,2,Type,"Level 18",20,false);}
            case 19:{return new level(19,8,Type,"Level 19",8,false);}
            case 20:{return new level(20,2,Type,"Level 20",26,true);}
            case 21:{return new level(0,1,Type,"Level 21",1,false);}
            case 22:{return new level(1,1,Type,"Level 22",2,false);}
            case 23:{return new level(2,2,Type,"Level 23",2,false);}
            case 24:{return new level(3,2,Type,"Level 24",3,false);}
            case 25:{return new level(4,2,Type,"Level 25",4,false);}
            case 26:{return new level(5,3,Type,"Level 26",3,false);}
            case 27:{return new level(6,3,Type,"Level 27",4,false);}
            case 28:{return new level(7,3,Type,"Level 28",5,false);}
            case 29:{return new level(8,2,Type,"Level 29",6,false);}
            case 30:{return new level(9,4,Type,"Level 30",4,true);}
            case 31:{return new level(10,1,Type,"Level 31",5,false);}
            case 32:{return new level(11,4,Type,"Level 32",8,false);}
            case 33:{return new level(12,4,Type,"Level 33",10,false);}
            case 34:{return new level(13,3,Type,"Level 34",9,false);}
            case 35:{return new level(14,5,Type,"Level 35",15,false);}
            case 36:{return new level(15,5,Type,"Level 36",20,false);}
            case 37:{return new level(16,3,Type,"Level 37",21,false);}
            case 38:{return new level(17,4,Type,"Level 38",26,false);}
            case 39:{return new level(18,2,Type,"Level 39",20,false);}
            case 40:{return new level(19,8,Type,"Level 40",8,true);}
            case 41:{return new level(1,1,Type,"Level 41",2,false);}
            case 42:{return new level(2,2,Type,"Level 42",2,false);}
            case 43:{return new level(3,2,Type,"Level 43",3,false);}
            case 44:{return new level(4,2,Type,"Level 44",4,false);}
            case 45:{return new level(5,3,Type,"Level 45",3,false);}
            case 46:{return new level(6,3,Type,"Level 46",4,false);}
            case 47:{return new level(7,3,Type,"Level 47",5,false);}
            case 48:{return new level(8,2,Type,"Level 48",6,false);}
            case 49:{return new level(9,4,Type,"Level 49",4,false);}
            case 50:{return new level(10,1,Type,"Level 50",5,true);}
            case 51:{return new level(11,4,Type,"Level 51",8,false);}
            case 52:{return new level(12,4,Type,"Level 52",10,false);}
            case 53:{return new level(13,3,Type,"Level 53",9,false);}
            case 54:{return new level(14,5,Type,"Level 54",15,false);}
            case 55:{return new level(15,5,Type,"Level 55",20,false);}
            case 56:{return new level(16,3,Type,"Level 56",21,false);}
            case 57:{return new level(17,4,Type,"Level 57",26,false);}
            case 58:{return new level(18,2,Type,"Level 58",20,false);}
            case 59:{return new level(19,8,Type,"Level 59",8,false);}
            case 60:{return new level(20,2,Type,"Level 60",26,true);}
            case 61:{return new level(0,1,Type,"Level 61",1,false);}
            case 62:{return new level(1,1,Type,"Level 62",2,false);}
            case 63:{return new level(2,2,Type,"Level 63",2,false);}
            case 64:{return new level(3,2,Type,"Level 64",3,false);}
            case 65:{return new level(4,2,Type,"Level 65",4,false);}
            case 66:{return new level(5,3,Type,"Level 66",3,false);}
            case 67:{return new level(6,3,Type,"Level 67",4,false);}
            case 68:{return new level(7,3,Type,"Level 68",5,false);}
            case 69:{return new level(8,2,Type,"Level 69",6,false);}
            case 70:{return new level(9,4,Type,"Level 70",4,true);}
            case 71:{return new level(10,1,Type,"Level 71",5,false);}
            case 72:{return new level(11,4,Type,"Level 72",8,false);}
            case 73:{return new level(12,4,Type,"Level 73",10,false);}
            case 74:{return new level(13,3,Type,"Level 74",9,false);}
            case 75:{return new level(14,5,Type,"Level 75",15,false);}
            case 76:{return new level(15,5,Type,"Level 76",20,false);}
            case 77:{return new level(16,3,Type,"Level 77",21,false);}
            case 78:{return new level(17,4,Type,"Level 78",26,false);}
            case 79:{return new level(18,2,Type,"Level 79",20,false);}
            case 80:{return new level(19,8,Type,"Level 80",8,true);}
            case 81:{return new level(0,1,Type,"Level 81",1,false);}
            case 82:{return new level(1,1,Type,"Level 82",2,false);}
            case 83:{return new level(2,2,Type,"Level 83",2,false);}
            case 84:{return new level(3,2,Type,"Level 84",3,false);}
            case 85:{return new level(4,2,Type,"Level 85",4,false);}
            case 86:{return new level(5,3,Type,"Level 86",3,false);}
            case 87:{return new level(6,3,Type,"Level 87",4,false);}
            case 88:{return new level(7,3,Type,"Level 88",5,false);}
            case 89:{return new level(8,2,Type,"Level 89",6,false);}
            case 90:{return new level(9,4,Type,"Level 90",4,true);}
            case 91:{return new level(10,1,Type,"Level 91",5,false);}
            case 92:{return new level(11,4,Type,"Level 92",8,false);}
            case 93:{return new level(12,4,Type,"Level 93",10,false);}
            case 94:{return new level(13,3,Type,"Level 94",9,false);}
            case 95:{return new level(14,5,Type,"Level 95",15,false);}
            case 96:{return new level(15,5,Type,"Level 96",20,false);}
            case 97:{return new level(16,3,Type,"Level 97",21,false);}
            case 98:{return new level(17,4,Type,"Level 98",26,false);}
            case 99:{return new level(18,2,Type,"Level 99",20,false);}
            case 100:{return new level(19,8,Type,"Level 100",8,true);}

        }
        return null;
    }
}
