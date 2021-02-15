//Given an integer number n, return the difference between the product of its digits and the sum of its digits.

class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, prod = 1;
        while(n!=0){
            sum = sum + n%10;
            prod = prod * (n%10);
            n /= 10;
        }
        return (prod - sum);
    }
}
