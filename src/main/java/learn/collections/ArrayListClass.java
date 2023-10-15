package learn.collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class ArrayListClass<T> {
    ArrayList<T> items;
    ArrayListClass(ArrayList<T> items) {
        this.items = items;
    }
    public ArrayList<T> clone() {
        return (ArrayList<T>) items.clone();
    }
    public void ensureCapacity() {
        items.ensureCapacity(1);
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
    public boolean removeIf(Predicate<? super T> filter) {
        return items.removeIf(filter);
    }
    public void removeRange(int start, int end) {
//        return items.remove(s);
    }
    public boolean retainAll(ArrayList<T> items) {
        return items.retainAll(items);
    }
    public int size() {
        return items.size();
    }
    public void trimToSize() {
        items.trimToSize();
    }
}
