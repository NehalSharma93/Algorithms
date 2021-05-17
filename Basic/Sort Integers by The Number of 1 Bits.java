/*Given an integer array arr. 
You have to sort the integers in the array in ascending order by the number of 1's in their binary representation 
and in case of two or more integers have the same number of 1's you have to sort them in ascending order.

Return the sorted array.*/

class Solution {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        
        if(len==1)
            return arr;
        
        int[] out = new int[len];
        Map<Integer, ArrayList<Integer>> mp = new HashMap<Integer, ArrayList<Integer>>(16);
        for(int i=0; i<16; i++){
            ArrayList<Integer> ls = new ArrayList<Integer>();
            mp.put(i, ls);
        }
        
        for(int i=0; i<len; i++)
            binaryRepresentation(arr[i], mp);
        
        int j = 0;
        for(int i=0; i<16; i++){
            ArrayList<Integer> l = mp.get(i);
            // System.out.println(l);
            Collections.sort(l);
            for(Integer num : l){
                // System.out.println(num);
                out[j] = num;
                j++;
            }
        }
        
        return out;
    }
    
    public void binaryRepresentation(int num, Map<Integer, ArrayList<Integer>> mp){
        int n = num;
        int countOfOne = 0;
        while(num>0){
            if(num%2==1)
                countOfOne++;
            num /= 2;
        }
        mp.get(countOfOne).add(n);
        return;
    }
}
