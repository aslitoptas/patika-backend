package Donguler;

import java.util.Scanner;

public class CiftSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, sum=0;

        do{
            System.out.print("Bir Çift Sayı Giriniz: ");
            num=input.nextInt();
            if(num%4==0){
                sum+=num;
            }
        }while(num%2==0);
        System.out.println("Toplam: " + sum);
    }
}
