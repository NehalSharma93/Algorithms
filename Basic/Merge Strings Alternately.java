/*You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. 
If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.
*/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder output = new StringBuilder();
        int i = 0;
        int len1 = word1.length();
        int len2 = word2.length();
        int len = (len1<len2) ? len1 : len2;
        while(i<len){
            output.append(word1.charAt(i));
            output.append(word2.charAt(i));
            i++;
        }
        if(len<len1){
            while(i<len1){
                output.append(word1.charAt(i));
                i++;
            }
        }
        else if(len<len2){
            while(i<len2){
                output.append(word2.charAt(i));
                i++;
            }
        }
        else 
            return output.toString();
        return output.toString();
    }
}
