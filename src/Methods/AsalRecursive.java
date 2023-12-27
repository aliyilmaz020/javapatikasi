package methods;

import java.util.Scanner;

public class AsalRecursive {

    static boolean AsalMi(int a, int b) {
        if (a == 1) {
            return false;
        }
        if (b == 1) {
            return true;
        }
        if (a % b == 0) {
            return false;
        }
        return AsalMi(a, b - 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi1 = input.nextInt();
        boolean isAsal = AsalMi(sayi1, sayi1 / 2);

        if (isAsal) {
            System.out.println(sayi1 + " bir asal sayıdır.");
        } else {
            System.out.println(sayi1 + " bir asal sayı değildir.");
        }
    }
}
