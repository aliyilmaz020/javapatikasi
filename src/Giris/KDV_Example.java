package Giris;

import java.util.Scanner;

public class KDV_Example {
    public static void main(String[] args) {
        int tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Para tutarını giriniz: ");
        tutar = input.nextInt();

        double kdvTutari = (tutar>=0 && tutar<1000) ? tutar+tutar*0.18:
                tutar+tutar*0.08;
        System.out.print("KDV'siz Fiyat = "+tutar+
                "\nKDV'li Fiyat = "+kdvTutari);

    }
}
