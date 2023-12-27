package methods;

import java.util.Scanner;

public class DesenMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int n = scanner.nextInt();

        DesenMethods(n);
    }

    public static void DesenMethods(int sayi) {
        if (sayi > 0) {
            System.out.println("Çıkarma işlemi: " + sayi);
            DesenMethods(sayi - 5);
        } else {
            System.out.println("Toplama işlemi: " + sayi);
            if (sayi < 0) {
                DesenMethods(sayi + 5);
            }
        }
    }
}
