/*Given a positive integer num consisting only of digits 6 and 9.

Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).*/


class Solution {
    public int maximum69Number (int num) {
        int n = num;
        int count = 0;
        int[] arr = new int[5];
        int i = 0;
        while(n>0){
            arr[i] = n%10;
            n = n/10;
            count++;
            i++;
        }
        // System.out.println(count);
        i--;
        while(i>=0){
           if(arr[i]==0 || arr[i]==9)
               i--;
           else{
               arr[i] = 9;
               break;
           }
        }
        int out = 0;
        for(i=0; i<count; i++){
            // System.out.println(arr[i]);
            out = out + (arr[i] * (int)Math.pow(10, i));
            // System.out.println(out);
        }
        return out;
    }
}
