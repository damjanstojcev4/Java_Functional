package functionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println(isPhoneNumberValid("076242992"));
        System.out.println(isPhoneNumberValid("075207523"));
        System.out.println(isPhoneNumberValid("9900045554"));

        System.out.println("\n");

        System.out.println(isPhoneNumberValidPredicate.test("076242992"));
        System.out.println(isPhoneNumberValidPredicate.test("075207523"));
        System.out.println(isPhoneNumberValidPredicate.test("9900043554"));

        System.out.println("Is phone number valid and contains number 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("076242992"));
        System.out.println("Is phone number valid and contains number 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("075207523"));
        System.out.println("Is phone number valid and contains number 3 = "
                + isPhoneNumberValidPredicate.and(containsNumber3).test("9900043554"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 9;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 9;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
