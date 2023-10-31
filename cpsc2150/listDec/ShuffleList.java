package cpsc2150.listDec;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @correspondence self = myList
 */
public class ShuffleList<T> implements IShuffleList<T> {

    // ===========================================================
    // Member Fields
    // ===========================================================

    private List<T> myList;

    // ===========================================================
    // Constructors
    // ===========================================================

    /**
     * <p>
     * This creates a list implementation that includes the shuffle and swap functionality.
     * </p>
     *
     * @param l
     *            An existing implementation of {@link List}.
     * 
     * @pre l != null
     * 
     * @post myList = l
     */
    public ShuffleList(List<T> l) {
        myList = l;
    }

    // ===========================================================
    // Public Methods
    // ===========================================================

    @Override
    public boolean add(T e) {
        // complete this method
    }

    @Override
    public T get(int i) {
        // complete this method
    }

    @Override
    public void add(int index, T e) {
        // complete this method
    }

    @Override
    public int size() {
        // complete this method
    }

    @Override
    public void clear() {
        // complete this method
    }

    @Override
    public T set(int i, T x) {
        // complete this method
    }

    @Override
    public List<T> subList(int i, int j) {
        return myList.subList(i, j);
    }

    @Override
    public ListIterator<T> listIterator() {
        return myList.listIterator();
    }

    @Override
    public ListIterator<T> listIterator(int i) {
        return myList.listIterator(i);
    }

    @Override
    public int lastIndexOf(Object o) {
        return myList.lastIndexOf(o);
    }

    @Override
    public int indexOf(Object o) {
        return myList.indexOf(o);
    }

    @Override
    public int hashCode() {
        return myList.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return myList.equals(o);
    }

    @Override
    public String toString() {
        return myList.toString();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return myList.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return myList.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return myList.retainAll(c);
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> c) {
        return myList.addAll(i, c);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return myList.containsAll(c);
    }

    @Override
    public T remove(int index) {
        return myList.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return myList.remove(o);
    }

    @Override
    public boolean isEmpty() {
        return myList.isEmpty();
    }

    @Override
    public boolean contains(Object obj) {
        return myList.contains(obj);
    }

    @Override
    public Iterator<T> iterator() {
        return myList.iterator();
    }

    @Override
    public Object[] toArray() {
        return myList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return myList.toArray(ts);
    }
}