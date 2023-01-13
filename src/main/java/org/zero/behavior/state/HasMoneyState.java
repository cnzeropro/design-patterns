package org.zero.behavior.state;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class HasMoneyState implements ToyCraneState {
    private ToyCrane toyCrane;

    @Override
    public void insert() {
        System.out.println("请勿重复投币");
    }

    @Override
    public void eject() {
        System.out.println("已退币，请注意查收");
        toyCrane.setState(new StandbyState(toyCrane));
    }

    @Override
    public boolean turnCrank() {
        System.out.println("你操纵了手柄");
        toyCrane.setState(new SoldState(toyCrane));
        return true;
    }

    @Override
    public void getDoll() {
        System.out.println("等等操作中");
    }
}
