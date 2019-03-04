import java.util.Iterator;

public class IntervalIterator implements Iterator<Integer> {
    private int min;
    private int max;

    public IntervalIterator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
        return min < max;
    }

    @Override
    public Integer next() {
        return min++;
    }
}