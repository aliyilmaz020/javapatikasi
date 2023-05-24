package Donguler;

import java.util.Scanner;

public class EBOB_EKOK {
    public static void main(String[] args) {
        int sayi1,sayi2;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        sayi2 = input.nextInt();
        int ebob = 1;
        int i=1;

        //EBOB
        while(i>0){
            if(sayi1%i ==0 && sayi2%i == 0){
                ebob = i;
            }
            i++;
        }
        //EKOK
        int ekok = (sayi1 * sayi2) / ebob;

        System.out.printf("%d ve %d EBOB'u : %d\n" +
                "%d ve %d EKOK'u : %d",sayi1,sayi2,ebob,sayi1,sayi2,ekok);
    }
}
