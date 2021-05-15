/*A website domain like "discuss.leetcode.com" consists of various subdomains. 
At the top level, we have "com", at the next level, we have "leetcode.com", and at the lowest level, "discuss.leetcode.com". When we visit a domain like "discuss.leetcode.com", we will also visit the parent domains "leetcode.com" and "com" implicitly.

Now, call a "count-paired domain" to be a count (representing the number of visits this domain received), followed by a space, followed by the address. 
An example of a count-paired domain might be "9001 discuss.leetcode.com".

We are given a list cpdomains of count-paired domains. 
We would like a list of count-paired domains, (in the same format as the input, and in any order), that explicitly counts the number of visits to each subdomain.

Example 1:
Input: 
["9001 discuss.leetcode.com"]
Output: 
["9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"]*/


class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String cp : cpdomains){
            String[] num = cp.split(" ");
            int count = Integer.parseInt(num[0]);            
            String[] str = num[1].split("\\.");
            int len = str.length;
            
            StringBuffer sb = new StringBuffer();
            
            for(int i=len-1; i>=0; i--){
                if(i==len-1)
                    sb.append(str[i]);
                else
                    sb.insert(0, str[i]+".");
                
                String s = sb.toString();
                map.put(s, map.getOrDefault(s, 0)+count);
            }
        }

        ArrayList<String> ls = new ArrayList<String>();
        for(String s : map.keySet())
            ls.add(map.get(s)+" "+s);
        return ls ;                 
    }
}
