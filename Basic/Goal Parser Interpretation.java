/*You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. 
The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". 
The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
*/


class Solution {
    public String interpret(String command) {
        StringBuilder output = new StringBuilder();
        int len = command.length();
        for(int i=0; i<len; i++){
            if(command.charAt(i)=='G')
                output.append('G');
            else {
                if(command.charAt(++i)==')')
                    output.append('o');
                else{ 
                    output.append("al");
                    i = i+2;
                }
            }
        }
        return output.toString();
    }
}
