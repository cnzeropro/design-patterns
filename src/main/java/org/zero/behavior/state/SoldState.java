package org.zero.behavior.state;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class SoldState implements ToyCraneState {
    ToyCrane toyCrane;


    @Override
    public void insert() {
        System.out.println("运行中，请勿投币");
    }

    @Override
    public void eject() {
        System.out.println("运行中，无法退币");
    }

    @Override
    public boolean turnCrank() {
        System.out.println("请勿重复操纵手柄");
        return false;
    }

    @Override
    public void getDoll() {
        System.out.println("恭喜你获得娃娃");
    }
}
