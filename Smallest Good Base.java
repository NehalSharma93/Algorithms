/*For an integer n, we call k>=2 a good base of n, if all digits of n base k are 1.

Now given a string representing n, you should return the smallest good base of n in string format.*/

import java.math.BigInteger;

class Solution {
    public String smallestGoodBase(String n) {
        Long num = Long.parseLong(n);
        
        // int maxDigits = (int)Math.ceil(Math.log(num)/Math.log(2));
        // int minDigits = 2;
        
        for(int i=(int)Math.ceil(Math.log(num)/Math.log(2)); i>=2; i--){
            long start = 2;
            long end = Long.parseLong(n);
            
            BigInteger lhs, rhs;
            
            while(start<=end){
                long mid = (start+end)/2;
                lhs = BigInteger.valueOf(num).multiply(BigInteger.valueOf(mid).subtract(BigInteger.ONE));
                rhs = (BigInteger.valueOf(mid).pow(i)).subtract(BigInteger.ONE);
                int cmp = lhs.compareTo(rhs);
                
                if(cmp==0)
                    return String.valueOf(mid);
                else if(cmp>0)
                    start = mid+1;
                else
                    end = mid - 1;
            }
        }
        return String.valueOf(num-1);
    }
}
