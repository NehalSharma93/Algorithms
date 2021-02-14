/* Farmer John has built a new long barn, with N stalls. Given an array of integers A of size N where each element of the array represents the location of the stall, 
and an integer B which represent the number of cows. His cows don't like this barn layout and become aggressive towards each other once put into a stall. 
To prevent the cows from hurting each other, John wants to assign the cows to the stalls, such that the minimum distance between any two of them is as large as possible.
What is the largest minimum distance?
*/
public class Solution {
    public int solve(int[] a, int b) {
        int n = a.length;
        Arrays.sort(a);
        int first = 0;
        int last = a[n-1];
        int perfectDist = a[n-1]-a[0];
        if(b==2)
            return perfectDist;
        int i, cows = 1, j = 0;
        long mid;
        //Binary search on distances to find out if the distance is max out of min distances and can be used to keep cows
        while(first<=last){
            mid = (first+last)/2;
            for(i=1; i<n; i++){
                if(a[i]-a[j]<mid)
                    continue;
                else{
                    cows++;
                    j = i;
                }
                if(cows>=b){
                    perfectDist = (int)mid;
                    first = (int)mid + 1;
                    break;
                }
            }
            if(cows<b)
                last = (int)mid - 1;
            j = 0;
            cows = 1;
        }
        return perfectDist;
    }
}
