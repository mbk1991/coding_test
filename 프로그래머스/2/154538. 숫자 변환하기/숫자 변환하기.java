//D[i] = x에서 i로 만들기 위한 최소 연산 횟수

import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        if(x == y ){
            return 0;
        }
        
        int[] D = new int[y+1];
        Arrays.fill(D,-1);
        
        D[x] = 0;
        
        for(int i=x; i<y; i++){
            if(D[i] == -1){
                continue;
            }
            
            if((i+n) <= y){
                if(D[i+n] == -1){
                    D[i+n] = D[i] + 1;
                }else{
                    D[i+n] = Math.min(D[i] + 1, D[i+n]);
                }
            } 
            
            if((i*2) <= y){
                if(D[i*2] == -1){
                    D[i*2] = D[i] + 1;
                }else{
                    D[i*2] = Math.min(D[i] + 1, D[i*2]);
                }
                
            } 
            
            if((i*3) <= y){
                if(D[i*3] == -1){
                    D[i*3] = D[i] + 1;
                }else{
                    D[i*3] = Math.min(D[i] + 1, D[i*3]);
                }
                
            } 
            
            if(D[y] > 0){
                break;
            }
        }
        
        // System.out.println(Arrays.toString(D));
        
        return D[y];
    }
}