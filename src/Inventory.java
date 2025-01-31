import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;// ArrayList is for objects, Arrays can't hold them. ArrayList is also dynamically resizable, Arrays aren't in Java

    public Inventory() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayInventory() {
        for (Item item : items) {
            System.out.println("Item: " + item.getName() + ", Quantity: " + item.getQuantity() + ", Type: "  + item.getType());
        }
    }
}
