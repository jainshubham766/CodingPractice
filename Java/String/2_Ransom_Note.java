/*
Method 2  https://leetcode.com/problems/ransom-note/
 * */
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int arr[]=new int[26];
        
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=ransomNote.length()-1;i>=0;i--){
                    arr[ransomNote.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<0){
                return false;
            }
        }
        return true;
    }
}

