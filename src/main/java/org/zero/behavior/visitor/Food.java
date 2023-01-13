package org.zero.behavior.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
@Getter
public class Food implements Element{
    private String name;

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
