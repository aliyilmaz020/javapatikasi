package donguler;

import java.util.Scanner;

public class FourFivePow {
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        sayi = sc.nextInt();
        System.out.println("Durumlar  4^n 5^n\n------------------------");
        for (int i = 0; i <= sayi; i++) {
            System.out.println(i + ". Durum: " + (int) Math.pow(4, i) + "    " + (int) Math.pow(5, i));
        }
    }
}
