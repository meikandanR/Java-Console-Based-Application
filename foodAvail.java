import java.util.Scanner;

public class foodAvail {
    private addFood food;

    public foodAvail(addFood food) {
        this.food = food;
    }

    void checkAvailability() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the food item to check availability:");
        String item = sc.nextLine();
        if (food.isAvailable(item)) {
            System.out.println(item + " is available.");
        } else {
            System.out.println(item + " is not available.");
        }
    }
}
