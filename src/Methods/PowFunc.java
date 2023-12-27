package methods;

import java.util.Scanner;

public class PowFunc {
    public static double Pow(double taban, int us) {
        double sonuc = 1;
        if (us < 0) {
            us = us * -1;
            for (int i = 1; i <= us; i++) {
                sonuc *= (1.0 / taban);
            }
        } else {
            for (int i = 1; i <= us; i++) {
                sonuc *= taban;
            }
        }
        return sonuc;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üssünü giriniz: ");
        int us = input.nextInt();
        System.out.println(Pow(taban, us));
    }
}
