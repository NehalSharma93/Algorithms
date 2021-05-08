/*Write a function that reverses a string. The input string is given as an array of characters s.*/

class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        int i = 0, j = len-1;
        char temp;
        while(i<j){
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
