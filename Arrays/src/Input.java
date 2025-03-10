import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        int [] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;
        // [23, 45, 233, 543, 3]
//        System.out.println(arr[3]);
        Scanner in = new Scanner(System.in);
        // input using for loops
//        for(int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }

//        for(int i = 0; i < arr.length; i++){
//        System.out.println(arr[i]);
//        }

//        for(int num : arr){
//            System.out.println(num);
//        }

//        System.out.println(Arrays.toString(arr));

        String [] str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
