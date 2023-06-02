package Arrays;

import java.util.Scanner;

public class ArraysClass {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("matrix[%d][%d] : ", i, j);
                matrix[i][j] = input.nextInt();
            }
        }

    }
}
