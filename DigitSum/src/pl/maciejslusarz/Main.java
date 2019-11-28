package pl.maciejslusarz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("Wprowadź liczbę: ");
        String number = input.nextLine();
        int n;
        int sumaCyfr = 0;
        int sumaParzystych = 0, sumaNieparzystych = 0;
        int iloscParzystych = 0, iloscNieparzystych = 0;
        for (int i = 0; i < number.length(); i++) {
            n = Character.getNumericValue(number.charAt(i));
            sumaCyfr += n;
            if (n % 2 == 0) {
                sumaParzystych += n;
                iloscParzystych++;
            } else {
                sumaNieparzystych += n;
                iloscNieparzystych++;
            }
        }
        System.out.println("Suma cyfr tej liczby: "+ sumaCyfr);
        System.out.println("Srednia arytmetyczna cyfr parzystych: "+sumaParzystych/iloscParzystych);
        System.out.println("Srednia arytmetyczna cyfr nieparzystych: "+sumaNieparzystych/iloscNieparzystych);
        System.out.println("Stosunek średniej arytmetycznej cyfr parzystych do średniej arytmetycznej cyfr nieparzystych: "+(sumaParzystych/iloscParzystych)+" do "+(sumaNieparzystych/iloscNieparzystych));
    }
}
