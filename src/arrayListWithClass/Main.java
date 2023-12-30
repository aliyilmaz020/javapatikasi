package arrayListWithClass;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Customer c1 = new Customer(0, "Caner", "Kara");
    customers.add(c1);
    Customer c2 = new Customer(1, "Mahir", "Köse");
    customers.add(c2);
    Customer c3 = new Customer(2, "Eren", "Tüfekçioğlu");
    customers.add(c3);
    Customer c4 = new Customer(3, "Diyar", "Kapu");
    customers.add(c4);

    customers.remove(c2);
    for (Customer customer : customers) {
      System.out.println(customer.firstName);
    }
  }
}
