package giris;

import java.util.Scanner;

public class VucutKitleEndeks {
    public static void main(String[] args) {
        int kilo;
        double boy, indeks;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsi olarak (Örn: 1,64)) giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();
        indeks = kilo / Math.pow(boy, 2);
        System.out.println("Vücut kitle indeksiniz: " + indeks);

    }
}
