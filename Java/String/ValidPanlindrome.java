/*
 https://leetcode.com/problems/valid-palindrome/submissions/

 This has 3 methods use the 3rd method
 * */

class Solution {

    //Method 01

    public static boolean isAlphnumeric(char c){
        if((c>='a' && c<='z')||(c>='0' && c<='9'))
              return true;
        return false;
    }

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for (int i=0;i<s.length();i++){
            if (Solution.isAlphnumeric(s.charAt(i))){
                str+=s.charAt(i);
            }
        }

        boolean flag = true;
        int len = str.length();
        for (int i=0;i<(len/2);i++){
            if ( str.charAt(i) != str.charAt(len-1-i) ){
                flag=false;
                break;
            }
        }
        return flag;
    }

// Method 02

    public boolean isPalindrome(String s) {

        if(s.length() == 0) {
            return false;
        }
        if (s.equals(" ")) {
            return true;
        }

        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int first = 0;
        int second = s.length()-1;

        for (int i = 0;i< s.length() /2;i++) {
            if (s.charAt(first++) != s.charAt(second--)) {
                return false;
            }
        }
        return true;
    }

    //Method 03
    //Best One
        public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    }

