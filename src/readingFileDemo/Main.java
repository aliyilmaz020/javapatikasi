package readingFileDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    // try-catch yap ya da başkası
    // kullanacaksa FileNotFoundExpection
    // metodunu kullanmalı
    BufferedReader reader = null;
    try {
      reader = new BufferedReader(new FileReader("D:\\javapatikasi\\src\\readingFileDemo\\sayilar.txt"));

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      reader.close();
    }

  }
}
