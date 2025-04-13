package org.bala.IteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private class BookIterator implements IIterator<String> {
        List<String> books;
        private int index;

        public BookIterator(List<String> books) {
            this.index = 0;
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return index < books.size();
        }

        @Override
        public String next() {
            return books.get(index++);
        }

        @Override
        public void remove() {
            if (index > 0) {
                books.remove(--index);
            }
        }
    }

    List<String> books;

    BookCollection() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    public void removeBook(String book) {
        books.remove(book);
    }

    public String getBook(int index) {
        return books.get(index);
    }

    public List<String> getBooks() {
        return books;
    }

    public IIterator<String> getIterator() {
        return new BookIterator(books);
    }
}
