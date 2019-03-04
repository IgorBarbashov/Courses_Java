package square.iterator;

import static square.iterator.IteratorsCreater.interval;

public class Main {
    public static void main(String[] args) {

        double[] myArray = new double[]{0.5, 1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, 10.5};

        Iterable<Integer> iterator = interval(0, myArray.length);
        for (int i : iterator) {
            System.out.print("  " + myArray[i]);
        }
        System.out.println();


    }
}