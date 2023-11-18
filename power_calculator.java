import java.util.Scanner;
public class power_calculator {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int num, pow, res;
        System.out.println("Üssü alınacak sayı: ");
        num = input.nextInt();
        res = num;
        System.out.println("Üs: ");
        pow = input.nextInt();
        for (int i = 1; i < pow; i++){
            res *= num;}
        System.out.println(res);
    }
}
