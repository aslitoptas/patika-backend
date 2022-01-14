package Donguler;

import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, r, C, NFak = 1, rFak = 1, NrFak = 1;

        System.out.print("Kümenin eleman sayısını giriniz (N): ");
        N = input.nextInt();

        System.out.print("Alt kümenin eleman sayısını giriniz (r): ");
        r = input.nextInt();

        for(int i=1; i<=N; i++){
            NFak*=i;
            if(i<=r){
                rFak*=i;
            }
            if(i<=(N-r)){
                NrFak*=i;
            }
        }
        C = (NFak)/(rFak*NrFak);
        System.out.println("Alt küme sayısı: " + C);
    }
}
