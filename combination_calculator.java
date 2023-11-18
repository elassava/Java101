import java.util.Scanner;
public class combination_calculator {
    static int factorial(int n){
        int start = 1, total = 1;
        while (n >= start){
            total *= start;
            start++;
        } return total;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r, result;
        System.out.print("n: ");
        n = input.nextInt();
        System.out.print("r: ");
        r = input.nextInt();
        result = factorial(n) / (factorial(r) * factorial(n-r));
        System.out.println(result);
    }
}
