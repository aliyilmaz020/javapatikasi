package donguler;

import java.util.Scanner;

public class PowExam {
    public static void main(String[] args) {
        int sayi, us, sayac = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Üs giriniz: ");
        us = input.nextInt();

        for (int i = 1; i <= us; i++) {
            sayac *= sayi;
        }
        System.out.println("Sayının üssü: " + sayac);
    }
}
