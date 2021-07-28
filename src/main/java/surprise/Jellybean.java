package surprise;

public class Jellybean extends Candies{
    String brand;
    public Jellybean(String name, double price, double weight, String brand) {
        super (name, price, weight);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Jellybean [" + super.toString() + ", brand: " + brand +"]";
    }
}
