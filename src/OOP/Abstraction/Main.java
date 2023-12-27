package oop.abstraction;

public class Main {
  public static void main(String[] args) {
    // WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
    // womanGameCalculator.hesapla();
    // womanGameCalculator.gameOver();

    GameCalculator gameCalculator = new WomanGameCalculator();
    gameCalculator.hesapla();
    gameCalculator.gameOver();
    System.out.println("--------------------------");
    GameCalculator gameCalculator2 = new OlderGameCalculator();
    gameCalculator2.hesapla();
    // GameCalculator gameCalculator = new GameCalculator() {

    // @Override
    // public void hesapla() {

    // }
    // };
  }
}
