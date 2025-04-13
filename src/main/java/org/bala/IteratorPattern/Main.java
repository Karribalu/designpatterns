package org.bala.IteratorPattern;

public class Main {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook("hello");
        bookCollection.addBook("world");
        bookCollection.addBook("java");
        bookCollection.addBook("python");
        bookCollection.addBook("c++");

        IIterator<String> iterator = bookCollection.getIterator();
        while (iterator.hasNext()) {
            String book = iterator.next();
            System.out.println(book);
        }
    }
}
