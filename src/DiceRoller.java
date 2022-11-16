import java.util.Random;

public class DiceRoller {

    DiceRoller(){
        Random random = new Random(); //instance of the random class
        int number = 0; //holds our results
        roll(random,number);

    }
    void roll(Random random, int number){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
