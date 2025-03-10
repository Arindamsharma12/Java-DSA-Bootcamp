public class MaxWealth {
    public static void main(String[] args) {
        int [][] accounts = {
                {1,2,3},
                {3,2,1}
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] person: accounts){
            int totalWealth = sum(person);
            if(totalWealth > max) max = totalWealth;
        }
        return max;
    }
    static int sum(int [] arr){
        int ans = 0;
        for(int i : arr){
            ans += i;
        }
        return ans;
    }
}
