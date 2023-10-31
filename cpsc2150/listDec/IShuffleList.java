package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

public interface IShuffleList<T> extends List<T> {
    default void shuffle(int swaps) {
        Random rand = new Random();
        for (int i = 0; i < swaps; i++) {
            int j = rand.nextInt(size());
            int k = rand.nextInt(size());
            swap(j, k);
        }
    }

    default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}
