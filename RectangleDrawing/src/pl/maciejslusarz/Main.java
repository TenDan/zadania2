package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Czym chcesz wypełnić prostokąt: ");
        String znakWypelnienia = input.nextLine();
        System.out.print("Odstępowa pozycja: ");
        int spacePos = Integer.parseInt(input.nextLine());
        System.out.print("Liniowa pozycja: ");
        int linePos = Integer.parseInt(input.nextLine());
        System.out.print("Długość jednego boku: ");
        int a = Integer.parseInt(input.nextLine());
        System.out.print("Długość drugiego boku: ");
        int b = Integer.parseInt(input.nextLine());
        int iterator = 0;
        while (iterator < linePos-1) {
            System.out.println();
            iterator++;
        }
        for (int i = 0; i < a; i++) {
            iterator = 0;
            while (iterator < spacePos-1) {
                System.out.print(" ");
                iterator++;
            }
            iterator = 0;
            while (iterator < b) {
                System.out.print(znakWypelnienia);
                iterator++;
            }
            System.out.println();
        }
    }
}
