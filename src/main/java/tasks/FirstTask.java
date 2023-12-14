package tasks;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число - ");
        if (scanner.nextDouble()> 7) {
            System.out.println("Привет");
        }
    }
}
