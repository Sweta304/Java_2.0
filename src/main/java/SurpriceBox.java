/** Формируется новогодний подарок. Он может включать в себя разные сладости (Jellybean, Lollipop, Toffee)
 * У каждой сладости есть название, вес, цена и свой уникальный параметр.
 * Выводим на консоль общий вес подарка, общую стоимость подарка и информацию о всех сладостях в подарке.
 */
import surprise.Candies;
import surprise.Jellybean;
import surprise.Lollipop;
import surprise.Toffee;

public class SurpriceBox {
    public static void main (String[] args) {
        Jellybean jellybean1 = new Jellybean("Harry Potter",3.00,0.5,"Mars");
        Lollipop lollypop1 = new Lollipop("Sweet",1.50,0.2,"pink");
        Toffee toffee1 = new Toffee("Toffifee",3.59,0.7,"Germany");
        Candies [] box = {jellybean1,lollypop1,toffee1};

        double sum = 0.00;
        double totalWeight = 0.00;

        for (int i=0;i<box.length;i++) {
            System.out.println(box[i].toString());
            sum = sum + box[i].getPrice();
            totalWeight = totalWeight + box[i].getWeight();
        }

        System.out.println("Total amount: " + sum);
        System.out.println("Total weight: " + totalWeight);

    }
}
