package com.shubh.interview;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CustomerImpl {

    private Set<Customer> customerSet = new TreeSet<>(Comparator.comparing(Customer::getName));

    public static void main(String[] args) {

        /*CustomerImpl customerImpl = new CustomerImpl();
        customerImpl.addCustomer(new Customer("Shubhashish", 29));
        customerImpl.addCustomer(new Customer("Rajesh", 30));

        System.out.println(customerImpl.customerSet);*/

    }

    private void addCustomer(Customer cust) {

        customerSet.add(cust);
    }
}
