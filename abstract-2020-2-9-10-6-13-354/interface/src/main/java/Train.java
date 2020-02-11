public class Train implements Transportation {
    @Override
    public double getPrice() {
        return 400;
    }

    @Override
    public String getType() {
        return "火车";
    }
}
