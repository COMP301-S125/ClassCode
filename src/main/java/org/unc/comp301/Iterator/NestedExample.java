package org.unc.comp301.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class NestedExample<E> implements Iterable<E> {
    protected List<E> hiddenCollection = new ArrayList<>();

    @Override
    public Iterator<E> iterator() {
        return new HiddenIterator();
    }

    private class HiddenIterator<E> implements Iterator<E>{
        private int cursor;

        public HiddenIterator(){
            cursor = 0;
        }
        @Override
        public boolean hasNext() {
            return cursor <= hiddenCollection.size();
        }
        @Override
        public E next() {
            if(hasNext()){
                //Return the item currently seen by the cursor and increment the position
                return (E) hiddenCollection.get(cursor++);
            }
            throw new NoSuchElementException("No next element");
        }
    }
}
