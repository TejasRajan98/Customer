package main;

import data.Customer;

public class CustomerImpl {
    public static void main(String[] args) {

        Customer object1 = new Customer("Tejas", "Delhi", "tejas@yahoo.com", 9876543210L, true);
        Customer object2 = new Customer();
        Customer temp = object1;
        object1 = object2;
        object2 = temp;
        object1.displayCustomer();
        System.out.println();
        object2.displayCustomer();
    }
}
