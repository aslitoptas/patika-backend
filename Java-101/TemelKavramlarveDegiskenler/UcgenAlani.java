package TemelKavramlarveDegiskenler;

import java.util.Scanner;

public class UcgenAlani {
    public static void main(String[] args) {
        int a, b, c;
        double s, area;

        Scanner input = new Scanner(System.in);

        System.out.println("Alanını hesaplamak istediğiniz üçgenin kenar uzunluklarını giriniz.");
        System.out.print("1. Kenar: ");
        a = input.nextInt();
        System.out.print("2. Kenar: ");
        b = input.nextInt();
        System.out.print("3. Kenar: ");
        c = input.nextInt();

        s = (a + b + c)/2.0;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Üçgenin Alanı: " + area);
    }
}
