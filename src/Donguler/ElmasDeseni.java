package Donguler;

import java.util.Scanner;

public class ElmasDeseni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini giriniz: ");
        int yukseklik = scanner.nextInt();

        int boslukSayisi = yukseklik - 1;
        int yildizSayisi = 1;

        // Üst kısım
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();
            boslukSayisi--;
            yildizSayisi += 2;
        }

        boslukSayisi = 1;
        yildizSayisi = yildizSayisi - 4;

        // Alt kısım
        for (int i = 0; i < yukseklik - 1; i++) {
            for (int j = 0; j < boslukSayisi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < yildizSayisi; j++) {
                System.out.print("*");
            }

            System.out.println();
            boslukSayisi++;
            yildizSayisi -= 2;
        }
    }
}
