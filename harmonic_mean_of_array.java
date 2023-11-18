import java.util.Scanner;

public class harmonic_mean_of_array {
    static double harmonic(int[] arr){
        double sum = 0.0;
        for (int e: arr){
            sum += 1.0 / e;}
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        System.out.print("Dizinin eleman sayısını giriniz: ");
        length = input.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++){
            System.out.print((i+1) + ". elemanı giriniz: ");
            arr[i] = input.nextInt();
        }
        System.out.println("Dizinin harmonik ortalaması => " + (arr.length / harmonic(arr)));
    }
}
