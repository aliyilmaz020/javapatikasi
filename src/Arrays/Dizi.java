package Arrays;

import java.util.Scanner;

public class Dizi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] dizi = new int[5];
        for (int i = 0;i< dizi.length;i++){
            System.out.print("Sayı gir: ");
            dizi[i] = input.nextInt();
        }for (int i = 0;i< dizi.length;i++){
            System.out.println((i+1)+". Eleman: "+dizi[i]);
        }

    }
}
