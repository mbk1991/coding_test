import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        final int base = n;
        int[] answer = Arrays.stream(numlist).boxed().sorted((a,b)->{
            
            if(Math.abs(a-base) - Math.abs(b-base) > 0){
                return 1;
            }
            if(Math.abs(a-base) - Math.abs(b-base) < 0){
                return -1;
            }
            else{
                return (a>b)? -1: (a==b)? 0 : 1;
            }
        }).mapToInt(Integer::valueOf).toArray();
        
        
        return answer;
    }
}