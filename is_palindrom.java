import java.util.Scanner;
public class is_palindrom {
    static void palindrom(int num){
        int reverseNumber = 0, number = num, lastDigit, count = 1;
        while (number > 0){
            lastDigit = number % 10;
            number = number / 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
        }
        if (reverseNumber == num) System.out.println(num + " palindrom bir sayıdır. ");
        else System.out.println(num + " palindrom bir sayı değildir.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();
        palindrom(num);
    }
}
