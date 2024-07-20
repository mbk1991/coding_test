// 시점 별 
//가격이 떨어지지 않은 시간을 리턴

import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        answer[answer.length-1] = 0;
        for(int i=answer.length-2; i>=0; i--){
            for(int j=i+1; j<answer.length; j++){
                answer[i] ++;
                if(prices[i] > prices[j]) break;
            }
        }
        return answer;
    }
}