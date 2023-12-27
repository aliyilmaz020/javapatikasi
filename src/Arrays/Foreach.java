package arrays;

public class Foreach {
    public static void main(String[] args) {
        int[] scores = new int[10];
        scores = new int[3];
        scores = new int[] { 215, 234, 218, 189, 221, 290 };

        for (int score : scores) {
            System.out.print(score + "  ");
        }

        /*
         * int [][] dizi = {{1,2,4},{6,7,3},{5,8,44}};
         * for (int [] i: dizi) {
         * for (int j: i) {
         * System.out.print(j+"\t");
         * }
         * System.out.println();
         */

        /*
         * int [] dizi = {3,4,5,6,7,8,9,0};
         * int sum = 0;
         * for (int i:dizi
         * ) {
         * sum+=i;
         * }
         * System.out.println(sum);
         */
    }
}
