package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double ucret, elma = 3.67, armut = 2.14, domates = 1.11, muz = 0.95, patlican = 5.00;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut Miktarı (kg): ");
        armut *= input.nextDouble();
        System.out.print("Elma Miktarı (kg): ");
        elma *= input.nextDouble();
        System.out.print("Domates Miktarı (kg): ");
        domates *= input.nextDouble();
        System.out.print("Muz Miktarı (kg): ");
        muz *= input.nextDouble();
        System.out.print("Patlıcan Miktarı (kg): ");
        patlican *= input.nextDouble();

        ucret = armut + elma + domates + muz + patlican;

        System.out.println("Toplam Tutar: " + ucret + " TL");
    }
}
