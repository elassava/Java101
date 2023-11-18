public class sum_of_digits {
    static int sumOfDigits(int number){
        int remainder = 0;
        while (number > 0){
            remainder += number % 10;
            number = number / 10;
        } return remainder;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1643));
    }
}
