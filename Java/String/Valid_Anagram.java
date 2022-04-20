/*
 242. Valid Anagram
 https://leetcode.com/problems/valid-anagram/
Question : 
https://stackoverflow.com/questions/71107616/character-arrays-comparison-in-java
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        
        //Brute Force
        char carr[] =s.toCharArray();
        Arrays.sort(carr);
        char tarr[] =t.toCharArray();
        Arrays.sort(tarr);
        return Arrays.equals(carr,tarr);
        
        
         //Approach 02
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;        //O(N)
        return true;
        
        //Approach Use of HashMap 
    }
}
