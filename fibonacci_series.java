import java.util.Scanner;

public class fibonacci_series {
    static int fibonacci(int num){
        if (num == 0) return 0;
        if (num == 1) return 1;
        else return fibonacci(num-1) + fibonacci(num-2);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayısı giriniz: ");
        int num = input.nextInt();
        for (int i = 1; i < num; i++){
            System.out.print(fibonacci(i) + " ");
        }

    }
}
