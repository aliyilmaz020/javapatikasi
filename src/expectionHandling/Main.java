package expectionHandling;

public class Main {
  public static void main(String[] args) {
    try {// Çalıştırmayı dener
      int[] sayilar = new int[] { 1, 2, 3 };
      System.out.println(sayilar[4]);
    } catch (StringIndexOutOfBoundsException exception) {// Hata yakalar
      System.out.println("Hata oluştu");
      System.out.println(exception);
    } catch (ArrayIndexOutOfBoundsException exception) {
      System.out.println(exception);
    } catch (Exception exception) { // Başka bir hata olursa o hataya yönlendiriyor
      System.out.println("Loglandı : " + exception);
    } finally {
      System.out.println("Ben her türlü çalışırım.");
    } // Database'i veya benzeri şeyleri kapatmak için kullanılıyor genelde

  }
}
//
/**
 * Throwable : Expection - Error
 * Expection : Runtime - IO - SQL - AWT - Interrupted
 * Runtime Exp. :
 * Arithmetic - NullPointer - ClassCast
 * - IndexOutOfBounds : Array - String
 */