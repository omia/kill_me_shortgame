package main.levels;

public class levelgen {

    public static level getlevel(int i){
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
            case 21:{return new level(0,1,2,"Level 21",1,false);}
            case 22:{return new level(1,1,2,"Level 22",2,false);}
            case 23:{return new level(2,2,2,"Level 23",2,false);}
            case 24:{return new level(3,2,2,"Level 24",3,false);}
            case 25:{return new level(4,2,2,"Level 25",4,false);}
            case 26:{return new level(5,3,2,"Level 26",3,false);}
            case 27:{return new level(6,3,2,"Level 27",4,false);}
            case 28:{return new level(7,3,2,"Level 28",5,false);}
            case 29:{return new level(8,2,2,"Level 29",6,false);}
            case 30:{return new level(9,4,2,"Level 30",4,true);}
            case 31:{return new level(10,1,2,"Level 31",5,false);}
            case 32:{return new level(11,4,2,"Level 32",8,false);}
            case 33:{return new level(12,4,2,"Level 33",10,false);}
            case 34:{return new level(13,3,2,"Level 34",9,false);}
            case 35:{return new level(14,5,2,"Level 35",15,false);}
            case 36:{return new level(15,5,2,"Level 36",20,false);}
            case 37:{return new level(16,3,2,"Level 37",21,false);}
            case 38:{return new level(17,4,2,"Level 38",26,false);}
            case 39:{return new level(18,2,2,"Level 39",20,false);}
            case 40:{return new level(19,8,2,"Level 40",8,true);}
            case 41:{return new level(1,1,3,"Level 41",2,false);}
            case 42:{return new level(2,2,3,"Level 42",2,false);}
            case 43:{return new level(3,2,3,"Level 43",3,false);}
            case 44:{return new level(4,2,3,"Level 44",4,false);}
            case 45:{return new level(5,3,3,"Level 45",3,false);}
            case 46:{return new level(6,3,3,"Level 46",4,false);}
            case 47:{return new level(7,3,3,"Level 47",5,false);}
            case 48:{return new level(8,2,3,"Level 48",6,false);}
            case 49:{return new level(9,4,3,"Level 49",4,false);}
            case 50:{return new level(10,1,3,"Level 50",5,true);}
            case 51:{return new level(11,4,3,"Level 51",8,false);}
            case 52:{return new level(12,4,3,"Level 52",10,false);}
            case 53:{return new level(13,3,3,"Level 53",9,false);}
            case 54:{return new level(14,5,3,"Level 54",15,false);}
            case 55:{return new level(15,5,3,"Level 55",20,false);}
            case 56:{return new level(16,3,4,"Level 56",21,false);}
            case 57:{return new level(17,4,4,"Level 57",26,false);}
            case 58:{return new level(18,2,4,"Level 58",20,false);}
            case 59:{return new level(19,8,4,"Level 59",8,false);}
            case 60:{return new level(20,2,4,"Level 60",26,true);}
            case 61:{return new level(0,1,4,"Level 61",1,false);}
            case 62:{return new level(1,1,4,"Level 62",2,false);}
            case 63:{return new level(2,2,4,"Level 63",2,false);}
            case 64:{return new level(3,2,4,"Level 64",3,false);}
            case 65:{return new level(4,2,4,"Level 65",4,false);}
            case 66:{return new level(5,3,4,"Level 66",3,false);}
            case 67:{return new level(6,3,4,"Level 67",4,false);}
            case 68:{return new level(7,3,4,"Level 68",5,false);}
            case 69:{return new level(8,2,4,"Level 69",6,false);}
            case 70:{return new level(9,4,4,"Level 70",4,true);}
            case 71:{return new level(10,1,4,"Level 71",5,false);}
            case 72:{return new level(11,4,4,"Level 72",8,false);}
            case 73:{return new level(12,4,4,"Level 73",10,false);}
            case 74:{return new level(13,3,4,"Level 74",9,false);}
            case 75:{return new level(14,5,4,"Level 75",15,false);}
            case 76:{return new level(15,5,4,"Level 76",20,false);}
            case 77:{return new level(16,3,4,"Level 77",21,false);}
            case 78:{return new level(17,4,4,"Level 78",26,false);}
            case 79:{return new level(18,2,4,"Level 79",20,false);}
            case 80:{return new level(19,8,4,"Level 80",8,true);}
            case 81:{return new level(0,1,5,"Level 81",1,false);}
            case 82:{return new level(1,1,5,"Level 82",2,false);}
            case 83:{return new level(2,2,5,"Level 83",2,false);}
            case 84:{return new level(3,2,5,"Level 84",3,false);}
            case 85:{return new level(4,2,5,"Level 85",4,false);}
            case 86:{return new level(5,3,5,"Level 86",3,false);}
            case 87:{return new level(6,3,5,"Level 87",4,false);}
            case 88:{return new level(7,3,5,"Level 88",5,false);}
            case 89:{return new level(8,2,5,"Level 89",6,false);}
            case 90:{return new level(9,4,5,"Level 90",4,true);}
            case 91:{return new level(10,1,5,"Level 91",5,false);}
            case 92:{return new level(11,4,5,"Level 92",8,false);}
            case 93:{return new level(12,4,5,"Level 93",10,false);}
            case 94:{return new level(13,3,5,"Level 94",9,false);}
            case 95:{return new level(14,5,5,"Level 95",15,false);}
            case 96:{return new level(15,5,5,"Level 96",20,false);}
            case 97:{return new level(16,3,5,"Level 97",21,false);}
            case 98:{return new level(17,4,5,"Level 98",26,false);}
            case 99:{return new level(18,2,5,"Level 99",20,false);}
            case 100:{return new level(19,8,5,"Level 100",8,true);}

        }
        return null;
    }
}
