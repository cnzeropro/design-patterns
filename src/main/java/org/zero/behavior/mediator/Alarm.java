package org.zero.behavior.mediator;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
public class Alarm implements Colleague {
    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("alarm");
    }

    public void doAlarm() {
        System.out.println("闹钟响了");
    }
}
