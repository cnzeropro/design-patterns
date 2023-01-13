package org.zero.behavior.mediator;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
public class Calender implements Colleague {
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public void onEvent(Mediator mediator) {
        mediator.doEvent("calender");
    }

    public void doCalender() {
        System.out.println("日历：" + dateFormat.format(new Date()));
    }
}
