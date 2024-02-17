import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        
        List<Integer> clearCntList = new ArrayList<>();
        boolean[] isClear = new boolean[dungeons.length];
        clear(k, dungeons, isClear, clearCntList, 0);
        
        answer = (int) clearCntList.stream().sorted(Comparator.reverseOrder()).toArray()[0];
        
        return answer;
    }
    
    void clear(int fatigue, int[][] dungeons, boolean[] isClear, List<Integer> clearCntList, int clearCnt){
        if(fatigue < needFatigue(dungeons,isClear)){
            
            clearCntList.add(clearCnt);  
            return;
        }
        
        for(int i=0; i<dungeons.length; i++){
            if(!isClear[i] && fatigue >= dungeons[i][0]){
                boolean[] chked = Arrays.copyOf(isClear, isClear.length);
                chked[i] = true;
                clear(fatigue-dungeons[i][1], dungeons, chked, clearCntList, clearCnt+1);
            }
        }
        
        
    }
    
    int needFatigue(int[][] dungeons, boolean[] isClear){
        int minNeed = 1000;
        for(int i=0; i<dungeons.length; i++){
            if(minNeed > dungeons[i][0] && !isClear[i]) minNeed = dungeons[i][0];
        }
        return minNeed;
    }
    
}