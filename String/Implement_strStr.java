/*28. Implement strStr()
 
https://leetcode.com/problems/implement-strstr/
*/
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length()==0)
            return 0;
        return haystack.indexOf(needle);
}
}
