package se.johan.lektion2.principle.solid.openclosed;

public class Potion  implements IReward{
    @Override
    public void giveReward() {
        System.out.println("POTION");
    }

    // new features - without disturbing
}
