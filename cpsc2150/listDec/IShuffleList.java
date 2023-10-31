package cpsc2150.listDec;

import java.util.List;
import java.util.Random;

/**
 * List that can be shuffled and swapped
 *
 * Initialization ensures:
 *              the list is empty
 *              the list is not null
 *              the list has a size of 0
 *
 * Defines:
 *             size: Z
 *             self: T
 * Constraints:
 *            0 <= size
 *            self != null
 *
 */
public interface IShuffleList<T> extends List<T> {
    /**
     * Swaps random indexes of the list swaps times
     *
     * @param swaps The number of swaps to make
     *
     * @pre
     *      swaps >= 0
     * @post
     *      [Random indexes have been swapped swaps times] AND
     *      |#self| = |self|
     */
    default void shuffle(int swaps) {
        Random rand = new Random();
        for (int i = 0; i < swaps; i++) {
            int j = rand.nextInt(size());
            int k = rand.nextInt(size());
            swap(j, k);
        }
    }

    /**
     * Swaps index i with index j in the list
     *
     * @param i the index of the element to swap with index j
     * @param j the index of the element to swap with index i
     *
     * @pre
     *      0 <= i < |self| AND
     *      0 <= j < |self|
     * @post
     *      self[i] = #self[j] AND
     *      self[j] = #self[i] AND
     *      |#self| = |self|
     */
    default void swap(int i, int j) {
        T temp = get(i);
        set(i, get(j));
        set(j, temp);
    }
}
