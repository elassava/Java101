import java.util.Scanner;
public class mean_until_given_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, counter = 0;
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 4 == 0){
                sum += i;
                counter++;
            }
        }
        System.out.println("Ortalama: " + (sum/counter));
    }
}
