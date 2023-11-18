import java.util.Scanner;

public class chinese_zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remainder;
        String zodiac = null;
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        remainder = year % 12;
        switch (remainder){
            case 0:
                zodiac = "Maymun";
                break;
            case 1:
                zodiac = "Horoz";
                break;
            case 2:
                zodiac = "Köpek";
                break;
            case 3:
                zodiac = "Domuz";
                break;
            case 4:
                zodiac = "Fare";
                break;
            case 5:
                zodiac = "Öküz";
                break;
            case 6:
                zodiac = "Kaplan";
                break;
            case 7:
                zodiac = "Tavşan";
                break;
            case 8:
                zodiac = "Ejderha";
                break;
            case 9:
                zodiac = "Yılan";
                break;
            case 10:
                zodiac = "At";
                break;
            case 11:
                zodiac = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş! ");
        }
        System.out.println("Zodyak: " + zodiac);
    }
}
