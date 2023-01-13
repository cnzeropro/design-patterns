package org.zero.structural.decorator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class BeverageTest {

    @Test
    public void test() {
        Beverage beverage = new Honey();
        beverage = new Milk(beverage);
        System.out.println(beverage.cost());
    }
}