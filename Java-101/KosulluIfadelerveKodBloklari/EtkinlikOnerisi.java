package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);

        System.out.print("Hava Sıcaklığını Giriniz: ");
        sicaklik = input.nextInt();

        if(sicaklik > 5 && sicaklik <= 15){
            System.out.print("Sinemaya gidebilirsiniz.");
        }else if(sicaklik > 15 && sicaklik <= 25){
            System.out.print("Piknik yapabilirsiniz.");
        }else if(sicaklik > 25){
            System.out.print("Yüzmeye gidebilirsiniz.");
        }else{
            System.out.print("Kayak yapabilirsiniz.");
        }
    }
}
