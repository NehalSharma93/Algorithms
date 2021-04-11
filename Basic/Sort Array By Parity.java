/*Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.*/

class Solution {
    public int[] sortArrayByParity(int[] a) {
        int len = a.length;
        int start = 0;
        int end = len-1;
        int temp;
      
        while(start<len && start<end && end>=0){
            while(start<len && a[start]%2==0)
               start++;
          
            if(start<end && start<len){
                while(end>=0 && a[end]%2!=0)
                    end--;
              
                if(end<0 || end<=start)
                    return a;
              
                temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
            else 
                return a;
          
            start++;
            end--;
        }
        return a;
    }
}
