package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        while(true) {
            System.out.print("Podaj liczbę: ");
            String inputNumber = input.nextLine();
            if (inputNumber.equals("0")) {
                break;
            } else {
                number = Integer.parseInt(inputNumber);
                sum += number;
            }
        }
        System.out.println("Suma tych liczb wynosi: "+sum);
    }
}
