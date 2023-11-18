import java.util.Scanner;
public class multiples_of_four {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum = 0;
        do {
            System.out.print("Bir sayı giriniz: ");
            n = input.nextInt();
            if (n % 4 == 0){
                sum += n;
            }
        } while (n >= 0) ;
        System.out.println(sum);
    }
}
