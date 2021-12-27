package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class KDVTutari {
    public static void main(String[] args) {
        double tutar, kdvOrani, kdv, kdvDahil;

        Scanner input = new Scanner(System.in);

        System.out.print("Ürün tutarını giriniz: ");
        tutar = input.nextDouble();

        kdvOrani = (tutar>1000) ? 0.08 : 0.18;
        kdv = tutar * kdvOrani;
        kdvDahil = tutar + kdv;

        System.out.println("KDV'siz Tutar: ");
        System.out.println("KDV Oranı: " + kdvOrani);
        System.out.println("KDV Tutarı: " + kdv);
        System.out.println("KDV Dahil Fiyat: " + kdvDahil);
    }
}
