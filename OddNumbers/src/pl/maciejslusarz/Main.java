package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź dowolną liczbę całkowitą dodatnią: ");
        int number = input.nextInt();
        System.out.println("Liczby pierwsze niewiększe od podanej to: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(i+" ");
            }
        }
    }
}
