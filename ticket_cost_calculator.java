import java.util.Scanner;
public class ticket_cost_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, flightType;
        double price, drop;
        System.out.print("Mesafe giriniz (KM): ");
        distance = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        flightType = input.nextInt();
        if (distance < 0 || age < 0 || (flightType != 1 && flightType != 2)){
            System.out.println("Hatalı veri girdiniz!");
        } price = distance * (0.10);
        if (flightType == 2){
            if (age < 12){
                drop = price / 2;
                price = price - drop;
            } else if (age >= 12 && age <= 24){
                drop = price * 10 / 100;
                price = price - drop;
                System.out.println(price);
                System.out.println(drop);
            } else if (age > 65) {
                drop = price * 30 / 100;
                price = price - drop;
            } drop = price * 20 / 100;
            price = (price - drop) * 2;

        } else if (flightType == 1) {
            if (age < 12){
                drop = price / 2;
                price = price - drop;
            } else if (age >= 12 && age <= 24){
                drop = price * 10 / 100;
                price = price - drop;
            } else if (age > 65) {
                drop = price * 30 / 100;
                price = price - drop;}}
        System.out.println("Toplam tutar: " + price + " TL.");}}

