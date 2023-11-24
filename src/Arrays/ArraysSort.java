package Arrays;

import java.util.*;

public class ArraysSort {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Dizinin boyutu n : ");
    int n = scan.nextInt();
    int[] dizi = new int[n];
    System.out.println("Diznin elemanlarını giriniz : ");

    for (int i = 0; i < n; i++) {
      System.out.printf("%d. elemanı : ", (i + 1));
      dizi[i] = scan.nextInt();
    }
    Arrays.sort(dizi);
    System.out.print("Sıralama: ");
    for (int i = 0; i < dizi.length; i++) {
      System.out.print(" " + dizi[i]);
    }
  }
}
