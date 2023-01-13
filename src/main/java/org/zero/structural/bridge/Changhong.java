package org.zero.structural.bridge;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class Changhong implements TV{
    @Override
    public void on() {
        System.out.println("Changhong on");
    }

    @Override
    public void off() {
        System.out.println("Changhong off");
    }

    @Override
    public void tuneChannel() {
        System.out.println("Changhong tune channel");
    }
}
