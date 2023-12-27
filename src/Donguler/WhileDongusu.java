package donguler;

public class WhileDongusu {
    public static void main(String[] args) {
        int i = 1;
        int k;
        System.out.println("Program Başladı.");
        while (i <= 5) {
            System.out.println(i);
            i++;
            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
        }
        System.out.println("Program Bitti.");
    }
}
