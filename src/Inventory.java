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
            item.displayInfo();
        }
    }

    // method overload example, compile time polymorphism
    public void displayInventory(String type) {
        for (Item item : items) {
            if (item instanceof Fruit && ((Fruit) item).getType().equalsIgnoreCase(type)) {
                item.displayInfo();
            } else if (item instanceof Weapon && ((Weapon) item).getType().equalsIgnoreCase(type)) {
                item.displayInfo();
            }
        }
    }
}
