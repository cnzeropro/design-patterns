package org.zero.behavior.interpreter;

import lombok.AllArgsConstructor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/12
 */
@AllArgsConstructor
public class ContainExpression implements Expression{
    private String literal;

    @Override
    public boolean interpret(String str) {
        return str.contains(literal);
    }
}
