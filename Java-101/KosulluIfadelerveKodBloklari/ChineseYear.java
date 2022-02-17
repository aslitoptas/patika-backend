package KosulluIfadelerveKodBloklari;
import java.util.Scanner;

public class ChineseYear {
    public static void main(String[] args) {
        int year, cYear;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınız: ");
        year = input.nextInt();
        cYear = year%12;
        System.out.print("Çin Yılı: ");
        switch (cYear) {
            case 1 -> System.out.print("Horoz");
            case 2 -> System.out.print("Köpek");
            case 3 -> System.out.print("Domuz");
            case 4 -> System.out.print("Fare");
            case 5 -> System.out.print("Öküz");
            case 6 -> System.out.print("Kaplan");
            case 7 -> System.out.print("Tavşan");
            case 8 -> System.out.print("Ejderha");
            case 9 -> System.out.print("Yılan");
            case 10 -> System.out.print("At");
            case 11 -> System.out.print("Koyun");
            default -> System.out.print("Maymun");
        }
    }
}
