package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class VucutKitle {
    public static void main(String[] args) {
        float boy, kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu giriniz (m): ");
        boy = input.nextFloat();
        System.out.print("Lütfen kilonuzu giriniz (kg): ");
        kilo = input.nextFloat();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}
