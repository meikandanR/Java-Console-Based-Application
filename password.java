public class password {
    private int ID = 101;
    private String st = "MKFOODS123";

    password(int id, String str, addFood add) {
        if (id == ID) {
            if (str.equals(st)) {
                System.out.println("Successfully logged in");
                add.Items();
            } else {
                System.out.println("Incorrect password. Please try again.");
            }
        } else {
            System.out.println("ID not available in database. Please enter correctly.");
        }
    }
}
