/*Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.

We repeatedly make duplicate removals on S until we no longer can.

Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.*/


class Solution {
    public String removeDuplicates(String s) {
        StringBuffer res = new StringBuffer(s);
        int i = 1;
        while(i<res.length()){
            if(res.charAt(i)==res.charAt(i-1)){
                while(i>0 && i<res.length() && res.charAt(i)==res.charAt(i-1))
                    res.delete(i-1, i+1);
                i = 1;
            }
            else
                i++;
        }
        return res.toString();
    }
}

//O(n)
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();
        for(int i=0; i<len; i++){
            if(res.length()==0 || s.charAt(i)!=res.charAt(res.length()-1))
                res.append(s.charAt(i));
            else
                res.deleteCharAt(res.length()-1);
        }
        return res.toString();
    }
}

class Solution {
    public String removeDuplicates(String s) {
        StringBuilder res = new StringBuilder();
        int len = s.length();
        int l = res.length();
        // for(int i=0; i<len; i++){
        //     if(res.length()==0 || s.charAt(i)!=res.charAt(res.length()-1))
        //         res.append(s.charAt(i));
        //     else
        //         res.deleteCharAt(res.length()-1);
        // }
        for(char c : s.toCharArray()){
            if(l==0 || c!=res.charAt(l-1)){
                res.append(c);
                l++;
            }
            else{
                res.deleteCharAt(l-1);
                l--;
            }
        }
        return res.toString();
    }
}
