//base case + 递推的条件
public class Solution {
    public int climbStairs(int n) {
        if(n < 2) return 1;
        int[] res = new int[n];
        res[0] = 1;
        res[1] = 2;
        
        for(int i = 2; i < n; i++) {
            res[i] = res[i-1] + res[i-2];
        }
        
        return res[n-1];
    }
}