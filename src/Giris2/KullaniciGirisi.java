package Giris2;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String username,password;
        String onay;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adını giriniz: ");
        username = input.nextLine();
        System.out.print("Şifreyi giriniz: ");
        password = input.nextLine();

        if(username.equals("ali") && password.equals("ali123")){
            System.out.println("Giriş Başarılı.");
        }else{
            System.out.println("Giriş başarısız.");
            System.out.println("Şifreyi sıfırlamak ister misiniz(evet/hayır)?");
            onay = input.nextLine();
            switch (onay){
                case "evet":
                    System.out.print("Yeni şifre giriniz: ");
                    password = input.nextLine();
                    if(password.equals("ali123"))
                        System.out.println("Şifre aynı, lütfen başka şifre giriniz.");
                    else
                        System.out.println("Şifre oluşturuldu.");
                    break;
                case "hayır":
                    System.out.println("Tekrar deneyiniz.");
                    break;
                default:
                    System.out.println("Yanlış seçim");
                    break;

            }

        }

    }
}
