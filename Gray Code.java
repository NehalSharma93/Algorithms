//Using Bit manipulation | o(n^2)
class Solution {
    public List<Integer> grayCode(int a){
	    if(a==1){
	        List<Integer> res = new ArrayList<Integer>();
	        res.add(0);
	        res.add(1);
	        return res;
	    }
	    
	    List<Integer> prevRes = grayCode(a-1);
        List<Integer> res = new ArrayList<Integer>();
	    int len = prevRes.size();
	    for(int i=0; i<len; i++){
	        int n = prevRes.get(i);
	        res.add(n<<1);
	    }
	    for(int i=len-1; i>=0; i--){
	        int n = prevRes.get(i);
	        res.add((n<<1) | 1);
	    }
	    
	    return res;
	}
}

//Not time efficient
class Solution {
    public List<Integer> grayCode(int a) {
	    List<Integer> output = new ArrayList<Integer>();
	   // ArrayList<String> binary = new ArrayList<String>();
	    ArrayList<String> res = findGrayCode(a);
	    int len = res.size();
	    for(int i=0; i<len; i++)
	        output.add(Integer.parseInt(res.get(i), 2));
	    return output;
	}
	
	public ArrayList<String> findGrayCode(int a){
	    if(a==1){
	        ArrayList<String> res = new ArrayList<String>();
	        res.add("0");
	        res.add("1");
	        return res;
	    }
	    
	    ArrayList<String> prevRes = findGrayCode(a-1);
	    ArrayList<String> res = new ArrayList<String>();
	    int len = prevRes.size();
	    for(int i=0; i<len; i++){
	        String str = prevRes.get(i);
	        res.add("0"+str);
	    }
	    for(int i=len-1; i>=0; i--){
	        String str = prevRes.get(i);
	        res.add("1"+str);
	    }
	    
	    return res;
	}
}
