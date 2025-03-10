public class SearchInRange {
    public static void main(String[] args) {
        int [] arr = {18,12,-7,3,14,28};
        int low = 1;
        int high = 4;
        int target = 3;
        System.out.println(searchInRange(arr,low,high,target));
    }
    static int searchInRange(int [] arr, int low,int high,int target){
        if(low > high){
            return -1;
        }
        if(low == high && arr[low] != target){
            return -1;
        }
        if(low == high && arr[low] == target){
            return low;
        }
        for(int i = low; i<= high; i++){
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
