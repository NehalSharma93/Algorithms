/*Given an array of integers arr, write a function that returns true if and only if the number of occurrences of each value in the array is unique.*/


// 2 ms
//class Solution {  
//     public boolean uniqueOccurrences(int[] arr) {
//         int len = arr.length;
//         if(len==1)
//             return true;
//         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         for(int i=0; i<len; i++){
//             if(!(map.containsKey(arr[i])))
//                 map.put(arr[i], 1);
//             else{
//                 int val = map.get(arr[i]);            
//                 map.put(arr[i], val + 1);
//             }
//         }
//         List<Integer> valueList = new ArrayList<Integer>(map.values());
//         Set<Integer> valueSet = new HashSet<Integer>(map.values());
//         if(valueList.size()==valueSet.size())
//             return true;
//         return false;
//     }
// }

//1 ms
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int len = arr.length;
        if(len==1)
            return true;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0; i<len; i++){
            if(!(map.containsKey(arr[i])))
                map.put(arr[i], 1);
            else{
                int val = map.get(arr[i]);            
                map.put(arr[i], val + 1);
            }
        }
        for(int key : map.keySet()){
            int count = map.get(key);
            if(set.contains(count))
                return false;
            else
                set.add(count);
        }
        return true;
    }
}
