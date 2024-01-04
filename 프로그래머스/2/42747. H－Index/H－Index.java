/*
20240105 00:09

전체 발표한 논문 수 : n
h번 이상이 h개 이상이고
나머지는 h번 이하인 h의 최대값

0,1,3,5,6

1) 정렬
2) 길이 - 해당 값의 인덱스+1 이 해당 값 이상

*/

import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        Arrays.sort(citations);
        int[] desc = new int[citations.length];
        for(int i=0; i<citations.length; i++){
            desc[i] = citations[citations.length-i-1];
        }
        
        for(int i=0; i<desc.length; i++){
            if((i+1) <= desc[i]){
                answer = i+1;
            }
        }
        
        return answer;
    }
}