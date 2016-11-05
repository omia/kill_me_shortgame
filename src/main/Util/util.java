package main.Util;



import main.Fighter;
import main.Queue;

import java.util.Random;


public class util {


    public  int randInt(int min, int max) {
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }

    public Fighter getsecond(Queue<Fighter> fighterQueue){
        Fighter first = fighterQueue.front();
        fighterQueue.dequeue();
        fighterQueue.enqueue(first);
        Fighter second=fighterQueue.front();
        Fighter moving;

        while (!fighterQueue.front().equals(first)){
            moving = fighterQueue.front();
            fighterQueue.dequeue();
            fighterQueue.enqueue(moving);
        }
        return second;
    }

    public Fighter getthird(Queue<Fighter> fighterQueue){
        Fighter first = fighterQueue.front();
        fighterQueue.dequeue();
        fighterQueue.enqueue(first);
        Fighter second=fighterQueue.front();
        fighterQueue.dequeue();
        fighterQueue.enqueue(second);
        Fighter third=fighterQueue.front();
        fighterQueue.dequeue();
        fighterQueue.enqueue(second);
        Fighter moving;

        while (!fighterQueue.front().equals(first)){
            moving = fighterQueue.front();
            fighterQueue.dequeue();
            fighterQueue.enqueue(moving);
        }
        return third;
    }
}
