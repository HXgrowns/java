import java.util.Optional;

public class Product {
    private String id;
    private String name;
    private int price;

    public Product(String id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public boolean isShop(String name, int minPrice, int maxPrice) {
        return Optional.of(this).map(product -> name.equals(product.name) && product.price <= 2000 && product.price >= 1000)
                                .orElse(false);

    }
}
