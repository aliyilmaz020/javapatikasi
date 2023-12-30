package expectionHandling;

public class Main {
  public static void main(String[] args) {
    try {// Çalıştırmayı dener
      int[] sayilar = new int[] { 1, 2, 3 };
      System.out.println(sayilar[2]);
    } catch (Exception exception) {// Hata yakalar
      System.out.println("Hata oluştu");
      System.out.println(exception);
    } finally {
      System.out.println("Ben her türlü çalışırım.");
    } // Database'i veya benzeri şeyleri kapatmak için kullanılıyor genelde

  }
}
