package lab09;

import java.util.Iterator;
import java.util.Random;

public class SuccessioneCasuale implements Iterable<Integer> {

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private Random random = new Random();
        
            @Override
            public boolean hasNext() {
                return true;
            }
    
            @Override
            public Integer next() {
                return random.nextInt(100);
            }
        };
    }
}