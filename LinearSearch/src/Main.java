//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr = {12,45,49,14,65,93,32,73};
        int target = 14;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
    static int linearSearch1(int[] arr,int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int element: arr){
            if(element == target) return element;
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch2(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }
        for(int element: arr){
            if(element == target) return true;
        }
        return false;
    }
}