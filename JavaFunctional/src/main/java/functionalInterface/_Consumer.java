package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        // Normal Java function
        Customer damjan = new Customer("Damjan", "076242992");
        greetCustomer(damjan);
        greetCustomerV2(damjan, false);

        // Consumer Functional Interface
        greetCustomerConsumer.accept(damjan);
        greetCustomerConsumerV2.accept(damjan, true);
        greetCustomerConsumerV2.accept(damjan, false);
    }
    static BiConsumer<Customer, Boolean> greetCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName
            + ", thanks for registering phone number " + (showPhoneNumber ? customer.customerPhoneNumber : "*********"));

    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName
            + ", thanks for registering phone number " + customer.customerPhoneNumber);

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering phone number "
                + customer.customerPhoneNumber);

    }
    static void greetCustomerV2(Customer customer, boolean showPhoneNumber) {
        System.out.println("Hello " + customer.customerName
                + ", thanks for registering phone number " +
                (showPhoneNumber ? customer.customerPhoneNumber : "*********"));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
