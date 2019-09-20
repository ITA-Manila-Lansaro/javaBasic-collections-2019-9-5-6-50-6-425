package com.cultivation.javaBasic.showYourIntelligence;

import java.util.Iterator;

public class Sequence implements Iterable<Integer> {
    private final Integer start;
    private final Integer end;

    public Sequence(Integer start, Integer end) {
        if (start >= end) { throw new IllegalArgumentException("Start must be smaller than End."); }
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new SequenceIterator(start, end);
    }
}

class SequenceIterator implements Iterator<Integer> {
    // TODO: You can add additional fields or methods if you want.
    // <--start
        private Integer seqStart;
        private Integer capacity;
        private Integer currentIndex = 0;
    // --end-->

    SequenceIterator(Integer start, Integer end) {
        // TODO: please implements the following code to pass the test
        // <--start
        seqStart = start;
        capacity = end - start;
        // --end-->
    }

    @Override
    public boolean hasNext() {
        // TODO: please implements the following code to pass the test
        // <--start
        return currentIndex < capacity;
        // --end-->
    }

    @Override
    public Integer next() {
        // TODO: please implements the following code to pass the test
        // <--start
        currentIndex ++;
        return seqStart++;
        // --end-->
    }
}
