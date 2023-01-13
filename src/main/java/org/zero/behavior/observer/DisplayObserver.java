package org.zero.behavior.observer;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class DisplayObserver implements WeatherObserver {
    public DisplayObserver(Weather weather){
        weather.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        System.out.println("temperature: " + temperature + ", humidity: " + humidity + ", pressure: " + pressure);
    }
}
