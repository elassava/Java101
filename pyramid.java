import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısı ");
        int basamak = input.nextInt();
        for (int i = 1; i <= basamak; i++){
            for (int j = 1; j <= (basamak-i); j++){
                System.out.print(" ");
            }
            if (i <= (basamak / 2) + 1){
            for (int k = 1; k <= (i * 2) - 1 ; k++ ){
                System.out.print("*");
                }
            } else {
                for (int m = (((basamak - 1) * 2) -1); m >= 1; m--){
                    System.out.print("*");
                }
            } System.out.println();
        }
    }
}
