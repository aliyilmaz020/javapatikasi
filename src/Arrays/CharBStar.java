package Arrays;

// 0 ve 5. sütunlarla başlayanlar *
// 0, 3 ve 6. satırlarla başlayanlar ise *
//geri kalanlar boşluk
public class CharBStar {
    public static void main(String[] args) {
        String[][] letter = new String[7][6];
        for (int i = 0; i < letter.length; i++) {
            for (int j = 0; j < letter[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letter[i][j] = " * ";
                } else if (j == 0 || j == 5) {
                    letter[i][j] = " * ";
                } else {
                    letter[i][j] = "   ";
                }
            }
        }
        for (String row[] : letter) {
            for (String col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
