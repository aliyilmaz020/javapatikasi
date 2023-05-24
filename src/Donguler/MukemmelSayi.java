package Donguler;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,mukSayi=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = input.nextInt();

        for(int i = 1; i<sayi; i++){
            if(sayi%i==0){
                mukSayi +=i;
            }
        }
        if(mukSayi==sayi){
            System.out.println(sayi+" bir mükemmel sayıdır.");
        }else{
            System.out.println(sayi+" bir mükemmel sayı değildir.");
        }
    }
}
