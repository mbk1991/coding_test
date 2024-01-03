/*
20240103 23:33
*/

import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String,Integer> map = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map.put(want[i], number[i]);
        }
        
        Map<String,Integer> tmpMap;
        for(int i=0;  i<=discount.length-10; i++){
            tmpMap = new HashMap<>(map);
            for(int j=i; j<i+10; j++){
                if(tmpMap.containsKey(discount[j])){
                    tmpMap.put(discount[j], tmpMap.get(discount[j]) - 1);
                }
            }
            
            boolean isOk = true;
            for(String key: tmpMap.keySet()){
                if(tmpMap.get(key) != 0){
                    isOk = false;
                }
            }
            if(isOk) answer++;
        }
        
        
        
        
        
        return answer;
    }
}