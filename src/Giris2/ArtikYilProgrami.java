package Giris2;
import java.util.Scanner;

public class ArtikYilProgrami {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        boolean artikYil = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYil = true;
                }
            } else {
                artikYil = true;
            }
        }

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}

