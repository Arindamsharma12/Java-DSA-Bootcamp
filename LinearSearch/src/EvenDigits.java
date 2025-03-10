//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(1234));
    }
    static int findNumbers(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
//    function to check whether the number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }

    static int digits2(int num){
        if(num < 0) num = -1*num;
        return (int)(Math.log10(num)) + 1 ;
    }

    static int digits(int num){
        if(num < 0){
            num = -1*num;
        }
        if(num == 0) return 1;
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
