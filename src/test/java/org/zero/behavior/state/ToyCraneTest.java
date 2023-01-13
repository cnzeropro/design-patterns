package org.zero.behavior.state;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class ToyCraneTest {

    @Test
    public void test() {
        ToyCrane toyCrane = new ToyCrane(1);
        toyCrane.insert();
        toyCrane.turnCrank();

        toyCrane.insert();
        toyCrane.eject();
        toyCrane.turnCrank();

        toyCrane.eject();

        toyCrane.insert();
        toyCrane.turnCrank();
    }
}