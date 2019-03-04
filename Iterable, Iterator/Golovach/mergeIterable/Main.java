public class Main {
    public static void main(String[] args) {

        for (Integer num : IteratorsCreator.interval(0, 10)) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(10, 12), IteratorsCreator.interval(10, 12))) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(10, 10), IteratorsCreator.interval(10, 12))) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(10, 12), IteratorsCreator.interval(10, 10))) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(10, 10), IteratorsCreator.interval(10, 10))) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(5, 10), IteratorsCreator.interval(0, 15))) {
            System.out.print("  " + num);
        }
        System.out.println();

        for (Integer num : IteratorsCreator.merge(IteratorsCreator.interval(5, 10), IteratorsCreator.interval(110, 115))) {
            System.out.print("  " + num);
        }
        System.out.println();

    }
}