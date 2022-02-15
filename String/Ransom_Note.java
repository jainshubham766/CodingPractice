/*
 https://leetcode.com/problems/ransom-note/

 */

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char marr [] = magazine.toCharArray();
        char rarr [] = ransomNote.toCharArray();
        boolean flag =false;
        for(int i=0;i<rarr.length;i++)
        {
            for (int j=0;j<marr.length;j++){
                
                if (rarr[i]==marr[j])
                {
                    marr[j]='1';
                    flag = true;
                    break ;
                }
                flag = false;
                
            }
            if (!flag) return false;
        }
        return true;
        
        
        
    }
}
