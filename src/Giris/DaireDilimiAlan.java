package Giris;

import java.util.Scanner;

public class DaireDilimiAlan {
    public static void main(String[] args) {
        int yaricap, aciOlcusu;
        double alan, pi = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Daire Diliminin Yarıçapını Giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Daire Diliminin Merkez Açısını Giriniz: ");
        aciOlcusu = input.nextInt();

        alan = (pi*Math.pow(yaricap,2)*aciOlcusu)/360;
        System.out.println("Daire diliminin alanı: "+alan);


    }
}
