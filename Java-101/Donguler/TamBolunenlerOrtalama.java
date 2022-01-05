package Donguler;
import java.util.Scanner;

public class TamBolunenlerOrtalama {
    public static void main(String[] args) {
        int number, n = 0, sum = 0;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        number = input.nextInt();

        for(int i = 1; i <= number; i++){
            if(i % 3 == 0 || i % 4 == 0){
                sum += i;
                n += 1;
            }
        }

        average = sum/n;
        System.out.println("Ortalama: " + average);
    }
}
