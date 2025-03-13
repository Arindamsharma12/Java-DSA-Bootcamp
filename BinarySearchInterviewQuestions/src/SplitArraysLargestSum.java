public class SplitArraysLargestSum {
    public static void main(String[] args) {
        int [] arr = {7,2,5,10,8};
//        System.out.println(splitCount(arr,21));
        System.out.println(splitArray(arr,2));
    }
    static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for(int i = 0; i < nums.length; i++){
            start = Math.max(start,nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + (end - start)/2;
            int sum = 0;
            int pieces = 1;
            for(int e: nums){
                if(sum + e > mid){
                    pieces++;
                    sum = e;

                }
                else{
                    sum += e;
                }
            }
            if(pieces <= k){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }


    static int findStart(int []nums){
        int max = Integer.MIN_VALUE;
        for(int e:nums){
            if(e > max){
                max = e;
            }
        }
        return max;
    }
    static int findEnd(int [] nums){
        int sum = 0;
        for(int e : nums){
            sum += e;
        }
        return sum;
    }
}
