/*A self-dividing number is a number that is divisible by every digit it contains.
For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
Also, a self-dividing number is not allowed to contain the digit zero.
Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.*/

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         int j;
         int digit;
         boolean eligible;
         ArrayList<Integer> out = new ArrayList<Integer>();
         for(int i = left; i<=right; i++){
             eligible = true;
             // ArrayList<Integer> digits = new ArrayList<Integer>();
             j = i;
             while(j>0){
                 digit = j%10;
                 if(digit == 0 || i%digit!=0){
                     eligible = false;
                     break;
                 }
                 // digits.add(j%10);
                 j /= 10;
             }
             // for(int digit : digits){
             //     if(digit==0 || i%digit!=0){
             //         eligible = false;
             //         break;
             //     }
             // }
             // for(char c : String.valueOf(i).toCharArray()){
             //     if(c=='0' || i%(c-'0')!=0){
             //         eligible = false;
             //         break;
             //     }
             // }
             if(eligible==true)
                out.add(i); 
         }
        return out;
    }
}
