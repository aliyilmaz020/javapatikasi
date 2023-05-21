package Donguler;

import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int sayi;
        double toplam = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();
        toplam = 0;
        for(int i = 1; i<=sayi; i++ ){
            toplam += (1.0/i);
        }
        System.out.println(toplam);
    }
}
