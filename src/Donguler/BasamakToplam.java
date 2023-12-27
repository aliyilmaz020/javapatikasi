package donguler;

import java.util.Scanner;

public class BasamakToplam {
    public static void main(String[] args) {
        int sayi, basamak, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        sayi = input.nextInt();

        while (sayi > 0) {
            basamak = sayi % 10;
            toplam += basamak;
            sayi /= 10;
        }
        System.out.println(toplam);
    }
}
