Question: https://leetcode.com/problems/richest-customer-wealth/
Solution: https://leetcode.com/problems/richest-customer-wealth/discuss/1866927/Simple-Java-Approach-with-100-%2B-Runtime-of-0ms

class Solution {
    public int maximumWealth(int[][] accounts) {


        //Brute Force Approach --> O(n^2)
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int totalOfEachCustomer=0;
            for (int j=0;j<accounts[0].length;j++){
                totalOfEachCustomer+=accounts[i][j];
            }
            if (totalOfEachCustomer>max)    max=totalOfEachCustomer;
        }
        return max;
    }
}
