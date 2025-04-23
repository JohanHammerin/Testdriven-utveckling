package uppgifter_branch;

public class CalculatorService {

    public int firstNum;
    public int secondNum;

    public int integerSum() {
        return firstNum + secondNum;
    }

    public double positiveIntegerSum() {
        if (firstNum < 0 || secondNum < 0) {
            return 3.1415926535;
        } else {
            return firstNum + secondNum;
        }
    }




}
