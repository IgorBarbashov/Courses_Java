import java.util.Iterator;

public class MergeIterator implements Iterator<Integer> {
    private final Iterator<Integer> first;
    private final Iterator<Integer> second;
    private int whoNext = 0;
    private int firstNumber;
    private int secondNumber;
    private boolean onMoreStep = true;

    public MergeIterator(Iterator<Integer> first, Iterator<Integer> second) {
        this.first = first;
        this.second = second;
        if (!first.hasNext() || !second.hasNext()) onMoreStep = false;
    }

    @Override
    public boolean hasNext() {
        return (first.hasNext() || second.hasNext() || onMoreStep);
    }

    @Override
    public Integer next() {
        if (!first.hasNext() && !second.hasNext()) {
            onMoreStep = false;
            return secondNumber;
        }

        if (first.hasNext() ^ second.hasNext()) {
            if (whoNext == 0) {
                return first.hasNext() ? first.next() : second.next();
            } else {
                firstNumber = first.hasNext() ? first.next() : second.next();
                if (firstNumber > secondNumber) {
                    int tmp = firstNumber;
                    firstNumber = secondNumber;
                    secondNumber = tmp;
                }
                return firstNumber;
            }
        }

        if (whoNext == 0) {
            whoNext = 1;
            firstNumber = first.next();
            secondNumber = second.next();
        } else if (whoNext == 1) {
            firstNumber = first.next();
        } else {
            firstNumber = second.next();
        }

        if (firstNumber > secondNumber) {
            whoNext = whoNext == 1 ? 2 : 1;
            int tmp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = tmp;
        }
        return firstNumber;
    }
}