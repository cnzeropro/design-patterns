package org.zero.structural.facade;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class SubSystem {
    public void turnOnTV() {
        System.out.println("turnOnTV");
    }

    public void setCD(String cd) {
        System.out.println("setCD( " + cd + " )");
    }

    public void startWatching() {
        System.out.println("startWatching");
    }
}
