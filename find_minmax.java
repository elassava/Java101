import java.util.Scanner;

public class find_minmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        int val1 = Integer.MIN_VALUE;
        int val2 = Integer.MAX_VALUE;
        System.out.print("Kaç sayı girmek istiyorsunuz ?: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + ". sayı: ");
            int sayi = input.nextInt();
            if (sayi > val1) val1 = sayi;
            if (sayi < val2) val2 = sayi;
        }
        System.out.println("min. değer: " + val2);
        System.out.println("max. değer: " + val1);
    }
}
