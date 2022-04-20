/*
 https://leetcode.com/problems/first-unique-character-in-a-string/submissions/

 * */

class Solution {
    public int firstUniqChar(String s) {

        int arr []=new int[26]; //alphabet array
        int len = s.length();
        for (int i=0;i<len;i++){
            arr[(s.charAt(i))-'a']++;               //a-a=0, b-a=1 --> helps to provide matrix index
        }

        for (int i=0;i<len;i++){
            if ( arr[(s.charAt(i))-'a'] == 1){
                return i;
            }
        }
        return -1;


//         for (int i=0;i<s.length()-1;i++){
//             for (int j=i+1;j<s.length();j++)
//             {
//                 if(s.charAt(i)==s.charAt(j)) {
//                     s=s.replaceAll(Character.toString(s.charAt(i)),"");
//                     break;
//                 }

//                 else if ((s.charAt(i)!=s.charAt(j) )&& j == (s.length()-1)) return i;

//             }
//         }
//         return -1;

    }
}
