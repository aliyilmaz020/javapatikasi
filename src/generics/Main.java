package generics;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {// generics tip güvenli çalışmak için kullanılır
    ArrayList<String> cities = new ArrayList<String>();
    cities.add("Ankara");
    cities.add("İzmir");
    cities.add("Bursa");
  }
}
