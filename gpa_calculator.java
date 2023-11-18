import java.util.Scanner;
public class gpa_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int matematik, turkce, fizik, kimya, muzik, dersSayi = 5;
        double toplam = 0.0;

        System.out.print("Matematik notunu giriniz: ");
        matematik = input.nextInt();
        if (0 <= matematik && 100 >= matematik){
            toplam += matematik;
        } else {
            dersSayi--;
        }
        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if (0 <= turkce && 100 >= turkce){
            toplam += turkce;
        } else {
            dersSayi--;
        }
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if (0 <= fizik && 100 >= fizik){
            toplam += fizik;
        } else {
            dersSayi--;
        }
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if (0 <= kimya && 100 >= kimya){
            toplam += kimya;
        } else {
            dersSayi--;
        }
        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if (0 <= muzik && 100 >= muzik){
            toplam += muzik;
        } else {
            dersSayi--;
        }
        double ortalama = toplam / dersSayi ;
        System.out.println("Ortalamanız: " + ortalama);
        if (ortalama >= 55){
            System.out.println("Sınıfı geçtiniz.");
        }else {
            System.out.println("Kaldınız.");
        }


    }
}
