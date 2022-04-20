/*
Question: https://leetcode.com/problems/plus-one/

Solution: https://leetcode.com/problems/plus-one/discuss/24338/Simple-Java-Solution-(no-copying-arrays!)

 * */

// Start from the end. If the current number is less than 9, we won't have a carry: increment the digit and return the array. If we have a 9, then set the current to 0 and simply repeat with the next digit.

// Here's the kicker: if we complete the loop and don't return, this means that the whole array was set to 0! The answer must therefore be an array that's one bigger with the first number being 1. There's no need to copy to the new array since all numbers are by default initialized to 0.

class Solution {
    public int[] plusOne(int[] digits) {

        if (digits==null || digits.length==0)   return digits;

        for (int i=digits.length-1;i>=0;i--){
            if (digits[i]<9) {
                digits[i]++;
                return digits;
            }else{
                digits[i]=0;
            }
        }

        int newArr[] = new int[digits.length+1];
        newArr[0]=1;
        return newArr;
    }
}

