import java.util.Scanner;

public class bank_system {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String passWord, userName;
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0){
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.println("Şifrenizi giriniz: " );
        passWord = input.nextLine();

        if (passWord.equals("123") && userName.equals("patika")){
            System.out.println("Merhaba, Kodluyoruz bankasına hoşgeldiniz!");
            do {
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Yatırmak istediğiniz para miktarı: ");
                        int addMoney = input.nextInt();
                        balance += addMoney;
                        System.out.println("Bakiyeniz: " + balance + " TL");
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz para miktarı: ");
                        int takeMoney = input.nextInt();
                        balance -= takeMoney;
                        System.out.println("Bakiyeniz: " + balance + " TL");
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance + " TL");
                        break;
                }
            } while (select != 4);
            System.out.println("Tekrar görüşmek üzere.");

        } else {
            right--;
            System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
            if (right == 0){
                System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
            } else {
                System.out.println("Kalan deneme hakkınız: " + right);}}}}}
