package Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matris = new int[3][4];
        int num = 1;
        for (int i = 0; i < matris.length; i++) {
            // matris[i]
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = 3 * num++;
            }
        }
        for (int i = 0; i < matris.length; i++) {
            // matris[i]
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + "\t");
            }
            System.out.println();
        }

        // System.out.println(matris[0].length);

        // int[][] matris = new int[6][6];
        // matris[0][0] = 0;
        // matris[2][3] = 839;
        // System.out.println(matris[2][3]);

    }
}
