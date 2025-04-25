package se.johan.lektion2.principle.solid.dependencyinversion;

public class Currency {

    private String currencyName;


    public Currency(String currencyName) {
        this.currencyName = currencyName;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }
}
