//find the closest possible sum of an Array's elements to a particular value

import java.util.Set;
import java.util.HashSet;

public class HelloWorld{
    
     public static void main(String []args){
        int arr[] = new int[]{1,2,3};
        int k = 4;
        int res = closestSum(arr, k);
        System.out.println(res);
     }
    
  
  public static int closestSum(int[] arr, int k){
         int result = 0;
         int len = arr.length;
         Set<Integer> sums = new HashSet<Integer>();
         sums.add(0);
         for(int i : arr){
             if(i==k){
                 result = i;
                 return result;
             }
             if(i>k)
                continue;
             else{
                 Set<Integer> newsums = new HashSet<Integer>();
                 for(Integer j : sums){
                     int sum = i + j;
                     if(sum == k){
                         result = k;
                         return result;
                     }
                     if(sum > k)
                        continue;
                     else{
                         newsums.add(sum);
                         if(sum > result)
                            result = sum;
                     }
                 }
                 sums.addAll(newsums);
             }
         }
         return result;
     }
}
