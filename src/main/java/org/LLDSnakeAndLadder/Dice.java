package org.LLDSnakeAndLadder;
import java.util.Random;

public class Dice {

    int diceCount;
    int min=1;
    int max=6;

    public  Dice(int diceCount){
        this.diceCount=diceCount;
    }

    public  int rollDice(){
        int totalSum=0;
        int dice=0;
        while(dice<diceCount){
            Random random = new Random();

            totalSum+=random.nextInt(max) + min;
            dice++;
        }
        return totalSum;
    }

}
