package org.zero.structural.composite;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public abstract class Component {
    protected String name;

    public void print() {
        print(0);
    }

    abstract void print(int level);

    public abstract void add(Component component);

    public abstract void remove(Component component);
}
