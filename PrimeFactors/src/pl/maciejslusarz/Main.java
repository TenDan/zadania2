package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int number = input.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Liczba ta, nie jest liczbą pierwszą!");
                System.exit(0);
            }
        }
        System.out.println("Liczba ta, jest liczbą pierwszą");
    }
}
