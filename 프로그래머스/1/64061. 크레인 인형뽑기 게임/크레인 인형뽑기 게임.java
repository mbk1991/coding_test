import java.util.ArrayList;
 
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> basket = new ArrayList<>();
        
        for(int crain: moves){
            int moveCrain = crain -1;
            for(int i = 0 ; i < board.length ; i ++){
                if(board[i][moveCrain]!=0){
                    basket.add(board[i][moveCrain]);
                    board[i][moveCrain] = 0;
                    break;
                }                
            }
        }
 
    
        for(int j=0 ; j<basket.size()-1 ; j++){
            if(basket.get(j)==basket.get(j+1)){
                
       
                answer += 2;
         
                basket.remove(j);
                
                basket.remove(j);
               
                j=-1;
              
            }
        }
 
        return answer;
           
}
}