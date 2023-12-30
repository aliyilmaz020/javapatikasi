package workingWithFiles;

import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    getFileInfo();
  }

  public static void createFile() {
    File file = new File("D:\\javapatikasi\\src\\files\\student.txt");
    try {
      if (file.createNewFile()) {
        System.out.println("Dosya oluşturuldu.");
      } else {
        System.out.println("Dosya zaten mevcut");
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void getFileInfo() {
    File file = new File("D:\\javapatikasi\\src\\files\\student.txt");
    if (file.exists()) {
      System.out.println("Dosya adı : " + file.getName());
      System.out.println("Dosya Yolu : " + file.getAbsolutePath());
      System.out.println("Dosya yazılabilir mi : " + file.canWrite());
      System.out.println("Dosya okunabilir mi : " + file.canRead());
      System.out.println("Dosya boyutu (byte): " + file.length());

    }
  }
}
