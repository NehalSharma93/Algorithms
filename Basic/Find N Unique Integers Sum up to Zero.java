/*Given an integer n, return any array containing n unique integers such that they add up to 0.*/

class Solution {
    public int[] sumZero(int n) {
        int[] out = new int[n];
        int i;
        for(i=0; i<n/2; i++)
            out[i] = i+1;
        if(n%2==0){
            for(i=n/2; i<n; i++)
                out[i] = -(i-n/2+1);
        }
        else{
            for(i=n/2; i<n-1; i++)
                out[i] = -(i-n/2+1);
            out[i] = 0;
        }
        return out;    
    }
}
