/*
 https://leetcode.com/problems/keyboard-row/submissions/
 * */

class Solution {
    public String[] findWords(String[] words) {

        ArrayList <String> str =  new ArrayList<>();
        int i=0;
        for(String word : words)
        {
            if (word.toLowerCase().matches("[qwertyuiop]*")){
                str.add(word); i++;
            }
            else if (word.toLowerCase().matches("[asdfghjkl]*")){
                str.add(word); i++;
            }
            else if (word.toLowerCase().matches("[zxcvbnm]*")){
                str.add(word); i++;
            }
        }
        String strArr [] = str.toArray(new String[0]);      //converting ArrayList --> String Array
        return strArr;
    }
}
