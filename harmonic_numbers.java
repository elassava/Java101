import java.util.Scanner;
public class harmonic_numbers {
    static double harmonic(int num) {
        double sum = 0.0;
        for (int i = 1; i <= num; i++){
            sum += 1.0 / i;
        } return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = input.nextInt();
        System.out.println(harmonic(number));

    }
}
