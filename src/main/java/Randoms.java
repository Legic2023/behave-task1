import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    protected int min, max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    public int getRandomsValue() {
        int range = this.max - this.min;
        return this.min + this.random.nextInt(range + 1);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomsIterator<Integer>();
    }

    public class RandomsIterator<T> implements Iterator<Integer> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            return getRandomsValue();
        }

    }


}