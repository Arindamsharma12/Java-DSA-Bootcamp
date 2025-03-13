public class Floor {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floorBS(arr,target);
        System.out.println(ans);
    }
    // Returns the greatest number smaller or equal to target
    static int floorBS(int [] arr, int target){


        int start = 0;
        int end  = arr.length - 1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target > arr[mid]){
                start= mid + 1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }
        }
        return end;
    }
}
