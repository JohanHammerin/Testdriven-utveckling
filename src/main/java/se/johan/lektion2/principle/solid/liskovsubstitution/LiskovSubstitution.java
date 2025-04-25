package se.johan.lektion2.principle.solid.liskovsubstitution;

import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitution {

    // Polymorphism

    // Refactoring code for a ZOO
    void test() {
        Zebra zebra = new Zebra();
        Zebra zebraOne = new Zebra();
        Zebra zebraTwo = new Zebra();

        Snake snake = new Snake();

        List<Animal> zebraPenList = new ArrayList<>();
        zebraPenList.add(zebra);
        zebraPenList.add(zebraOne);
        zebraPenList.add(zebraTwo);
        zebraPenList.add(snake); // Polymorphism thanks to Animal interface
    }
}
