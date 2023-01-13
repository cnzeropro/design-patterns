package org.zero.structural.bridge;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class RemoteControl1 extends RemoteControl{
    public RemoteControl1(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("RemoteControl1 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("RemoteControl1 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("RemoteControl1 tune channel");
        tv.tuneChannel();
    }
}
