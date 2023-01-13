package org.zero.behavior.template;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class Coffee implements BrewDrinkTemplate {
    @Override
    public void prepareIngredients() {
        System.out.println("准备咖啡粉");
    }

    @Override
    public void addCondiments() {
        System.out.println("添加糖");
    }

    @Override
    public void nextSteps() {
        System.out.println("用勺子搅拌");
    }
}
