public class NumberOfTimeArrayRotated {
    public static void main(String[] args) {
        int [] arr = {7, 9, 11, 12, 15};
        System.out.println(countRotate(arr));
    }
    static int countRotate(int []arr){
        return findPivot(arr)+1;
    }

    static int findPivot(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;

            // case1
            if((end > mid) && (arr[mid] > arr[mid + 1])){
                return mid;
            }
            else if((start <mid) && (arr[mid] < arr[mid-1])){
                return mid-1;
            }
            else if(arr[start] >= arr[mid]){
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

}
