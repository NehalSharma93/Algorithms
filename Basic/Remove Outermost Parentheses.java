/*A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  
For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.

A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.

Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.*/


class Solution {
    public String removeOuterParentheses(String S) {
        int len = S.length();
        StringBuilder result = new StringBuilder();
        char[] str = S.toCharArray();
        int start = 0, end = -1;
        int paren = 0;
        int j;
        for(int i=0; i<len; i++){
            if(str[i]=='(')
                paren++;
            else
                paren--;
            if(paren==0)
                end = i;
            if(end>-1){
                for(j=start+1; j<end; j++)
                    result.append(str[j]);
                start = i+1;
                end = -1;
            }
        }
        return result.toString();
    }
}
