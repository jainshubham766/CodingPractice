Question: https://leetcode.com/problems/merge-strings-alternately/

Solution: https://leetcode.com/problems/merge-strings-alternately/discuss/1950472/JAVA-100-fast-and-easy-to-understand-solution-using-two-pointers


class Solution {

    public String mergeAlternately(String word1, String word2) {

        //CORRECT APPROACH

//         int l1 = word1.length();
//         int l2 = word2.length();
//         //Bounder Line Cases...
//         // if (l1==0) return word2;
//         // if (l2==0) return word1;


//         //Counters
//         int i=0, j=0;

//         //Loops
//         String result = "";
//         while (i < l1 && j < l2){
//             result += word1.charAt(i);
//             result += word2.charAt(j);
//             i++; j++;
//         }

//         while ( i<l1){
//            result += word1.charAt(i);   i++;
//         }


//         while ( j<l2){
//            result += word2.charAt(j);   j++;
//         }


//         return result;



        // SAME APPROACH BUT DIFFERENT WAY OF WRITING!!!

                StringBuilder sb = new StringBuilder();
        int lenmax = Math.max(word1.length(),word2.length());
        for(int i=0;i<=lenmax-1;i++)
        {
            if(i<word1.length()) sb.append(word1.charAt(i));
            if(i<word2.length()) sb.append(word2.charAt(i));
        }
        return sb.toString();

    }
}
