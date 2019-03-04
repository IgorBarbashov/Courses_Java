import java.util.Iterator;

public class IntervalIterable implements Iterable<Integer> {
    private final int min;
    private final int max;

    public IntervalIterable(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IntervalIterator(min, max);
    }
}