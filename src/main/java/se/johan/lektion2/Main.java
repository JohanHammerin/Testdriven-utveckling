package se.johan.lektion2;

import se.johan.lektion2.uppgifter.Discount;
import se.johan.lektion2.uppgifter.Item;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world :)");


        Item firstItem = new Item("Laptop", 1000.00, 1);
        Item secondItem = new Item("Phone", 500.00, 2);


        Discount discount = new Discount();
        System.out.println(discount.priceBeforeDiscount(firstItem));

        // Discount
        discount.priceAfterDiscount(secondItem,10.0);


    }
}
