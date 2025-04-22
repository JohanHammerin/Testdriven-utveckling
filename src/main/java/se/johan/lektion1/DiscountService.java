package se.johan.lektion1;

public class DiscountService {
    // Variables
    public double sum;
    public double discount;

    // Methods
    public double applyDiscount() {

        if (sum >= 500) {
            return sum * (1 - discount / 100);
        } else {
            return sum;
        }

    }
}
