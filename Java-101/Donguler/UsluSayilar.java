package Donguler;

import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;

        System.out.print("Üssü alınacak sayıyı giriniz (n): ");
        n = input.nextInt();

        System.out.print("Üs olarak bir doğal sayı giriniz (n): ");
        k = input.nextInt();

        int result = 1;

        for(int i=1; i<=(k-1); i++){
            result *= n;
        }
        System.out.println("Sonuç: " + result);
    }
}
