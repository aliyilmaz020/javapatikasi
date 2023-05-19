package Giris2;

import java.util.Scanner;

public class BurcCode {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";
        boolean kontrol = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Ay giriniz: ");
        ay = input.nextInt();
        System.out.print("Gün giriniz: ");
        gun = input.nextInt();

        if(ay>=1 && ay<=12){
            if(ay==1 && gun>=1 && gun<=31){
                if(gun<=21){
                    burc = "Oğlak";
                }else{
                    burc = "Kova";
                }
            }else if(ay==2 && gun>=1 && gun<=28){
                if(gun<=19){
                    burc = "Kova";
                }else{
                    burc = "Balık";
                }
            } else if(ay==3 && gun>=1 && gun<=31){
                if(gun<=20){
                    burc = "Balık";
                }else{
                    burc = "Koç";
                }
            } else if(ay==4 && gun>=1 && gun<=30){
                if(gun<=20){
                    burc = "Koç";
                }else{
                    burc = "Boğa";
                }
            } else if(ay==5 && gun>=1 && gun<=31){
                if(gun<=21){
                    burc = "Boğa";
                }else{
                    burc = "İkizler";
                }
            } else if(ay==6 && gun>=1 && gun<=30){
                if(gun<=22){
                    burc = "İkizler";
                }else{
                    burc = "Yengeç";
                }
            }else if(ay==7 && gun>=1 && gun<=31){
                if(gun<=22){
                    burc = "Yengeç";
                }else{
                    burc = "Aslan";
                }
            }else if(ay==8 && gun>=1 && gun<=31){
                if(gun<=22){
                    burc = "Aslan";
                }else{
                    burc = "Başak";
                }
            } else if (ay == 9  && gun>=1 && gun<=30) {
                if(gun<=22){
                    burc = "Başak";
                }else{
                    burc = "Terazi";
                }
            }else if (ay == 10  && gun>=1 && gun<=31) {
                if(gun<=22){
                    burc = "Terazi";
                }else{
                    burc = "Akrep";
                }
            }else if (ay == 11  && gun>=1 && gun<=30) {
                if(gun<=21){
                    burc = "Akrep";
                }else{
                    burc = "Yay";
                }
            }else if (ay == 12  && gun>=1 && gun<=31) {
                if(gun<=21){
                    burc = "Yay";
                }else{
                    burc = "Oğlak";
                }
            }else{
                kontrol = true;
            }
            if(kontrol){
                System.out.println("Hatalı giriş yaptınız.");
            }else{
                System.out.println("Burcunuz: "+burc);
            }
        }else{
            System.out.println("Yanlış ay girdiniz.");
        }

    }
}
