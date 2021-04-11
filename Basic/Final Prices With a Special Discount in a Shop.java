/*Given the array prices where prices[i] is the price of the ith item in a shop. 
There is a special discount for items in the shop, if you buy the ith item, then you will receive a discount equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i], otherwise, you will not receive any discount at all.

Return an array where the ith element is the final price you will pay for the ith item of the shop considering the special discount.*/

class Solution {
    public int[] finalPrices(int[] prices) {
        int len = prices.length;
        int j;
        for(int i=0; i<len; i++){
            j = i+1;
            while(j<len && prices[j]>prices[i])
                j++;
            if(j<len){
                prices[i] -= prices[j];
            }
        }
        return prices;
    }
}
