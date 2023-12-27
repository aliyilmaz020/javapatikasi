package methods;

public class Palindrom {
    static void PalindromSayi(int sayi) {
        int temp = sayi, num = 0, sonNum = 0;
        while (temp != 0) {
            sonNum = temp % 10;
            num = (num * 10) + sonNum;
            temp /= 10;
        }
        if (sayi != num) {
            System.out.println(sayi + " Palindrom Sayı değildir.");
        } else {
            System.out.println(sayi + " Palindrom Sayıdır.");
        }
    }

    public static void main(String[] args) {
        PalindromSayi(141);
    }
}
