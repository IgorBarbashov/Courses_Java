package square.iterator;

public class IteratorsCreater {

    public static Iterable<Integer> interval(int min, int max) {
        return new SquareIterable(min, max);
    }

}