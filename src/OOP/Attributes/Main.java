package OOP.Attributes;

public class Main {
  public static void main(String[] args) {
    Product product = new Product(1, "Laptop", "Asus", 2000, 2, "Black");
    // product.setName("Laptop");
    // product.setId(1);
    // product.setDescription("Asus");
    // product.setPrice(5000);
    // product.setStockAmount(5);

    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    System.out.println(product.getKod());
  }
}
