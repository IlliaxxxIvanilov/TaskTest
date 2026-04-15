import shapes.*;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] colors = {"синій", "червоний", "зелений", "жовтий", "фіолетовий", "рожевий",
                "білий", "чорний", "сірий", "помаранчевий", "коричневий", "бірюзовий",
                "золотий", "срібний", "малиновий", "лавандовий", "оливковий", "кремовий"};
        int number;
        do {
            System.out.println("Задайте 0 для рандомної генерації або 1 для ручного введення");
            Scanner input = new Scanner(System.in);
            try {
                number = input.nextInt();
            } catch (InputMismatchException e) {
                input.nextLine();
                number = -1;
            }
        } while (number != 0 && number != 1);

        Randomizator randomizator = new Randomizator();

        int size;
        if (number == 1) {
            do {
                System.out.println("Задайте кількість фігур");
                Scanner input = new Scanner(System.in);
                try {
                    size = input.nextInt();
                } catch (InputMismatchException e) {
                    input.nextLine();
                    size = -1;
                }
            } while (size < 1);
        } else size = randomizator.randBetween(1, 100);

        randomizator.fillArrayAndPrint(size,  colors);
    }



}