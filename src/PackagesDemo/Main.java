package packagesDemo;

import java.util.Scanner;

import packagesDemo.matematik.*;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Sayi: ");
    int num = input.nextInt();

    num *= 2;
    System.out.println(num);
    DortIslem dortIslem = new DortIslem();
    dortIslem.topla(2, 3);
    Logaritma logaritma = new Logaritma();
  }
}
