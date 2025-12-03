import java.util.ArrayList;
import java.util.Scanner;
import com.inventory.Inventory;

public class Main {
    public static void main(String[] args) {

        ArrayList<Inventory> inventory = new ArrayList<Inventory>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product name");
        String productName = scanner.nextLine();

        System.out.println("Enter product price");
        double productPrice  = scanner.nextDouble();

        System.out.println("Enter product quantity");
        int productQuantity = scanner.nextInt();

        scanner.close();

        Inventory product = new Inventory(productName, productPrice, productQuantity);
        inventory.add(product);

        for(Inventory info : inventory) {
            System.out.println(info.toString());
        }
    }
}