package org.unc.comp301.Iterator;

import java.util.*;

public class IteratorExamples implements Iterable<String>{
    private final List<java.lang.String> items = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        return new SortedIterator();
    }

    public Iterator<String> SimpleIterator(){
        return new Simpleterator();
    }

    private class Simpleterator implements Iterator<java.lang.String>{
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < items.size();
        }

        @Override
        public java.lang.String next() {
            if(hasNext()){
                return items.get(cursor++);
            }
            throw new NoSuchElementException();
        }
    }

    private class DelegatedIterator implements Iterator<java.lang.String>{
        private final Iterator<java.lang.String> it = items.iterator();
        @Override
        public boolean hasNext() {
           return it.hasNext();
        }

        @Override
        public java.lang.String next() {
            return it.next();
        }
    }

    private class SortedIterator implements Iterator<String>{
        private final List<String> sortedCollection;
        private final Iterator<String> it;
        public SortedIterator(){
            sortedCollection = new ArrayList<>(items);
            Collections.sort(sortedCollection);
            it = sortedCollection.iterator();
        }


        @Override
        public boolean hasNext() {
            return it.hasNext();
        }

        @Override
        public String next() {
            return it.next();
        }
    }


}
