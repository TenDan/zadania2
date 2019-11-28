package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 100);
        int number;
        System.out.println(randomNumber);
        while(true) {
            System.out.print("Wprowadź liczbę: ");
            number = input.nextInt();
            if (number > randomNumber) {
                System.out.println("Podana przez ciebie liczba jest większa od wylosowanej! Spróbuj ponownie");
            }
            if (number < randomNumber) {
                System.out.println("Podana przez ciebie liczba jest mniejsza od wylosowanej! Spróbuj ponownie");
            }
            if (number == randomNumber) {
                System.out.println("Gratulację! Trafiłeś! Liczbą tą była: "+randomNumber);
                break;
            }
        }
    }
}
