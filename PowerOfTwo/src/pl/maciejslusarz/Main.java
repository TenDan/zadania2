package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą dodatnią: ");
        int n = input.nextInt();
        int wynik = 1;
        int i = 1;
        do {
            System.out.println(wynik);
            wynik = (int)Math.pow(2,i);
            i++;
        } while(wynik < n);
    }
}
