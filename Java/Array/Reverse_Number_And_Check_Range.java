/*
 https://leetcode.com/problems/reverse-integer/submissions/
 * */
class Solution {
    public int reverse(int x) {
        boolean isNegative = false;
        if ( x<0) {
            x*=(-1);
            isNegative = true;
        }
        long newValue = 0;

        //using long as we don't knowif the already entered number is out of int range.

        while (x>0){
            newValue =newValue* 10 + (x%10);
            x/=10;
        }

        // checking the newValue if it is excited in the int range and if it does data type conversion is
        // done and response is shared.

    if (newValue<Integer.MIN_VALUE || newValue>Integer.MAX_VALUE)
            return 0;
     return (isNegative==false)? (int)newValue: (int)(-1*newValue);

    }
}
