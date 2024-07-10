import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu d = new mainMenu();
        addFood fd = new addFood();
        d.menu();
        System.out.println("Enter the number to select:");
        int choice = sc.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println("Enter your admin id:");
                    int id = sc.nextInt();
                    System.out.println("Enter your password:");
                    sc.nextLine();  // consume the newline
                    String str = sc.nextLine();
                    password pass = new password(id, str, fd);
                    break;
                case 2:
                    fd.display();
                    break;
                case 3:
                    orderFood of = new orderFood(fd);
                    of.placeOrder();
                    break;
                case 4:
                    placeOrder po = new placeOrder();
                    po.confirmOrder();
                    break;
                case 7:
                    d.menu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("Enter the number to select:");
            choice = sc.nextInt();
        }
    }
}
