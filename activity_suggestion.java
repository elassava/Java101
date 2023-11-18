import java.util.Scanner;
public class activity_suggestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        int heat = input.nextInt();
        if (heat < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat > 5 && heat <10) {
            System.out.println("Pikniğe ya da sinemaya gidebilirsiniz.");
        } else if (heat < 15 && heat > 10) {
            System.out.println("Sinemaya gidebilirsiniz.");
        } else if (heat > 15 && heat < 25){
            System.out.println("Pikniğe gidebilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz. ");
        }

    }
}
