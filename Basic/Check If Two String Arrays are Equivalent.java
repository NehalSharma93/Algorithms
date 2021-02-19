/*Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.

A string is represented by an array if the array elements concatenated in order forms the string.*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int len1 = word1.length;
        int len2 = word2.length;
        String s1 = "", s2 = "";
        int i;
        for(i=0; i<len1; i++)
            s1 = s1+word1[i];
        for(i=0; i<len2; i++)
            s2 = s2+word2[i];
        int len3 = s1.length();
        int len4 = s2.length();
        if(len3!=len4)
            return false;
        for(i=0; i<len3; i++){
            if(s1.charAt(i)!=s2.charAt(i))
                return false;
        }
        return true;
    }
}
