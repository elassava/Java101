import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hesap makinesi açılıyor...");
        System.out.print("Lütfen ilk sayıyı giriniz: ");
        int one = input.nextInt();
        System.out.print("Lütfen ikinci sayıyı giriniz: ");
        int two = input.nextInt();
        System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
        System.out.println("çarpma -> 1");
        System.out.println("bölme -> 2");
        System.out.println("toplama -> 3");
        System.out.print("çıkarma -> 4: ");
        int islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Sonuç: " + (one * two));
                break;
            case 2:
                System.out.println("Sonuç: " + (one / two));
                break;
            case 3:
                System.out.println("Sonuç: " + (one + two));
                break;
            case 4:
                System.out.println("Sonuç: " + (one - two));
                break;
            default:
                System.out.println("Hatalı giriş!");
        }

    }
}
