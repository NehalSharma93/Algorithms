/*Given a string s formed by digits ('0' - '9') and '#' . We want to map s to English lowercase characters as follows:

Characters ('a' to 'i') are represented by ('1' to '9') respectively.
Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
Return the string formed after mapping.

It's guaranteed that a unique mapping will always exist.*/


class Solution {
    public String freqAlphabets(String s) {
        int len = s.length();
        StringBuilder out = new StringBuilder();
        char[] str = s.toCharArray();
        int n;
        for(int i=len-1; i>=0; i--){
            if(str[i]=='#'){
                i--;
                n = Integer.parseInt(String.valueOf(str[i]));
                i--;
                n = n + 10*(Integer.parseInt(String.valueOf(str[i])));
                out.append((char)(n+96));                
            }
            else
                out.append((char)(Integer.parseInt(String.valueOf(str[i]))+96));
        }
        out.reverse();
        return out.toString();
    }
}
