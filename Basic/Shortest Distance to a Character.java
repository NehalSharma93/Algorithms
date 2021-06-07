/*Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length 
and answer[i] is the distance from index i to the closest occurrence of character c in s.

The distance between two indices i and j is abs(i - j), where abs is the absolute value function.*/

//more efficient
class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] answer = new int[len];
        int pos = -len;        
        //From left to right
        for(int i=0; i<len; i++){
            if(s.charAt(i)==c)
                pos = i;
            answer[i] = i - pos;
        }        
        //from right to left
        for(int i=len-1; i>=0; i--){
            if(s.charAt(i)==c)
                pos = i;
            answer[i] = Math.min(answer[i], Math.abs(i-pos));
        }
        
        return answer;
    }
}


//Not very efficient
class Solution {
    public int[] shortestToChar(String s, char c) {
        int len = s.length();
        int[] answer = new int[len];
        ArrayList<Integer> positions = new ArrayList<Integer>();
        for(int i=0; i<len; i++){
            if(s.charAt(i)==c){
                positions.add(i);
                answer[i] = -1;
            }
        }
        int i = 0;
        while(i<len){
            if(answer[i]==-1)
                answer[i] = 0;
            else{
                int minDist = len;
                for(int j=0; j<positions.size(); j++){
                    int dist = Math.abs(positions.get(j)-i);
                    if( dist < minDist)
                        minDist = dist;
                }
                answer[i] = minDist;
            }
            i++;
        }
        return answer;
    }
}
