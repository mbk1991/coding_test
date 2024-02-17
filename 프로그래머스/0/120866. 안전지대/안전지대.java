class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        
        int[] dy = {-1,-1,-1,0,0,1,1,1};
        int[] dx = {-1,0,1,-1,1,-1,0,1};
        
        for(int i=0; i<board.length; i++){
             for(int j=0; j<board.length; j++){
                if(board[i][j] == 1){
                    for(int k = 0; k<8; k++){
                        int danX = j + dx[k];
                        int danY = i + dy[k];
                        if( (danX < 0) || (board[i].length <= danX)) continue;
                        if( (danY < 0) || (board.length    <= danY)) continue;
                        if(board[danY][danX] == 1) continue;
                        board[danY][danX] = 2;
                    }
                }
            }   
        }
        
        for(int i=0; i<board.length; i++){
             for(int j=0; j<board.length; j++){
                 if(board[i][j] == 0) answer ++;
             }
        }
        return answer;
    }
}