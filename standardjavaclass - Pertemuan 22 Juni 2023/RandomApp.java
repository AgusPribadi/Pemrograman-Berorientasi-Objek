package standardjavaclass;

import java.util.Random;

public class RandomApp {
    public static void main(String[] args) {
        Random random = new Random();

        int randomInt = random.nextInt();
        System.out.println(randomInt);

        int randomNextToInt = random.nextInt(9);
        System.out.println(randomNextToInt);
    }
}
