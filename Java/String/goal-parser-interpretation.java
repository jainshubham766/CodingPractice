Question : https://leetcode.com/problems/goal-parser-interpretation/

Solution: https://leetcode.com/problems/goal-parser-interpretation/discuss/1950537/JAVA-O(N)-Time-Complexity-or-Easy-To-Understand-or-Faster-and-Simple



class Solution {
    public String interpret(String command) {

        int len = command.length();

        if (len==0) return "";

        int i=0;
        String result = "";

        while (i<len){

            char ch = command.charAt(i);

            if (ch == 'G')  result += "G";
            else if ((ch == '(') && (command.charAt(i + 1) == ')')){
                result+="o";
                i++;
            }
            else {
                result+="al";
                i+=3;       // if command is (al)  increase counter by 3 more;
            }
            i++;
        }
        return result;


    }
}
