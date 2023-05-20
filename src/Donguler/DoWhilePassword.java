package Donguler;

import java.util.Scanner;

public class DoWhilePassword {
    public static void main(String[] args) {
        int password;
        boolean kontrol = true;
        Scanner input = new Scanner(System.in);
        do{
            System.out.print("Şifreyi giriniz : ");
            password = input.nextInt();
            if(password == 123){
                System.out.println("Doğru");
                kontrol = false;
            }else{
                System.out.println("Yanlış");
            }
        }while(kontrol);
    }
}
