package Donguler;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        Scanner input  = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int price;
        while(right>0){
            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = input.nextLine();
            if(userName.equals("patika") && password.equals("dev123")){
                System.out.println("Giriş yapıldı. Merhaba..");
                do{

                    System.out.print("1 - Para Yatırma\n" +
                            "2 - Para Çekme\n" +
                            "3 - Bakiye Sorgulama\n" +
                            "4 - Çıkış Yap\n" +
                            "Yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = input.nextInt();
                            balance+=price;
                            continue;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = input.nextInt();
                            if(price>balance){
                                System.out.println("Bakiye yetersiz.");
                            }else{
                                balance-=price;
                            }
                            continue;
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            continue;
                        case 4:
                            System.out.println("Görüşmek üzere.");
                        default:
                            System.out.println("Hatalı Giriş Yaptınız.");
                    }
                }while (select !=4);
                break;
            }else{
                right--;
                System.out.println("Hatalı giriş, tekrar dene.");
                System.out.println("Kalan Hakkınız: " + right);
            }
        }

    }
}
