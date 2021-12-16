package TemelKavramlarveDegiskenler;
import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double ortalama;
        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        ortalama = (matematik + fizik + kimya + turkce + tarih + muzik)/6.0;

        sonuc = (ortalama>=60) ? ("Sınıfı Geçti") : ("Sınıfta Kaldı");

        System.out.println(sonuc);

    }
}
