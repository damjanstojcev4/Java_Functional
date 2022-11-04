package combinator;

import java.time.LocalDate;

import static combinator.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Damjan",
                "damjan@gmail.com",
                "076242992",
                LocalDate.of(2003, 5, 29)
        );

//        System.out.println(new CustomerValidatorService().isValid(customer));

        // if valid we can store costumer in database

        // Using Combinator
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAnAdult())
                .apply(customer);

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
