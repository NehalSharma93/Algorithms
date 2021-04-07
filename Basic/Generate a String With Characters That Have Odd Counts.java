/*Given an integer n, return a string with n characters such that each character in such string occurs an odd number of times.

The returned string must contain only lowercase English letters. If there are multiples valid strings, return any of them.  */


class Solution {
    public String generateTheString(int n) {
        char[] ch = new char[n];
        if(n%2==0){
            for(int i=0; i<n-1; i++)
                ch[i] = 'a';
            ch[n-1] = 'b';
        }
        else{
            for(int i=0; i<n; i++)
                ch[i] = 'a';
        }
        return String.valueOf(ch);
    }
}
