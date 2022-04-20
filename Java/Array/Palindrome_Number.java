/*
 https://leetcode.com/problems/palindrome-number/
 * */

class Solution {

    //method 01

    // public boolean isPalindrome(int x) {
    //     String str = String.valueOf(x);
    //     int len=str.length();
    //     for (int i=0;i<(len/2);i++){
    //         if (str.charAt(i)!=(str.charAt(len-i-1)))  return false;
    //     }
    //     return true;
    // }

    //method 02

        public boolean isPalindrome(int x) {
            int sum=0,duplicate=x;
            while (x>0){
                sum = sum*10 + (x%10);
                x/=10;
            }
            return (duplicate==sum)?true:false;
    }


}
