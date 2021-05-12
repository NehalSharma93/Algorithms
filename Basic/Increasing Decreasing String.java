/*Given a string s. You should re-order the string using the following algorithm:

Pick the smallest character from s and append it to the result.
Pick the smallest character from s which is greater than the last appended character to the result and append it.
Repeat step 2 until you cannot pick more characters.
Pick the largest character from s and append it to the result.
Pick the largest character from s which is smaller than the last appended character to the result and append it.
Repeat step 5 until you cannot pick more characters.
Repeat the steps from 1 to 6 until you pick all characters from s.
In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result.

Return the result string after sorting s with this algorithm.*/

class Solution {
    public String sortString(String s) {
        StringBuffer out = new StringBuffer();
        int[] count = new int[26];
        for(char c : s.toCharArray()){
            count[c-97]++;
        }
        int lenIn = s.length();
        // int lenOut = out.length();
        while(lenIn!=out.length()){
            
            for(int i=0; i<26; i++){
                if(count[i]>0){
                    out.append((char)(i+97));
                    count[i]--;
                }                    
            }
            
            for(int i=25; i>=0; i--){
                if(count[i]>0){
                    out.append((char)(i+97));
                    count[i]--;
                }                    
            }
            
        }
        return out.toString();
    }
}
