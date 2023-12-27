package methods;

public class PowRecursive {
    static int Pow(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * Pow(a, (b - 1));
        }
    }

    public static void main(String[] args) {
        int num = Pow(2, 0);
        System.out.println(num);
    }
}
