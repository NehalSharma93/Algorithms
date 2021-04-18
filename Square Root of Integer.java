//If A is not a perfect square, return floor(sqrt(A)).

public class Solution {
    public int sqrt(int a) {
        if(a==0 || a==1)
            return a;
        if(a==2)
            return 1;
        long low = 0;
        long high = a;
        long mid = 0;
        while(low<=high){
            mid = (low+high)/2;
            if((mid * mid) > a)
                high = mid -1;
            else if((mid * mid) < a)
                low = mid + 1;
            else break;
        }
        if(high<low)
            return (int)high;
        return (int)mid;
    }
}
