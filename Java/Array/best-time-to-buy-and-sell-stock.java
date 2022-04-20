Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

Solution: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/discuss/1735493/JavaC%2B%2B-best-ever-EXPLANATION-could-possible

class Solution {
    public int maxProfit(int[] prices) {

        //Brute Force : --> Time Limit Exceeding
        // int profit = Integer.MIN_VALUE;
        // for (int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if ((prices[j]-prices[i])>profit)
        //             profit=prices[j]-prices[i];
        //     }
        // }
        // if (profit<0) return 0;
        // return profit;

        //One -Pointer Appraoch  +  O(n)

         int buy = Integer.MAX_VALUE;
         int profit = 0;

        for(int i=0; i < prices.length; i++){

            if(prices[i] < buy)     buy = prices[i];

            profit = Math.max(profit, prices[i] - buy);         //sell = prices[i] - buy;
        }
        return profit;

        //Dry-Run o
    }
}
