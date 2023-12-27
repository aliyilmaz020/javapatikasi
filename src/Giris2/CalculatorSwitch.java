package giris2;

import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {
        int num1, num2, secim;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        num2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Çıkarma = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Çarpma = " + (num1 * num2));
                break;
            case 4:
                System.out.println("Bölme = " + (num1 / num2));
                break;
            default:
                System.out.println("Yanlış seçim");
                break;
        }

    }
}
