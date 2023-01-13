package org.zero.behavior.iterator;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
public class IntIterator implements Iterator<Integer> {
    private final Integer[] items;
    private int pos = 0;

    public IntIterator(Integer[] items) {
        this.items = items;
    }

    @Override
    public Integer next() {
        return items[pos++];
    }

    @Override
    public boolean hasNext() {
        return pos < items.length;
    }
}
