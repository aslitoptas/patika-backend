package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int n1, n2, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        secim = input.nextInt();

        switch (secim) {
            case 1 -> System.out.println("Toplama : " + (n1 + n2));
            case 2 -> System.out.println("Çıkarma : " + (n1 - n2));
            case 3 -> System.out.println("Çarpma : " + (n1 * n2));
            case 4 -> System.out.println("Bölme : " + (n1 / n2));
            default -> System.out.println("Yanlış seçim yaptınız.");
        }
    }
}
