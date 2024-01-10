class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(String d:keyinput){
            int horizonLimit  = board[0]/2;
            int verticalLimit = board[1]/2;
            
            if("left".equals(d) && -horizonLimit < answer[0]){
                answer[0]--;
            }    
            if("right".equals(d) && horizonLimit > answer[0]){
                answer[0]++;    
            }   
            if("up".equals(d) && verticalLimit > answer[1]){
                answer[1]++;
            }      
            if("down".equals(d) && -verticalLimit < answer[1]){
                answer[1]--;    
            }    
        }
        return answer;
    }
}