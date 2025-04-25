package se.johan.lektion2.principle.dry;

public class Dry {


    /* DRY Q:A
     *   Question: What is DRY for?
     *   Answer: Do not repeat yourself.
     *   INFO: Avoid repetition of code, seek abstraction and apply OOP.
     *   HINT: If the same code is ever repeated more than once, look to DRY.
     */


    // Example
    // Question: Does this break the DRY principle?
    // Answer: YES
    void prepareProductApple() {
        String productName = "";
        String productDescription = "Crunchy, juice red apples";
        double price = 15.0;
        boolean isOnSale = false;

    }

    void prepareProductPear() {
        String productName = "Pear";
        String productDescription = "Juicy pear with ability to explode your mind";
        double price = 25.0;
        boolean isOnSale = true;
    }

    // Question: How do we solve this problem?
    // Answer: Abstraction & Object-Oriented Programming, Create a new product class.

    //Solution:
    void prepareProduct(Product product) {
        System.out.println(product);
    }

    void fakeMain() {
        prepareProduct
                (new Product(
                        "",
                        "",
                        0.0,
                        false));
    }

}
