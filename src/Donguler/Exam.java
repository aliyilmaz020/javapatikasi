package donguler;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        int sayac = 0, a, b, n;
        Scanner input = new Scanner(System.in);
        int q = input.nextInt();
        for (int i = 0; i < q; i++) {
            a = input.nextInt();
            b = input.nextInt();
            n = input.nextInt();
            for (int j = 0; j < n; j++) {
                sayac += (int) Math.pow(2, j) * b;
                System.out.print((a + sayac) + " ");
            }
            System.out.println();
            sayac = 0;
        }
    }
}
