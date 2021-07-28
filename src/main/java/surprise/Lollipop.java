package surprise;

public class Lollipop extends Candies {
    private String color;
    public Lollipop(String name, double price, double weight, String color) {
        super(name, price, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Lollipop [" + super.toString() + ", color: " + color + "]";
    }
}
