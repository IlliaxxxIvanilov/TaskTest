package shapes;

public class Trapezoid extends Shape {

    private int sideA;
    private int sideB;
    private int height;

    public Trapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public int getSideA() {
        return this.sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return this.sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (double) ((this.sideA + this.sideB) * this.height) / 2;
    }

    @Override
    public String describe() {
        return "Трапеція, площа: " + this.area() +
                " кв.од., основи: " + this.sideA + " і " + this.sideB +
                " од., висота: " + this.height +
                " од., колір: " + super.describe();
    }
}
