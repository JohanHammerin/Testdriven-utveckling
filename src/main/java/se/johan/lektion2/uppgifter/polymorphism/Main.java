package se.johan.lektion2.uppgifter.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        Dog dog = new Dog();
        Bird bird = new Bird();
        animalList.add(dog);
        animalList.add(bird);
        System.out.println(animalList);
    }
}
