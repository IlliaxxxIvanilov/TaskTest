package shapes;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.pow(this.radius, 2) * Math.PI);
    }

    public int getRadius() {
        return this.radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String describe() {
        return "Коло, площа: " + this.area() +
                " кв.од., радіус: " + this.radius +
                ", колір: " + super.describe();
    }
}
