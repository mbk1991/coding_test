import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
                
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=64; i++){
            int fiveAndZeroNum = Integer.parseInt(Integer.toBinaryString(i))*5;
            if(l <= fiveAndZeroNum && fiveAndZeroNum <= r){
                list.add(fiveAndZeroNum);
            }
        }
        
        int[] answer = {};
        if(list.size() > 0){
            answer = new int[list.size()];
            for(int i=0; i<answer.length; i++){
                answer[i] = list.get(i);
            }
        }else{
            answer = new int[]{-1};
        }

        return answer;
    }
}