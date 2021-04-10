class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> answer = new ArrayList<String>(n);
        for(int i=1; i<=n; i++){
            if(i%3==0){
                if(i%5==0)
                    answer.add(i-1, "FizzBuzz");
                else
                    answer.add(i-1, "Fizz");
            }
            else if(i%5==0)
                answer.add(i-1, "Buzz");
            else
                answer.add(i-1, String.valueOf(i));
        }
        return answer;
    }
}
