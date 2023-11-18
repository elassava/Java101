import java.util.Scanner;
public class leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, remainder;
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        remainder = year % 4;
        if (remainder == 0){
            System.out.println(year + " bir artık yıl.");
        } else if (year % 100 == 0 && year % 400 == 0){
            System.out.println(year + " bir artık yıl.");
        } else {
            System.out.println(year + " bir artık yıl değil.");
        }
    }
}
