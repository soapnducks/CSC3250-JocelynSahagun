package labs.lab12;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
/** New reusable component, separate from the earlier Product-only Catalog.
 * Keeps insertion order and duplicates, rejects null, and exposes no raw list.
 * Each iterator owns a shallow snapshot of the element references at creation.
 * Single-threaded classroom component; snapshot does not promise thread safety.
 */
public class ItemCatalog<T> implements Iterable<T> {
    private final List<T> items = new ArrayList<>();
    public void add(T item) {
        Objects.requireNonNull(item);
        items.add(item);
    }
    public int size() { return items.size(); }
    /** Uses the usual List index range: 0 <= index < size(). */
    public T get(int index) { return items.get(index); }
    @Override public Iterator<T> iterator() {
        return new SnapshotIterator();
    }
    // A non-static nested helper can use this catalog's T and items.
    // This structure is supplied; only its two small methods are lab TODOs.
    private class SnapshotIterator implements Iterator<T> {
        private final List<T> snapshot = new ArrayList<>(items);
        private int cursor = 0;
        @Override public boolean hasNext() {
            return cursor < snapshot.size();
        }
        @Override public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return snapshot.get(cursor++);
        }
        // Iterator's default remove() throws UnsupportedOperationException.
    }
}