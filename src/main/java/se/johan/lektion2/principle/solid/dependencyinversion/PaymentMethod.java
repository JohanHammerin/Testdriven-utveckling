package se.johan.lektion2.principle.solid.dependencyinversion;

public class PaymentMethod {

    private Currency currency;
    // Breaks dependency inverstion due to "new" keyword
    // private Currency currency = new Currency("");


    public PaymentMethod(Currency currency) {
        this.currency = currency;
    }
}

