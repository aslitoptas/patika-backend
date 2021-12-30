package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik, not = 0, ders = 0;
        double ortalama;
        String sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();
        if(matematik>=0 && matematik<=100){
            not = matematik;
            ders = 1;
        }

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        if(fizik>=0 && fizik<=100){
            not = not + fizik;
            ders = ders + 1;
        }

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        if(kimya>=0 && kimya<=100){
            not = not + kimya;
            ders = ders + 1;
        }

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();
        if(turkce>=0 && turkce<=100){
            not = not + turkce;
            ders = ders + 1;
        }

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();
        if(muzik>=0 && muzik<=100){
            not = not + muzik;
            ders = ders + 1;
        }

        ortalama = not/ders;

        if(ortalama<55){
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere!");
            System.out.print("Ortalamanız: " + ortalama);
        }else{
            System.out.println("Tebrikler, sınıfı geçtiniz!");
            System.out.print("Ortalamanız: " + ortalama);
        }
    }
}
