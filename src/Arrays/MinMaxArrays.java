package arrays;

public class MinMaxArrays {
    public static void main(String[] args) {
        int[] list = { 11, 33, -13, -35, 56, 75, 89, 41, 100, 56 };
        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);

    }
}
