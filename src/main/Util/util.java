package main.Util;



import main.Fighter;
import main.Queue;

import java.util.Random;


public class util {


    public static int randInt(int min, int max) {
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
        fighterQueue.enqueue(third);
        Fighter moving;

        while (!fighterQueue.front().equals(first)){
            moving = fighterQueue.front();
            fighterQueue.dequeue();
            fighterQueue.enqueue(moving);
        }
        return third;
    }

    public int gethowmany(Queue<Fighter> fighterQueue){
        int n=1;
        Fighter front = fighterQueue.front();
        fighterQueue.dequeue();
        fighterQueue.enqueue(front);
        Fighter movment = fighterQueue.front();
        while (fighterQueue.front()!=front){
            n++;
            fighterQueue.dequeue();
            fighterQueue.enqueue(movment);
            movment=fighterQueue.front();
        }
        return n;
    }
}
