package lab08;

import java.util.Random;

public class SuccessioneCasuale implements Successione {
    private Random random = new Random();

    @Override
    public int next() {
        return random.nextInt();
    }
}