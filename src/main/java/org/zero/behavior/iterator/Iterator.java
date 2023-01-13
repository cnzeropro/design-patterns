package org.zero.behavior.iterator;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
public interface Iterator<E> {
    E next();

    boolean hasNext();
}
