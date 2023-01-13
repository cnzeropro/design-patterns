package org.zero.structural.bridge;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public abstract class RemoteControl {
    protected TV tv;

    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel();
}
