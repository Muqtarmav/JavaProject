 package Assignment;

import java.util.ArrayList;

class Cart {
    private String ownerName;
    private ArrayList<Item> items = new ArrayList<>();


    public Cart(String ownerName) {
        this.ownerName = ownerName;

    }
    @Override
    public String toString() {
        String stringToBeReturned = "";
        for (Item item : items) {
            stringToBeReturned = stringToBeReturned + item + "\n";
        }

        return stringToBeReturned;
    }


    public void addItem(Item item){
        items.add(item);


    }

    public double calculateGrandTotal() {
        int total = 0;
        for (Item item : items) {

            total = total + item.calculateTotal();

        }
        return total;
    }


}
