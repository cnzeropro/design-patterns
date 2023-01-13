package org.zero.behavior.observer;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public interface WeatherObserver {
    void update(double temperature, double humidity, double pressure);
}
