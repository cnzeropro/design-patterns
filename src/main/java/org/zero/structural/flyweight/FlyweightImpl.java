package org.zero.structural.flyweight;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class FlyweightImpl implements Flyweight {
    private String intrinsicState;

    @Override
    public void doOperation(String extrinsicState) {
        System.out.println("Object address: " + System.identityHashCode(this));
        System.out.println("Intrinsic state: " + intrinsicState);
        System.out.println("Extrinsic state: " + extrinsicState);
    }
}
