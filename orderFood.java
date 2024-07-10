import java.util.Scanner;

public class orderFood {
    private addFood food;
    private String orderedItem;
    private int orderedPrice;

    public orderFood(addFood food) {
        this.food = food;
    }

    void placeOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food item you want to order:");
        String foodItem = sc.nextLine();
        if (food.isAvailable(foodItem)) {
            orderedItem = foodItem;
            orderedPrice = food.getPrice(foodItem);
            System.out.println("Order placed for: " + orderedItem + ", Price: " + orderedPrice);
            confirmOrder();
        } else {
            System.out.println(foodItem + " is not available.");
        }
    }

    void confirmOrder() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to confirm the order for " + orderedItem + " with price " + orderedPrice + "? (yes/no)");
        String response = sc.nextLine();
        if (response.equalsIgnoreCase("yes")) {
            System.out.println("Your order has been confirmed.");
        } else {
            System.out.println("Order not confirmed.");
        }
    }
}
