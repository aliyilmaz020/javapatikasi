package donguler;

import java.util.Scanner;

public class EvenFourMode {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0;
        Scanner input = new Scanner(System.in);
        while (sayi % 2 == 0) {
            System.out.print("Sayı Giriniz : ");
            sayi = input.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Toplam : " + toplam);

    }
}
