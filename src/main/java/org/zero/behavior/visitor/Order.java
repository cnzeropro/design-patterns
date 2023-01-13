package org.zero.behavior.visitor;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@Getter
public class Order implements Element {
    private final String name;
    private final List<Food> foods = new ArrayList<>();

    public Order(String name) {
        this.name = name;
    }

    public Order(String name, String foodName) {
        this.name = name;
        this.addFood(new Food(foodName));
    }

    public void addFood(Food item) {
        foods.add(item);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Food food : foods) {
            food.accept(visitor);
        }
    }
}
