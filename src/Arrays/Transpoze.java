package arrays;

public class Transpoze {
  public static void main(String[] args) {
    int[][] matris = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int[][] transpoze;
    int temp = 0;
    System.out.println("Matris: ");
    for (int i = 0; i < matris.length; i++) {
      for (int j = 0; j < matris[i].length; j++) {
        System.out.print(matris[i][j] + "  ");
      }
      System.out.println();
    }
    System.out.println("Transpoze: ");
    int sutun = matris[0].length;
    for (int i = 0; i < sutun; i++) {
      for (int j = 0; j < matris.length; j++) {
        System.out.print(matris[j][i] + "  ");
      }
      System.out.println();
    }

  }
}
