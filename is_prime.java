import java.util.Scanner;

public class is_prime {
    static boolean isPrime(int number, int count) {
        if (number == 1) return false;
        if (count == 1) return true;
        else if (number % count == 0) return false;
        else return isPrime(number, count-1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();
        boolean prime = isPrime(number, number-1);
        if (prime) System.out.println(number + " sayısı asaldır.");
        else System.out.println(number + " sayısı asal değildir.");
    }
}
