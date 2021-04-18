/*You are working in a ball factory where you have n balls numbered from lowLimit up to highLimit inclusive (i.e., n == highLimit - lowLimit + 1), 
and an infinite number of boxes numbered from 1 to infinity.

Your job at this factory is to put each ball in the box with a number equal to the sum of digits of the ball's number. 
For example, the ball number 321 will be put in the box number 3 + 2 + 1 = 6 and the ball number 10 will be put in the box number 1 + 0 = 1.

Given two integers lowLimit and highLimit, return the number of balls in the box with the most balls.*/


// Hashmap solution - 38 ms, 38.3 MB
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();        
        int maxCount = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            int s = 0;
            int num = i;
            while(num>0){
                s = s + num%10;
                num = num/10;
            }
            Integer count = map.get(s);
            if(count==null){
                map.put(s, 1);
                count = 1;
            }
            else
                map.put(s, ++count);
            if(count > maxCount)
                maxCount = count;
        }        
    }
}

// array solution - 20ms, 35.5 MB
/*max highLimit --> 10*10*10*10*10 = 10^5
max sum of digits we can have --> 99999 = 9+9+9+9+9 ==> 45
create a count array with size max of 45+1 ==> 46*/
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] arr = new int[46];
        int maxCount = 0;
        for(int i=lowLimit; i<=highLimit; i++){
            int sum = 0;
            int num = i;
            while(num>0){
                sum = sum + num%10;
                num = num/10;
            }
            arr[sum]++;
            if(arr[sum]>maxCount)
                maxCount = arr[sum];
        }
        return maxCount;
    }
}
