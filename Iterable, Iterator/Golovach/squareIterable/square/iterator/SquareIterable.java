package square.iterator;

import java.util.Iterator;

public class SquareIterable implements Iterable<Integer> {
    private final int min;
    private final int max;

    public SquareIterable(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SquareIterator(min, max);
    }
}