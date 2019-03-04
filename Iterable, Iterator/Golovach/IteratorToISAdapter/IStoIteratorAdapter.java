import java.io.InputStream;
import java.util.Iterator;

public class IStoIteratorAdapter implements Iterable<Integer> {
    private final InputStream inStream;

    public IStoIteratorAdapter(InputStream inStream) {
        this.inStream = inStream;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IStoIterator(inStream);
    }
}