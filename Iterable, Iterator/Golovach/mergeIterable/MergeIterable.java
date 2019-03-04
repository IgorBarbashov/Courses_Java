import java.util.Iterator;

public class MergeIterable implements Iterable<Integer> {
    private final Iterable<Integer> first;
    private final Iterable<Integer> second;

    public MergeIterable(Iterable<Integer> first, Iterable<Integer> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MergeIterator(first.iterator(), second.iterator());
    }
}