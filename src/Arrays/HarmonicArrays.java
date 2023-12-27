package arrays;

import java.util.Scanner;

public class HarmonicArrays {
    public static void main(String[] args) {
        int[] harm = new int[5];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < harm.length; i++) {
            System.out.printf("%d. elemanı gir: ", i);
            harm[i] = input.nextInt();
        }
        double toplam = 0.0;
        for (int i = 0; i < harm.length; i++) {
            toplam += 1.0 / harm[i];
        }
        System.out.println(toplam);
    }
}
