package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("A < B");
        System.out.print("Wprowadź liczbę A: ");
        int defaultA = input.nextInt();
        int a = defaultA;
        System.out.print("Wprowadź liczbę B: ");
        int b = input.nextInt();
        int sum = 0;
        while(a <= b) {
            sum += a;
            a++;
        }
        System.out.println("Suma ciągu liczb wyniesie (while): "+sum);
        sum = 0;
        a = defaultA;
        do {
            sum += a;
            a++;
        } while (a <= b);
        System.out.println("Suma ciągu liczb wyniesie (do-while): "+sum);
        sum = 0;
        a = defaultA;
        for (;a <= b;a++) {
            sum += a;
        }
        System.out.println("Suma ciągu liczb wyniesie (for): "+sum);
    }
}
