package BehaviourPatterns.Iterator;

public interface ProfileIterator {

    boolean hasNext();

    Profile getNext();

    void reset();
}
