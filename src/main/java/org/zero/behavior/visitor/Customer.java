package org.zero.behavior.visitor;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@Getter
public class Customer implements Element {
    private final String name;
    private final List<Order> orders = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Order order : orders) {
            order.accept(visitor);
        }
    }
}
