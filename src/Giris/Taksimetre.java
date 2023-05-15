package Giris;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int mesafe;
        double ucret,tutar,kmBasi = 2.2,ilkUcret = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe giriniz (km) : ");
        mesafe = input.nextInt();
        ucret = ilkUcret + mesafe*kmBasi;
        tutar = (ucret<20) ? 20 : ucret;
        System.out.println("Taksimetre ücreti: "+ tutar);

    }
}
