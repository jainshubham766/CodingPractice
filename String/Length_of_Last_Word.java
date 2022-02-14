/*
 *58. Length of Last Word
 https://leetcode.com/problems/length-of-last-word/
 * */
class Solution {
    public int lengthOfLastWord(String s) {
        //Solution 01
        // s=s.trim();
        // String arr[]=s.split(" ");
        // return arr[arr.length-1].length();
        
        //Solution 02
        // s=s.trim();
        // int last= s.lastIndexOf(" ");
        // String str = s.substring(last+1);
        // return str.length();
          
        //Solution 03
        return s.trim().length()-1-s.trim().lastIndexOf(" ");
        
    }
}