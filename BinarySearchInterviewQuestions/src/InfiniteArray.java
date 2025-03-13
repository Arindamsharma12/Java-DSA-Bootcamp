//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        int sol = ans(arr,target);
        System.out.println(sol);

    }
    static int ans(int []arr,int target){
        // first find the range
        // first start with the box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while(target > arr[end]){
            int newStart = end + 1;
            // double box value
            // end = prevEnd + (size of box)*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return InfiniteBS(arr,target,start,end);
    }

    static int InfiniteBS(int [] arr, int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
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
        return -1;
    }
}
