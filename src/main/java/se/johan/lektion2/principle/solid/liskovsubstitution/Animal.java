package se.johan.lektion2.principle.solid.liskovsubstitution;

public interface Animal {
    void eat();
    void fly();
    // void fly(); //Breaks Liskov's principle.
    // Why? Will break the functionality for other animals...

    // Question: Imagine you have a birdcage with one platform...
    // will an animal that can't fly be able to get to the platform?
    // Answer: NO... They can't fly...

    // To solve this problem we can also apply
    // Interface Segregation
}
