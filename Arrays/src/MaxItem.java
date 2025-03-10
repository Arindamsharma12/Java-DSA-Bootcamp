public class MaxItem {
    public static void main(String[] args) {
        int [] arr = {1,3,23,9,18};
        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(ans < arr[i]) ans = arr[i];
        }
        return ans;
    }

    static int maxRange(int [] arr,int start,int end){
        int max = Integer.MIN_VALUE;
        for(int i = start; i <= end; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

}
