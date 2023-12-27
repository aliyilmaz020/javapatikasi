package donguler;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int sayi, kombSayi, sonuc, pay = 1, payda = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = sc.nextInt();
        System.out.print("Kombinasyon sayısını giriniz: ");
        kombSayi = sc.nextInt();

        while (kombSayi > 0) {
            pay *= sayi;
            payda *= kombSayi;
            sayi--;
            kombSayi--;
        }
        sonuc = pay / payda;
        System.out.println("Sonuç : " + sonuc);

    }
}
