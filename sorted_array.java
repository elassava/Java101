import java.util.Scanner;
import java.util.Arrays;

public class sorted_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elementNum;
        System.out.print("Dizinin eleman sayısını giriniz: ");
        elementNum = input.nextInt();
        int[] arr = new int[elementNum];
        for (int i = 0; i < arr.length; i++){
            System.out.print((i + 1) +". " + "elemanı giriniz: ");
            arr[i] = input.nextInt();
        } Arrays.sort(arr);
        System.out.println("Sıralanmış dizi: " + Arrays.toString(arr));

    }
}
