Question: https://leetcode.com/problems/valid-palindrome-ii/
solution: https://leetcode.com/problems/valid-palindrome-ii/discuss/1905354/JAVA-%3A-Simple-or-Cleanor-Pure-Logic-or-Efficient-Solution

https://leetcode.com/problems/valid-palindrome-ii/discuss/1904942/JavaC%2B%2B-Awesome-Visuall-EXPLANATION


class Solution {

    public boolean validPalindrome(String s) {

        //Aproach 01: Brute Force : this was falied coz...moving the character from start++ OR end-- can ot determine the correct letter to be removed
        //solution :  need to run palindrome sequence from (start +1)  and one for (end-1)

        // Failed for test cses like:
        		// ( leftIndex + 1), rightIndex for cases like "ececabbacec"
				// leftIndex, (rightIndex - 1) for cases like "abccbab"

//         int start =0, end = s.length()-1;
//         boolean characterRemoved =false;
//         while (start < end){
//             if (s.charAt(start)==s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             if (s.charAt(start)!=s.charAt(end) ){
//                 if (characterRemoved) {         //if it is true
//                     return false;
//                 }
//                 else {
//                     if (s.charAt(start+1)==s.charAt(end)) {
//                             start++;
//                         }
//                     else if (s.charAt(start)==s.charAt(end-1)){
//                             end--;
//                         }
//                characterRemoved =true;
//                }
//             }
//         }
// return true;

        //Aproach 02:

        int start =0, end = s.length()-1;

        while (start < end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else  return (isPalindrome(s,start+1,end) || isPalindrome(s,start,end-1) );
        }
    return true;
    }

     public boolean isPalindrome(String s, int start,int end) {

        while (start < end){
            if (s.charAt(start)==s.charAt(end)){
                start++;
                end--;
            }
            else return false;
        }
         return true;
     }
}
