package org.zero.behavior.state;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class StandbyState implements ToyCraneState {
    ToyCrane toyCrane;

    @Override
    public void insert() {
        System.out.println("你投入1块钱");
        toyCrane.setState(new HasMoneyState(toyCrane));
    }

    @Override
    public void eject() {
        System.out.println("请投入1块钱");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("请投入1块钱以开始游戏");
        return false;
    }

    @Override
    public void getDoll() {
        System.out.println("你需要先支付1块钱");
    }
}
