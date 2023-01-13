package org.zero.structural.flyweight;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new LinkedHashMap<>();

    public Flyweight getFlyweight(String intrinsicState) {
        if (!flyweights.containsKey(intrinsicState)) {
            Flyweight flyweight = new FlyweightImpl(intrinsicState);
            flyweights.put(intrinsicState, flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
