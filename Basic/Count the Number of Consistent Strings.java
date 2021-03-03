/*You are given a string allowed consisting of distinct characters and an array of strings words. 
A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.*/


class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int i, count = 0, countLetters = 0;
        int len = allowed.length();
        boolean present = true, allPresent = false;
        for(String word : words){
            for(char c : word.toCharArray()){
                for(i=0; i<len; i++){
                    if(c!=allowed.charAt(i))
                        present = false;
                    else{
                        present = true;
                        break;
                    }
                }
                if(present==false)
                    break;
            }
            if(present==true)
                count++;
        }
        return count;
    }
}
