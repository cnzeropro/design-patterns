package org.zero.behavior.template;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public interface BrewDrinkTemplate {

    default void process() {
        prepareIngredients();
        pourInCup();
        boilWater();
        addCondiments();
        nextSteps();
    }

    void prepareIngredients();

    void addCondiments();

    void nextSteps();

    default void pourInCup() {
        System.out.println("放入杯子");
    }

    default void boilWater() {
        System.out.println("加入开水");
    }
}
