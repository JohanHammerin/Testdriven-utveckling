package se.johan.lektion2.principle.solid.dependencyinversion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DependencyInversion {

    // What type is nameList?
    void test(List<String> newList) {
        String test = "";
        List<String> nameList = newList;
    }

    void fakeMain() {
        test(new ArrayList<>());
        test(new LinkedList<>());

    }

    // Dependency Inversion == CORRECT APPROACH
    void testPaymentMethod() {
        PaymentMethod paymentMethod = new PaymentMethod(
                new Currency("EURO")
        );
    }
}
