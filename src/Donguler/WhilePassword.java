package Donguler;

import java.util.Scanner;

public class WhilePassword {
    public static void main(String[] args) {
        int password;
        boolean isPasswordSuccess = false;
        Scanner input = new Scanner(System.in);

        while (!isPasswordSuccess) {
            System.out.print("Şifre giriniz : ");
            password = input.nextInt();

            if (password == 123) {
                System.out.println("Doğru");
                isPasswordSuccess = true;
            } else {
                System.out.println("Yanlış");
            }
        }
    }
}
