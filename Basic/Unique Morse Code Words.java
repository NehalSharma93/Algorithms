/*nternational Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: 
"a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. 
For example, "cab" can be written as "-.-..--...", (which is the concatenation "-.-." + ".-" + "-..."). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.*/


class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String morseCode[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet unique = new HashSet<String>();
        for(String word : words){
            StringBuilder str = new StringBuilder();
            char[] s = word.toCharArray();
            for(char ch : s)
                str.append(morseCode[ch-'a']);
            unique.add(str.toString());
        }
        return unique.size();
    }
}
