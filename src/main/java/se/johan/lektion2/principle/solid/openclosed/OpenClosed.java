package se.johan.lektion2.principle.solid.openclosed;

// Explanation -

public class OpenClosed {


    //  Bad example
    void rewardSystem(String rewardType) {
        if (rewardType == "Coin") {
            System.out.println("Coin");
        } else if (rewardType == "weapon") {
            System.out.println("Weapon");
        } else if (rewardType == "potion") {
            System.out.println("Potion");
        }
    }

    // Solution: Polymorphism (OOP)

}
