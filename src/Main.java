//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Fruit apples = new Fruit("Apple(s)", 20, "Fuji", "Redish");
        Weapon sword = new Weapon("Sword", 2, "Melee", 15);

        inventory.addItem(apples);
        inventory.addItem(sword);

        inventory.displayInventory();

        inventory.displayInventory("Melee");
    }
}