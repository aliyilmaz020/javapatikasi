package generics;

public class MyList<T> { // <T> type belirtmek için kullanılır
  public void add(T value) {
    MyList<Customer> cities = new MyList<Customer>();
    cities.add(new Customer());
    cities.add(new Customer());
    // cities.add(1);
  }

  public void remove(T value) {

  }
}
