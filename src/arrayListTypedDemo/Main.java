package arrayListTypedDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> sehirler = new ArrayList<String>();
    sehirler.add("Ankara");
    sehirler.add("İzmir");
    sehirler.add("Adana");
    sehirler.add("İstanbul");

    Collections.sort(sehirler);
    for (String sehir : sehirler) {
      System.out.println(sehir);
    }
    sehirler.remove(1);
    sehirler.remove("Ankara");
    System.out.println(sehirler);
  }
}
