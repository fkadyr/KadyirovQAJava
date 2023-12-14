package tasks;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = 5;
        double[] mas = new double[size];
        System.out.println("Введите числа массива - ");
        for (double el : mas) {
            el = scanner.nextDouble();
            if (el % 3 == 0) {
                System.out.println(el);
            }
        }
    }
}
