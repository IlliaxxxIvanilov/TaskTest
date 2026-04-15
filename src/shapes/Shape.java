package shapes;

public abstract class Shape {

    private final String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double area();

    public String describe() {
        return this.color;
    }

    protected String getColor() {
        return this.color;
    }
}
