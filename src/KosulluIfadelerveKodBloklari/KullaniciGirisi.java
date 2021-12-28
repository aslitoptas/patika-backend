package KosulluIfadelerveKodBloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, newPassword, sifreOlustur;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Başarılı!");

        }else if(userName.equals("patika") && (!password.equals("java123"))){
            System.out.print("Girdiğiniz şifre hatalıdır. Yeni şifre oluştur? (E/H)");
            sifreOlustur = input.nextLine();
            if(sifreOlustur.equals("E")){
                System.out.print("Yeni Şifre: ");
                newPassword = input.nextLine();
            }

            if (newPassword.equals(password) || newPassword.equals("java123")){
                System.out.print("Şifre oluşturulamadı. Lütfen başka şifre giriniz: ");
                newPassword = input.nextLine();
            }
            else{
                System.out.print("Şifre Oluşturuldu!");
            }

        }

    }
}
