/* There is a stream of n (idKey, value) pairs arriving in an arbitrary order, where idKey is an integer between 1 and n and value is a string. 
No two pairs have the same id.

Design a stream that returns the values in increasing order of their IDs by returning a chunk (list) of values after each insertion. 
The concatenation of all the chunks should result in a list of the sorted values.

Implement the OrderedStream class:

OrderedStream(int n) Constructs the stream to take n values.
String[] insert(int idKey, String value) Inserts the pair (idKey, value) into the stream, then returns the largest possible chunk of currently inserted values 
that appear next in the order.
*/


class OrderedStream {
    // ArrayList<String> s;
    String[] s;
    int p;
    int length;

    public OrderedStream(int n) {
        // s = new ArrayList<String>(n+1);
        // for(int i=1; i<=n+1; i++)
        //     s.add(null);
        s = new String[n+1];
        p = 1;
        length = n+1;
    }
    
    public List<String> insert(int idKey, String value) {
        ArrayList<String> out = new ArrayList<String>();
        if(idKey==p){
            out.add(value);
            int i = ++p;
            while(i<length && s[i]!=null){
                out.add(s[i++]);
                p++;
            }
        }
        else
            s[idKey] = value;
        return out;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
