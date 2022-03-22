Question: https://leetcode.com/problems/excel-sheet-column-number/
Solution: https://leetcode.com/problems/excel-sheet-column-number/discuss/1874524/Java-Simple-Approach-With-Explaination
Code:
class Solution {
    
    public final int countOfAlphabet = 26;          // Tried To showoff the Java features
    
    public int titleToNumber(String columnTitle) {
        
         int i=0, n = columnTitle.length(), result=0;
        
        while ( i<n){
            
            // Main Formula to remenber 
            //Tried To map out the formula from this example.
//             For a title “LEET”:

//                     L = 12
//                     E = (12 x 26) + 5 = 317
//                     E = (317 x 26) + 5 = 8247
//                     T = (8247 x 26) + 20 = 214442
                        
            result = (result * countOfAlphabet) + (columnTitle.charAt(i)-'A'+1);    
            // result is initialized as 0 therefore in the first iteration letter value will be added,
            //it will not n=be multipled by the countOfAlphabet
            i++;
            
        }
        
        return result;
    }
}
