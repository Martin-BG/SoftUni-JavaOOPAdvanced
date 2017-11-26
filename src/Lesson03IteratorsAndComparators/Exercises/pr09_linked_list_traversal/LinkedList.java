package Lesson03IteratorsAndComparators.Exercises.pr09_linked_list_traversal;

public interface LinkedList<T extends Comparable<T>> extends Iterable<T> {
    void addAll(T... values);

    int getSize();

    void add(T value);

    void remove(T value);
}
