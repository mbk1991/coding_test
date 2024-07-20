import java.util.*;

class Solution {
    public long solution(int m, int n, int[][] puddles) {
        int col = m;
        int row = n;
        long answer = 0;
        long[][] map = new long[row][col];
        
        //init map
        for(int y=0; y<row; y++){
            for(int x=0; x<col; x++){
                map[y][x] = -1;
            }
        }
        map[row-1][col-1] = 1;
        
        //set puddle
        for(int i=0; i<puddles.length; i++){
            map[puddles[i][1] -1][puddles[i][0] -1] = 0;
        }
        
        
        for(int y=row-1; y>=0; y--){
            for(int x=col-1; x>=0; x--){
                if(map[y][x] != -1) continue;
                
                long tmp = 0;
                //right check
                if(x + 1 < col && map[y][x+1] != -1){
                    tmp += map[y][x+1];
                }
                //down check
                if(y + 1 < row && map[y+1][x] != -1){
                    tmp += map[y+1][x];
                }
                map[y][x] = tmp % 1_000_000_007;
            }
        }
        
        //print map
        // for(long[] r:map){
        //     System.out.println(Arrays.toString(r));
        // }
        
        
        answer = map[0][0];
        
        return answer;
    }
}