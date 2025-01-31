public class Fruit extends Item {
    private String color;

    public Fruit(String name, int quantity, String type, String color) {
        super(name, quantity, type);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public String toString() {
        return "Item: " + getName() + ", Quantity: " + getQuantity() + ", Type: "  + getType() + ", Color: " + getColor();
    }
}
