/*On an 8x8 chessboard, there can be multiple Black Queens and one White King.

Given an array of integer coordinates queens that represents the positions of the Black Queens, and a pair of coordinates king that represent the position of the White King, 
return the coordinates of all the queens (in any order) that can attack the King.
 */
 
 class Solution {
    public List<List<Integer>> queensAttacktheKing(int[][] queens, int[] king) {
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        int len = queens.length;
        for(int i=0; i<len; i++)
            checkQueen(out, queens, len, i, king);
        return  out;
    }
    
    public void checkQueen(List<List<Integer>> out, int[][] queens, int len, int i, int[] king){
        boolean flag = false;
        int row_queen = queens[i][0];
        int col_queen = queens[i][1];
        //if queen in same row
        if(row_queen==king[0]){
            flag = true;
            if(col_queen<king[1]){
                for(int j=0; j<len; j++){
                    if(queens[j][0]==king[0] && queens[j][1]<king[1] && queens[j][1]>col_queen){
                        flag = false;
                        break;
                    }
                } 
            }
            else{
                for(int j=0; j<len; j++){
                    if(queens[j][0]==king[0] && queens[j][1]>king[1] && queens[j][1]<col_queen){
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        //if queen in same column
        else if(col_queen==king[1]){
            flag = true;
            if(row_queen<king[0]){
                for(int j=0; j<len; j++){
                    if(queens[j][1]==king[1] && queens[j][0]<king[0] && queens[j][0]>row_queen){
                        flag = false;
                        break;
                    }
                } 
            }
            else{
                for(int j=0; j<len; j++){
                    if(queens[j][1]==king[1] && queens[j][0]>king[0] && queens[j][0]<row_queen){
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        //if queen in same diagonal - top-down
        else if(row_queen-king[0]==col_queen-king[1]){
            flag = true;
            if(row_queen<king[0]){
                for(int j=0; j<len; j++){
                    if(queens[j][0]-king[0]==queens[j][1]-king[1] && queens[j][0]<king[0] && queens[j][0]>row_queen){
                        flag = false;
                        break;
                    }
                } 
            }
            else{
                for(int j=0; j<len; j++){
                    if(king[0]-queens[j][0]==king[1]-queens[j][1] && queens[j][0]>king[0] && queens[j][0]<row_queen){
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        //same diagoanl - bottom-up
        else if(row_queen+col_queen==king[0]+king[1]){
           flag = true;
            if(row_queen<king[0]){
                for(int j=0; j<len; j++){
                    if(queens[j][0]+queens[j][1]==king[0]+king[1] && queens[j][0]<king[0] && queens[j][0]>row_queen){
                        flag = false;
                        break;
                    }
                }
            }
            else{
                for(int j=0; j<len; j++){
                    if(queens[j][0]+queens[j][1]==king[0]+king[1] && queens[j][0]>king[0] && queens[j][0]<row_queen){
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        if(flag==true){
            ArrayList<Integer> pos = new ArrayList<Integer>();
            pos.add(row_queen);
            pos.add(col_queen);
            out.add(new ArrayList<Integer>(pos));
        }
        return;
    }
}
