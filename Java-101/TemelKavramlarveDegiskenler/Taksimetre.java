package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int mesafe, acilis = 10, minTutar = 20;
        double birimUcret = 2.20, ucret;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi giriniz: ");
        mesafe = input.nextInt();

        ucret = acilis + mesafe*birimUcret;
        ucret = (ucret>20) ? ucret : minTutar;

        System.out.println("Toplam Tutar: " + ucret);
    }
}
