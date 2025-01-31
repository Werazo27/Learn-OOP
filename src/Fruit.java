public class Fruit extends Item {
    private String color;

    public Fruit(String name, int quantity, String type, String color) {
        super(name, quantity, type);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public void displayInfo() {
        System.out.println("Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: "  + getType() + ", Color: " + getColor());
    }

//    public String displayInfo() {
//        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: "  + getType() + ", Color: " + getColor();
//    } this version would be to allow more flexibility of usage instead of forcing print with void
}
