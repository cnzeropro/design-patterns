package org.zero.structural.bridge;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class RemoteControl2 extends RemoteControl{
    public RemoteControl2(TV tv) {
        super(tv);
    }

    @Override
    public void on() {
        System.out.println("RemoteControl2 on");
        tv.on();
    }

    @Override
    public void off() {
        System.out.println("RemoteControl2 off");
        tv.off();
    }

    @Override
    public void tuneChannel() {
        System.out.println("RemoteControl2 tune channel");
        tv.tuneChannel();
    }
}
