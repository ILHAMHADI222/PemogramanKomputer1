/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practice;

/**
 *
 * @author lenovo
 */
import java.util.Scanner;

public class DuckSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Pilih jenis bebek (1/2/3) atau ketik '0' untuk keluar:");
            System.out.println("1. Mallard Duck");
            System.out.println("2. Redhead Duck");
            System.out.println("3. Rubber Duck");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Terima kasih! Keluar dari Ducksimulator.");
                break;
            } else if (choice < 1 || choice > 3) {
                System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, atau 0 untuk keluar.");
                continue;
            }

            Duck duck = createDuck(choice);
            performDuckBehavior(duck);
        }

        scanner.close();
    }

    private static Duck createDuck(int choice) {
        switch (choice) {
            case 1 -> {
                return new MallardDuck();
            }
            case 2 -> {
                return new ReadHeadDuck();
            }
            case 3 -> {
                return new RubberDuck();
            }
            default -> throw new IllegalArgumentException("Pilihan tidak valid.");
        }
    }

    private static void performDuckBehavior(Duck duck) {
        duck.display();
        duck.quack();
        duck.swim();
        duck.fly();
        System.out.println();
    }   
}
