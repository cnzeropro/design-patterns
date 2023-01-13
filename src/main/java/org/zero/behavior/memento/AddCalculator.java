package org.zero.behavior.memento;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
@AllArgsConstructor
public class AddCalculator implements Calculator<Integer> {
    private int first;
    private int second;

    @Override
    public Integer getResult() {
        return first + second;
    }

    public AddMemento backup() {
        return new AddMemento(first, second);
    }

    public void restore(AddMemento memento) {
        this.first = memento.getFirst();
        this.second = memento.getSecond();
    }
}
