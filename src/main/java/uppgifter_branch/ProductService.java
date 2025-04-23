package uppgifter_branch;

public class ProductService {
    public Product[] products;

    public ProductService(Product[] products) {
        this.products = products;
    }

    public int totalProducts() {
        return products.length;
    }
}
