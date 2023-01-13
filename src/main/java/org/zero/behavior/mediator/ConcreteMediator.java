package org.zero.behavior.mediator;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
@AllArgsConstructor
public class ConcreteMediator implements Mediator {
    private Alarm alarm;
    private Calender calender;

    @Override
    public void doEvent(String type) {
        switch (type) {
            case "alarm":
                doAlarmEvent();
                break;
            case "calender":
                doCalenderEvent();
                break;
            default:
                doDefaultEvent();
        }
    }

    private void doAlarmEvent() {
        alarm.doAlarm();
    }

    private void doCalenderEvent() {
        calender.doCalender();
    }

    private void doDefaultEvent() {
        System.out.println("default event");
    }
}
