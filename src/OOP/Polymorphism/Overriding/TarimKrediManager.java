package oop.polymorphism.overriding;

public class TarimKrediManager extends BaseKrediManager {
  public double hesapla(double tutar) {
    return tutar * 2.76;
  }
}
