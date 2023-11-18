import java.util.Scanner;
public class powers_of_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i = 0, fourPow = 1, fivePow = 1;
        System.out.println("Bir sayı giriniz: ");
        n = input.nextInt();
        while (n >= i){
            System.out.println("4**" + i + " : " + fourPow);
            System.out.println("5**" + i + " : " + fivePow);
            fourPow *= 4;
            fivePow *= 5;
            i++;
        }
    }
}
