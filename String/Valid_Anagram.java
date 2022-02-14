/*
 242. Valid Anagram
 https://leetcode.com/problems/valid-anagram/
Question : 
https://stackoverflow.com/questions/71107616/character-arrays-comparison-in-java
 */
class Solution {
    public boolean isAnagram(String s, String t) {
        char carr[] =s.toCharArray();
        Arrays.sort(carr);
        char tarr[] =t.toCharArray();
        Arrays.sort(tarr);
        return Arrays.equals(carr,tarr);
    }
}
