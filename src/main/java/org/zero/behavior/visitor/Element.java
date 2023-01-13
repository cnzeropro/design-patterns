package org.zero.behavior.visitor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public interface Element {
    void accept(Visitor visitor);
}
