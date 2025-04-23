package uppgifter_branch;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    @Test
    @DisplayName(value = "Summan av addition mellan två tal")
    void addingTwoNumbers_returnsCorrectSum() {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.firstNum = 3;
        calculatorService.secondNum = 7;
        assertEquals(10, calculatorService.integerSum());
    }

    @Test
    @DisplayName(value = "Summan av addition mellan två positiva tal")
    void addingTwoPositiveNumbers_returnsCorrectSum() {
        CalculatorService calculatorService = new CalculatorService();
        calculatorService.firstNum = 10;
        calculatorService.secondNum = -20;
        assertEquals(3.1415926535, calculatorService.positiveIntegerSum());
    }


    @Test
    @DisplayName(value = "Antalet produkter i listan")
    void countingAmountOfProductsInList_returnsCorrectCount() {
        Product[] products = new Product[3];

        Product firstProduct = new Product("Apelsin", 10);
        products[0] = firstProduct;
        Product secondProduct = new Product("Äpple", 9);
        products[1] = secondProduct;
        Product thirdProduct = new Product("Päron", 8);
        products[2] = thirdProduct;


        ProductService productService = new ProductService(products);
        assertEquals(3, productService.totalProducts());
    }
}