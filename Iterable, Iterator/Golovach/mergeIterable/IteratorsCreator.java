public class IteratorsCreator {

    public static Iterable<Integer> interval(int min, int max) {
        return new IntervalIterable(min, max);
    }

    public static Iterable<Integer> merge(Iterable<Integer> first, Iterable<Integer> second) {
        return new MergeIterable(first, second);
    }

}