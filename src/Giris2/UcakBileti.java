package giris2;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirim = 0, indirimliTutar = 0, gidisDonusInd = 0, toplamTutar = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yolculukTipi = input.nextInt();

        normalTutar = mesafe * 0.10;

        if (mesafe >= 0 && yas >= 0 && yolculukTipi >= 1 && yolculukTipi <= 2) {
            if (yas < 12) {
                yasIndirim = normalTutar * 0.5;
            }
            if (yas >= 12 && yas <= 24) {
                yasIndirim = normalTutar * 0.10;
            }
            if (yas >= 65) {
                yasIndirim = normalTutar * 0.3;
            }
            indirimliTutar = normalTutar - yasIndirim;

            if (yolculukTipi == 2) {
                gidisDonusInd = indirimliTutar * 0.2;
            }
            toplamTutar = (indirimliTutar - gidisDonusInd) * yolculukTipi;
            System.out.println("Toplam Tutar = " + toplamTutar + " TL");
        } else {
            System.out.println("Hatalı veri girdiniz !");
        }

    }
}
