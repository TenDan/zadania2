package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String inputNumber;
        int number;
        int min = 0;
        int max = 0;
        int sumOfMinAndMax;
        float averageOfMinAndMax;
        while(true) {
            System.out.print("Podaj liczbę: ");
            inputNumber = input.nextLine();
            if (inputNumber.equals("0")) {
                break;
            } else {
                number = Integer.parseInt(inputNumber);
                if (number > max) {
                    max = number;
                }
                if (min == 0) {
                    min = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }
        sumOfMinAndMax = max + min;
        averageOfMinAndMax = (float)(max + min) / 2;
        System.out.println("Suma największej i najmniejszej liczby to: "+ sumOfMinAndMax);
        System.out.println("Srednia największej i najmniejszej liczby to: "+ averageOfMinAndMax);
    }
}
