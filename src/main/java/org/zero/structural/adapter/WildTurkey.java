package org.zero.structural.adapter;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Wild turkey gobble!");
    }
}
