package se.johan.lektion2.uppgifter;

public class Discount {

    public double priceBeforeDiscount(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    public double priceAfterDiscount(Item item, double discount) {
        return priceBeforeDiscount(item) * (discount / 100);
    }


}
