import by.gsu.pms.*;
import java.util.Arrays;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {


        Commodity butter = new Commodity("butter", 1.5);
        Commodity muffin = new Commodity("muffin", 3);
        Commodity bread = new Commodity("bread", 0.7);
        Commodity cheese = new Commodity("cheese", 4.22);
        Commodity nutella = new Commodity("nutella", 4.22);


        Purchases[] purchases = new Purchases[6];
        purchases[0] = new DiscountedPrice(butter, 7, 0.1);
        purchases[1] = new DiscountedPrice(muffin, 8, 0.2);
        purchases[2] = new DiscountedPrice(bread, 2, 0.3);
        purchases[3] = new DiscountedPrice(muffin, 5, 2);
        purchases[4] = new Transport(cheese, 4, 3);
        purchases[5] = new Transport(nutella, 1, 2);


        for (Purchases purchase : purchases) {
            System.out.println(purchase.toString());
        }

        Arrays.sort(purchases, Comparator.comparing(Purchases::getCost));

        System.out.println("Sorted: ");
        for (Purchases purchase : purchases) {
            System.out.println(purchase.toString());
        }

        System.out.println("Minimal cost:");
        System.out.println(purchases[0].toString());
    }
    }