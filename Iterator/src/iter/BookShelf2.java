package iter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf2 implements Iterable<Book> {
    private List<Book> books;
    private int last = 0;

    public BookShelf2(int maxsize) {
        this.books = new ArrayList<>(maxsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator2(this);
    }
}
