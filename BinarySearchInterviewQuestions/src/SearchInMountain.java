// https://leetcode.com/problems/find-in-mountain-array/

public class SearchInMountain {
    public static void main(String[] args) {

    }

    int search(int []arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = OrderAgnosticBs(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return OrderAgnosticBs(arr,target,peak+1,arr.length-1);
    }

    static int OrderAgnosticBs(int [] arr,int target,int start,int end){

        // find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while(start <= end){
//            int mid = (start+end)/2; // might be possible that (start+end) exceeds the integer range
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAscending){
                if(target < arr[mid]){
                    end = mid-1;
                }
                else if(target > arr[mid]){
                    start = mid+1;
                }
            }
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }
            else if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
        }
        return end;
    }
}

