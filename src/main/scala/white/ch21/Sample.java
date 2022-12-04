package white.ch21;

import java.util.Random;

public class Sample {
    public static void main(String[] args) {
        Random random = new Random(10);
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt(10));
        }
    }
}
