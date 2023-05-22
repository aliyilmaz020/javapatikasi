package Donguler;

import java.util.Scanner;

public class StarTrigon {
    public static void main(String[] args) {
        int sayi;
        char c = '*';
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        sayi = input.nextInt();

        for(int i = 1; i<=sayi;i++){
            System.out.print(c);
        }

    }
}
