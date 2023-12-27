package giris;

import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int kenar1, kenar2, kenar3, cevre;
        double valueU, alan;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        kenar1 = input.nextInt();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        kenar2 = input.nextInt();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        kenar3 = input.nextInt();

        cevre = kenar1 + kenar2 + kenar3;
        valueU = cevre / 2.0;
        alan = Math.sqrt(valueU * (valueU - kenar1) * (valueU - kenar2) * (valueU - kenar3));

        System.out.println("Üçgenin alanı: " + alan);

    }

}
