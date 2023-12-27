package donguler;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı Giriniz: ");
        int sayi = input.nextInt();
        int num1 = 0;
        int num2 = 1;
        int toplam;
        for (int i = 0; i <= sayi; i++) {
            System.out.print(num1 + "     ");
            toplam = num1 + num2;
            num1 = num2;
            num2 = toplam;
        }
    }
}
