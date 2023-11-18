import java.util.Scanner;

public class n_number {
    static void loop1(int num, int temp) {
        if (num > 0) {
            System.out.print(num + " ");
            loop1(num - 5, temp);
        } else {
            loop2(num, temp);
        }
    }

    static void loop2(int num, int temp) {
        if (temp >= num) {
            System.out.print(num + " ");
            loop2(num +5, temp);
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısı girin: ");
        int n = input.nextInt();
        int temp = n;
        loop1(n, temp);
    }
}


