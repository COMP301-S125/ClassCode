package org.unc.comp301.Iterator;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

class Wallet implements Iterable<Integer> {
    private final List<Integer> bills = new ArrayList<>();

    public Wallet(){
        bills.addAll(List.of(1,5,10,20,50,100));
    }

    @Override
    public Iterator<Integer> iterator() {
        return new BillIterator();
    }

    private class BillIterator implements Iterator<Integer> {
        private int i = 0;

        @Override
        public boolean hasNext() {
            return i < bills.size();
        }

        @Override
        public Integer next()    {
            return bills.get(i++);
        }
    }
}