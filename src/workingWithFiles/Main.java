package workingWithFiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    readFile();
    writeFile();
    readFile();
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

  public static void readFile() {
    File file = new File("D:\\javapatikasi\\src\\files\\student.txt");
    try {
      Scanner reader = new Scanner(file);
      while (reader.hasNextLine()) { // Satırda yazılar varsa okur
        String line = reader.nextLine();
        System.out.println(line);
      }
      reader.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  public static void writeFile() {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\javapatikasi\\src\\files\\student.txt", true));
      writer.newLine();
      writer.write("ali");
      System.out.println("Dosyaya yazıldı");
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
