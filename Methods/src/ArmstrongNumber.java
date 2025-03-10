import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number");
//        int n = in.nextInt();
        for(int i = 100; i <= 999; i++){
            if(isArmstrong(i)) System.out.println(i);
        }
    }
    static boolean isArmstrong(int n){
        int temp = n;
        int rem,sum = 0;
        while(temp != 0){
            rem = temp % 10;
            sum += Math.pow(rem,3);
            temp /= 10;
        }
        return n == sum;
    }

}
