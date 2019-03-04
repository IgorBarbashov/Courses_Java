package square.iterator;

import java.util.Iterator;

public class SquareIterator implements Iterator<Integer> {
    private int min;
    private int max;
    private int base;

    public SquareIterator(int min, int max) {
        this.min = min;
        this.max = max;
        base = (int) Math.sqrt(min);
        if (base * base < this.min) base++;
    }

    @Override
    public boolean hasNext() {
        return base * base < max;
    }

    @Override
    public Integer next() {
        int kvdrat = base * base;
        base++;
        return kvdrat;
    }
}