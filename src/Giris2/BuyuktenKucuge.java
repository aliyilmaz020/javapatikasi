package giris2;

import java.util.Scanner;

public class BuyuktenKucuge {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        num1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        num2 = input.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        num3 = input.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("num1 >= num2 >= num3");
            } else {
                System.out.println("num1 >= num3 >= num2");
            }
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("num2 >= num1 >= num3");
            } else {
                System.out.println("num2 >= num3 >= num1");
            }
        } else {
            if (num1 >= num2) {
                System.out.println("num3 >= num1 >= num2");
            } else {
                System.out.println("num3 >= num2 >= num1");
            }

        }
    }
}
