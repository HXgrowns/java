import org.junit.Test;

import java.util.Optional;

public class Product {
    @Test
    public void testOrElse() {
        Integer x = 3;
        Optional<Integer> optional = Optional.ofNullable(x);

        System.out.println(optional.orElse(test1()));

        System.out.println(optional.orElseGet(() -> {
            System.out.println("orElseGet执行了");
            return 5;
        }));
    }

    private int test1() {
        System.out.println("orElse执行了");
        return 4;
    }
}
