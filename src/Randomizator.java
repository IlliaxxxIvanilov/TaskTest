import shapes.*;

import java.util.Random;

public class Randomizator {

    public void fillArrayAndPrint(int size, String[] colors) {
        Shape[] shapes = new Shape[size];
        for (int i = 0; i < size; i++) {
            Random rand = new Random();
            shapes[i] = this.randShape(rand.nextInt(4) + 1, colors);
        }

        for (Shape shape : shapes) {
            System.out.printf("Фігура: %s%n", shape.describe());
        }
    }


    public int randBetween(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    private String randColor(String[] colors) {
        return colors[this.randBetween(0, colors.length - 1)];
    }

    private Shape randShape(int rand, String[] colors) {
        return switch (rand) {
            case 1 -> new Circle(this.randBetween(1, 20), this.randColor(colors));
            case 2 -> new Square(this.randBetween(1, 20), this.randColor(colors));
            case 3 -> new Triangle(this.randBetween(1, 20), this.randBetween(1, 20), this.randColor(colors));
            case 4 -> new Trapezoid(this.randBetween(1, 20), this.randBetween(1, 20), this.randBetween(1, 20), this.randColor(colors));
            default -> null;
        };
    }
}
