import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Product product = new Product("1", "手机", 1500);
        System.out.println(product.isShop("手机", 1000, 2000));
    }

}
