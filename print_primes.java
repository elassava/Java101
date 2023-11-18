public class print_primes {
    static void prime(int num){
        boolean isPrime = true;
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                isPrime = false;
            }
        } if (num == 2) isPrime = true;
        if (num == 1) isPrime = false;
        if (isPrime) System.out.print(num + " ");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            prime(i);
        }

    }
}
