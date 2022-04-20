/*
Question: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/

Solution Explaination: https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/discuss/1798724/Java-Math-and-Logic-Based-O(1)-Time-and-Space-100-Faster
*/

class Solution {
    public int countOdds(int low, int high) {


        //Method 01 --> Brute Force: iterate from each element and see if odd then counter++
//         if (low==high && low%2!=0) return 1;
//         int counter= 0;
//         while (low < high){
//              if (low %2 != 0){
//                 counter++;
//              }
//              if (high %2 != 0){
//                 counter++;
//             }
//             low++;
//             high--;
//         }
//         if (low%2!=0 && low==high){counter++;}
//         return counter;

        //Method 02  Very Smart Approach
        //Consider 4 cases 1. e-o-e-o-e 2. e-o-e-o 3. o-e-o-e 4. o-e-o-e-o

        int totalNums = high-low+1; //counting total numbers in range

        if (low%2!=0    &&  high%2!=0)  return (totalNums/2)+1;
        return totalNums/2;

    }
}
