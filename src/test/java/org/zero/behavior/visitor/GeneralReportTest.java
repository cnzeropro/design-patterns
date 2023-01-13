package org.zero.behavior.visitor;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class GeneralReportTest {

    @Test
    public void test() {
        Customer customer1 = new Customer("customer_a");
        customer1.addOrder(new Order("order_a1", "food_a1_1"));
        customer1.addOrder(new Order("order_a1", "food_a2_1"));
        customer1.addOrder(new Order("order_a3", "food_a3_1"));

        Order order = new Order("order_b");
        order.addFood(new Food("food_b1"));
        order.addFood(new Food("food_b2"));
        order.addFood(new Food("food_b3"));
        Customer customer2 = new Customer("customer_b");
        customer2.addOrder(order);

        Restaurant restaurant = new Restaurant();
        restaurant.addCustomer(customer1);
        restaurant.addCustomer(customer2);

        GeneralReport visitor = new GeneralReport();
        restaurant.accept(visitor);
        visitor.displayResults();
    }
}