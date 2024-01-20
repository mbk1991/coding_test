/*
240120 21:45
*/

import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int sIdx = 0;
        int eIdx = arr.length-1;
        
        for(int i=0; i<query.length; i++){
            if(i%2==1){
                sIdx = sIdx + query[i];                
            }else{
                eIdx = sIdx + query[i];
            }
        }
        
        int[] answer = Arrays.copyOfRange(arr,sIdx,eIdx+1);
        return answer;
    }
}