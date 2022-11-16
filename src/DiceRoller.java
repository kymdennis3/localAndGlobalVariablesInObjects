import java.util.Random;

public class DiceRoller {

    Random random;
    int number;
    DiceRoller(){
        random = new Random(); //instance of the random class
        int number = 0; //holds our results
        roll();

    }
    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);

    }
}
