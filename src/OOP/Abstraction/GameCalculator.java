package oop.abstraction;

public abstract class GameCalculator {
  // public void hesapla() {
  // System.out.println("Puanınız : 100");
  // }

  // hesapla() abstract yapıldı ve bu classtan miras alan diğer classların bu
  // metodu yazmasını zorunlu kıldı.
  public abstract void hesapla();

  public final void gameOver() {
    System.out.println("Oyun bitti");
  }
}
// abstract new olmaz