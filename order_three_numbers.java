import java.util.Scanner;
public class order_three_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sıralamak istediğiniz 3 sayıyı giriniz.");
        System.out.print("1: ");
        int a = input.nextInt();
        System.out.print("2: ");
        int b = input.nextInt();
        System.out.print("3: ");
        int c = input.nextInt();

        if ((a == b) || (b == c) || (a == c)){
            System.out.println("Eşit iki ya da daha fazla sayı girilemez.");
        } else if (a < b && a < c){
            if (b < c){
                System.out.println(a + " < " + b + " < " + c);
            } else {
                System.out.println(a + " < " + c + " < " + b);}

        } else if (b < c && b < a){
            if(c < a){
                System.out.println(b + " < " + c + " < " + a);
            } else {
                System.out.println(b + " < " + a + " < " + c);}
        } else if (c < a && c < b){
            if (a < b){
                System.out.println(c + " < " + a + " < " + b);
            } else {
                System.out.println(c + " < " + b + " < " + a);}
        }

    }
}
