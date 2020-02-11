public class Bus implements Transportation {
    @Override
    public double getPrice() {
        return 300;
    }

    @Override
    public String getType() {
        return "大巴车";
    }
}
