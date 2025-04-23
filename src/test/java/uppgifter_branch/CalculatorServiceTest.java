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
}