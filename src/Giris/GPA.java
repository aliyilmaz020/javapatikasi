package giris;

import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        int Mathematic, Physic, Chemistry, Turkish, History, Music;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        Mathematic = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        Physic = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        Chemistry = input.nextInt();
        System.out.print("Turkce notunu giriniz: ");
        Turkish = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        History = input.nextInt();
        System.out.print("Muzik notunu giriniz: ");
        Music = input.nextInt();

        double average = (Mathematic + Physic + Chemistry +
                Turkish + History + Music) / 6.0;
        System.out.println("#######################");
        System.out.println("Not ortalaması: " + average);

        String result = (average >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);

    }
}
