package se.johan.lektion2.uppgifter.nr5;

public class TwentyFivePercentDiscount implements Discount{
    @Override
    public double applyDiscount(double total) {
        return total - (total * 0.25);
    }
}
