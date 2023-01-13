package org.zero.behavior.state;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public interface ToyCraneState {
    /**
     * 投入1块钱
     */
    void insert();

    /**
     * 退回1块钱
     */
    void eject();

    /**
     * 转动曲柄
     */
    boolean turnCrank();

    /**
     * 获得娃娃
     */
    void getDoll();
}
