import java.util.Scanner;

public class creating_patterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı: ");
        int basamak = input.nextInt();
        for (int i = basamak; i > 0; i--) {
            for (int j = 1; j <= (basamak - i); j++) {
                System.out.print(" ");
            } for (int k = 1; k <= (i * 2) - 1 ; k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
