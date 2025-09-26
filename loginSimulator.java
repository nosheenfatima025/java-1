import java.util.Scanner;

public class loginSimulator {
    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        if(username.equals("admin") && password.equals("admin123")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
        scanner.close();
    }
    
}
