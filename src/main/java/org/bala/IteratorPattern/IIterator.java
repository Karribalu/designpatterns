package org.bala.IteratorPattern;

public interface IIterator<T> {
    boolean hasNext();

    T next();
    void remove();
}
