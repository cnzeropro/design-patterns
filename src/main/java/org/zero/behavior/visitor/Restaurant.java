package org.zero.behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class Restaurant {
    private List<Customer> customers = new ArrayList<>();

    public void accept(Visitor visitor) {
        for (Customer customer : customers) {
            customer.accept(visitor);
        }
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
}
