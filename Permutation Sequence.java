/*The set [1, 2, 3, ..., n] contains a total of n! unique permutations.

By listing and labeling all of the permutations in order, we get the following sequence for n = 3:

"123"
"132"
"213"
"231"
"312"
"321"
Given n and k, return the kth permutation sequence.*/

class Solution {
    StringBuffer sb;
    ArrayList<Integer> numbers;
    
    public String getPermutation(int n, int k) {
        sb = new StringBuffer();
        numbers = new ArrayList<Integer>();
        int i=1;
        while(i<=n){
            numbers.add(i);
            i++;
        }
        //k-1 for using 0-based index
        permute(n, k-1, 1);
        return sb.toString();
    }
    
    public void permute(int n, int k, int i){
        int fac = factorial(n-i);
        int index = (k/fac);
        int num = numbers.get(index);
        sb.append(num);
        numbers.remove(Integer.valueOf(num));
        if(numbers.size()==0)
            return;
        k = k - (index * fac);
        if(k>=0)
            permute(n, k, i+1);
        return;
    }
    
    public int factorial(int n){
        if(n<=0)
            return 1;
        int fac = 1;
        for(int i=1; i<=n; i++)
           fac *= i;
        return fac;
    }
}
