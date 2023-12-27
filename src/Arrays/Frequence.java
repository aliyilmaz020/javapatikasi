package arrays;

public class Frequence {
  public static void main(String[] args) {
    int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };

    System.out.println("Tekrar Sayıları");

    for (int i = 0; i < dizi.length; i++) {
      int sayac = 0;

      // Daha önce kontrol edilen elemanları bir daha kontrol etme
      boolean isControlled = false;

      for (int j = 0; j < i; j++) {
        if (dizi[i] == dizi[j]) {
          isControlled = true;
          break;
        }
      }

      if (!isControlled) {
        for (int j = i; j < dizi.length; j++) {
          if (dizi[i] == dizi[j]) {
            sayac++;
          }
        }
        System.out.printf("%d sayısı %d kere tekrar edildi.", dizi[i], sayac);
        System.out.println();
      }
    }
  }
}
