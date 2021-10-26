package Assignment;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Who get this cart");
        String name = input.next();
        Cart newCart = new Cart(name);
        String response;
        do {
            System.out.println("what did they buy");
            String itemName = input.next();
            System.out.println("How much did they buy");
            int itemPrice = input.nextInt();
            System.out.println("How many did they buy");
            int itemQuantity = input.nextInt();
            System.out.println("anything else");
             response = input.next();
            Item item = new Item(itemName, itemPrice, itemQuantity);
            newCart.addItem(item);


        }  while(response.equalsIgnoreCase("yes"));
             System.out.print("=".repeat(50));
             System.out.println();
            System.out.println(newCart);

    }
}
