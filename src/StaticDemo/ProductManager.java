package staticDemo;

public class ProductManager {
  public void add(Product product) {
    // ProductValidator validator = new ProductValidator();
    if (ProductValidator.isValid(product)) { // static ise kendisini kullanır

      System.out.println("Eklendi.");
    } else {
      System.out.println("Ürün bilgileri geçersiz.");
    }
    // ProductValidator productValidator = new ProductValidator();
    // productValidator.another();
  }
}
// Constructer çalışması için new'lemek gerekir.