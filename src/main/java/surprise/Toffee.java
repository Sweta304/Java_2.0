package surprise;

public class Toffee extends Candies {
    private String origin;

    public Toffee (String name, double price, double weight, String origin) {
        super(name, price, weight);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Toffee [" + super.toString() + ", origin: " + origin + "]";
    }
}
