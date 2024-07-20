import java.util.*;

class Solution {
    List<int[]> resultList = new ArrayList<>();
    
    public int[][] solution(int n) {
        hanoi(1,3,n);
        int[][] answer = new int[resultList.size()][2];
        for(int i=0; i<resultList.size(); i++){
            answer[i] = resultList.get(i);
        }
        return answer;
    }
    
    
    void hanoi(int s, int e, int n){
        if(n > 1){
            hanoi(s, 6-(s+e), n-1);
            hanoi(s, e, 1);
            hanoi(6-(s+e), e, n-1);
        }else{
            resultList.add(new int[]{s,e});
            
        }
    }
}