/*Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

*/

class Solution {
    public List<String> letterCombinations(String digits) {
        int len = digits.length();
        List<String> result = new ArrayList<String>();
        //if input is empty, return empty list
        if(len==0)
            return result;
        
        String[] mapping = new String[]{"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        char[] word = new char[len];
        findCombinations(digits, mapping, word, 0, result);
        return result;
    }
    
    public void findCombinations(String digits, String[] mapping, char[] word, int index, List<String> result){
        if(index>=digits.length()){
            result.add(new String(word));
            return;
        }
        
        //iterate over length of string(number of characters) mapped to letter at 'index' in digits 
        for(int i=0; i < mapping[digits.charAt(index)-'0'].length(); i++){
            word[index] = mapping[digits.charAt(index)-'0'].charAt(i);
            findCombinations(digits, mapping, word, index+1, result);
        }
            
    }
}
