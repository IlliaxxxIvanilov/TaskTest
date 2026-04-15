package shapes;

public class Triangle extends Shape {

    private int sideA;
    private int sideB;

    public Triangle(int sideA, int sideB, String color) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
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

    public double getHypotenus() {
        return Math.sqrt(this.sideA * this.sideA + this.sideB * this.sideB);
    }

    @Override
    public double area() {
        return (double)(this.sideA * this.sideB)/2;
    }

    @Override
    public String describe() {
        return "Трикутник, площа: " + this.area() +
                " кв.од., катети: " + this.sideA +
                " і " + this.sideB +
                " од., гіпотенуза: " +
                this.getHypotenus() +
                " од., колір: " + super.describe();
    }
}
