package org.zero.behavior.template;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class BrewDrinkTemplateTest {

    @Test
    public void test() {
        BrewDrinkTemplate coffeeBrew = new Coffee();
        BrewDrinkTemplate teaBrew = new Tea();
        coffeeBrew.process();
        System.out.println("---------------------");
        teaBrew.process();
    }
}