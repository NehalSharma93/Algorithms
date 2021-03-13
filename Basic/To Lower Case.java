/*Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase.*/

class Solution {
    public String toLowerCase(String str) {
        char[] s = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            if(65<=s[i] && s[i]<=90)
                s[i] += 32;
        }
        return(String.valueOf(s));
    }
}
