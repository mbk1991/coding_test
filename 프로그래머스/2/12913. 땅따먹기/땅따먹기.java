import java.util.*;

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        
        //해당 행까지 각 컬럼이 가질 수 있는 최대값을 기록
        int[][] D = new int[land.length][land[0].length];
        
        D[0][0] = land[0][0];
        D[0][1] = land[0][1];
        D[0][2] = land[0][2];
        D[0][3] = land[0][3];
        
        for(int row=1; row<land.length; row++){
            
            for(int col=0; col<4; col++){
                
                int max = 0;
                for(int bef=0; bef<4; bef++){
                    if(col == bef) continue;
                    
                    if(max < land[row][col] + D[row-1][bef]){
                        max = land[row][col] + D[row-1][bef];
                    }
                }
                
                D[row][col] = max;
                
            }
            
        }
        
        for(int i=0; i<D[D.length-1].length; i++){
            
            if(answer < D[D.length-1][i]){
                
                answer = D[D.length-1][i];
                
            }
        }
        
        return answer;
    }
}