package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        int r, alpha;
        double pi=3.14, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Daire diliminin yarıçapını giriniz: ");
        r = input.nextInt();
        System.out.print("Dilimin açısını giriniz: ");
        alpha = input.nextInt();

        alan = (pi * r * r) * (alpha/360.0);

        System.out.println("Dilimin Alanı: " + alan);
    }
}
