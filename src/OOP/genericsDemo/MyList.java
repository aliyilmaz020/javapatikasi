package oop.genericsDemo;

import java.util.Arrays;

public class MyList<T> {
  private Object[] array;
  private int size;
  private static final int DEFAULT_CAPACITY = 10;

  // Boş constructor
  public MyList() {
    this.array = new Object[DEFAULT_CAPACITY];
    this.size = 0;
  }

  // Kapasite parametresi alan constructor
  public MyList(int capacity) {
    if (capacity < 0) {
      throw new IllegalArgumentException("Capacity cannot be negative");
    }
    this.array = new Object[capacity];
    this.size = 0;
  }

  // Dizideki eleman sayısını verir
  public int size() {
    return size;
  }

  // Dizinin kapasite değerini verir
  public int getCapacity() {
    return array.length;
  }

  // Eleman ekler, eğer dizi boyutu yetersizse boyutunu 2 katına çıkartır
  public void add(T data) {
    if (size == array.length) {
      ensureCapacity(); // Dizinin boyutunu kontrol et ve gerekirse artır
    }
    array[size++] = data;
  }

  // Dizinin boyutunu 2 katına çıkartan yardımcı metod
  private void ensureCapacity() {
    int newCapacity = array.length * 2;
    array = Arrays.copyOf(array, newCapacity);
  }
}
