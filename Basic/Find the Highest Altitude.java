/*There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.

You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). 
Return the highest altitude of a point.
*/

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        if(n==1)
            return (gain[0]>=0)?gain[0]:0;
        int altitude = 0, maxAltitude = 0;
        for(int i:gain){
            altitude = altitude + i;
            if(altitude>maxAltitude)
                maxAltitude = altitude;
        }
        return maxAltitude;
    }
}
