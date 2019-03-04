import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

public class IStoIterator implements Iterator<Integer> {
    private InputStream stream;
    private int currentByte;

    public IStoIterator(InputStream stream) {
        this.stream = stream;
    }

    @Override
    public boolean hasNext() {
        try {
            currentByte = stream.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return currentByte != -1;
    }

    @Override
    public Integer next() {
        return currentByte;
    }

}