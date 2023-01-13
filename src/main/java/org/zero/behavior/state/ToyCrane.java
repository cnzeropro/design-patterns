package org.zero.behavior.state;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class ToyCrane {
    private ToyCraneState state;
    private int count = 0;

    public ToyCrane(int toyNum) {
        count = toyNum;
        setStateViaCount();
    }

    public void insert() {
        state.insert();
    }

    public void eject() {
        state.eject();
    }

    public void turnCrank() {
        if (state.turnCrank()) {
            if (Math.random() < 0.5) {
                releaseOne();
                state.getDoll();
            } else {
                System.out.println("Sorry, unlucky boy!");
            }
        }
        setStateViaCount();
    }

    public void setState(ToyCraneState state) {
        this.state = state;
    }

    private void releaseOne() {
        if (count > 0) {
            count--;
        }
    }

    private void setStateViaCount() {
        if (count > 0) {
            state = new StandbyState(this);
        } else {
            state = new SoldOutState(this);
        }
    }
}
