public class Plane implements Transportation {
    @Override
    public double getPrice() {
        return 1000;
    }

    @Override
    public String getType() {
        return "飞机";
    }
}
