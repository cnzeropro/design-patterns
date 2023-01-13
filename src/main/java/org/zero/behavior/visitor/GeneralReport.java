package org.zero.behavior.visitor;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class GeneralReport implements Visitor {
    private int customerNum = 0;
    private int orderNum = 0;
    private int foodNum = 0;

    @Override
    public void visit(Customer customer) {
        System.out.println(customer.getName());
        customerNum++;
    }

    @Override
    public void visit(Order order) {
        System.out.println(order.getName());
        orderNum++;
    }

    @Override
    public void visit(Food food) {
        System.out.println(food.getName());
        foodNum++;
    }

    public void displayResults() {
        System.out.println("Number of customers: " + customerNum);
        System.out.println("Number of orders: " + orderNum);
        System.out.println("Number of foods: " + foodNum);
    }
}
