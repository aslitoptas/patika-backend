package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class BurcunuzNe {
    public static void main(String[] args) {
        int gun, ay;
        String burc = "";
        boolean isError = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz Ay (M): ");
        ay = input.nextInt();

        System.out.print("Doğduğunuz Gün (D): ");
        gun = input.nextInt();

        if((ay == 1 && (gun >= 1 && gun <= 21)) || (ay == 12 && (gun > 21 && gun <= 31))){
            burc = "Oğlak";
        }else if((ay == 2 && (gun >= 1 && gun <= 19)) || (ay == 1 && (gun > 21 && gun <= 31))){
            burc = "Kova";
        }else if((ay == 3 && (gun >= 1 && gun <= 20)) || (ay == 2 && (gun > 19 && gun <= 29))){
            burc = "Balık";
        }else if((ay == 4 && (gun >= 1 && gun <= 20)) || (ay == 3 && (gun > 20 && gun <= 31))){
            burc = "Koç";
        }else if((ay == 5 && (gun >= 1 && gun <= 21)) || (ay == 4 && (gun > 20 && gun <= 30))){
            burc = "Boğa";
        }else if((ay == 6 && (gun >= 1 && gun <= 22)) || (ay == 5 && (gun > 21 && gun <= 31))){
            burc = "İkizler";
        }else if((ay == 7 && (gun >= 1 && gun <= 22)) || (ay == 6 && (gun > 22 && gun <= 30))){
            burc = "Yengeç";
        }else if((ay == 8 && (gun >= 1 && gun <= 22)) || (ay == 7 && (gun > 22 && gun <= 31))){
            burc = "Aslan";
        }else if((ay == 9 && (gun >= 1 && gun <= 22)) || (ay == 8 && (gun > 22 && gun <= 31))){
            burc = "Başak";
        }else if((ay == 10 && (gun >= 1 && gun <= 22)) || (ay == 9 && (gun > 22 && gun <= 30))){
            burc = "Terazi";
        }else if((ay == 11 && (gun >= 1 && gun <= 21)) || (ay == 10 && (gun > 22 && gun <= 31))){
            burc = "Akrep";
        }else if(( ay == 12 && (gun >= 1 && gun <= 21)) || (ay == 11 && (gun > 21 && gun <= 30))){
            burc = "Yay";
        }else{
            isError = true;
        }
        if(isError){
            System.out.print("Geçersiz tarih girdiniz. Tekrar deneyiniz.");
        }else{
            System.out.print("Burcunuz: " + burc);
        }
    }
}
