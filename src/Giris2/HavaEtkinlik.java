package Giris2;

import java.util.Scanner;

public class HavaEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        } else if (sicaklik>=5 && sicaklik<15) {
            System.out.println("Sinemaya gidebilirsin.");
        } else if (sicaklik>=15 && sicaklik<25) {
            System.out.println("Piknik yapabilirsin.");
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
