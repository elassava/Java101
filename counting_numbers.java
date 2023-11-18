import java.util.Arrays;
import java.util.List;

public class counting_numbers {
    static boolean isFound(int[] arr, int item){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == item) return true;
        } return false;
    }

    static int count(int[] arr, int item) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) count++;
        } return count;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] counted = new int[list.length];
        int idx = 0;
        System.out.println("Tekrar Sayıları");
        for (int e : list) {
            if (!isFound(counted, e)) {
                System.out.println(e + " sayısı " + count(list, e) + " kez tekrar edildi. ");
                counted[idx++] = e;
            }
        }
    }
}