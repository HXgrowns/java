public class SelfDriving implements Transportation {
    @Override
    public double getPrice() {
        return 500;
    }

    @Override
    public String getType() {
        return "自驾游";
    }
}
