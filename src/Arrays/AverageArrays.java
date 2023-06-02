package Arrays;

public class AverageArrays {
    public static void main(String[] args) {
        int[] dizi = {4,5,2,3,34,223,3456,754,433};
        double toplam = 0.0;
        double average;
        for(int i = 0; i<dizi.length; i++){
            toplam += dizi[i];
        }
        average = toplam / dizi.length;
        System.out.println(average);
    }
}
