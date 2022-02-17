package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        int distance, age, trip;
        double fee, discount, total;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe (km): ");
        distance = input.nextInt();
        System.out.print("Yaşınız: ");
        age = input.nextInt();
        System.out.print("Yolculuk Tipi (1: Tek Yön, 2: Gidiş Dönüş): ");
        trip = input.nextInt();
        if(distance>0 && age>=0 && (trip==1 || trip==2)){
            fee = distance * 0.1;
            if(age<12){
                discount = fee*0.5;
            }else if(age>=12 && age <=24){
                discount = fee*0.1;
            }else if(age>=65){
                discount = fee*0.3;
            }else{
                discount = 0.0;
            }
            if(trip==1){
                total = fee-discount;
            }else{
                total = 2*((fee-discount)*(1-0.2));
            }
            System.out.print("Toplam Tutar: " + total);
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
