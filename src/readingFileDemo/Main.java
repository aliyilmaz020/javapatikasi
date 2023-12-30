package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // try-catch yap ya da başkası
    // kullanacaksa FileNotFoundExpection
    // metodunu kullanmalı
    BufferedReader reader = null;
    int total = 0;

    try {
      reader = new BufferedReader(new FileReader("D:\\javapatikasi\\src\\readingFileDemo\\sayilar.txt"));
      String line = null;
      while ((line = reader.readLine()) != null) {
        total += Integer.valueOf(line);
      }
      System.out.println("Toplam = " + total);
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (Exception e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        reader.close();
      } catch (Exception e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }

  }
}
