package methods;

import java.util.Scanner;

public class CalcMeth {
    static int Toplama(int a, int b) {
        int sonuc = a + b;
        return sonuc;
    }

    static int Cikarma(int a, int b) {
        int sonuc = a - b;
        return sonuc;
    }

    static int Carpma(int a, int b) {
        int sonuc = a * b;
        return sonuc;
    }

    static double Bolme(double a, double b) {
        double sonuc = a / b;
        return sonuc;
    }

    static int UsAlma(int a, int b) {
        int sonuc = 1;
        for (int i = 0; i < b; i++) {
            sonuc *= a;
        }
        return sonuc;
    }

    static int Faktoriyel(int a) {
        int sonuc = 1;
        for (int i = 1; i <= a; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    static double ModAlma(double a, double b) {
        double sonuc = a % b;
        return sonuc;
    }

    static void DikdortgenAlanCevre(int a, int b) {
        System.out.println("Çevre : " + (2 * (a + b)));
        System.out.println("Alan : " + (a * b));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sorgu = "1- Toplama\n" +
                "2- Çıkarma\n" +
                "3- Çarpma\n" +
                "4- Bölme\n" +
                "5- Üs Alma\n" +
                "6- Faktöriyel\n" +
                "7- Mod Alma\n" +
                "8- Dikdörtgen ve Alan Hesaplama\n" +
                "9- Çıkış Yap";
        while (true) {
            System.out.println(sorgu);
            System.out.print("Yapacağınız işlemi seçiniz: ");
            int secim = input.nextInt();

            if (secim == 9) {
                break;
            }

            System.out.print("1. Sayıyı giriniz: ");
            int num1 = input.nextInt();
            System.out.print("2. Sayıyı giriniz: ");
            int num2 = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Toplam: " + Toplama(num1, num2));
                    break;
                case 2:
                    System.out.println("İki sayının farkı : " + Cikarma(num1, num2));
                    break;
                case 3:
                    System.out.println("Çarpımları : " + Carpma(num1, num2));
                    break;
                case 4:
                    System.out.println("Bölümü : " + Bolme(num1, num2));
                    break;
                case 5:
                    System.out.println("Sayının üssü : " + UsAlma(num1, num2));
                    break;
                case 6:
                    System.out.println("Sayının Faktoriyeli : " + Faktoriyel(num1));
                    break;
                case 7:
                    System.out.println("Sayının modu : " + ModAlma(num1, num2));
                    break;
                case 8:
                    DikdortgenAlanCevre(num1, num2);
                    break;
                default:
            }
            System.out.println("-------------------------------------------");
        }
        System.out.println("Görüşmek Üzere......");

    }
}
