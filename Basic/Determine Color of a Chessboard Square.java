/*You are given coordinates, a string that represents the coordinates of a square of the chessboard. Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second*/


class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] ch = coordinates.toCharArray();
        System.out.println(ch[0]);
        if((int)ch[0]%2!=0){
            if(ch[1]%2!=0)
                return false;
            else
                return true;
        }
        else{
            if(ch[1]%2!=0)
                return true;
            else
                return false;
        }
    }
}
