public class Weapon extends Item {
    private int damage;

    public Weapon(String name, int quantity, String type, int damage) {
        super(name, quantity, type);
        this.damage = damage;
    }

    public int getDamage() { return damage; }

    @Override
    public String toString() {
        return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: "  + getType() + ", Damage: " + getDamage();
    }
}
