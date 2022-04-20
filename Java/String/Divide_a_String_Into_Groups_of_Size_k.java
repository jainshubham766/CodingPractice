/*Problem Statement: 
 https://leetcode.com/problems/divide-a-string-into-groups-of-size-k/submissions/
*/

class Solution
{
    public String[] divideString(String s, int k, char fill)
    {
        int i=0,j=0,len=s.length();
        //Total Groups ?
        int group = (len % k == 0) ? len / k : (len/k)+1;
        String [] arr = new String [group];
        //Filling Array
        for ( i=0; (i+k)< len;i+=k)
        {
            arr[j]=s.substring (i,i+k);
            j++;
        }
        //Checking Leftovers
        String lastWord = s.substring(i);
        lastWord+=String.valueOf(fill).repeat(k-(len-i));
        arr[j]=lastWord;
        return arr;
    }
}
