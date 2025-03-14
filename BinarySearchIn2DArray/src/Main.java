import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50},
        };
        for(int [] num:arr){
                System.out.println(Arrays.toString(num));
        }
        int [] ans = binarySearchIn2DArray(arr,10);
        System.out.println(Arrays.toString(ans));
    }

    static int[] binarySearchIn2DArray(int [][] arr,int target){
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == target) return new int [] {r,c};
            else if(arr[r][c] < target) r++;
            else c--;
        }
        return new int[] {-1,-1};
    }

}