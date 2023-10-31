package cpsc2150.listDec.cpsc2150.listDec;

import java.util.List;

public interface IShuffleList extends List {
    default void shuffle(int swaps) {
        for (int i = 0; i < swaps; i++) {
            int j = (int) (Math.random() * size());
            int k = (int) (Math.random() * size());
            swap(j, k);
        }
    }

    default void swap(int i, int j) {
        Object temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}
