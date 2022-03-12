/*
Question: https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
 * */

class Solution {
    public double average(int[] salary) {

//Method 01 :  Sort --> array
        // Arrays.sort(salary);
        // int sum=0, deno=salary.length-2;
        // for (int i=1;i<salary.length-1;i++){
        //     sum+=salary[i];
        // }
        // return (sum/(double)deno);

//Method 02 :  Find Min & Max --> subtract min max from sum
        int min = salary[0];
        int max = salary[0];
        int sum = salary[0];

        for (int i=1;i<salary.length;i++){
            // if else condition for check min and max
            min = min > salary[i] ? salary[i]:min;
            max = max < salary[i] ? salary[i]:max;
            sum+=salary[i];
         }
        return ((sum-min-max)/((double)(salary.length-2)));

    }
}
