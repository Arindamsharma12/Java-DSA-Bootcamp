import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr = {1,3,9,5,4,6};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int [] arr){
        int i = 0;
        int j = arr.length - 1;
        while(i <= j) {
            swap(arr, i,j);
            i++;
            j--;
        }
    }


    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

