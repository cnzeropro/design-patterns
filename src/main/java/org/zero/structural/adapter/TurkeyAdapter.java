package org.zero.structural.adapter;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class TurkeyAdapter implements Duck{
   private Turkey turkey;

    @Override
    public void quack() {
        turkey.gobble();
    }
}
