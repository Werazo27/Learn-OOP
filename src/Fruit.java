public class Fruit extends Item {
    private String color;

    public Fruit(String name, int quantity, String type, String color) {
        super(name, quantity, type);
        this.color = color;
    }

    public String getColor() { return color; }
}
