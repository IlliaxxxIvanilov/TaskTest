package shapes;

public class Square extends Shape {

    private int sideA;

    public Square(int sideA, String color) {
        super(color);
        this.sideA = sideA;
    }

    public int getSideA() {
        return this.sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    @Override
    public double area() {
        return this.sideA * this.sideA;
    }

    @Override
    public String describe() {
        return "Квадрат, площа: " + this.area() +
                " кв.од., довжина сторони: " +
                this.sideA + "од., колір: " + super.describe();
    }
}
