import java.util.Scanner;

public class ebob_ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, ebob = 1, ekok;
        System.out.print("A sayısı: ");
        a = input.nextInt();
        System.out.print("B sayısı: ");
        b = input.nextInt();
        int i = 1;
        if (a > b) {
            while (i <= b) {
                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= a) {
                if ((a % i == 0) && (b % i == 0)) {
                    ebob = i;
                }
                i++;
            }
        } ekok = (a * b) / ebob;
        System.out.println("EKOK: " + ekok);
        System.out.println("EBOB: " + ebob);
    }
}