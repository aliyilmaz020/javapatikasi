package Giris2;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,dersSayisi=0;
        Scanner input = new Scanner(System.in);
        double ortalama,toplam = 0;

        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if(mat>=0&&mat<=100){
            toplam += mat;
            dersSayisi++;
        }
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if(fizik>=0&&fizik<=100){
            toplam += fizik;
            dersSayisi++;
        }
        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if(turkce>=0&&turkce<=100){
            toplam += turkce;
            dersSayisi++;
        }
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if(kimya>=0&&kimya<=100){
            toplam += kimya;
            dersSayisi++;
        }
        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if(muzik>=0&&muzik<=100){
            toplam += muzik;
            dersSayisi++;
        }
        ortalama = toplam/dersSayisi;
        if(ortalama<55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz.");
        }
        System.out.println("Not ortalaması = "+ortalama);

    }
}
