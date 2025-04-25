package se.johan.lektion2.principle.solid.interfacesegregation;

public interface InterfaceSegregationProblem {

    void eat(); // All animals can EAT
    void fly(); // Not all animals can FLY...

    // Break them apart to achieve
    // Interface Segregation
}
