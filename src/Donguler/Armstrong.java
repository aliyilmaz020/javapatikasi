package Donguler;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        int basamakUs;
        long sayi,armSayi,armSayi1,basamak,toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextLong();
        armSayi = sayi;
        armSayi1 = sayi;
        basamakUs=0;
        //Basamak Sayısı Bulma
        while(basamakUs>=0){
            if(sayi!=0){
                sayi = sayi/10;
                basamakUs++;
                continue;
            }
            break;
        }

        while (armSayi>0){
            basamak = armSayi%10;
            toplam += Math.pow(basamak,basamakUs);
            armSayi /= 10;
        }

        if(toplam == armSayi1){
            System.out.println(armSayi1+" = "+toplam+" bir Armstrong sayıdır.");
        } else{
            System.out.println(armSayi1+" != "+toplam+" bir Armstrong sayı değildir.");
        }

    }
}
