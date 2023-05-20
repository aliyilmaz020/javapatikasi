package Donguler;

import java.util.Scanner;

public class GirilenSayi3_4 {
    public static void main(String[] args) {
        int sayi,toplam = 0,sayac = 0;
        double ortalama;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi  = input.nextInt();


        for(int i = 0;i<=sayi;i++){
            if(i%4 == 0 && i%3 == 0){
                System.out.println("Sayılar : " + i);
                toplam+=i;
                sayac++;
            }
        }
        ortalama = toplam/sayac;
        System.out.println("Ortalama : "+ ortalama+"\nSayıların Toplamı : "+toplam+"\nToplam Sayı : "+sayac);

    }
}
