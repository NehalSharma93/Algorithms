/*You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.*/


class Solution {
    public boolean halvesAreAlike(String s) {
        int left = 0, right = 0;
        int len = s.length();
        char[] str = s.toCharArray();
        char ch;
        for(int i=0; i<len/2; i++){
            ch = str[i];
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
                left++;
        }
        for(int i=len/2; i<len; i++){
            ch = str[i];
            if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
                right++;
        }
        if(left==right)
            return true;
        return false;
    }
}
