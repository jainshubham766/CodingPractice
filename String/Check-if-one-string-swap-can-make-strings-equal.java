Question:https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/

Solution: With Reduced Space Complexity:: https://leetcode.com/problems/check-if-one-string-swap-can-make-strings-equal/discuss/1434887/0(n)-Time-or-0(1)-Space-or-0-ms-faster-than-100.00-of-Java-online-submissions

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //Brute Force
        if (s1.length() != s2.length()) return false;
        int counter=0;
        int s[] = new int [26];
        int ss[] = new int [26];
        for (int i=0;i<s1.length();i++){

            if (s1.charAt(i) != s2.charAt(i)) counter++;
            if (counter>2) return false;
            s[s1.charAt(i)-'a']++;
            ss[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(s,ss);





//<<<CANNOT WORK AS WE NEED TO CHECK IN PLACE SORTING>>>
        // char c1 [] = s1.toCharArray();
        // char c2 [] = s2.toCharArray();
        // Arrays.sort(c1);
        // Arrays.sort(c2);
        //return Arrays.equals(c1,c2);

    }
}
