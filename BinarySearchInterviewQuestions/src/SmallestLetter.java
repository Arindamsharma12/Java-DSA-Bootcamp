//https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallestLetter {
    public static void main(String[] args) {

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        int mid;
        while(start <= end){
            mid = start + (end - start)/2;
            if(target > letters[mid]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return letters[start % letters.length];
    }
}
