package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

  public static void main(String[] args) {
    // Rastgele bir sayı seçme
    Random random = new Random();
    int rastgeleSayi = random.nextInt(101); // 0 ile 100 arasında rastgele bir sayı seçer

    // Kullanıcıdan tahmin isteme
    Scanner scanner = new Scanner(System.in);
    int tahmin;
    int denemeSayisi = 0;
    int maksimumDeneme = 5; // Kullanıcının sahip olduğu maksimum deneme sayısı
    List<Integer> yanlisTahminler = new ArrayList<>(); // Yanlış tahminleri saklamak için liste

    System.out.println("0 ile 100 arasında bir sayıyı tahmin etmeye çalışın.");

    while (denemeSayisi < maksimumDeneme) {
      System.out.print("Tahmininizi girin: ");
      tahmin = scanner.nextInt();

      if (tahmin < 0 || tahmin > 100) {
        System.out.println("Lütfen 0 ile 100 arasında bir sayı girin.");
        continue; // Geçerli bir sayı girilmediğinde döngüyü tekrar başlat
      }

      denemeSayisi++;

      if (tahmin < rastgeleSayi) {
        System.out.println("Daha büyük bir sayı deneyin.");
      } else if (tahmin > rastgeleSayi) {
        System.out.println("Daha küçük bir sayı deneyin.");
      } else {
        System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
        break; // Doğru tahmin yapıldığında döngüyü kır
      }

      yanlisTahminler.add(tahmin); // Yanlış tahminleri listeye ekle

      int kalanHak = maksimumDeneme - denemeSayisi;
      System.out.println("Kalan hakkınız: " + kalanHak);

      if (kalanHak > 0) {
        System.out.println("Yanlış tahminleriniz: " + yanlisTahminler);
        System.out.println("Yeniden deneyin.");
      } else {
        System.out.println("Üzgünüm! Haklarınız bitti. Doğru cevap: " + rastgeleSayi);
      }
    }

    scanner.close();
  }
}
