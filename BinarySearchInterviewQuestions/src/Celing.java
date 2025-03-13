//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Celiing {
    public static void main(String[] args) {
        int [] arr = {2,3,5,9,14,16,18};
        int target = 15;
        int ans = ceilingBS(arr,target);
        System.out.println(ans);
    }
    // Returns the index of smallest number greater or equal to target
    static int ceilingBS(int [] arr, int target){
        // but what if the target element is greater than the greatest number in the array
        if(target > arr[arr.length - 1]){
            return -1;
        }
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
        return start;
    }

}
