/*
 Reverse A Vowel in String
 https://leetcode.com/problems/reverse-vowels-of-a-string/
  */

class Solution {
    public static boolean isVowel(char ch){
        if (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u'|| ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')
            return true;
        return false;

    }

    public String reverseVowels(String s) {

        char arr[] = s.toCharArray();
        int len = arr.length, start=0, end=len-1;
        char hold = ' ';
        if (len==0)return s;
        else if (len==1)return s;
        while (start<end)
        {
             if ( Solution.isVowel(arr[start]) &&  ( Solution.isVowel(arr[end])) ){

                 hold=arr[start];
                 arr[start]=arr[end];
                 arr[end]=hold;
                 start++;
                 end--;
             }
            if (!Solution.isVowel(arr[start])) start++;
            if (!Solution.isVowel(arr[end])) end--;
        }

        return String.valueOf(arr);


    }
}


