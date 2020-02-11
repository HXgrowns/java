import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Transportation> transportations = new ArrayList<>();
        transportations.add(new Bus());
        transportations.add(new Plane());
        transportations.add(new Train());
        transportations.add(new SelfDriving());
        System.out.println(select(300, transportations));

    }

    public static String select(double price, List<Transportation> transportationList) {
        List<String> transportations = new ArrayList<>();
        for (Transportation transportation : transportationList) {
            if (price >= transportation.getPrice()) {
                transportations.add(transportation.getType());
            }
        }
        return String.join(", ", transportations);
    }
}
