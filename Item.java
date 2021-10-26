package Assignment;
import java.util.Scanner;

public class Item {
    private String name;
    private int price;
    private int quantity;


    public Item(String name, int price, int quantity) {
        this.name = name;
         this.price = price;
        this.quantity = quantity;
    }

    public Item() {
    }


    public int calculateTotal() {
        return price * quantity;
    }

    public String toString() {

        return name + "\t\t\t" + price + "\t\t\t" + quantity + "\t\t\t" + calculateTotal();
    }
}












































//                public void get_Calculate_Total() {
//         Item myItem = new Item();
//         myItem.setCalculate_Total( 20, 100);
//         myItem.getCalculate_Total();
//         System.out.println(myItem.getCalculate_Total());
//
//        }// public void static main (String [] args ){
//        }
//
//}
