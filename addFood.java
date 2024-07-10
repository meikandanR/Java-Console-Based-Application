import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class addFood {
    private List<String> items = new ArrayList<>();
    private List<Integer> prices = new ArrayList<>();

    void Items() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of food items you want to add:");
        int numberOfItems = sc.nextInt();
        sc.nextLine();  // consume the newline

        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter item Name " + (i + 1) + ":");
            String itemName = sc.nextLine();
            items.add(itemName);
            System.out.println("Enter item price " + (i + 1) + ":");
            int itemPrice = sc.nextInt();
            sc.nextLine();  // consume the newline
            prices.add(itemPrice);
        }
    }

    void display() {
        System.out.println("Available Food Items:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Item: " + items.get(i) + ", Price: " + prices.get(i));
        }
    }

    boolean isAvailable(String item) {
        return items.contains(item);
    }

    int getPrice(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            return prices.get(index);
        } else {
            return -1; // indicates item not found
        }
    }
}
