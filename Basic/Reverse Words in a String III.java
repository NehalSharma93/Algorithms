/*Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.*/

//7ms
class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder(len);
        char[] ch = s.toCharArray();
        for(int i=0; i<len; ){
            if(ch[i]==' '){
                str.append(ch[i]);
                i++;
            }
            int start = i;
            while(i<len && ch[i]!=' ')
                i++; 
            int j = i-1;
            while(j>=start){
                str.append(ch[j]);
                j--;
            }
        }
        return str.toString();
    }
}
