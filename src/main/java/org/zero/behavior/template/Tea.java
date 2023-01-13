package org.zero.behavior.template;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class Tea implements BrewDrinkTemplate {
    @Override
    public void prepareIngredients() {
        System.out.println("准备茶叶");
    }

    @Override
    public void addCondiments() {
        System.out.println("无需添加任何东西");
    }

    @Override
    public void nextSteps() {
        System.out.println("静置几分钟");
    }
}
