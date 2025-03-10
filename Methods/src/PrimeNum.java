import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int n = in.nextInt();
        System.out.println(isPrime(n));
    }

    static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }
}
