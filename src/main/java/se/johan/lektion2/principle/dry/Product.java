package se.johan.lektion2.principle.dry;

public class Product {

    private String productName;
    private String productDescription;
    private double price;
    private boolean isOnSale;

    public Product(String productName, String productDescription, double price, boolean isOnSale) {
        this.productName = productName;
        this.productDescription = productDescription;
        this.price = price;
        this.isOnSale = isOnSale;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return isOnSale;
    }

    public void setOnSale(boolean onSale) {
        isOnSale = onSale;
    }
}
