import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("IteratorToISAdapter test: ");
        InputStream stream = new IteratorToISAdapter(new IntervalIterable(87, 115).iterator());
        int k = 0;
        while ((k = stream.read()) != -1) {
            System.out.print("  " + k);
        }

        System.out.println("\n");
        System.out.println("IStoIteratorAdapter test: ");

        Iterator<Integer> resultIterator = new IStoIterator(new ByteArrayInputStream(new byte[0]));
        while (resultIterator.hasNext()) {
            System.out.print("  " + resultIterator.next());
        }
        System.out.println();

        Iterator<Integer> resultIterator1 = new IStoIterator(new ByteArrayInputStream(new byte[]{10}));
        while (resultIterator1.hasNext()) {
            System.out.print("  " + resultIterator1.next());
        }
        System.out.println();

        Iterator<Integer> resultIterator2 = new IStoIterator(new ByteArrayInputStream(new byte[]{10, 20, 30}));
        while (resultIterator2.hasNext()) {
            System.out.print("  " + resultIterator2.next());
        }
        System.out.println();

    }
}