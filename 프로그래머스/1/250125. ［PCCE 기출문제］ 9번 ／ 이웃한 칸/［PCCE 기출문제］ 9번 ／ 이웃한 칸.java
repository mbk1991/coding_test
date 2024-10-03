class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        // u,d,l,r
        int[] dh = {-1,1,0,0}; 
        int[] dw = {0,0,-1,1};
        
        String thisColor = board[h][w];
        //up check
        if(h>0
           && board[h+dh[0]][w+dw[0]].equals(thisColor)){
            answer++;
        }
        //down check
        if(h<board.length-1 
           && board[h+dh[1]][w+dw[1]].equals(thisColor)){
            answer++;
        }
        //left check 
        if(w>0
           && board[h+dh[2]][w+dw[2]].equals(thisColor)){
            answer++;
        }
        //right check
        if(w<board[0].length-1
           && board[h+dh[3]][w+dw[3]].equals(thisColor)){
            answer++;
        }
        return answer;
    }
    
}