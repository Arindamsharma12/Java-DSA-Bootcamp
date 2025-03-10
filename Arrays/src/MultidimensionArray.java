import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {
        // Matrix
        /*
             1 2 3
             4 5 6
             7 8 9
        */

//        int[][] arr = new int[3][3];
//        int [][] arr = {
//                {1,2,3}, // 0th index
//                {4,5}, // 1st index
//                {6,7,8,9} // 2nd index
//        };

        Scanner in = new Scanner(System.in);
        int [][] arr = new int[3][3];


        // input
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }

        // output
//        for(int row = 0; row < arr.length; row++){
//            for(int col = 0; col < arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++){
//            for(int col : arr[row]){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

//        for(int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for(int [] row: arr){
            System.out.println(Arrays.toString(row));
        }

        String [] arr1 = new String[4];
        System.out.println(arr1[0]);
    }
}
