//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item apples = new Item("Apples", 20);
        Item sword = new Item("Sword", 2);

        inventory.addItem(apples);
        inventory.addItem(sword);

        inventory.displayInventory();
    }
}