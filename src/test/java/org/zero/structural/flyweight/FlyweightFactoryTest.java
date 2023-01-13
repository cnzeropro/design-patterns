package org.zero.structural.flyweight;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class FlyweightFactoryTest {

    @Test
    public void test() {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("a");
        Flyweight flyweight2 = factory.getFlyweight("a");
        flyweight1.doOperation("x");
        flyweight2.doOperation("y");
    }
}