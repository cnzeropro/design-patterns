package org.zero.behavior.command;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
@AllArgsConstructor
public class TurnOffCommand implements Command {
    Light light;

    @Override
    public void execute() {
        light.off();
    }
}
