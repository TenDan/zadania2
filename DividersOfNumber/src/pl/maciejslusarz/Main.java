package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        int number = input.nextInt();
        for(int dzielnik = 1; dzielnik <= number; dzielnik++) {
            if (number % dzielnik == 0) {
                System.out.print(dzielnik+" ");
            }
        }
    }
}
