package methods;

public class FiboMethods {

    static void Fibonacci(int elemanSayisi) {
        int num1 = 0, num2 = 1;
        int temp = 0;
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(num1 + " ");
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
    }

    public static void main(String[] args) {
        Fibonacci(4);
    }
}
