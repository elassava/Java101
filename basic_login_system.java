import java.util.Scanner;

public class basic_login_system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String validUserName = "patika", validPassword = "1234", userName, password, reset, newPassword;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();
        if (userName.equals(validUserName)){
            if (!password.equals(validPassword)){
                System.out.print("Yanlış şifre! Şifrenizi sıfırlamak istiyorsanız S tuşuna basın. Yeniden giriş yapmak istiyorsanız herhangi bir tuşa basın. ");
                reset = input.nextLine();
                if (reset.equals("S")){
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newPassword = input.nextLine();
                    while (newPassword.equals(validPassword)){
                        System.out.print("Şifre oluşturulamadı, lütfen başka şifre giriniz." );
                        newPassword = input.nextLine();
                    }
                    System.out.println("Şifre oluşturuldu. ");
                }
            }
        }else {
            System.out.println("Yanlış kullanıcı adı! ");
        }

    }
}
