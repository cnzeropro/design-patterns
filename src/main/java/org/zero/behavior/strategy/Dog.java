package org.zero.behavior.strategy;

import lombok.Setter;

import java.util.Objects;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@Setter
public class Dog {
    private Behavior behavior;

    public void perform() {
        if (Objects.nonNull(behavior)) {
            behavior.doSomething();
        }
    }
}
