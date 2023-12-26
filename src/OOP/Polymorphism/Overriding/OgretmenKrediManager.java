package OOP.Polymorphism.Overriding;

public class OgretmenKrediManager extends BaseKrediManager {
  public double hesapla(double tutar) {
    return tutar * 0.5;
  }
}
