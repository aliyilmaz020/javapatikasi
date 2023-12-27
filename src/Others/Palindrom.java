package others;

import java.util.*;

public class Palindrom {

  static boolean isPalindrom(String str) {
    int i = 0;
    int j = str.length() - 1;
    while (i < j) {
      if (str.charAt(i) != str.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word;
    System.out.print("Kelime giriniz: ");
    word = input.nextLine();
    if (isPalindrom(word)) {
      System.out.println("Bu kelime palindromiktir.");
    } else {
      System.out.println("Bu kelime palindromik değildir");
    }
  }
}
