/*Given a string s, partition s such that every substring of the partition is a palindrome. Return all possible palindrome partitioning of s.

A palindrome string is a string that reads the same backward as forward.*/

class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> partitions = new ArrayList<List<String>>();
        ArrayList<String> st = new ArrayList<String>();
        int len = s.length();
        solve(0, s, partitions, st, len);
        return partitions;
    }
    
    public void solve(int index, String s, List<List<String>> partitions, ArrayList<String> st, int len){
        
        if(index==len){
            partitions.add(new ArrayList<String>(st));
            return;
        }
        
        for(int i=index; i<len; i++){
            String str = s.substring(index, i+1);
            if(isPalindrome(str)){
                st.add(str);
                solve(i+1, s, partitions, st, len);
                st.remove(st.size()-1);
            }
        }
    }
    
    public boolean isPalindrome(String s){
        int len = s.length();
        int i = 0, j = len-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
