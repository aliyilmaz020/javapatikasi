import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int basamakSayisi;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısı Giriniz: ");
        basamakSayisi = input.nextInt();

        for(int i = basamakSayisi; i>=1;i--){
            for(int k = 1; k<=basamakSayisi-i;k++){
                System.out.print(" ");
            }
            for(int j  = 1 ; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
